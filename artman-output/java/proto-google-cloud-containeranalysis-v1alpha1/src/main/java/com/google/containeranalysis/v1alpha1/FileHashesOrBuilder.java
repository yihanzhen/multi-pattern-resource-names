// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1alpha1/provenance.proto

package com.google.containeranalysis.v1alpha1;

public interface FileHashesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.containeranalysis.v1alpha1.FileHashes)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Collection of file hashes.
   * </pre>
   *
   * <code>repeated .google.devtools.containeranalysis.v1alpha1.Hash file_hash = 1;</code>
   */
  java.util.List<com.google.containeranalysis.v1alpha1.Hash> 
      getFileHashList();
  /**
   * <pre>
   * Collection of file hashes.
   * </pre>
   *
   * <code>repeated .google.devtools.containeranalysis.v1alpha1.Hash file_hash = 1;</code>
   */
  com.google.containeranalysis.v1alpha1.Hash getFileHash(int index);
  /**
   * <pre>
   * Collection of file hashes.
   * </pre>
   *
   * <code>repeated .google.devtools.containeranalysis.v1alpha1.Hash file_hash = 1;</code>
   */
  int getFileHashCount();
  /**
   * <pre>
   * Collection of file hashes.
   * </pre>
   *
   * <code>repeated .google.devtools.containeranalysis.v1alpha1.Hash file_hash = 1;</code>
   */
  java.util.List<? extends com.google.containeranalysis.v1alpha1.HashOrBuilder> 
      getFileHashOrBuilderList();
  /**
   * <pre>
   * Collection of file hashes.
   * </pre>
   *
   * <code>repeated .google.devtools.containeranalysis.v1alpha1.Hash file_hash = 1;</code>
   */
  com.google.containeranalysis.v1alpha1.HashOrBuilder getFileHashOrBuilder(
      int index);
}