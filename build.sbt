name := "monolith"

scalaVersion := "2.10.3"

resolvers ++= Seq(
  "Sonatype Public"     at "https://oss.sonatype.org/content/groups/public",
  "Sonatype Snapshots"  at "https://oss.sonatype.org/content/repositories/snapshots/"
)

libraryDependencies ++= Seq(
  "org.scalaz"        %% "scalaz-core"    % "7.0.4",
  "org.spire-math"    %% "spire"          % "0.6.0"
)
