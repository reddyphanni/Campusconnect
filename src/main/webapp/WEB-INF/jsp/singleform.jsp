
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html data-ng-app="myapp">
<head>

<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.2/angular.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/angularcontroller/singleforum.js"></script>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" >
<script   src="http://code.jquery.com/jquery-3.1.1.js"></script>

</head>
<body data-ng-controller="singleforum">
 <div >
	<div style="margin-top: 20px;border: 5px;border-color: blue">
		<c:if test="${!empty forumlist}">
			<c:forEach items="${forumlist}" var="forum">
				<div  hidden="true">
					<p style="padding: 10px; font-size: large">
						<input type="number" value="${forum.f_id}" id="f_id">
					</p>
				</div>
				<div style="background-color: lightgrey">
					<p style="padding: 10px; font-size: large;">
						<strong>${forum.name}</strong>
					</p>
				</div>
				<div style="background-color: lightgrey">
					<p style="padding: 10px; font-size: medium">${forum.description}</p>
				</div>
			</c:forEach>
		</c:if>
	</div>
	<br>
	 <sec:authorize access="isAuthenticated()"> 
		<div class="row"  >
			<form role="form" >
				<div class=" col-sm-11">
					<input type=text data-ng-model="comments" class="form-control" placeholder="Enter Comment">
				</div>
				<div class=" col-sm-1">
					<button type="submit" data-ng-click="Comment()" class="btn btn-success" style="float: right">Comment</button>
				</div>
			</form>
		</div>
	 </sec:authorize> 
	<br>

<div data-ng-init="getAllForumComments()">
		<table class="table table-bordered table-hover">
			
			<tbody>
				<tr data-ng-repeat="comment in allcomments">
					<td width="80%">{{comment.comments}}</td>
					<td width="20%">{{comment.commenttime}}</td>
					
					
				</tr>
			</tbody>
		</table>
	</div>
	</div>
	</body>
	</html>

