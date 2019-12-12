// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1alpha1/containeranalysis.proto

package com.google.containeranalysis.v1alpha1;

public interface ResourceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.containeranalysis.v1alpha1.Resource)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the resource. E.g., the name of a Docker image - "Debian".
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the resource. E.g., the name of a Docker image - "Debian".
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The unique URI of the resource. E.g.,
   * "https://gcr.io/project/image&#64;sha256:foo" for a Docker image.
   * </pre>
   *
   * <code>string uri = 2;</code>
   */
  java.lang.String getUri();
  /**
   * <pre>
   * The unique URI of the resource. E.g.,
   * "https://gcr.io/project/image&#64;sha256:foo" for a Docker image.
   * </pre>
   *
   * <code>string uri = 2;</code>
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <pre>
   * The hash of the resource content. E.g., the Docker digest.
   * </pre>
   *
   * <code>.google.devtools.containeranalysis.v1alpha1.Hash content_hash = 3;</code>
   */
  boolean hasContentHash();
  /**
   * <pre>
   * The hash of the resource content. E.g., the Docker digest.
   * </pre>
   *
   * <code>.google.devtools.containeranalysis.v1alpha1.Hash content_hash = 3;</code>
   */
  com.google.containeranalysis.v1alpha1.Hash getContentHash();
  /**
   * <pre>
   * The hash of the resource content. E.g., the Docker digest.
   * </pre>
   *
   * <code>.google.devtools.containeranalysis.v1alpha1.Hash content_hash = 3;</code>
   */
  com.google.containeranalysis.v1alpha1.HashOrBuilder getContentHashOrBuilder();
}