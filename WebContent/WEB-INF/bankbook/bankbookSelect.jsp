<%@page import="com.ee.y1.bankbook.BankBookDTO" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<%
	BankBookDTO bankbookDTO = (BankBookDTO)request.getAttribute("select");
%>   

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>


</head>
<body>

	<nav class="navbar navbar-inverse">
  		<div class="container-fluid">
	    	<div class="navbar-header">
	      		<a class="navbar-brand" href="#">WebSiteName</a>
	    	</div>
	    	
	    	<ul class="nav navbar-nav">
	      		<li class="active"><a href="#">Home</a></li>
	      		<li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Page 1 <span class="caret"></span></a>
			        <ul class="dropdown-menu">
				        <li><a href="#">Page 1-1</a></li>
				        <li><a href="#">Page 1-2</a></li>
				        <li><a href="#">Page 1-3</a></li>
			        </ul>
	        
	      		</li>
	      		<li><a href="./bankbookList.do">BankBook</a></li>
	    	</ul>
	    	
	    	<ul class="nav navbar-nav navbar-right">
			    <li><a href="../member/memberJoin.do"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
			    <li><a href="../member/memberLogin.do"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
	   		</ul>
   		
  		</div>
	</nav>
	
	<div class = "container">
		<div class="row">
		
			<h1>BankBook Select</h1>
			
<!-- 			<form class="form-horizontal" action="./bankbookSelect.do">
	
			  <div class="form-group">
			    <label class="control-label col-sm-2" for="bookNumber">BookNumber:</label>
			    <div class="col-sm-10">
			      <input type="text" class="form-control" id="bookNumber" placeholder="Enter bookNumber" name="bookNumber">
			    </div>
			  </div>
			  
			  <div class="form-group">        
			      <div class="col-sm-offset-2 col-sm-10">
			        <button type="submit" class="btn btn-default">Search</button>
			      </div>
			  </div>
			  
			 </form> -->
			
			<table class= "table table-hover">
				<thead>				
					<tr>
						<th>Name</th>
						<th>Rate</th>
						<th>Sale</th>
					</tr>				
				</thead>
				
				<tbody>				
					<tr>					
						<td><%=bankbookDTO.getBookName() %></td>
						<td><%=bankbookDTO.getBookRate() %></td>
						<td><%=bankbookDTO.getBookSale() %></td>					
					</tr>
				</tbody>
						
			</table>
			
		</div>
	</div>

</body>
</html>