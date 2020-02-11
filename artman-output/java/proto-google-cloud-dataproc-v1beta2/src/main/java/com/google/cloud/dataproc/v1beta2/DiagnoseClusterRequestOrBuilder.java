// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1beta2/clusters.proto

package com.google.cloud.dataproc.v1beta2;

public interface DiagnoseClusterRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1beta2.DiagnoseClusterRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the Google Cloud Platform project that the cluster
   * belongs to.
   * </pre>
   *
   * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   * <pre>
   * Required. The ID of the Google Cloud Platform project that the cluster
   * belongs to.
   * </pre>
   *
   * <code>string project_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * Required. The Cloud Dataproc region in which to handle the request.
   * </pre>
   *
   * <code>string region = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The region.
   */
  java.lang.String getRegion();
  /**
   * <pre>
   * Required. The Cloud Dataproc region in which to handle the request.
   * </pre>
   *
   * <code>string region = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for region.
   */
  com.google.protobuf.ByteString
      getRegionBytes();

  /**
   * <pre>
   * Required. The cluster name.
   * </pre>
   *
   * <code>string cluster_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The clusterName.
   */
  java.lang.String getClusterName();
  /**
   * <pre>
   * Required. The cluster name.
   * </pre>
   *
   * <code>string cluster_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for clusterName.
   */
  com.google.protobuf.ByteString
      getClusterNameBytes();
}
