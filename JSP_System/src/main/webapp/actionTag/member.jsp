<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>ȸ������</title>
<style type="text/css">

	.input {
		width: 96%;
		background-color: hotpink;
		padding: 5px;
	}
</style>
</head>
<body>
	<!-- 
		onsubmit �̺�Ʈ�� form�� submit ��ư�� Ŭ���Ǹ� ����Ǵ� �̺�Ʈ
		form check�� submit ��ư�� Ŭ���Ǹ� ����Ǵ� onsubmit �̺�Ʈ���� javascript
		�Լ��� �����ؼ� form�� �Էµ� �����Ͱ� ���������� ��ȿ�� �˻��ؼ� �����
		���� true, ������ false ����
		
		true���� ���� action �Ӽ����� ������ �������� �Ѱ��ְ� false ���� ������
		�״�� �ӹ��� �Ѵ�.
		
		
	 -->
	<form action="?" method="post" onsubmit="return passwordCheck(this)">
		<table width="500" border="1" align="center" cellpadding="5"
			cellspacing="0">

			<tr>
				<th colspan="2">ȸ�� ����</th>
			</tr>

			<tr>
				<th width="150">���̵�</th>
				<td width="350"><input class="input" type="text" name="id"
					placeholder="���̵� �Է��ϼ���" /></td>
			</tr>

			<tr>
				<th>�̸�</th>
				<td><input class="input" type="text" name="name"
					placeholder="�̸��� �Է��ϼ���" /></td>
			</tr>

			<tr>
				<th>��й�ȣ</th>
				<td><input class="input" type="text" name="password"
					placeholder="��й�ȣ�� �Է��ϼ���" /></td>
			</tr>

			<tr>
				<th>��й�ȣ Ȯ��</th>
				<td><input class="input" type="password" name="repassword"
					placeholder="��й�ȣ�� �ѹ��� �Է��ϼ���" /></td>
			</tr>

			<tr>
				<th>����</th>
				<td><input class="input" type="text" name="age"
					placeholder="���̸� �Է��ϼ���" /></td>
			</tr>

			<tr>
				<th>����</th>
				<td><input type="radio" name="gender" value="true"
					checked="checked" />���� <input type="radio" name="gender"
					value="false" />����</td>
			</tr>

			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="ȸ������" /> <input type="reset" value="�ٽþ���" /></td>
			</tr>

		</table>
		<!-- getRemoteAddr() �޼���� ������ ip�ּҸ� ��� �� �� �ִ�. -->
		<input type="hidden" name="ip" value="<%=request.getRemoteAddr()%>" />
	</form>
</body>
</html>