<?php

$flag=0;
$s="";
if($_POST)
{
   $ph=$_POST['ph'];
   $pass=$_POST['pass'];
   file_put_contents('a.txt', $pass);
   
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

   $ret = $db->query($sql);
   while($row = $ret->fetchArray(SQLITE3_ASSOC) ){
      if(strcmp($ph,$row['PHONE'])==0 && strcmp($pass,$row['PASS'])==0)
         $flag=1;
   }
   if($flag==1)
      echo "1";
   else
      echo "0";
   $db->close();
?>
