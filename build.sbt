name := "scala.stats"
organization := "objektwerks"
version := "0.1-SNAPSHOT"
scalaVersion := "2.12.6"
libraryDependencies ++= {
  Seq(
    "org.scalafx" % "scalafx_2.12" % "8.0.144-R12",
    "org.scalatest" % "scalatest_2.12" % "3.0.4" % "test"
  )
}
unmanagedJars in Compile += Attributed.blank(file(System.getenv("JAVA_HOME") + "/jre/lib/ext/jfxrt.jar"))
scalacOptions ++= Seq(
  "-language:postfixOps",
  "-language:reflectiveCalls",
  "-language:implicitConversions",
  "-language:higherKinds",
  "-feature",
  "-Ywarn-unused-import",
  "-Ywarn-unused",
  "-Ywarn-dead-code",
  "-unchecked",
  "-deprecation",
  "-Xfatal-warnings",
  "-Xlint:missing-interpolator",
  "-Xlint"
)
fork in test := true
