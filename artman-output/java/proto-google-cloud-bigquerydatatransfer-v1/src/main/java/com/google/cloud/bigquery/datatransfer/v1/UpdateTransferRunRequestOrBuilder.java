// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/datatransfer/v1/datasource.proto

package com.google.cloud.bigquery.datatransfer.v1;

public interface UpdateTransferRunRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.datatransfer.v1.UpdateTransferRunRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Run name must be set and correspond to an already existing run. Only
   * state, error_status, and data_version fields will be updated. All other
   * fields will be ignored.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.TransferRun transfer_run = 1;</code>
   */
  boolean hasTransferRun();
  /**
   * <pre>
   * Run name must be set and correspond to an already existing run. Only
   * state, error_status, and data_version fields will be updated. All other
   * fields will be ignored.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.TransferRun transfer_run = 1;</code>
   */
  com.google.cloud.bigquery.datatransfer.v1.TransferRun getTransferRun();
  /**
   * <pre>
   * Run name must be set and correspond to an already existing run. Only
   * state, error_status, and data_version fields will be updated. All other
   * fields will be ignored.
   * </pre>
   *
   * <code>.google.cloud.bigquery.datatransfer.v1.TransferRun transfer_run = 1;</code>
   */
  com.google.cloud.bigquery.datatransfer.v1.TransferRunOrBuilder getTransferRunOrBuilder();

  /**
   * <pre>
   * Required list of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Required list of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Required list of fields to be updated in this request.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}