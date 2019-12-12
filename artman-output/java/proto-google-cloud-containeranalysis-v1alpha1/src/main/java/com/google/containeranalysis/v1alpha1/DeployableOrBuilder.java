// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1alpha1/containeranalysis.proto

package com.google.containeranalysis.v1alpha1;

public interface DeployableOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.containeranalysis.v1alpha1.Deployable)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resource URI for the artifact being deployed.
   * </pre>
   *
   * <code>repeated string resource_uri = 1;</code>
   */
  java.util.List<java.lang.String>
      getResourceUriList();
  /**
   * <pre>
   * Resource URI for the artifact being deployed.
   * </pre>
   *
   * <code>repeated string resource_uri = 1;</code>
   */
  int getResourceUriCount();
  /**
   * <pre>
   * Resource URI for the artifact being deployed.
   * </pre>
   *
   * <code>repeated string resource_uri = 1;</code>
   */
  java.lang.String getResourceUri(int index);
  /**
   * <pre>
   * Resource URI for the artifact being deployed.
   * </pre>
   *
   * <code>repeated string resource_uri = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceUriBytes(int index);
}