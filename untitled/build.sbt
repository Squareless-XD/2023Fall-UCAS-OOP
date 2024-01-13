ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

libraryDependencies += "edu.berkeley.cs" %% "chisel3" % "3.1.2"

lazy val root = (project in file("."))
  .settings(
    name := "untitled"
  )
