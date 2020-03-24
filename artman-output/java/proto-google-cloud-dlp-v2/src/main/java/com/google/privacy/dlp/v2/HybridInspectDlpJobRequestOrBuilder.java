// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface HybridInspectDlpJobRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.HybridInspectDlpJobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Resource name of the job to execute a hybrid inspect on, for
   * example `projects/dlp-test-project/dlpJob/53234423`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Resource name of the job to execute a hybrid inspect on, for
   * example `projects/dlp-test-project/dlpJob/53234423`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The item to inspect.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.HybridContentItem hybrid_item = 3;</code>
   * @return Whether the hybridItem field is set.
   */
  boolean hasHybridItem();
  /**
   * <pre>
   * The item to inspect.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.HybridContentItem hybrid_item = 3;</code>
   * @return The hybridItem.
   */
  com.google.privacy.dlp.v2.HybridContentItem getHybridItem();
  /**
   * <pre>
   * The item to inspect.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.HybridContentItem hybrid_item = 3;</code>
   */
  com.google.privacy.dlp.v2.HybridContentItemOrBuilder getHybridItemOrBuilder();
}
