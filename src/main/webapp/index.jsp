<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta charset="utf-8">
<title>Welcome</title>
<script
	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
</head>
<body>
	<!-- angularjs part -->
	<div ng-app="">
		<p>
			Name: <input type="text" ng-model="teacher">
		</p>
		<p id="teacherid" ng-bind="teacher"></p>
		<p2>			
			<c:url var="messageUrl" value="teacher" >
			    <c:param name="Add" value="${teacherid}" />
			</c:url>
			<a href="${messageUrl}">Click to get teacher</a>
		</p2>
	</div>
	<p>
		<c:url value="learner" var="messageUrl" />
		<a href="${messageUrl}">Click to get learner</a>
	</p>
	<p>
		<c:url value="teacher/all" var="messageUrl" />
		<a href="${messageUrl}">Click to get teachers</a>
	</p>





</body>
</html>
