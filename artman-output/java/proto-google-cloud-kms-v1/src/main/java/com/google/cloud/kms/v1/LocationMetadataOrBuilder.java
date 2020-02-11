// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/kms/v1/service.proto

package com.google.cloud.kms.v1;

public interface LocationMetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.LocationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Indicates whether [CryptoKeys][google.cloud.kms.v1.CryptoKey] with
   * [protection_level][google.cloud.kms.v1.CryptoKeyVersionTemplate.protection_level]
   * [HSM][google.cloud.kms.v1.ProtectionLevel.HSM] can be created in this location.
   * </pre>
   *
   * <code>bool hsm_available = 1;</code>
   * @return The hsmAvailable.
   */
  boolean getHsmAvailable();
}
