// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dataproc/v1/shared.proto

package com.google.cloud.dataproc.v1;

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
      "\n%google/cloud/dataproc/v1/shared.proto\022" +
      "\030google.cloud.dataproc.v1\032\034google/api/an" +
      "notations.proto*a\n\tComponent\022\031\n\025COMPONEN" +
      "T_UNSPECIFIED\020\000\022\014\n\010ANACONDA\020\005\022\020\n\014HIVE_WE" +
      "BHCAT\020\003\022\013\n\007JUPYTER\020\001\022\014\n\010ZEPPELIN\020\004Bo\n\034co" +
      "m.google.cloud.dataproc.v1B\013SharedProtoP" +
      "\001Z@google.golang.org/genproto/googleapis" +
      "/cloud/dataproc/v1;dataprocb\006proto3"
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
