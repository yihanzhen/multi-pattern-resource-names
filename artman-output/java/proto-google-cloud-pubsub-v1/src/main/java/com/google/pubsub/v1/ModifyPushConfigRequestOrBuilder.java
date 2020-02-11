// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

public interface ModifyPushConfigRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.ModifyPushConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the subscription.
   * Format is `projects/{project}/subscriptions/{sub}`.
   * </pre>
   *
   * <code>string subscription = 1;</code>
   * @return The subscription.
   */
  java.lang.String getSubscription();
  /**
   * <pre>
   * The name of the subscription.
   * Format is `projects/{project}/subscriptions/{sub}`.
   * </pre>
   *
   * <code>string subscription = 1;</code>
   * @return The bytes for subscription.
   */
  com.google.protobuf.ByteString
      getSubscriptionBytes();

  /**
   * <pre>
   * The push configuration for future deliveries.
   * An empty `pushConfig` indicates that the Pub/Sub system should
   * stop pushing messages from the given subscription and allow
   * messages to be pulled and acknowledged - effectively pausing
   * the subscription if `Pull` or `StreamingPull` is not called.
   * </pre>
   *
   * <code>.google.pubsub.v1.PushConfig push_config = 2;</code>
   * @return Whether the pushConfig field is set.
   */
  boolean hasPushConfig();
  /**
   * <pre>
   * The push configuration for future deliveries.
   * An empty `pushConfig` indicates that the Pub/Sub system should
   * stop pushing messages from the given subscription and allow
   * messages to be pulled and acknowledged - effectively pausing
   * the subscription if `Pull` or `StreamingPull` is not called.
   * </pre>
   *
   * <code>.google.pubsub.v1.PushConfig push_config = 2;</code>
   * @return The pushConfig.
   */
  com.google.pubsub.v1.PushConfig getPushConfig();
  /**
   * <pre>
   * The push configuration for future deliveries.
   * An empty `pushConfig` indicates that the Pub/Sub system should
   * stop pushing messages from the given subscription and allow
   * messages to be pulled and acknowledged - effectively pausing
   * the subscription if `Pull` or `StreamingPull` is not called.
   * </pre>
   *
   * <code>.google.pubsub.v1.PushConfig push_config = 2;</code>
   */
  com.google.pubsub.v1.PushConfigOrBuilder getPushConfigOrBuilder();
}
