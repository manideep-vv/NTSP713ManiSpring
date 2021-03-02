<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>One way binding</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
<div class=".container-md">
<!-- url inheritence -->

<form:form  method="POST" modelAttribute="custData">


<div class="card text-white bg-primary mb-3" style="max-width: 18rem;">
  <div class="card-header">Customer Reg form</div>
  <div class="card-body">
    <h5 class="card-title">Enter your details</h5>
    
   <table class="class="card-text"">

customer Number<form:input type="text" path="customerName" cssClass="card-text"/><br>

customer Name<form:input type="text" path="address"/><br>
customer Bill amount<form:input type="number" path="billAmount"/></br>
<input type="submit" value="click here to get urself Registered"/></br>

</table>
</form:form>
</div>
</body>
</html>