// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface CryptoHashConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.CryptoHashConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The key used by the hash function.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CryptoKey crypto_key = 1;</code>
   * @return Whether the cryptoKey field is set.
   */
  boolean hasCryptoKey();
  /**
   * <pre>
   * The key used by the hash function.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CryptoKey crypto_key = 1;</code>
   * @return The cryptoKey.
   */
  com.google.privacy.dlp.v2.CryptoKey getCryptoKey();
  /**
   * <pre>
   * The key used by the hash function.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CryptoKey crypto_key = 1;</code>
   */
  com.google.privacy.dlp.v2.CryptoKeyOrBuilder getCryptoKeyOrBuilder();
}
