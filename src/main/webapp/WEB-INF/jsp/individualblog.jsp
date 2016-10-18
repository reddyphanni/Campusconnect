<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div ><!-- data-ng-controller="IndividualBlog" -->
	<div style="margin-top: 20px;border: 5px;border-color: blue">
		<c:if test="${!empty bloglist}">
			<c:forEach items="${bloglist}" var="blog">
				<div  hidden="true">
					<p style="padding: 10px; font-size: large">
						<input type="number" value="${blog.b_id}" id="bid">
					</p>
				</div>
				<div style="background-color: lightgrey">
					<p style="padding: 10px; font-size: large;">
						<strong>${blog.name}</strong>
					</p>
				</div>
				<div style="background-color: lightgrey">
					<p style="padding: 10px; font-size: medium">${blog.description}</p>
				</div>
			</c:forEach>
		</c:if>
	</div>
	<%-- <script src="${pageContext.request.contextPath}/resources/js/AngularControllers/IndividualBlog.js"></script>
	 --%>

</div>



<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
njdsgyds</h1>
<table>
<c:if test="${!empty bloglist} ">
<c:forEach items="${bloglist}" var="blog">
<tr>
<td>${blog.b_id};
${blog. description};</td>

</c:forEach>
</c:if>
</table>
</body>
</html> --%>