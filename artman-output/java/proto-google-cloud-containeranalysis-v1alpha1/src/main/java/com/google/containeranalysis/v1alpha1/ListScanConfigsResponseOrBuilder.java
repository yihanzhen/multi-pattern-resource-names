// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1alpha1/containeranalysis.proto

package com.google.containeranalysis.v1alpha1;

public interface ListScanConfigsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.containeranalysis.v1alpha1.ListScanConfigsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The set of scan configs
   * </pre>
   *
   * <code>repeated .google.devtools.containeranalysis.v1alpha1.ScanConfig scan_configs = 1;</code>
   */
  java.util.List<com.google.containeranalysis.v1alpha1.ScanConfig> 
      getScanConfigsList();
  /**
   * <pre>
   * The set of scan configs
   * </pre>
   *
   * <code>repeated .google.devtools.containeranalysis.v1alpha1.ScanConfig scan_configs = 1;</code>
   */
  com.google.containeranalysis.v1alpha1.ScanConfig getScanConfigs(int index);
  /**
   * <pre>
   * The set of scan configs
   * </pre>
   *
   * <code>repeated .google.devtools.containeranalysis.v1alpha1.ScanConfig scan_configs = 1;</code>
   */
  int getScanConfigsCount();
  /**
   * <pre>
   * The set of scan configs
   * </pre>
   *
   * <code>repeated .google.devtools.containeranalysis.v1alpha1.ScanConfig scan_configs = 1;</code>
   */
  java.util.List<? extends com.google.containeranalysis.v1alpha1.ScanConfigOrBuilder> 
      getScanConfigsOrBuilderList();
  /**
   * <pre>
   * The set of scan configs
   * </pre>
   *
   * <code>repeated .google.devtools.containeranalysis.v1alpha1.ScanConfig scan_configs = 1;</code>
   */
  com.google.containeranalysis.v1alpha1.ScanConfigOrBuilder getScanConfigsOrBuilder(
      int index);

  /**
   * <pre>
   * A page token to pass in order to get more scans.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * A page token to pass in order to get more scans.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}