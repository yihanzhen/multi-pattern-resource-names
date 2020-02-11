// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface CryptoKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.CryptoKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Transient crypto key
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TransientCryptoKey transient = 1;</code>
   * @return Whether the transient field is set.
   */
  boolean hasTransient();
  /**
   * <pre>
   * Transient crypto key
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TransientCryptoKey transient = 1;</code>
   * @return The transient.
   */
  com.google.privacy.dlp.v2.TransientCryptoKey getTransient();
  /**
   * <pre>
   * Transient crypto key
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TransientCryptoKey transient = 1;</code>
   */
  com.google.privacy.dlp.v2.TransientCryptoKeyOrBuilder getTransientOrBuilder();

  /**
   * <pre>
   * Unwrapped crypto key
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.UnwrappedCryptoKey unwrapped = 2;</code>
   * @return Whether the unwrapped field is set.
   */
  boolean hasUnwrapped();
  /**
   * <pre>
   * Unwrapped crypto key
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.UnwrappedCryptoKey unwrapped = 2;</code>
   * @return The unwrapped.
   */
  com.google.privacy.dlp.v2.UnwrappedCryptoKey getUnwrapped();
  /**
   * <pre>
   * Unwrapped crypto key
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.UnwrappedCryptoKey unwrapped = 2;</code>
   */
  com.google.privacy.dlp.v2.UnwrappedCryptoKeyOrBuilder getUnwrappedOrBuilder();

  /**
   * <pre>
   * Kms wrapped key
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.KmsWrappedCryptoKey kms_wrapped = 3;</code>
   * @return Whether the kmsWrapped field is set.
   */
  boolean hasKmsWrapped();
  /**
   * <pre>
   * Kms wrapped key
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.KmsWrappedCryptoKey kms_wrapped = 3;</code>
   * @return The kmsWrapped.
   */
  com.google.privacy.dlp.v2.KmsWrappedCryptoKey getKmsWrapped();
  /**
   * <pre>
   * Kms wrapped key
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.KmsWrappedCryptoKey kms_wrapped = 3;</code>
   */
  com.google.privacy.dlp.v2.KmsWrappedCryptoKeyOrBuilder getKmsWrappedOrBuilder();

  public com.google.privacy.dlp.v2.CryptoKey.SourceCase getSourceCase();
}
