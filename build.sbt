name := """stamkast"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws,
  "org.webjars.bower" % "bootstrap" % "3.3.4",
  "org.webjars" %% "webjars-play" % "2.3.0-2",
  "com.typesafe.play" %% "play-mailer" % "2.4.0",
  "jp.t2v" %% "play2-auth"      % "0.13.2",
  "jp.t2v" %% "play2-auth-test" % "0.13.2" % "test"
)

herokuAppName in Compile := "stamkast"

fork in run := true