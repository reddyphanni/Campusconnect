<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html data-ng-app="myapp">
<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<!-- <script type="text/javascript" src="https://opensource.keycdn.com/angularjs/1.5.8/angular.min.js "></script> -->
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.2/angular.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/angularcontroller/blog.js"></script>
			<%-- <script
			src="${pageContext.request.contextPath}/resources/js/angular.min.js"></script>
			 --%>
<!-- Latest compiled and minified CSS -->
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

<body data-ng-controller="blogcontroller">
	<sec:authorize access="isAuthenticated()">
	<div class= "container">
		<form  data-ng-submit="submit()" >
			<div  class="form-group">
				<label for="formdata">Blog Title</label><br> <input type="text"
					placeholder="blogname" data-ng-model="name" class="form-control"><br><br>
			</div>
			<div class="form-group">
				<label for="formdata">Blog Description</label><br>
				<textarea draggable="false" style="resize: none" id="formdata"
					class="form-control" rows="10%" cols="30%"  data-ng-model="description"></textarea>
			</div>
			<div  align ="right">
				<button type="submit" class="btn btn-success" >save</button>
			</div>
			
		</form>
		</div>
		</sec:authorize>
		
<br>
<br>
<div data-ng-init="getalldetails()">
		<table class="table table-bordered table-hover">
			<thead>
				<tr>
				 <th>index</th>
					<th>Blog ID</th>
					<th>Blog Name</th>
					<th>Blog Description</th>
					<sec:authorize access="isAuthenticated()">
						<th>Delete Blog</th>
						<th>Edit Blog</th>
						</sec:authorize>
					<th>View Blog</th>
				</tr>
			</thead>
			<tbody>
				<tr data-ng-repeat="blog in blogs">
				 <td>{{ $index + 1 }}</td>
					<td>{{blog.b_id}}</td>
					<td>{{blog.name}}</td>
					<td>{{blog.description}}</td>
					<sec:authorize access="isAuthenticated()">
						<td><button  data-ng-show="access(blog.b_userid)" data-ng-click="deleteblog(blog.b_id)"
								class="btn btn-default">Delete</button></td>
						<td><button data-ng-show="access(blog.b_userid)" data-ng-click="editblog(blog.b_id)"
								class="btn btn-default">Edit</button></td>
				</sec:authorize>
				<td>
				<a href="${pageContext.request.contextPath}/viewblog/{{blog.b_id}}"
								class="btn btn-default">view</a></td>
				</tr>
			</tbody>
		</table>
	</div>
	<input type="text" value="${sessionScope.userid}" id="userid" hidden="true" />{{userid}}
</body>
</html>