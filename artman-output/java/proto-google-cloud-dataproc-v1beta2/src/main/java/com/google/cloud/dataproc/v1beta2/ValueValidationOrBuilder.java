// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1beta2/workflow_templates.proto

package com.google.cloud.dataproc.v1beta2;

public interface ValueValidationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1beta2.ValueValidation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. List of allowed values for the parameter.
   * </pre>
   *
   * <code>repeated string values = 1;</code>
   * @return A list containing the values.
   */
  java.util.List<java.lang.String>
      getValuesList();
  /**
   * <pre>
   * Required. List of allowed values for the parameter.
   * </pre>
   *
   * <code>repeated string values = 1;</code>
   * @return The count of values.
   */
  int getValuesCount();
  /**
   * <pre>
   * Required. List of allowed values for the parameter.
   * </pre>
   *
   * <code>repeated string values = 1;</code>
   * @param index The index of the element to return.
   * @return The values at the given index.
   */
  java.lang.String getValues(int index);
  /**
   * <pre>
   * Required. List of allowed values for the parameter.
   * </pre>
   *
   * <code>repeated string values = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the values at the given index.
   */
  com.google.protobuf.ByteString
      getValuesBytes(int index);
}
