<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring Angular Routing Example</title>

<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular-route.js"></script>
 <script src="JS/routing.js"></script>

</head>
<body ng-app="myRoutingApp">
<center><h2>This is a Index Page</h2></center>
<hr>
<ul>
  <li><a href="#!home">HOME</a></li>
  <li><a href="#!contact">CONTACT US</a></li>
  <li><a href="#!signup">SIGN UP</a></li>
</ul>

<hr>
<center><div ng-view></div></center>
</body>
</html>