resolvers += "Sonatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/" 
addSbtPlugin("com.typesafe.sbt" % "sbt-site" % "0.7.0") 
addSbtPlugin("com.github.mpeltonen" % "sbt-idea" % "1.6.0")  
addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0-RC4")
