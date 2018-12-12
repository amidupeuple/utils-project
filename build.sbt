name := "utils-project"

version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies ++= Seq(
  "org.apache.poi" % "poi" % "4.0.1",
  "org.apache.poi" % "poi-ooxml" % "4.0.1"
)

scalacOptions ++= Seq("-unchecked", "-deprecation")
