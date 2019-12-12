// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/jobs.proto

package com.google.cloud.dataproc.v1;

public interface JobPlacementOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.JobPlacement)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the cluster where the job will be submitted.
   * </pre>
   *
   * <code>string cluster_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getClusterName();
  /**
   * <pre>
   * Required. The name of the cluster where the job will be submitted.
   * </pre>
   *
   * <code>string cluster_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString
      getClusterNameBytes();

  /**
   * <pre>
   * Output only. A cluster UUID generated by the Cloud Dataproc service when
   * the job is submitted.
   * </pre>
   *
   * <code>string cluster_uuid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.lang.String getClusterUuid();
  /**
   * <pre>
   * Output only. A cluster UUID generated by the Cloud Dataproc service when
   * the job is submitted.
   * </pre>
   *
   * <code>string cluster_uuid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.ByteString
      getClusterUuidBytes();
}
