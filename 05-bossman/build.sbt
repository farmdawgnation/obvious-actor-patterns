name := "bossman"

organization := "me.frmr"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.4.1"

fork in (Compile, run) := true
