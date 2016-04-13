
function getFollowers($scope, $http) {
    //$http.get('http://rest-service.guides.spring.io/follower').
	$http.get('http://localhost:8080/followers').
        success(function(data) {
            $scope.followers = data;
        });
}