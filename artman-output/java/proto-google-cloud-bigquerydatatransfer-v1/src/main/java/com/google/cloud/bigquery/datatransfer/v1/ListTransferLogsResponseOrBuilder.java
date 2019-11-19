// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/datatransfer.proto

package com.google.cloud.bigquery.datatransfer.v1;

public interface ListTransferLogsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datatransfer.v1.ListTransferLogsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output only. The stored pipeline transfer messages.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferMessage transfer_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<com.google.cloud.bigquery.datatransfer.v1.TransferMessage> 
      getTransferMessagesList();
  /**
   * <pre>
   * Output only. The stored pipeline transfer messages.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferMessage transfer_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.bigquery.datatransfer.v1.TransferMessage getTransferMessages(int index);
  /**
   * <pre>
   * Output only. The stored pipeline transfer messages.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferMessage transfer_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  int getTransferMessagesCount();
  /**
   * <pre>
   * Output only. The stored pipeline transfer messages.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferMessage transfer_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.util.List<? extends com.google.cloud.bigquery.datatransfer.v1.TransferMessageOrBuilder> 
      getTransferMessagesOrBuilderList();
  /**
   * <pre>
   * Output only. The stored pipeline transfer messages.
   * </pre>
   *
   * <code>repeated .google.cloud.bigquery.datatransfer.v1.TransferMessage transfer_messages = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.cloud.bigquery.datatransfer.v1.TransferMessageOrBuilder getTransferMessagesOrBuilder(
      int index);

  /**
   * <pre>
   * Output only. The next-pagination token. For multiple-page list results,
   * this token can be used as the
   * `GetTransferRunLogRequest.page_token`
   * to request the next page of list results.
   * </pre>
   *
   * <code>string next_page_token = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * Output only. The next-pagination token. For multiple-page list results,
   * this token can be used as the
   * `GetTransferRunLogRequest.page_token`
   * to request the next page of list results.
   * </pre>
   *
   * <code>string next_page_token = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}