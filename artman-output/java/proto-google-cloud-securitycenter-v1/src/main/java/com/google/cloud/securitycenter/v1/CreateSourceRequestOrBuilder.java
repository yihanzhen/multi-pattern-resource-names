// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1/securitycenter_service.proto

package com.google.cloud.securitycenter.v1;

public interface CreateSourceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1.CreateSourceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Resource name of the new source's parent. Its format should be
   * "organizations/[organization_id]".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. Resource name of the new source's parent. Its format should be
   * "organizations/[organization_id]".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The Source being created, only the display_name and description will be
   * used. All other fields will be ignored.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Source source = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  boolean hasSource();
  /**
   * <pre>
   * Required. The Source being created, only the display_name and description will be
   * used. All other fields will be ignored.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Source source = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.securitycenter.v1.Source getSource();
  /**
   * <pre>
   * Required. The Source being created, only the display_name and description will be
   * used. All other fields will be ignored.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Source source = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.securitycenter.v1.SourceOrBuilder getSourceOrBuilder();
}