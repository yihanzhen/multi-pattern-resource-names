// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

public interface ListTopicSubscriptionsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.ListTopicSubscriptionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the topic that subscriptions are attached to.
   * Format is `projects/{project}/topics/{topic}`.
   * </pre>
   *
   * <code>string topic = 1;</code>
   * @return The topic.
   */
  java.lang.String getTopic();
  /**
   * <pre>
   * The name of the topic that subscriptions are attached to.
   * Format is `projects/{project}/topics/{topic}`.
   * </pre>
   *
   * <code>string topic = 1;</code>
   * @return The bytes for topic.
   */
  com.google.protobuf.ByteString
      getTopicBytes();

  /**
   * <pre>
   * Maximum number of subscription names to return.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * The value returned by the last `ListTopicSubscriptionsResponse`; indicates
   * that this is a continuation of a prior `ListTopicSubscriptions` call, and
   * that the system should return the next page of data.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * The value returned by the last `ListTopicSubscriptionsResponse`; indicates
   * that this is a continuation of a prior `ListTopicSubscriptions` call, and
   * that the system should return the next page of data.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
