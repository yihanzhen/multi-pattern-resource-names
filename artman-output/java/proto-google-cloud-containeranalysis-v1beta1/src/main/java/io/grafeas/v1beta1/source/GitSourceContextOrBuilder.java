// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/source/source.proto

package io.grafeas.v1beta1.source;

public interface GitSourceContextOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.source.GitSourceContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Git repository URL.
   * </pre>
   *
   * <code>string url = 1;</code>
   * @return The url.
   */
  java.lang.String getUrl();
  /**
   * <pre>
   * Git repository URL.
   * </pre>
   *
   * <code>string url = 1;</code>
   * @return The bytes for url.
   */
  com.google.protobuf.ByteString
      getUrlBytes();

  /**
   * <pre>
   * Git commit hash.
   * </pre>
   *
   * <code>string revision_id = 2;</code>
   * @return The revisionId.
   */
  java.lang.String getRevisionId();
  /**
   * <pre>
   * Git commit hash.
   * </pre>
   *
   * <code>string revision_id = 2;</code>
   * @return The bytes for revisionId.
   */
  com.google.protobuf.ByteString
      getRevisionIdBytes();
}