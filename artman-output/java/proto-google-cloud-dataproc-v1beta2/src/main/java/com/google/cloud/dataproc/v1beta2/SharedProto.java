// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1beta2/shared.proto

package com.google.cloud.dataproc.v1beta2;

public final class SharedProto {
  private SharedProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*google/cloud/dataproc/v1beta2/shared.p" +
      "roto\022\035google.cloud.dataproc.v1beta2\032\034goo" +
      "gle/api/annotations.proto*\225\001\n\tComponent\022" +
      "\031\n\025COMPONENT_UNSPECIFIED\020\000\022\014\n\010ANACONDA\020\005" +
      "\022\t\n\005DRUID\020\t\022\020\n\014HIVE_WEBHCAT\020\003\022\013\n\007JUPYTER" +
      "\020\001\022\014\n\010KERBEROS\020\007\022\n\n\006PRESTO\020\006\022\014\n\010ZEPPELIN" +
      "\020\004\022\r\n\tZOOKEEPER\020\010By\n!com.google.cloud.da" +
      "taproc.v1beta2B\013SharedProtoP\001ZEgoogle.go" +
      "lang.org/genproto/googleapis/cloud/datap" +
      "roc/v1beta2;dataprocb\006proto3"
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
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}