// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1alpha1/containeranalysis.proto

package com.google.containeranalysis.v1alpha1;

public interface UpdateOperationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.containeranalysis.v1alpha1.UpdateOperationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the Operation.
   * Should be of the form "projects/{provider_id}/operations/{operation_id}".
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the Operation.
   * Should be of the form "projects/{provider_id}/operations/{operation_id}".
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The operation to create.
   * </pre>
   *
   * <code>.google.longrunning.Operation operation = 3;</code>
   */
  boolean hasOperation();
  /**
   * <pre>
   * The operation to create.
   * </pre>
   *
   * <code>.google.longrunning.Operation operation = 3;</code>
   */
  com.google.longrunning.Operation getOperation();
  /**
   * <pre>
   * The operation to create.
   * </pre>
   *
   * <code>.google.longrunning.Operation operation = 3;</code>
   */
  com.google.longrunning.OperationOrBuilder getOperationOrBuilder();

  /**
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  boolean hasUpdateMask();
  /**
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <code>.google.protobuf.FieldMask update_mask = 4;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}