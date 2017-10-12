angular.module('hello', []).controller(
    'Hello',
    function($scope, $http) {
      $http.get('http://127.0.0.1:8080/WsProto/services/hello/getTimeJSon').then(
          function(response) {
            $scope.dataOra = response.data;
          });
    });