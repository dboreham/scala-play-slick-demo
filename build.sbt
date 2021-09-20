name := """scala-play-slick-demo"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.6"

ThisBuild / libraryDependencySchemes += "com.typesafe.slick" %% "slick" % "early-semver"
ThisBuild / libraryDependencySchemes += "com.typesafe.slick" %% "slick-hikaricp" % "early-semver"

libraryDependencies += guice
libraryDependencies += "com.typesafe.play" %% "play-slick" % "5.0.0"
libraryDependencies += "org.postgresql" % "postgresql" % "42.2.2"
libraryDependencies += "com.typesafe.slick" %% "slick" % "3.4.0-SNAPSHOT"
libraryDependencies += "com.typesafe.slick" %% "slick-hikaricp" % "3.4.0-SNAPSHOT"
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.example.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.example.binders._"
