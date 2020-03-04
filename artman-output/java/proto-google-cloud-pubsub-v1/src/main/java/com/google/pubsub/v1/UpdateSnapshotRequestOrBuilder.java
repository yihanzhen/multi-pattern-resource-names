// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

public interface UpdateSnapshotRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.UpdateSnapshotRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The updated snapshot object.
   * </pre>
   *
   * <code>.google.pubsub.v1.Snapshot snapshot = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the snapshot field is set.
   */
  boolean hasSnapshot();
  /**
   * <pre>
   * Required. The updated snapshot object.
   * </pre>
   *
   * <code>.google.pubsub.v1.Snapshot snapshot = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The snapshot.
   */
  com.google.pubsub.v1.Snapshot getSnapshot();
  /**
   * <pre>
   * Required. The updated snapshot object.
   * </pre>
   *
   * <code>.google.pubsub.v1.Snapshot snapshot = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.pubsub.v1.SnapshotOrBuilder getSnapshotOrBuilder();

  /**
   * <pre>
   * Required. Indicates which fields in the provided snapshot to update.
   * Must be specified and non-empty.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Required. Indicates which fields in the provided snapshot to update.
   * Must be specified and non-empty.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Required. Indicates which fields in the provided snapshot to update.
   * Must be specified and non-empty.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}