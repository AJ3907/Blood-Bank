<?php

$flag=0;
$s="";
if($_POST)
{
   $phone=$_POST['Phone'];
   $pass=$_POST['Password'];
   $bloodgroup=$_POST['BloodGroup'];
   $name=$_POST['Name'];
   $city=$_POST['City'];

   //file_put_contents('a.txt', $pass);
   
}

   class MyDB extends SQLite3
   {
      function __construct()
      {
         $this->open('test.db');
      }
   }
   $db = new MyDB();
  
   $sql =<<<EOF
      SELECT * from PROFILE;
EOF;
$n = 0;
   $ret = $db->query($sql);
   while($row = $ret->fetchArray(SQLITE3_ASSOC) ){
      if(strcmp($ph,$row['PHONE'])==0)
      {
         $flag=1;     
         echo "0"; //User already exists.
      }
n=$row['ID'];
         
   }

   if($flag==0)
   {
      $sql =<<<EOF
      INSERT INTO PROFILE (ID,PHONE,NAME,PASSWORD,BLOODGROUP,CITY);
      VALUES (n, $phone, $name, $password, $bloodgroup, $city);
EOF;
echo "1";// User registered
   }
   $db->exec($sql);
   
   $db->close();
?>
