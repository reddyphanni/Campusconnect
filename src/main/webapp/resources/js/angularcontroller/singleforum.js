var app=angular.module('myapp',[])
app.controller('singleforum', [ '$scope', '$http', function($scope, $http) {
	/*var BASE_URL = 'http://localhost:8081/Testpro';
	   $scope.comments = '';*/
	    $scope.c_fid=document.getElementById("f_id").value;  
	    var BASE_URL = 'http://localhost:8081/Testpro';
	    $scope.Comment = function() {
	    	$scope.comment = {	
					c_fid : $scope.c_fid,
					comments : $scope.comments,
				}
			$http({
				method : 'POST',
				url : BASE_URL + '/ForumComments',
				data : $scope.comment
			}).success(function(data, status, headers, config) {
				
			    $scope.comments= '';
			    console.log($scope.comments)
			}).error(function(data, status, headers, config) {
				alert("Error");
			});	
		};
		$scope.getAllForumComments = function() {
			$http({
				method : 'GET',
				url : BASE_URL + '/getAllComments/'+ $scope.c_fid
			}).success(function(data, status, headers, config) {
				$scope.allcomments = data;
			console.log($scope.allcomments)
			}).error(function(data, status, headers, config) {
				alert("Error");
			});
		};
}]);


