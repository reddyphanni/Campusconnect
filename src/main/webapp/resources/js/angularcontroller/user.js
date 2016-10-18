var app = angular.module('myapp',[])
app.controller('Usercontroller',['$scope','$http',function($scope,$http){
$scope.submit=function() {
	var BASE_URL="http://localhost:8081/Testpro";
	$scope.user={
			name:$scope.name,
			username:$scope.username,
			email:$scope.email,
			password:$scope.password,
			usermobile:$scope.usermobile,
			
	}
	$http({
		method:'POST',
		url:BASE_URL+'/userdetails',
		data:$scope.user
	}).success(function(data, status, headers, config) {
		console.log($scope.user);
		alert("Success");
		$scope.name ='';
		$scope.username = '';
		$scope.email='';
		$scope.password='';
		$scope.usermobile='';
		
	}).error(function(data, status, headers, config) {
		console.log($scope.user);
		alert("Error");
	});
};                               
	
	
	
	
}]);