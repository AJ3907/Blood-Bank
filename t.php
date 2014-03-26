<?php


class MyDB extends SQLite3
   {
      function __construct()
      {
         $this->open('test.db');
      }
   }
   $db = new MyDB();
   if(!$db){
      echo $db->lastErrorMsg();
   } else {
      echo "Opened database successfully\n";
   }

$sql =<<<EOF
      INSERT INTO PROFILE (ID,PHONE,PASS)
      VALUES (1, 'Paul', '1234567890');

      INSERT INTO PROFILE (ID,PHONE,PASS)
      VALUES (2, 'Allen', '0123456789');

EOF;
$ret = $db->exec($sql);
   if(!$ret){
      echo $db->lastErrorMsg();
   } else {
      echo "Records created successfully\n";
   }
   $db->close();
   ?>
