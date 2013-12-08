name := "Scala for the Impatient Exercises"

version := "1.0"

scalaVersion := "2.10.3"

libraryDependencies ++= {
    Seq(
        "org.scalatest" % "scalatest_2.10" % "2.0" % "test"
    )
}

resolvers ++= Seq("snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
                  "releases"  at "http://oss.sonatype.org/content/repositories/releases"
              )
