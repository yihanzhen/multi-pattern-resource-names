// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

public interface ReceivedMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.ReceivedMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * This ID can be used to acknowledge the received message.
   * </pre>
   *
   * <code>string ack_id = 1;</code>
   */
  java.lang.String getAckId();
  /**
   * <pre>
   * This ID can be used to acknowledge the received message.
   * </pre>
   *
   * <code>string ack_id = 1;</code>
   */
  com.google.protobuf.ByteString
      getAckIdBytes();

  /**
   * <pre>
   * The message.
   * </pre>
   *
   * <code>.google.pubsub.v1.PubsubMessage message = 2;</code>
   */
  boolean hasMessage();
  /**
   * <pre>
   * The message.
   * </pre>
   *
   * <code>.google.pubsub.v1.PubsubMessage message = 2;</code>
   */
  com.google.pubsub.v1.PubsubMessage getMessage();
  /**
   * <pre>
   * The message.
   * </pre>
   *
   * <code>.google.pubsub.v1.PubsubMessage message = 2;</code>
   */
  com.google.pubsub.v1.PubsubMessageOrBuilder getMessageOrBuilder();

  /**
   * <pre>
   * Delivery attempt counter is 1 + (the sum of number of NACKs and number of
   * ack_deadline exceeds) for this message.
   * A NACK is any call to ModifyAckDeadline with a 0 deadline. An ack_deadline
   * exceeds event is whenever a message is not acknowledged within
   * ack_deadline. Note that ack_deadline is initially
   * Subscription.ackDeadlineSeconds, but may get extended automatically by
   * the client library.
   * The first delivery of a given message will have this value as 1. The value
   * is calculated at best effort and is approximate.
   * If a DeadLetterPolicy is not set on the subscription, this will be 0.
   * &lt;b&gt;EXPERIMENTAL:&lt;/b&gt; This feature is part of a closed alpha release. This
   * API might be changed in backward-incompatible ways and is not recommended
   * for production use. It is not subject to any SLA or deprecation policy.
   * </pre>
   *
   * <code>int32 delivery_attempt = 3;</code>
   */
  int getDeliveryAttempt();
}