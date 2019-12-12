// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1/securitycenter_service.proto

package com.google.cloud.securitycenter.v1;

public interface GetOrganizationSettingsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1.GetOrganizationSettingsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Name of the organization to get organization settings for. Its format is
   * "organizations/[organization_id]/organizationSettings".
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. Name of the organization to get organization settings for. Its format is
   * "organizations/[organization_id]/organizationSettings".
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
