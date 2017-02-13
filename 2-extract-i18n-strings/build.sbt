organization := "tv.cntt"
name         := "scala-xgettext-presentation"
version      := "1.0-SNAPSHOT"

scalaVersion := "2.12.1"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked")
javacOptions  ++= Seq("-source", "1.8", "-target", "1.8")

// scala-xgettext
autoCompilerPlugins := true
addCompilerPlugin("tv.cntt" %% "xgettext" % "1.5.1")
scalacOptions += "-P:xgettext:hello.I18n"
