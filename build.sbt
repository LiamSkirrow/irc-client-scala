val scala3Version = "3.3.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "irc-client",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "0.7.29" % Test,
    libraryDependencies += "org.scalafx" %% "scalafx" % "16.0.0-R24",
    // libraryDependencies += "org.openjfx" % "javafx" % "12.0.2" pomOnly()
    
    // ScalaFX requires JavaFX
    libraryDependencies ++= {
      // Determine OS version of JavaFX binaries
      lazy val osName = System.getProperty("os.name") match {
        case n if n.startsWith("Linux") => "linux"
        case n if n.startsWith("Mac") => "mac"
        case n if n.startsWith("Windows") => "win"
        case _ => throw new Exception("Unknown platform!")
      }
      Seq("base", "controls", "fxml", "graphics", "media", "swing", "web")
        .map(m => "org.openjfx" % s"javafx-$m" % "16" classifier osName)
    }
  )


// useful page on dependency stuff...
// https://askubuntu.com/questions/1091157/javafx-missing-ubuntu-18-04