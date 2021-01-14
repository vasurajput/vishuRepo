var app = angular.module("myRoutingApp", ["ngRoute"]);
app.config(function($routeProvider) {
  $routeProvider
  .when("/home", {
    templateUrl : "homeEndPoint"
  })
  .when("/contact", {
    templateUrl : "contactUsEndPoint"
  })
  .when("/signup", {
    templateUrl : "signUpEndPoint"
  })
  .otherwise({
	  templateUrl : "defaultEndPoint"
	  });
});