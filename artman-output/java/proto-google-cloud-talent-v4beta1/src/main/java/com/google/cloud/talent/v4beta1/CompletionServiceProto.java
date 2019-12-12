// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/completion_service.proto

package com.google.cloud.talent.v4beta1;

public final class CompletionServiceProto {
  private CompletionServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_CompleteQueryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CompleteQueryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_CompleteQueryResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CompleteQueryResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_CompleteQueryResponse_CompletionResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CompleteQueryResponse_CompletionResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4google/cloud/talent/v4beta1/completion" +
      "_service.proto\022\033google.cloud.talent.v4be" +
      "ta1\032\034google/api/annotations.proto\032\027googl" +
      "e/api/client.proto\032\037google/api/field_beh" +
      "avior.proto\032(google/cloud/talent/v4beta1" +
      "/common.proto\"\321\003\n\024CompleteQueryRequest\022\023" +
      "\n\006parent\030\001 \001(\tB\003\340A\002\022\022\n\005query\030\002 \001(\tB\003\340A\002\022" +
      "\026\n\016language_codes\030\003 \003(\t\022\026\n\tpage_size\030\004 \001" +
      "(\005B\003\340A\002\022\017\n\007company\030\005 \001(\t\022P\n\005scope\030\006 \001(\0162" +
      "A.google.cloud.talent.v4beta1.CompleteQu" +
      "eryRequest.CompletionScope\022N\n\004type\030\007 \001(\016" +
      "2@.google.cloud.talent.v4beta1.CompleteQ" +
      "ueryRequest.CompletionType\"K\n\017Completion" +
      "Scope\022 \n\034COMPLETION_SCOPE_UNSPECIFIED\020\000\022" +
      "\n\n\006TENANT\020\001\022\n\n\006PUBLIC\020\002\"`\n\016CompletionTyp" +
      "e\022\037\n\033COMPLETION_TYPE_UNSPECIFIED\020\000\022\r\n\tJO" +
      "B_TITLE\020\001\022\020\n\014COMPANY_NAME\020\002\022\014\n\010COMBINED\020" +
      "\003\"\305\002\n\025CompleteQueryResponse\022_\n\022completio" +
      "n_results\030\001 \003(\0132C.google.cloud.talent.v4" +
      "beta1.CompleteQueryResponse.CompletionRe" +
      "sult\022?\n\010metadata\030\002 \001(\0132-.google.cloud.ta" +
      "lent.v4beta1.ResponseMetadata\032\211\001\n\020Comple" +
      "tionResult\022\022\n\nsuggestion\030\001 \001(\t\022N\n\004type\030\002" +
      " \001(\0162@.google.cloud.talent.v4beta1.Compl" +
      "eteQueryRequest.CompletionType\022\021\n\timage_" +
      "uri\030\003 \001(\t2\325\002\n\nCompletion\022\330\001\n\rCompleteQue" +
      "ry\0221.google.cloud.talent.v4beta1.Complet" +
      "eQueryRequest\0322.google.cloud.talent.v4be" +
      "ta1.CompleteQueryResponse\"`\202\323\344\223\002Z\022//v4be" +
      "ta1/{parent=projects/*/tenants/*}:comple" +
      "teZ\'\022%/v4beta1/{parent=projects/*}:compl" +
      "ete\032l\312A\023jobs.googleapis.com\322AShttps://ww" +
      "w.googleapis.com/auth/cloud-platform,htt" +
      "ps://www.googleapis.com/auth/jobsB\204\001\n\037co" +
      "m.google.cloud.talent.v4beta1B\026Completio" +
      "nServiceProtoP\001ZAgoogle.golang.org/genpr" +
      "oto/googleapis/cloud/talent/v4beta1;tale" +
      "nt\242\002\003CTSb\006proto3"
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
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.cloud.talent.v4beta1.CommonProto.getDescriptor(),
        }, assigner);
    internal_static_google_cloud_talent_v4beta1_CompleteQueryRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_CompleteQueryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_CompleteQueryRequest_descriptor,
        new java.lang.String[] { "Parent", "Query", "LanguageCodes", "PageSize", "Company", "Scope", "Type", });
    internal_static_google_cloud_talent_v4beta1_CompleteQueryResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_talent_v4beta1_CompleteQueryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_CompleteQueryResponse_descriptor,
        new java.lang.String[] { "CompletionResults", "Metadata", });
    internal_static_google_cloud_talent_v4beta1_CompleteQueryResponse_CompletionResult_descriptor =
      internal_static_google_cloud_talent_v4beta1_CompleteQueryResponse_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_CompleteQueryResponse_CompletionResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_CompleteQueryResponse_CompletionResult_descriptor,
        new java.lang.String[] { "Suggestion", "Type", "ImageUri", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.talent.v4beta1.CommonProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
