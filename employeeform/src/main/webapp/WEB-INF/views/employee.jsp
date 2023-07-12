<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action ="<%=request.getContextPath() %>/register" method="post"  >
<table>
<tr>
<td>
Enter your firstname
</td>

<td>
<input type ="text" name ="firstname">
</td>

</tr>

<tr>
<td>
Enter your lastname
</td>
<td>
<input type ="text" name ="lastname">
</td>
</tr>
<tr>
<td>
Enter your Username
</td>
<td>
<input type ="text" name ="username">
</td>
</tr>
<tr>
<td>
Enter your password
</td>
<td>
<input type ="password" name ="passwords">
</td>
</tr>
<tr>
<td>
Enter your address
</td>
<td>
<input type ="text" name ="address">
</td>
</tr>
<tr>
<td>
Enter your contact no 
</td>
<td>
<input type ="text" name ="contact">
</td>
</tr>


</table>

<input type ="submit" value ="submit">


</form>
</body>
</html>