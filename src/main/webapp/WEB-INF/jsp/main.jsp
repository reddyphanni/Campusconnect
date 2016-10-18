<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Connect</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"> 
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
</head>
<body>

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">CONNECT</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="blog">Blog</a></li>
      <li><a href="forum">Forum</a></li>
      <li><a href="chat">Chat</a></li>
      <sec:authorize access="isAuthenticated()">
       <li><a href="profile">Profile</a></li>
      </sec:authorize>
    </ul>
    <sec:authorize access="isAuthenticated()">
    <ul class="nav navbar-nav navbar-right">
						<li><a style="color: black">Hello <b><sec:authentication
										property="principal.username" /></b></a></li>
										<li><a href="${pageContext.request.contextPath}/perform_logout"><span
								class="glyphicon glyphicon-log-out"></span></a></li>
				
								</ul>		</sec:authorize>
      <sec:authorize access="!isAuthenticated()">
     <ul class="nav navbar-nav navbar-right">
      <li><a href="login"><span class="glyphicon glyphicon-user"></span> Sign Up/Sign In</a></li>
    <!--   <li><a href="register"><span class="glyphicon glyphicon-log-in"></span> Login</a></li> -->
    </ul>
    </sec:authorize>
  </div>
</nav>

  <c:choose>
  <c:when test="${loginclicked}">
  <c:import url="\home.jsp"></c:import>
  </c:when>
   <c:when test="${blogclicked}">
  <c:import url="\blog.jsp"></c:import>
  </c:when>
   <c:when test="${forumclicked}">
  <c:import url="\forum.jsp"></c:import>
  </c:when>
   <c:when test="${chatclicked}">
  <c:import url="\Chat.jsp"></c:import>
  </c:when>
  <c:when test="${viewforumclicked}">
				
					<c:import url="\singleform.jsp">
					</c:import>
				</c:when>
				<c:when test="${viewblogclicked}">
				
					<c:import url="\individualblog.jsp">
					</c:import>
				</c:when>
				<c:when test="${profileclicked}">
				<sec:authorize access="hasRole('ROLE_USER')">
				<c:import url="/WEB-INF/jsp/Body.jsp">
					</c:import>
				</sec:authorize>
				</c:when>
				<c:otherwise>
			<%-- <sec:authorize access="hasRole('ROLE_USER')">
				<div class="container-fluid">
					<c:import url="/WEB-INF/jsp/Body.jsp">
					</c:import> --%>
				
			</c:otherwise>
  
  </c:choose>
<!-- <div class="container">
  <h3>Basic Navbar Example</h3>
  <p>A navigation bar is a navigation header that is placed at the top of the page.</p>
</div> -->

</body>
</html>

