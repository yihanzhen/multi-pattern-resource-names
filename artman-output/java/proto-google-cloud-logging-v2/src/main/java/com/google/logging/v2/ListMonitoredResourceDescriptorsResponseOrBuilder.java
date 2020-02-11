// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/logging.proto

package com.google.logging.v2;

public interface ListMonitoredResourceDescriptorsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.ListMonitoredResourceDescriptorsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of resource descriptors.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
   */
  java.util.List<com.google.api.MonitoredResourceDescriptor> 
      getResourceDescriptorsList();
  /**
   * <pre>
   * A list of resource descriptors.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
   */
  com.google.api.MonitoredResourceDescriptor getResourceDescriptors(int index);
  /**
   * <pre>
   * A list of resource descriptors.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
   */
  int getResourceDescriptorsCount();
  /**
   * <pre>
   * A list of resource descriptors.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
   */
  java.util.List<? extends com.google.api.MonitoredResourceDescriptorOrBuilder> 
      getResourceDescriptorsOrBuilderList();
  /**
   * <pre>
   * A list of resource descriptors.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResourceDescriptor resource_descriptors = 1;</code>
   */
  com.google.api.MonitoredResourceDescriptorOrBuilder getResourceDescriptorsOrBuilder(
      int index);

  /**
   * <pre>
   * If there might be more results than those appearing in this response, then
   * `nextPageToken` is included.  To get the next set of results, call this
   * method again using the value of `nextPageToken` as `pageToken`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * If there might be more results than those appearing in this response, then
   * `nextPageToken` is included.  To get the next set of results, call this
   * method again using the value of `nextPageToken` as `pageToken`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
