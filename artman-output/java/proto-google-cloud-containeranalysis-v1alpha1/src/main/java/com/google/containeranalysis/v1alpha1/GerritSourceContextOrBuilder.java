// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1alpha1/source_context.proto

package com.google.containeranalysis.v1alpha1;

public interface GerritSourceContextOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.containeranalysis.v1alpha1.GerritSourceContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The URI of a running Gerrit instance.
   * </pre>
   *
   * <code>string host_uri = 1;</code>
   */
  java.lang.String getHostUri();
  /**
   * <pre>
   * The URI of a running Gerrit instance.
   * </pre>
   *
   * <code>string host_uri = 1;</code>
   */
  com.google.protobuf.ByteString
      getHostUriBytes();

  /**
   * <pre>
   * The full project name within the host. Projects may be nested, so
   * "project/subproject" is a valid project name. The "repo name" is
   * the hostURI/project.
   * </pre>
   *
   * <code>string gerrit_project = 2;</code>
   */
  java.lang.String getGerritProject();
  /**
   * <pre>
   * The full project name within the host. Projects may be nested, so
   * "project/subproject" is a valid project name. The "repo name" is
   * the hostURI/project.
   * </pre>
   *
   * <code>string gerrit_project = 2;</code>
   */
  com.google.protobuf.ByteString
      getGerritProjectBytes();

  /**
   * <pre>
   * A revision (commit) ID.
   * </pre>
   *
   * <code>string revision_id = 3;</code>
   */
  java.lang.String getRevisionId();
  /**
   * <pre>
   * A revision (commit) ID.
   * </pre>
   *
   * <code>string revision_id = 3;</code>
   */
  com.google.protobuf.ByteString
      getRevisionIdBytes();

  /**
   * <pre>
   * An alias, which may be a branch or tag.
   * </pre>
   *
   * <code>.google.devtools.containeranalysis.v1alpha1.AliasContext alias_context = 4;</code>
   */
  boolean hasAliasContext();
  /**
   * <pre>
   * An alias, which may be a branch or tag.
   * </pre>
   *
   * <code>.google.devtools.containeranalysis.v1alpha1.AliasContext alias_context = 4;</code>
   */
  com.google.containeranalysis.v1alpha1.AliasContext getAliasContext();
  /**
   * <pre>
   * An alias, which may be a branch or tag.
   * </pre>
   *
   * <code>.google.devtools.containeranalysis.v1alpha1.AliasContext alias_context = 4;</code>
   */
  com.google.containeranalysis.v1alpha1.AliasContextOrBuilder getAliasContextOrBuilder();

  public com.google.containeranalysis.v1alpha1.GerritSourceContext.RevisionCase getRevisionCase();
}