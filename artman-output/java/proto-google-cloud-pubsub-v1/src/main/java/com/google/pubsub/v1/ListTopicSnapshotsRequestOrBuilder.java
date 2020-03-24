// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

public interface ListTopicSnapshotsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.ListTopicSnapshotsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the topic that snapshots are attached to.
   * Format is `projects/{project}/topics/{topic}`.
   * </pre>
   *
   * <code>string topic = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The topic.
   */
  java.lang.String getTopic();
  /**
   * <pre>
   * Required. The name of the topic that snapshots are attached to.
   * Format is `projects/{project}/topics/{topic}`.
   * </pre>
   *
   * <code>string topic = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for topic.
   */
  com.google.protobuf.ByteString
      getTopicBytes();

  /**
   * <pre>
   * Maximum number of snapshot names to return.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   * @return The pageSize.
   */
  int getPageSize();

  /**
   * <pre>
   * The value returned by the last `ListTopicSnapshotsResponse`; indicates
   * that this is a continuation of a prior `ListTopicSnapshots` call, and
   * that the system should return the next page of data.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * The value returned by the last `ListTopicSnapshotsResponse`; indicates
   * that this is a continuation of a prior `ListTopicSnapshots` call, and
   * that the system should return the next page of data.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();
}
