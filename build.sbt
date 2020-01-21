val RainierVersion = "0.2.3"
val PlotlyVersion = "0.7.2"

lazy val root = (project in file(".")).settings(
  inThisBuild(
    List(
      organization := "ca.valencik",
      scalaVersion := "2.12.10",
      version := "0.1.0-SNAPSHOT",
    )
  ),
  name := "mdoc-plotly-example",
  libraryDependencies ++= Seq(
    "com.stripe"    %% "rainier-core" % RainierVersion,
    "org.plotly-scala" %% "plotly-render" % PlotlyVersion
  )
)
lazy val docs = (project in file("mdocs"))
  .dependsOn(root)
  .enablePlugins(MdocPlugin)
