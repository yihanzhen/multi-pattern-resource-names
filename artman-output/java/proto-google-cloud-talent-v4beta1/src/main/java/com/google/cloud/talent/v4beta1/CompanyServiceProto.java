// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/company_service.proto

package com.google.cloud.talent.v4beta1;

public final class CompanyServiceProto {
  private CompanyServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_CreateCompanyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CreateCompanyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_GetCompanyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_GetCompanyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_UpdateCompanyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_UpdateCompanyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_DeleteCompanyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_DeleteCompanyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_ListCompaniesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ListCompaniesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_ListCompaniesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ListCompaniesResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/talent/v4beta1/company_se" +
      "rvice.proto\022\033google.cloud.talent.v4beta1" +
      "\032\034google/api/annotations.proto\032\027google/a" +
      "pi/client.proto\032\037google/api/field_behavi" +
      "or.proto\032\031google/api/resource.proto\032(goo" +
      "gle/cloud/talent/v4beta1/common.proto\032)g" +
      "oogle/cloud/talent/v4beta1/company.proto" +
      "\032\033google/protobuf/empty.proto\032 google/pr" +
      "otobuf/field_mask.proto\"\207\001\n\024CreateCompan" +
      "yRequest\0223\n\006parent\030\001 \001(\tB#\340A\002\372A\035\022\033jobs.g" +
      "oogleapis.com/Company\022:\n\007company\030\002 \001(\0132$" +
      ".google.cloud.talent.v4beta1.CompanyB\003\340A" +
      "\002\"F\n\021GetCompanyRequest\0221\n\004name\030\001 \001(\tB#\340A" +
      "\002\372A\035\n\033jobs.googleapis.com/Company\"\203\001\n\024Up" +
      "dateCompanyRequest\022:\n\007company\030\001 \001(\0132$.go" +
      "ogle.cloud.talent.v4beta1.CompanyB\003\340A\002\022/" +
      "\n\013update_mask\030\002 \001(\0132\032.google.protobuf.Fi" +
      "eldMask\"I\n\024DeleteCompanyRequest\0221\n\004name\030" +
      "\001 \001(\tB#\340A\002\372A\035\n\033jobs.googleapis.com/Compa" +
      "ny\"\225\001\n\024ListCompaniesRequest\022;\n\006parent\030\001 " +
      "\001(\tB+\340A\002\372A%\n#jobs.googleapis.com/TenantO" +
      "rProject\022\022\n\npage_token\030\002 \001(\t\022\021\n\tpage_siz" +
      "e\030\003 \001(\005\022\031\n\021require_open_jobs\030\004 \001(\010\"\252\001\n\025L" +
      "istCompaniesResponse\0227\n\tcompanies\030\001 \003(\0132" +
      "$.google.cloud.talent.v4beta1.Company\022\027\n" +
      "\017next_page_token\030\002 \001(\t\022?\n\010metadata\030\003 \001(\013" +
      "2-.google.cloud.talent.v4beta1.ResponseM" +
      "etadata2\322\t\n\016CompanyService\022\343\001\n\rCreateCom" +
      "pany\0221.google.cloud.talent.v4beta1.Creat" +
      "eCompanyRequest\032$.google.cloud.talent.v4" +
      "beta1.Company\"y\202\323\344\223\002b\"0/v4beta1/{parent=" +
      "projects/*/tenants/*}/companies:\001*Z+\"&/v" +
      "4beta1/{parent=projects/*}/companies:\001*\332" +
      "A\016parent,company\022\315\001\n\nGetCompany\022..google" +
      ".cloud.talent.v4beta1.GetCompanyRequest\032" +
      "$.google.cloud.talent.v4beta1.Company\"i\202" +
      "\323\344\223\002\\\0220/v4beta1/{name=projects/*/tenants" +
      "/*/companies/*}Z(\022&/v4beta1/{name=projec" +
      "ts/*/companies/*}\332A\004name\022\355\001\n\rUpdateCompa" +
      "ny\0221.google.cloud.talent.v4beta1.UpdateC" +
      "ompanyRequest\032$.google.cloud.talent.v4be" +
      "ta1.Company\"\202\001\202\323\344\223\002r28/v4beta1/{company." +
      "name=projects/*/tenants/*/companies/*}:\001" +
      "*Z32./v4beta1/{company.name=projects/*/c" +
      "ompanies/*}:\001*\332A\007company\022\305\001\n\rDeleteCompa" +
      "ny\0221.google.cloud.talent.v4beta1.DeleteC" +
      "ompanyRequest\032\026.google.protobuf.Empty\"i\202" +
      "\323\344\223\002\\*0/v4beta1/{name=projects/*/tenants" +
      "/*/companies/*}Z(*&/v4beta1/{name=projec" +
      "ts/*/companies/*}\332A\004name\022\343\001\n\rListCompani" +
      "es\0221.google.cloud.talent.v4beta1.ListCom" +
      "paniesRequest\0322.google.cloud.talent.v4be" +
      "ta1.ListCompaniesResponse\"k\202\323\344\223\002\\\0220/v4be" +
      "ta1/{parent=projects/*/tenants/*}/compan" +
      "iesZ(\022&/v4beta1/{parent=projects/*}/comp" +
      "anies\332A\006parent\032l\312A\023jobs.googleapis.com\322A" +
      "Shttps://www.googleapis.com/auth/cloud-p" +
      "latform,https://www.googleapis.com/auth/" +
      "jobsB\201\001\n\037com.google.cloud.talent.v4beta1" +
      "B\023CompanyServiceProtoP\001ZAgoogle.golang.o" +
      "rg/genproto/googleapis/cloud/talent/v4be" +
      "ta1;talent\242\002\003CTSb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.cloud.talent.v4beta1.CommonProto.getDescriptor(),
          com.google.cloud.talent.v4beta1.CompanyResourceProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
        });
    internal_static_google_cloud_talent_v4beta1_CreateCompanyRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_CreateCompanyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_CreateCompanyRequest_descriptor,
        new java.lang.String[] { "Parent", "Company", });
    internal_static_google_cloud_talent_v4beta1_GetCompanyRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_talent_v4beta1_GetCompanyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_GetCompanyRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_talent_v4beta1_UpdateCompanyRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_talent_v4beta1_UpdateCompanyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_UpdateCompanyRequest_descriptor,
        new java.lang.String[] { "Company", "UpdateMask", });
    internal_static_google_cloud_talent_v4beta1_DeleteCompanyRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_talent_v4beta1_DeleteCompanyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_DeleteCompanyRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_talent_v4beta1_ListCompaniesRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_talent_v4beta1_ListCompaniesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_ListCompaniesRequest_descriptor,
        new java.lang.String[] { "Parent", "PageToken", "PageSize", "RequireOpenJobs", });
    internal_static_google_cloud_talent_v4beta1_ListCompaniesResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_talent_v4beta1_ListCompaniesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_ListCompaniesResponse_descriptor,
        new java.lang.String[] { "Companies", "NextPageToken", "Metadata", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.talent.v4beta1.CommonProto.getDescriptor();
    com.google.cloud.talent.v4beta1.CompanyResourceProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}