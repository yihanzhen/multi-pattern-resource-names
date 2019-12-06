// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface RedactImageRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.RedactImageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The parent resource name, for example projects/my-project-id.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.resource_reference) = { ... }</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * The parent resource name, for example projects/my-project-id.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The geographic location to process the request. Reserved for future
   * extensions.
   * </pre>
   *
   * <code>string location_id = 8;</code>
   */
  java.lang.String getLocationId();
  /**
   * <pre>
   * The geographic location to process the request. Reserved for future
   * extensions.
   * </pre>
   *
   * <code>string location_id = 8;</code>
   */
  com.google.protobuf.ByteString
      getLocationIdBytes();

  /**
   * <pre>
   * Configuration for the inspector.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
   */
  boolean hasInspectConfig();
  /**
   * <pre>
   * Configuration for the inspector.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
   */
  com.google.privacy.dlp.v2.InspectConfig getInspectConfig();
  /**
   * <pre>
   * Configuration for the inspector.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
   */
  com.google.privacy.dlp.v2.InspectConfigOrBuilder getInspectConfigOrBuilder();

  /**
   * <pre>
   * The configuration for specifying what content to redact from images.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.RedactImageRequest.ImageRedactionConfig image_redaction_configs = 5;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.RedactImageRequest.ImageRedactionConfig> 
      getImageRedactionConfigsList();
  /**
   * <pre>
   * The configuration for specifying what content to redact from images.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.RedactImageRequest.ImageRedactionConfig image_redaction_configs = 5;</code>
   */
  com.google.privacy.dlp.v2.RedactImageRequest.ImageRedactionConfig getImageRedactionConfigs(int index);
  /**
   * <pre>
   * The configuration for specifying what content to redact from images.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.RedactImageRequest.ImageRedactionConfig image_redaction_configs = 5;</code>
   */
  int getImageRedactionConfigsCount();
  /**
   * <pre>
   * The configuration for specifying what content to redact from images.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.RedactImageRequest.ImageRedactionConfig image_redaction_configs = 5;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.RedactImageRequest.ImageRedactionConfigOrBuilder> 
      getImageRedactionConfigsOrBuilderList();
  /**
   * <pre>
   * The configuration for specifying what content to redact from images.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.RedactImageRequest.ImageRedactionConfig image_redaction_configs = 5;</code>
   */
  com.google.privacy.dlp.v2.RedactImageRequest.ImageRedactionConfigOrBuilder getImageRedactionConfigsOrBuilder(
      int index);

  /**
   * <pre>
   * Whether the response should include findings along with the redacted
   * image.
   * </pre>
   *
   * <code>bool include_findings = 6;</code>
   */
  boolean getIncludeFindings();

  /**
   * <pre>
   * The content must be PNG, JPEG, SVG or BMP.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ByteContentItem byte_item = 7;</code>
   */
  boolean hasByteItem();
  /**
   * <pre>
   * The content must be PNG, JPEG, SVG or BMP.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ByteContentItem byte_item = 7;</code>
   */
  com.google.privacy.dlp.v2.ByteContentItem getByteItem();
  /**
   * <pre>
   * The content must be PNG, JPEG, SVG or BMP.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ByteContentItem byte_item = 7;</code>
   */
  com.google.privacy.dlp.v2.ByteContentItemOrBuilder getByteItemOrBuilder();
}
