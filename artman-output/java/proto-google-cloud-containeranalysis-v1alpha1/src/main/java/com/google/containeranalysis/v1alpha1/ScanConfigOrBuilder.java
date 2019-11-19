// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1alpha1/containeranalysis.proto

package com.google.containeranalysis.v1alpha1;

public interface ScanConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.containeranalysis.v1alpha1.ScanConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The name of the ScanConfig in the form
   * “projects/{project_id}/ScanConfigs/{ScanConfig_id}".
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output only. The name of the ScanConfig in the form
   * “projects/{project_id}/ScanConfigs/{ScanConfig_id}".
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Output only. A human-readable description of what the `ScanConfig` does.
   * </pre>
   *
   * <code>string description = 2;</code>
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Output only. A human-readable description of what the `ScanConfig` does.
   * </pre>
   *
   * <code>string description = 2;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * Indicates whether the Scan is enabled.
   * </pre>
   *
   * <code>bool enabled = 3;</code>
   */
  boolean getEnabled();
}