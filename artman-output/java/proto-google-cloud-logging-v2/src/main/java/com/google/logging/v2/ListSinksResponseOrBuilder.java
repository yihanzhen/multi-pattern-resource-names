// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/logging_config.proto

package com.google.logging.v2;

public interface ListSinksResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.ListSinksResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A list of sinks.
   * </pre>
   *
   * <code>repeated .google.logging.v2.LogSink sinks = 1;</code>
   */
  java.util.List<com.google.logging.v2.LogSink> 
      getSinksList();
  /**
   * <pre>
   * A list of sinks.
   * </pre>
   *
   * <code>repeated .google.logging.v2.LogSink sinks = 1;</code>
   */
  com.google.logging.v2.LogSink getSinks(int index);
  /**
   * <pre>
   * A list of sinks.
   * </pre>
   *
   * <code>repeated .google.logging.v2.LogSink sinks = 1;</code>
   */
  int getSinksCount();
  /**
   * <pre>
   * A list of sinks.
   * </pre>
   *
   * <code>repeated .google.logging.v2.LogSink sinks = 1;</code>
   */
  java.util.List<? extends com.google.logging.v2.LogSinkOrBuilder> 
      getSinksOrBuilderList();
  /**
   * <pre>
   * A list of sinks.
   * </pre>
   *
   * <code>repeated .google.logging.v2.LogSink sinks = 1;</code>
   */
  com.google.logging.v2.LogSinkOrBuilder getSinksOrBuilder(
      int index);

  /**
   * <pre>
   * If there might be more results than appear in this response, then
   * `nextPageToken` is included. To get the next set of results, call the same
   * method again using the value of `nextPageToken` as `pageToken`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * If there might be more results than appear in this response, then
   * `nextPageToken` is included. To get the next set of results, call the same
   * method again using the value of `nextPageToken` as `pageToken`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}
