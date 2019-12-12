// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1/source.proto

package com.google.cloud.securitycenter.v1;

public interface SourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1.Source)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The relative resource name of this source. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name
   * Example:
   * "organizations/{organization_id}/sources/{source_id}"
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The relative resource name of this source. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name
   * Example:
   * "organizations/{organization_id}/sources/{source_id}"
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The source's display name.
   * A source's display name must be unique amongst its siblings, for example,
   * two sources with the same parent can't share the same display name.
   * The display name must have a length between 1 and 64 characters
   * (inclusive).
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * The source's display name.
   * A source's display name must be unique amongst its siblings, for example,
   * two sources with the same parent can't share the same display name.
   * The display name must have a length between 1 and 64 characters
   * (inclusive).
   * </pre>
   *
   * <code>string display_name = 2;</code>
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * The description of the source (max of 1024 characters).
   * Example:
   * "Web Security Scanner is a web security scanner for common
   * vulnerabilities in App Engine applications. It can automatically
   * scan and detect four common vulnerabilities, including cross-site-scripting
   * (XSS), Flash injection, mixed content (HTTP in HTTPS), and
   * outdated or insecure libraries."
   * </pre>
   *
   * <code>string description = 3;</code>
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * The description of the source (max of 1024 characters).
   * Example:
   * "Web Security Scanner is a web security scanner for common
   * vulnerabilities in App Engine applications. It can automatically
   * scan and detect four common vulnerabilities, including cross-site-scripting
   * (XSS), Flash injection, mixed content (HTTP in HTTPS), and
   * outdated or insecure libraries."
   * </pre>
   *
   * <code>string description = 3;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();
}