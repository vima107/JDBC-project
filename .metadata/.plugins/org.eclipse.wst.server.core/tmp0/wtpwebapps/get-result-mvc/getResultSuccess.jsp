<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	Integer id=(Integer)session.getAttribute("sid");
	String name=(String)session.getAttribute("sname");
	Integer marks1=(Integer)session.getAttribute("smarks1");
	Integer marks2=(Integer)session.getAttribute("smarks2");
	Integer marks3=(Integer)session.getAttribute("smarks3");
	
	out.println(id+" "+name+" "+" "+marks1+" "+marks2+" "+marks3);
	
%>
 <table style="color: white; background-color:red ">
 	<thead>
 		<tr>
 		<th>ID</th>
 		<th>NAME</th>
 		<th>MARKS 1</th>
 		<th>MARKS 2</th>
 		<th>MARKS 3</th>
 		</tr>
 	</thead>
 	<tbody>
 	<tr>
 		<td><%= id %></td>
 		<td><%= name %></td>
 		<td><%= marks1 %></td>
 		<td><%= marks2 %></td>
 		<td><%= marks3 %></td>
 	</tr>
 	</tbody>
 </table>
</body>
</html>