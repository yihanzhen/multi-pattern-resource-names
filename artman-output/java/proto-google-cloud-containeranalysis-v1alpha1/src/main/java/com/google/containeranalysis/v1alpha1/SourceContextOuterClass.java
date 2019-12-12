// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1alpha1/source_context.proto

package com.google.containeranalysis.v1alpha1;

public final class SourceContextOuterClass {
  private SourceContextOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_containeranalysis_v1alpha1_SourceContext_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_containeranalysis_v1alpha1_SourceContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_containeranalysis_v1alpha1_SourceContext_LabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_containeranalysis_v1alpha1_SourceContext_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_containeranalysis_v1alpha1_AliasContext_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_containeranalysis_v1alpha1_AliasContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_containeranalysis_v1alpha1_CloudRepoSourceContext_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_containeranalysis_v1alpha1_CloudRepoSourceContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_containeranalysis_v1alpha1_GerritSourceContext_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_containeranalysis_v1alpha1_GerritSourceContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_containeranalysis_v1alpha1_GitSourceContext_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_containeranalysis_v1alpha1_GitSourceContext_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_containeranalysis_v1alpha1_RepoId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_containeranalysis_v1alpha1_RepoId_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_containeranalysis_v1alpha1_ProjectRepoId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_containeranalysis_v1alpha1_ProjectRepoId_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?google/devtools/containeranalysis/v1al" +
      "pha1/source_context.proto\022*google.devtoo" +
      "ls.containeranalysis.v1alpha1\032\034google/ap" +
      "i/annotations.proto\"\232\003\n\rSourceContext\022X\n" +
      "\ncloud_repo\030\001 \001(\0132B.google.devtools.cont" +
      "aineranalysis.v1alpha1.CloudRepoSourceCo" +
      "ntextH\000\022Q\n\006gerrit\030\002 \001(\0132?.google.devtool" +
      "s.containeranalysis.v1alpha1.GerritSourc" +
      "eContextH\000\022K\n\003git\030\003 \001(\0132<.google.devtool" +
      "s.containeranalysis.v1alpha1.GitSourceCo" +
      "ntextH\000\022U\n\006labels\030\004 \003(\0132E.google.devtool" +
      "s.containeranalysis.v1alpha1.SourceConte" +
      "xt.LabelsEntry\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001" +
      "(\t\022\r\n\005value\030\002 \001(\t:\0028\001B\t\n\007context\"\252\001\n\014Ali" +
      "asContext\022K\n\004kind\030\001 \001(\0162=.google.devtool" +
      "s.containeranalysis.v1alpha1.AliasContex" +
      "t.Kind\022\014\n\004name\030\002 \001(\t\"?\n\004Kind\022\024\n\020KIND_UNS" +
      "PECIFIED\020\000\022\t\n\005FIXED\020\001\022\013\n\007MOVABLE\020\002\022\t\n\005OT" +
      "HER\020\004\"\323\001\n\026CloudRepoSourceContext\022C\n\007repo" +
      "_id\030\001 \001(\01322.google.devtools.containerana" +
      "lysis.v1alpha1.RepoId\022\025\n\013revision_id\030\002 \001" +
      "(\tH\000\022Q\n\ralias_context\030\003 \001(\01328.google.dev" +
      "tools.containeranalysis.v1alpha1.AliasCo" +
      "ntextH\000B\n\n\010revision\"\265\001\n\023GerritSourceCont" +
      "ext\022\020\n\010host_uri\030\001 \001(\t\022\026\n\016gerrit_project\030" +
      "\002 \001(\t\022\025\n\013revision_id\030\003 \001(\tH\000\022Q\n\ralias_co" +
      "ntext\030\004 \001(\01328.google.devtools.containera" +
      "nalysis.v1alpha1.AliasContextH\000B\n\n\010revis" +
      "ion\"4\n\020GitSourceContext\022\013\n\003url\030\001 \001(\t\022\023\n\013" +
      "revision_id\030\002 \001(\t\"s\n\006RepoId\022T\n\017project_r" +
      "epo_id\030\001 \001(\01329.google.devtools.container" +
      "analysis.v1alpha1.ProjectRepoIdH\000\022\r\n\003uid" +
      "\030\002 \001(\tH\000B\004\n\002id\"6\n\rProjectRepoId\022\022\n\nproje" +
      "ct_id\030\001 \001(\t\022\021\n\trepo_name\030\002 \001(\tB\214\001\n%com.g" +
      "oogle.containeranalysis.v1alpha1P\001Z[goog" +
      "le.golang.org/genproto/googleapis/devtoo" +
      "ls/containeranalysis/v1alpha1;containera" +
      "nalysis\242\002\003GCAb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_devtools_containeranalysis_v1alpha1_SourceContext_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_devtools_containeranalysis_v1alpha1_SourceContext_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_containeranalysis_v1alpha1_SourceContext_descriptor,
        new java.lang.String[] { "CloudRepo", "Gerrit", "Git", "Labels", "Context", });
    internal_static_google_devtools_containeranalysis_v1alpha1_SourceContext_LabelsEntry_descriptor =
      internal_static_google_devtools_containeranalysis_v1alpha1_SourceContext_descriptor.getNestedTypes().get(0);
    internal_static_google_devtools_containeranalysis_v1alpha1_SourceContext_LabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_containeranalysis_v1alpha1_SourceContext_LabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_devtools_containeranalysis_v1alpha1_AliasContext_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_devtools_containeranalysis_v1alpha1_AliasContext_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_containeranalysis_v1alpha1_AliasContext_descriptor,
        new java.lang.String[] { "Kind", "Name", });
    internal_static_google_devtools_containeranalysis_v1alpha1_CloudRepoSourceContext_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_devtools_containeranalysis_v1alpha1_CloudRepoSourceContext_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_containeranalysis_v1alpha1_CloudRepoSourceContext_descriptor,
        new java.lang.String[] { "RepoId", "RevisionId", "AliasContext", "Revision", });
    internal_static_google_devtools_containeranalysis_v1alpha1_GerritSourceContext_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_devtools_containeranalysis_v1alpha1_GerritSourceContext_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_containeranalysis_v1alpha1_GerritSourceContext_descriptor,
        new java.lang.String[] { "HostUri", "GerritProject", "RevisionId", "AliasContext", "Revision", });
    internal_static_google_devtools_containeranalysis_v1alpha1_GitSourceContext_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_devtools_containeranalysis_v1alpha1_GitSourceContext_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_containeranalysis_v1alpha1_GitSourceContext_descriptor,
        new java.lang.String[] { "Url", "RevisionId", });
    internal_static_google_devtools_containeranalysis_v1alpha1_RepoId_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_devtools_containeranalysis_v1alpha1_RepoId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_containeranalysis_v1alpha1_RepoId_descriptor,
        new java.lang.String[] { "ProjectRepoId", "Uid", "Id", });
    internal_static_google_devtools_containeranalysis_v1alpha1_ProjectRepoId_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_devtools_containeranalysis_v1alpha1_ProjectRepoId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_containeranalysis_v1alpha1_ProjectRepoId_descriptor,
        new java.lang.String[] { "ProjectId", "RepoName", });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}