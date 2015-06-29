<!doctype html>
<html ng-app>
    <head>
        <script src="angular/angular.min.js"></script>
    </head>
   <body>
        Your name: <input type="text" ng-model="yourname" placeholder="World">
        <hr>
        Hello {{yourname || 'World'}}!
        <p>Nothing here {{'yet' + '!'}}</p>
    </body>
</html>