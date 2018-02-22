import sbt._

object Dependencies {
  lazy val ScalaTest = "org.scalatest" %% "scalatest" % "3.0.5" % Test
  lazy val KafkaClients = "org.apache.kafka" % "kafka-clients" % "1.0.0"
  lazy val ExecutorTools = "com.evolutiongaming" %% "executor-tools" % "1.0.0"
  lazy val Sequentially = "com.evolutiongaming" %% "sequentially" % "1.0.3"
  lazy val Nel = "com.evolutiongaming" %% "nel" % "1.0"
  lazy val ConfigTools = "com.evolutiongaming" %% "config-tools" % "1.0.1"
  lazy val MetricTools = "com.evolutiongaming" %% "metric-tools" % "1.1"
  lazy val SafeActor = "com.evolutiongaming" %% "safe-actor" % "1.4"
}