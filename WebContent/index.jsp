<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WebService Prototype</title>
<script src="js/lib/angular.min.js"></script>
<script src="js/lib/angular-animate.min.js"></script>
<script src="js/lib/angular-touch.min.js"></script>
<script src="js/hello.js"></script>
<link rel="stylesheet" href="css/lib/bootstrap.min.css">
</head>
<body ng-app="hello">
  <h1>WebService Prototype</h1>
  <div ng-controller="Hello">
  <p>Oggi è {{dataOra.dayS}} {{dataOra.day}} {{dataOra.monthS}} {{dataOra.year}}</p>
  Sono le ore {{dataOra.hour}}:{{dataOra.minute}}:{{dataOra.second}}</div>

ORE:<div class="progress" ng-controller="Hello" style="width: 100px">
  <div class="progress-bar" role="progressbar" aria-valuenow="{{dataOra.hour}}" aria-valuemin="0" 
    aria-valuemax="24" style="min-width: 1px; width: {{(100*dataOra.hour/24)}}%;"> {{dataOra.hour}}</div>
</div>
MIN: <div class="progress" ng-controller="Hello" style="width: 100px">
  <div class="progress-bar" role="progressbar" aria-valuenow="{{dataOra.minute}}" aria-valuemin="0" 
    aria-valuemax="60" style="min-width: 1px; width: {{(100*dataOra.minute/60)}}%;"> {{dataOra.minute}}</div>
</div>
SEC: <div class="progress" ng-controller="Hello" style="width: 100px">
  <div class="progress-bar" role="progressbar" aria-valuenow="{{dataOra.second}}" aria-valuemin="0" 
    aria-valuemax="60" style="min-width: 1px; width: {{(100*dataOra.second/60)}}%;"> {{dataOra.second}}</div>
</div>

<i>Build: $Id$</i>
</body>
</html>
