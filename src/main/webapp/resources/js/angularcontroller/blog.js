var app = angular.module('myapp',[])
app.controller('blogcontroller', [ '$scope', '$http', function($scope, $http) {
	var BASE_URL='http://localhost:8081/Testpro';
     $scope.userid=document.getElementById("userid").value;  

	$scope.submit = function(){
		var BASE_URL='http://localhost:8081/Testpro';
		
		$scope.blog= {
				b_id:$scope.b_id,
				name:$scope.name,
				description:$scope.description
				
		}
		$http({
			method:'POST',
			url:BASE_URL + '/Blog',
			data:$scope.blog
		}).success(function(data, status, headers, config) {
			
			$scope.b_id ='';
			$scope.name = '';
			$scope.description='';
		}).error(function(data, status, headers, config) {
			alert("unable to save");
		});
	};
	
	$scope.getalldetails=function() {
		$http({
			method:'GET',
            url:'getalldetails'
		}).then(function(response) {
	        $scope.blogs = response.data;
		
		/*.success(function(data,status,headers,config){
			$scope.blogs = data;
			console.log($scope.blogs);
			
		}).error(function(data,status,headers,config){
			alert("error");
		});
		*/
		 });
		
		};
		
	$scope.deleteblog=function(id){
			$http({
				method:'DELETE',
              url:'deleteblog/'+b_id			
			}).success(function(data, status, headers, config) {
			   
			}).error(function(data, status, headers, config) {
				alert("error");
			});
		};
		$scope.editblog=function(id){
			$http({
				method:'GET',
				url:'editblog/'+id
			}).success(function(data, status, headers, config) {
				$scope.blog=data;
				$scope.b_id=$scope.blog.b_id;
				$scope.name=$scope.blog.name;
				$scope.description=$scope.blog.description;
				
				
			}).error(function(data, status, headers, config) {
				alert("error");
			});
			
			
			
		};
		$scope.access=function(b_userid){
			console.log($scope.userid);
			console.log(b_userid);
			
			if($scope.userid ==b_userid)
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
