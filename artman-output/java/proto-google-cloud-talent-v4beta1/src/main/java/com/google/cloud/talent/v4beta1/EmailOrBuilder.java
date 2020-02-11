// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/profile.proto

package com.google.cloud.talent.v4beta1;

public interface EmailOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.Email)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The usage of the email address. For example, SCHOOL, WORK, PERSONAL.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.ContactInfoUsage usage = 1;</code>
   * @return The enum numeric value on the wire for usage.
   */
  int getUsageValue();
  /**
   * <pre>
   * The usage of the email address. For example, SCHOOL, WORK, PERSONAL.
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.ContactInfoUsage usage = 1;</code>
   * @return The usage.
   */
  com.google.cloud.talent.v4beta1.ContactInfoUsage getUsage();

  /**
   * <pre>
   * Email address.
   * Number of characters allowed is 4,000.
   * </pre>
   *
   * <code>string email_address = 2;</code>
   * @return The emailAddress.
   */
  java.lang.String getEmailAddress();
  /**
   * <pre>
   * Email address.
   * Number of characters allowed is 4,000.
   * </pre>
   *
   * <code>string email_address = 2;</code>
   * @return The bytes for emailAddress.
   */
  com.google.protobuf.ByteString
      getEmailAddressBytes();
}
