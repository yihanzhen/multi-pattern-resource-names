// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/logging_config.proto

package com.google.logging.v2;

public interface UpdateCmekSettingsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.UpdateCmekSettingsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The resource name for the CMEK settings to update.
   *     "projects/[PROJECT_ID]/cmekSettings"
   *     "organizations/[ORGANIZATION_ID]/cmekSettings"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]/cmekSettings"
   *     "folders/[FOLDER_ID]/cmekSettings"
   * Example: `"organizations/12345/cmekSettings"`.
   * Note: CMEK for the Logs Router can currently only be configured for GCP
   * organizations. Once configured, it applies to all projects and folders in
   * the GCP organization.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The resource name for the CMEK settings to update.
   *     "projects/[PROJECT_ID]/cmekSettings"
   *     "organizations/[ORGANIZATION_ID]/cmekSettings"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]/cmekSettings"
   *     "folders/[FOLDER_ID]/cmekSettings"
   * Example: `"organizations/12345/cmekSettings"`.
   * Note: CMEK for the Logs Router can currently only be configured for GCP
   * organizations. Once configured, it applies to all projects and folders in
   * the GCP organization.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The CMEK settings to update.
   * See [Enabling CMEK for Logs
   * Router](/logging/docs/routing/managed-encryption) for more information.
   * </pre>
   *
   * <code>.google.logging.v2.CmekSettings cmek_settings = 2;</code>
   * @return Whether the cmekSettings field is set.
   */
  boolean hasCmekSettings();
  /**
   * <pre>
   * Required. The CMEK settings to update.
   * See [Enabling CMEK for Logs
   * Router](/logging/docs/routing/managed-encryption) for more information.
   * </pre>
   *
   * <code>.google.logging.v2.CmekSettings cmek_settings = 2;</code>
   * @return The cmekSettings.
   */
  com.google.logging.v2.CmekSettings getCmekSettings();
  /**
   * <pre>
   * Required. The CMEK settings to update.
   * See [Enabling CMEK for Logs
   * Router](/logging/docs/routing/managed-encryption) for more information.
   * </pre>
   *
   * <code>.google.logging.v2.CmekSettings cmek_settings = 2;</code>
   */
  com.google.logging.v2.CmekSettingsOrBuilder getCmekSettingsOrBuilder();

  /**
   * <pre>
   * Optional. Field mask identifying which fields from `cmek_settings` should
   * be updated. A field will be overwritten if and only if it is in the update
   * mask. Output only fields cannot be updated.
   * See [FieldMask][google.protobuf.FieldMask] for more information.
   * Example: `"updateMask=kmsKeyName"`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Optional. Field mask identifying which fields from `cmek_settings` should
   * be updated. A field will be overwritten if and only if it is in the update
   * mask. Output only fields cannot be updated.
   * See [FieldMask][google.protobuf.FieldMask] for more information.
   * Example: `"updateMask=kmsKeyName"`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Optional. Field mask identifying which fields from `cmek_settings` should
   * be updated. A field will be overwritten if and only if it is in the update
   * mask. Output only fields cannot be updated.
   * See [FieldMask][google.protobuf.FieldMask] for more information.
   * Example: `"updateMask=kmsKeyName"`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 3;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
