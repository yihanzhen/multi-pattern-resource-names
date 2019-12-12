// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/common.proto

package com.google.cloud.talent.v4beta1;

public interface CertificationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.Certification)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of license or certification.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   */
  java.lang.String getDisplayName();
  /**
   * <pre>
   * Name of license or certification.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getDisplayNameBytes();

  /**
   * <pre>
   * Acquisition date or effective date of license or certification.
   * </pre>
   *
   * <code>.google.type.Date acquire_date = 2;</code>
   */
  boolean hasAcquireDate();
  /**
   * <pre>
   * Acquisition date or effective date of license or certification.
   * </pre>
   *
   * <code>.google.type.Date acquire_date = 2;</code>
   */
  com.google.type.Date getAcquireDate();
  /**
   * <pre>
   * Acquisition date or effective date of license or certification.
   * </pre>
   *
   * <code>.google.type.Date acquire_date = 2;</code>
   */
  com.google.type.DateOrBuilder getAcquireDateOrBuilder();

  /**
   * <pre>
   * Expiration date of license of certification.
   * </pre>
   *
   * <code>.google.type.Date expire_date = 3;</code>
   */
  boolean hasExpireDate();
  /**
   * <pre>
   * Expiration date of license of certification.
   * </pre>
   *
   * <code>.google.type.Date expire_date = 3;</code>
   */
  com.google.type.Date getExpireDate();
  /**
   * <pre>
   * Expiration date of license of certification.
   * </pre>
   *
   * <code>.google.type.Date expire_date = 3;</code>
   */
  com.google.type.DateOrBuilder getExpireDateOrBuilder();

  /**
   * <pre>
   * Authority of license, such as government.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string authority = 4;</code>
   */
  java.lang.String getAuthority();
  /**
   * <pre>
   * Authority of license, such as government.
   * Number of characters allowed is 100.
   * </pre>
   *
   * <code>string authority = 4;</code>
   */
  com.google.protobuf.ByteString
      getAuthorityBytes();

  /**
   * <pre>
   * Description of license or certification.
   * Number of characters allowed is 100,000.
   * </pre>
   *
   * <code>string description = 5;</code>
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * Description of license or certification.
   * Number of characters allowed is 100,000.
   * </pre>
   *
   * <code>string description = 5;</code>
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();
}
