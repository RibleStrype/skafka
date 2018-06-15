package com.evolutiongaming.skafka.consumer


import com.evolutiongaming.skafka.Converters._
import com.evolutiongaming.skafka._
import org.apache.kafka.clients.consumer.{ConsumerRebalanceListener => RebalanceListenerJ}

import scala.collection.JavaConverters._

trait RebalanceListener {

  def onPartitionsAssigned(partitions: Iterable[TopicPartition]): Unit

  def onPartitionsRevoked(partitions: Iterable[TopicPartition]): Unit
}

object RebalanceListener {

  def apply(listener: RebalanceListenerJ): RebalanceListener = new RebalanceListener {

    def onPartitionsAssigned(partitions: Iterable[TopicPartition]): Unit = {
      val partitionsJ = partitions.map(_.asJava).asJavaCollection
      listener.onPartitionsAssigned(partitionsJ)
    }

    def onPartitionsRevoked(partitions: Iterable[TopicPartition]): Unit = {
      val partitionsJ = partitions.map(_.asJava).asJavaCollection
      listener.onPartitionsRevoked(partitionsJ)
    }
  }
}
