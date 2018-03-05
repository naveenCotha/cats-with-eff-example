name := "cats-with-eff-example"

version := "0.1"

scalaVersion := "2.12.4"

libraryDependencies += "org.typelevel" %% "cats-core" % "1.0.1"
libraryDependencies += "org.atnos" %% "eff" % "5.1.0"


resolvers += Resolver.sonatypeRepo("releases")

// to write types like Reader[String, ?]
addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.4")