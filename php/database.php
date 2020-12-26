<?php 
header('Access-Control-Allow-Origin: *');

header("Content-Type: application/json;charset=UTF-8");
header("Access-Control-Allow-Methods: PUT,GET,POST");
header("Access-Control-Allow-Headers: Origin, X-Requested-With,Content-Type,Accept");


$servername = 'localhost'; 
$username = 'root'; 
$password = ''; 
$dbname = 'project'; 
  
// checking connection 
$conn = new mysqli($servername, $username, $password, $dbname); 
?> 