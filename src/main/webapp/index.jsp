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
	<p>
		<c:url value="getLearner" var="messageUrl" />
		<a href="${messageUrl}">Click to get learner</a>
	</p>
	<p>
		<c:url value="getTeacher" var="messageUrl" />
		<a href="${messageUrl}">Click to get teacher</a>
	</p>
	<!-- angularjs part -->
	<div ng-app="">
		<p>
			Name: <input type="text" ng-model="name">
		</p>
		<p ng-bind="name"></p>
	</div>
	
</body>
</html>
