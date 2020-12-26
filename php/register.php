<?php
include_once("database.php");
 
$postdata = file_get_contents("php://input");
 $request=json_decode($postdata);
 $name=$request->name;
 $email=$request->email;
 $pwd=$request->pwd;
 $pwd2=$request->pwd2;

$sql="Insert into registration(name,email,pwd,pwd2) 
values('$name','$email','$pwd','$pwd2')";

if(mysqli_query($conn,$sql))
{
   echo json_encode("done");
}

?>