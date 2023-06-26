<%@page import="com.kh.calendar.Mycalendar"%>
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>달력</title>
<style type="text/css">
table {
	/* border: 선두께 선종류 선색상 */
	width: 100%;
	border: none;
	border-top: 1px solid #444444;
	border-collapse: collapse;
	
}

tr {
	height: 80px; /* 행 높이 */
}

th:first-child, td:first-child {
	border-left: none;
}

th, td {
	border-bottom: 1px solid #444444;
	border-left: 1px solid #444444;
	padding: 10px;
}

th {
	width: 100px;
	text-align: center;
}

td {
	text-align: right; /* 수평 정렬 */
	vertical-align: top; /* 수직 정렬 */
}

.title {
	height: 10px; /* 행 높이 */
	opacity: 0.4;
	font-size: 14px;
	padding: 0px 10px;
	border-spacing: 0px;
}

span {
	font-size: 8pt;
}

a {
	color: black;
	text-decoration: none; /* 밑줄 */
}

a:hover {
	color: lime;
	text-decoration: overline;
}

a:active {
	color: DodgerBlue;
	text-decoration: underline;
}

.select {
	width: 100px;
	height: 30px;
}

h3 {
	display: flex;
	justify-content: center;
	align-items: center;
	font-size: 30px;
}

.date {
	display: flex;
	justify-content: center;
	align-items: center;
	text-align: center;
	font-size: 16px;
	margin-bottom: 20px;
}
</style>
</head>
<body>
	<%
	Calendar calendar = Calendar.getInstance();

	int year = calendar.get(Calendar.YEAR);
	int month = calendar.get(Calendar.MONTH);

	// 이전 달, 다음달 하이퍼링크 또는 버튼이 클릭되면 get방식으로 넘어오는 달력을
	// 출력할 년, 월을 받는다.

	try {
		year = Integer.parseInt(request.getParameter("year"));
		month = Integer.parseInt(request.getParameter("month"));

		// 마이너스가 나오거나 12를 초과하면 안된다.
		// 1월달에서 이전을 누른다, 12월로 이동
		// 12월달에서 다음 달 누르면 1월로 이동

		if (month >= 13) {
			year++;
			month = 1;
		} else if (month <= 0) {
			year--;
			month = 12;
		}

	} catch (NumberFormatException e) {
	}
	%>
	<h3>스케쥴</h3>
	<div class="date">
		<%
		switch (month) {
		case 1:
			out.print("January");
			break;
		case 2:
			out.print("February");
			break;
		case 3:
			out.print("March");
			break;
		case 4:
			out.print("April");
			break;
		case 5:
			out.print("May");
			break;
		case 6:
			out.print("June");
			break;
		case 7:
			out.print("July");
			break;
		case 8:
			out.print("August");
			break;
		case 9:
			out.print("September");
			break;
		case 10:
			out.print("October");
			break;
		case 11:
			out.print("November");
			break;
		case 12:
			out.print("December");
			break;
		}
		%>
		<%=year%>
	</div>
	<table cellpadding="5"cellspacing="0">

		<tr class="title">
			<th>Sunday</th>
			<th>Monday</th>
			<th>Tuesday</th>
			<th>Wednesday</th>
			<th>Thursday</th>
			<th>Friday</th>
			<th>Saturday</th>
		</tr>

		<tr>
			<%
			// 달력을 출력할 달 1일의 요일을 계산
			int week = Mycalendar.weekDay(year, month, 1);

			// 빈 칸에 출력할 전달 날짜의 시작일을 계산한다.
			int start = 0;

			if (month == 1) {
				start = Mycalendar.lastDay(year - 1, 12) - week; // 1월
			} else {
				start = Mycalendar.lastDay(year, month - 1) - week; // 2~12월
			}

			// 1일이 출력될 위치(요일)을 맞추기 위해 달력을 출력할 1일의 요일만큼 반복하며
			// 전달 날짜를 출력한다.
			for (int i = 0; i < Mycalendar.weekDay(year, month, 1); i++) {
				if (i == 0) {
					out.println("<td id='beforesun'>" + (month == 1 ? 12 : month - 1) + "/" + (++start) + "</td>");
				} else {
					out.println("<td class='before'>" + (month == 1 ? 12 : month - 1) + "/" + (++start) + "</td>");
				}
			}

			// 1일부터 달력을 출력할 달의 마지막 날짜까지 반복하며 날짜를  출력한다.
			for (int i = 1; i <= Mycalendar.lastDay(year, month); i++) {
	
				// 대체 공휴일
				boolean flag0301 = false;
				int subHoliday0301 = 0;
				if (Mycalendar.weekDay(year, 3, 1) == 6) {
					flag0301 = true;
					subHoliday0301 = 3;
				} else if (Mycalendar.weekDay(year, 3, 1) == 0) {
					flag0301 = true;
					subHoliday0301 = 2;
				}

				boolean flag0505 = false;
				int subHoliday0505 = 0;
				if (Mycalendar.weekDay(year, 5, 5) == 6) {
					flag0505 = true;
					subHoliday0505 = 7;
				} else if (Mycalendar.weekDay(year, 5, 5) == 0) {
					flag0505 = true;
					subHoliday0505 = 6;
				}

				boolean flag0815 = false;
				int subHoliday0815 = 0;
				if (Mycalendar.weekDay(year, 8, 15) == 6) {
					flag0815 = true;
					subHoliday0815 = 17;
				} else if (Mycalendar.weekDay(year, 8, 15) == 0) {
					flag0815 = true;
					subHoliday0815 = 16;
				}

				boolean flag1003 = false;
				int subHoliday1003 = 0;
				if (Mycalendar.weekDay(year, 10, 3) == 6) {
					flag1003 = true;
					subHoliday1003 = 5;
				} else if (Mycalendar.weekDay(year, 10, 3) == 0) {
					flag1003 = true;
					subHoliday1003 = 4;
				}

				boolean flag1009 = false;
				int subHoliday1009 = 0;
				if (Mycalendar.weekDay(year, 10, 9) == 6) {
					flag1009 = true;
					subHoliday1009 = 11;
				} else if (Mycalendar.weekDay(year, 10, 9) == 0) {
					flag1009 = true;
					subHoliday1009 = 10;
				}
				if (month == 1 && i == 1) {
					out.println("<td class='holiday'>" + i + "<br><span>신정</span></td>");
				} else if (month == 3 && i == 1) {
					out.println("<td class='holiday'>" + i + "<br><span>삼일절</span></td>");
				} else if (month == 5 && i == 1) {
					out.println("<td class='holiday'>" + i + "<br><span>근로자의날</span></td>");
				} else if (month == 5 && i == 5) {
					out.println("<td class='holiday'>" + i + "<br><span>어린이날</span></td>");
				} else if (month == 6 && i == 6) {
					out.println("<td class='holiday'>" + i + "<br><span>현충일</span></td>");
				} else if (month == 8 && i == 15) {
					out.println("<td class='holiday'>" + i + "<br><span>광복절</span></td>");
				} else if (month == 10 && i == 3) {
					out.println("<td class='holiday'>" + i + "<br><span>개천절</span></td>");
				} else if (month == 10 && i == 9) {
					out.println("<td class='holiday'>" + i + "<br><span>한글날</span></td>");
				} else if (month == 12 && i == 25) {
					out.println("<td class='holiday'>" + i + "<br><span>크리스마스</span></td>");
				}

				// 대체 공휴일
				else if (flag0301 && month == 3 && i == subHoliday0301) {
					out.println("<td class='holiday'>" + i + "<br><span>대체공휴일</span></td>");
				} else if (flag0505 && month == 5 && i == subHoliday0505) {
					out.println("<td class='holiday'>" + i + "<br><span>대체공휴일</span></td>");
				} else if (flag0815 && month == 8 && i == subHoliday0815) {
					out.println("<td class='holiday'>" + i + "<br><span>대체공휴일</span></td>");
				} else if (flag1003 && month == 10 && i == subHoliday1003) {
					out.println("<td class='holiday'>" + i + "<br><span>대체공휴일</span></td>");
				} else if (flag1009 && month == 10 && i == subHoliday1009) {
					out.println("<td class='holiday'>" + i + "<br><span>대체공휴일</span></td>");
				}

				else {
					// 토요일이면 파랑 일요일이면 빨강
					switch (Mycalendar.weekDay(year, month, i)) {
					case 0: //일요일
				out.println("<td class = 'sun'>" + i + "</td>");
				break;

					case 6: //토요일
				out.println("<td class = 'sat'>" + i + "</td>");
				break;

					default:
				out.println("<td>" + i + "</td>");
				break;
					}
				}

				// 출력한 날짜가 토요일이고 그 달의 마지막 날짜가 아니면 줄을 바꾼다.
				if (Mycalendar.weekDay(year, month, i) == 6 && i != Mycalendar.lastDay(year, month)) {
					out.println("</tr><tr>");
				}
			}

			//			다음달 1일의 요일을 계산한다.
			if (month == 12) {
				week = Mycalendar.weekDay(year + 1, 1, 1); // 12월
			} else {
				week = Mycalendar.weekDay(year, month + 1, 1); // 1 ~ 11월
			}

			//			다음달 1일이 일요일이면 다음달 날짜를 출력할 필요없다.
			if (week != 0) {
				// 날짜를 다 출력하고 남은 빈 칸에 다음달 날짜를 다음달 1일의 요일부터 토요일까지 반복하며 
				// 출력한다.
				start = 0;
				for (int i = week; i <= 6; i++) {
					if (i == 6) {
				out.println("<td id='aftersat'>" + (month == 12 ? 1 : month + 1) + "/" + ++start + "</td>");
					} else {
				out.println("<td class='after'>" + (month == 12 ? 1 : month + 1) + "/" + ++start + "</td>");
					}
				}
			}
			%>

		</tr>

	</table>
</body>
</html>