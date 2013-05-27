version := "0.1"

name := "embed"

organization := "embed"

scalaVersion := "2.10.0"

publishTo  := Some("foo" at (file(".") / "target" / "repo").toURI.toURL.toString)

sbtPlugin := true

seq(aetherPublishSettings: _*)
