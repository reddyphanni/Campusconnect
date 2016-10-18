<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
	
<!DOCTYPE html>
<html data-ng-app="myapp">
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.2/angular.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/angularcontroller/forum.js"></script>
			
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" >
<style>
table, th , td  {
  border: 1px solid grey;
  border-collapse: collapse;
  padding: 5px;
}
table tr:nth-child(odd) {
  background-color: #f1f1f1;
}
table tr:nth-child(even) {
  background-color: #ffffff;
}

</style>
</head>
<body data-ng-controller="forumcontroller">
	
	<div class="container">
	<sec:authorize access="isAuthenticated()">
		<form  data-ng-submit="submit()" >
			<div class="form-group" >
				<label for="formdata"> Forum Title </label><br> <input type="text"
					placeholder="forum title" data-ng-model="name" class="form-control"><br><br>
			</div>
			<div class="form-group">
				<label for="formdata">Forum Description</label>
				<textarea draggable="false" style="resize: none" id="formdata"
					class="form-control" rows="10%" cols="30%"  data-ng-model="description" placeholder = "Enter Here"></textarea>
			</div>
			
			<div align="right">
				<button type="submit" class="btn btn-primary">save</button>
			</div>
			
		</form>
		</sec:authorize>
		</div>
		
<div data-ng-init="getallforumdetails()" class="container">
		<table class="table table-bordered" >
			<thead>
				<tr>
				 <th>index</th>
					<th>Forum ID</th>
					<th>Forum Name</th>
					<th>Forum Description</th>
					<th>Forum Date<th>
					<th>View</th>
					<sec:authorize access="isAuthenticated()">
					
						<th >Delete Forum</th>
						<th >Edit Forum</th>
						</sec:authorize>
					
				</tr>
			</thead>
			<tbody>
				<tr data-ng-repeat="forum in forums">
				 <td>{{ $index + 1 }}</td>
					<td>{{forum.f_id}}</td>
					<td>{{forum.name}}</td>
					<td>{{forum.description}}</td>
					<td>{{forum.date1}}<td>
					<td><a href="${pageContext.request.contextPath}/viewforum/{{forum.f_id}}" class="btn btn-default">view</a></td>
					<sec:authorize access="isAuthenticated()">
					
					 <td><button data-ng-show="access(forum.f_userid)" data-ng-click="deleteforum(forum.f_id)"
								class="btn btn-default">Delete</button></td>
						<td><button data-ng-show="access(forum.f_userid)" data-ng-click="editforum(forum.f_id)"
								class="btn btn-default">Edit</button></td>
						
		             		</sec:authorize>
						
						
				</tr>
			</tbody>
		</table>
		<input type="text" value="${sessionScope.userid}" id="userid" hidden="true" />
		
	</div>
</body>
</html>