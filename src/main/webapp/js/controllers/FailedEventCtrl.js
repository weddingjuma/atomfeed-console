var atomFeedConsoleApp = angular.module('atomFeedConsole');

atomFeedConsoleApp.controller('FailedEventCtrl',['$scope', '$routeParams','FailedEventService',
 function($scope, $routeParams, FailedEventService){
    console.log('failedEventCtrl')
    FailedEventService.getFailedEventData($routeParams.appName,$routeParams.feedUri).then(function(response){
        $scope.results = response.data;
        $scope.appName = $routeParams.appName
        //console.log(response.data)


//        $scope.submitForm = function(){
//             method  : 'POST',
//             url     : '/apps/appName/failedEvent/result.event.id/resetRetryCount',
//        }

    });

}])

