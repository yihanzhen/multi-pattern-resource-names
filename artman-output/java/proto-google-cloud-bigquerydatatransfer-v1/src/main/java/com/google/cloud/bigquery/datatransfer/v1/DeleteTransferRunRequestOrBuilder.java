// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/datatransfer.proto

package com.google.cloud.bigquery.datatransfer.v1;

public interface DeleteTransferRunRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datatransfer.v1.DeleteTransferRunRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The field will contain name of the resource requested, for example:
   * `projects/{project_id}/transferConfigs/{config_id}/runs/{run_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The field will contain name of the resource requested, for example:
   * `projects/{project_id}/transferConfigs/{config_id}/runs/{run_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();
}