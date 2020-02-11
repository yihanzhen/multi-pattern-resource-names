// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/logging.proto

package com.google.logging.v2;

public interface ListLogsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.ListLogsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of log names. For example,
   * `"projects/my-project/logs/syslog"` or
   * `"organizations/123/logs/cloudresourcemanager.googleapis.com%2Factivity"`.
   * </pre>
   *
   * <code>repeated string log_names = 3;</code>
   * @return A list containing the logNames.
   */
  java.util.List<java.lang.String>
      getLogNamesList();
  /**
   * <pre>
   * A list of log names. For example,
   * `"projects/my-project/logs/syslog"` or
   * `"organizations/123/logs/cloudresourcemanager.googleapis.com%2Factivity"`.
   * </pre>
   *
   * <code>repeated string log_names = 3;</code>
   * @return The count of logNames.
   */
  int getLogNamesCount();
  /**
   * <pre>
   * A list of log names. For example,
   * `"projects/my-project/logs/syslog"` or
   * `"organizations/123/logs/cloudresourcemanager.googleapis.com%2Factivity"`.
   * </pre>
   *
   * <code>repeated string log_names = 3;</code>
   * @param index The index of the element to return.
   * @return The logNames at the given index.
   */
  java.lang.String getLogNames(int index);
  /**
   * <pre>
   * A list of log names. For example,
   * `"projects/my-project/logs/syslog"` or
   * `"organizations/123/logs/cloudresourcemanager.googleapis.com%2Factivity"`.
   * </pre>
   *
   * <code>repeated string log_names = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the logNames at the given index.
   */
  com.google.protobuf.ByteString
      getLogNamesBytes(int index);

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
