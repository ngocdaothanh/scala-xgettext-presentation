organization := "tv.cntt"
name         := "scala-xgettext-presentation"
version      := "1.0-SNAPSHOT"

scalaVersion := "2.11.6"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked")
javacOptions  ++= Seq("-source", "1.7", "-target", "1.7")

// scala-xgettext
autoCompilerPlugins := true
addCompilerPlugin("tv.cntt" %% "xgettext" % "1.3")
scalacOptions += "-P:xgettext:hello.I18n"

// scaposer
libraryDependencies += "tv.cntt" %% "scaposer" % "1.6"
