<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/addVisitor" method="post">  

Name:<input type="text" name="name" /><br/>  
Email:<input type="email" name="email"  /><br/>  
Mobile No.:<input type="number" name="mobileNo" /><br/>  
Address:<input type="text" name="address" /><br/> 
Govt.IdProof:<input type="text" name="idProof" /><br/> 
Contact Person Name:<input type="text" name="contactPersonName" /><br/> 
Contact Person Email:<input type="email" name="contactPersonEmail" /><br/>  
Reason For Visit:<input type="text" name="reasonForVisit" /><br/>  
Contact Person Mobile No.:<input type="number" name="contactPersonMobileNo" /><br/> 

<input type="submit" value="save"/>  
</form>  

</body>
</html>

	