name := "scalafx.stats"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "2.13.7"
libraryDependencies ++= {
  Seq(
    "org.scalafx" %% "scalafx" % "17.0.1-R26",
    "org.scalatest" %% "scalatest" % "3.2.10" % Test
  )
}
