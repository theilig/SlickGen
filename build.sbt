name := "SlickGen"

version := "0.1"

scalaVersion := "2.13.2"

libraryDependencies += "com.typesafe.slick" %% "slick-codegen" % "3.3.2"

libraryDependencies ++= Seq("mysql" % "mysql-connector-java" % "5.1.49")
