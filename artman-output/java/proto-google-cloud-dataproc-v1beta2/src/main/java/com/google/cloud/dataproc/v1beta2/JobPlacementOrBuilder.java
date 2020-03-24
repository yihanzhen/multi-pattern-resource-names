// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1beta2/jobs.proto

package com.google.cloud.dataproc.v1beta2;

public interface JobPlacementOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1beta2.JobPlacement)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The name of the cluster where the job will be submitted.
   * </pre>
   *
   * <code>string cluster_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The clusterName.
   */
  java.lang.String getClusterName();
  /**
   * <pre>
   * Required. The name of the cluster where the job will be submitted.
   * </pre>
   *
   * <code>string cluster_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for clusterName.
   */
  com.google.protobuf.ByteString
      getClusterNameBytes();

  /**
   * <pre>
   * Output only. A cluster UUID generated by the Dataproc service when
   * the job is submitted.
   * </pre>
   *
   * <code>string cluster_uuid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The clusterUuid.
   */
  java.lang.String getClusterUuid();
  /**
   * <pre>
   * Output only. A cluster UUID generated by the Dataproc service when
   * the job is submitted.
   * </pre>
   *
   * <code>string cluster_uuid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The bytes for clusterUuid.
   */
  com.google.protobuf.ByteString
      getClusterUuidBytes();
}
