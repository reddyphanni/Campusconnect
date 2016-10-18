var app = angular.module('myapp',[])
app.controller('forumcontroller', [ '$scope', '$http', function($scope, $http) {
	var BASE_URL='http://localhost:8081/Testpro';

	  $scope.userid=document.getElementById("userid").value;  
	$scope.submit = function(){
		var BASE_URL='http://localhost:8081/Testpro';
		
		$scope.forum= {
				f_id:$scope.f_id,
				name:$scope.name,
				description:$scope.description
				
		}
		$http({
			method:'POST',
			url:BASE_URL + '/Forum',
			data:$scope.forum
		}).success(function(data, status, headers, config) {
			alert("Success");
			$scope.f_id ='';
			$scope.name = '';
			$scope.description='';
		}).error(function(data, status, headers, config) {
			alert("Error");
		});
	};
	
	/*$scope.getallforumdetails=function() {
		$http({
			method:'GET',
            url:'getallforumdetails'
		}).then(function(response) {
	        $scope.forums = response.data;
		
		.success(function(data,status,headers,config){
			$scope.blogs = data;
			console.log($scope.forums);
			
		}).error(function(data,status,headers,config){
			alert("error");
		});
		
		
		
		};*/
		
	$scope.deleteforum=function(f_id){
			$http({
				method:'DELETE',
              url:'deleteforum/'+f_id			
			}).success(function(data, status, headers, config) {
			   alert("Success");
			}).error(function(data, status, headers, config) {
				alert("error");
			});
		};
		$scope.editforum=function(f_id){
			$http({
				method:'GET',
				url:'editforum/'+f_id
			}).success(function(data, status, headers, config) {
				$scope.forum=data;
				$scope.f_id=$scope.forum.f_id;
				$scope.name=$scope.forum.name;
				$scope.description=$scope.forum.description;
				
				
			}).error(function(data, status, headers, config) {
				alert("error");
			});
			
			
			
		};
		$scope.getallforumdetails=function() {
			$http({
				method:'GET',
	            url:'getallforumdetails'
			}).then(function(response) {
		        $scope.forums = response.data;
			});
			
			
			
		};
		$scope.access=function(f_userid){
			console.log($scope.userid);
			console.log(f_userid);
			
			if($scope.userid ==f_userid)
				{
				console.log("true");
				return true;
				console.log("trueiu");
				}else{
					console.log("fale")
				return false;
			console.log("falsjasg")
				}};
		

}]);
