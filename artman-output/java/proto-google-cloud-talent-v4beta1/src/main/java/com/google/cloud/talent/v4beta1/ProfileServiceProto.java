// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/profile_service.proto

package com.google.cloud.talent.v4beta1;

public final class ProfileServiceProto {
  private ProfileServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_ListProfilesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ListProfilesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_ListProfilesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_ListProfilesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_CreateProfileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_CreateProfileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_GetProfileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_GetProfileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_UpdateProfileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_UpdateProfileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_DeleteProfileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_DeleteProfileRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_SearchProfilesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_SearchProfilesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_SearchProfilesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_SearchProfilesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_cloud_talent_v4beta1_SummarizedProfile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_talent_v4beta1_SummarizedProfile_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/talent/v4beta1/profile_se" +
      "rvice.proto\022\033google.cloud.talent.v4beta1" +
      "\032\034google/api/annotations.proto\032\027google/a" +
      "pi/client.proto\032\037google/api/field_behavi" +
      "or.proto\032(google/cloud/talent/v4beta1/co" +
      "mmon.proto\032)google/cloud/talent/v4beta1/" +
      "filters.proto\032+google/cloud/talent/v4bet" +
      "a1/histogram.proto\032)google/cloud/talent/" +
      "v4beta1/profile.proto\032#google/longrunnin" +
      "g/operations.proto\032\031google/protobuf/any." +
      "proto\032\033google/protobuf/empty.proto\032 goog" +
      "le/protobuf/field_mask.proto\032\027google/rpc" +
      "/status.proto\"\220\001\n\023ListProfilesRequest\022\023\n" +
      "\006parent\030\001 \001(\tB\003\340A\002\022\016\n\006filter\030\005 \001(\t\022\022\n\npa" +
      "ge_token\030\002 \001(\t\022\021\n\tpage_size\030\003 \001(\005\022-\n\trea" +
      "d_mask\030\004 \001(\0132\032.google.protobuf.FieldMask" +
      "\"g\n\024ListProfilesResponse\0226\n\010profiles\030\001 \003" +
      "(\0132$.google.cloud.talent.v4beta1.Profile" +
      "\022\027\n\017next_page_token\030\002 \001(\t\"g\n\024CreateProfi" +
      "leRequest\022\023\n\006parent\030\001 \001(\tB\003\340A\002\022:\n\007profil" +
      "e\030\002 \001(\0132$.google.cloud.talent.v4beta1.Pr" +
      "ofileB\003\340A\002\"&\n\021GetProfileRequest\022\021\n\004name\030" +
      "\001 \001(\tB\003\340A\002\"\203\001\n\024UpdateProfileRequest\022:\n\007p" +
      "rofile\030\001 \001(\0132$.google.cloud.talent.v4bet" +
      "a1.ProfileB\003\340A\002\022/\n\013update_mask\030\002 \001(\0132\032.g" +
      "oogle.protobuf.FieldMask\")\n\024DeleteProfil" +
      "eRequest\022\021\n\004name\030\001 \001(\tB\003\340A\002\"\275\003\n\025SearchPr" +
      "ofilesRequest\022\023\n\006parent\030\001 \001(\tB\003\340A\002\022K\n\020re" +
      "quest_metadata\030\002 \001(\0132,.google.cloud.tale" +
      "nt.v4beta1.RequestMetadataB\003\340A\002\022@\n\rprofi" +
      "le_query\030\003 \001(\0132).google.cloud.talent.v4b" +
      "eta1.ProfileQuery\022\021\n\tpage_size\030\004 \001(\005\022\022\n\n" +
      "page_token\030\005 \001(\t\022\016\n\006offset\030\006 \001(\005\022\033\n\023disa" +
      "ble_spell_check\030\007 \001(\010\022\020\n\010order_by\030\010 \001(\t\022" +
      "\033\n\023case_sensitive_sort\030\t \001(\010\022F\n\021histogra" +
      "m_queries\030\n \003(\0132+.google.cloud.talent.v4" +
      "beta1.HistogramQuery\022\025\n\rresult_set_id\030\014 " +
      "\001(\t\022\036\n\026strict_keywords_search\030\r \001(\010\"\223\003\n\026" +
      "SearchProfilesResponse\022\034\n\024estimated_tota" +
      "l_size\030\001 \001(\003\022I\n\020spell_correction\030\002 \001(\0132/" +
      ".google.cloud.talent.v4beta1.SpellingCor" +
      "rection\022?\n\010metadata\030\003 \001(\0132-.google.cloud" +
      ".talent.v4beta1.ResponseMetadata\022\027\n\017next" +
      "_page_token\030\004 \001(\t\022R\n\027histogram_query_res" +
      "ults\030\005 \003(\01321.google.cloud.talent.v4beta1" +
      ".HistogramQueryResult\022K\n\023summarized_prof" +
      "iles\030\006 \003(\0132..google.cloud.talent.v4beta1" +
      ".SummarizedProfile\022\025\n\rresult_set_id\030\007 \001(" +
      "\t\"\202\001\n\021SummarizedProfile\0226\n\010profiles\030\001 \003(" +
      "\0132$.google.cloud.talent.v4beta1.Profile\022" +
      "5\n\007summary\030\002 \001(\0132$.google.cloud.talent.v" +
      "4beta1.Profile2\355\010\n\016ProfileService\022\254\001\n\014Li" +
      "stProfiles\0220.google.cloud.talent.v4beta1" +
      ".ListProfilesRequest\0321.google.cloud.tale" +
      "nt.v4beta1.ListProfilesResponse\"7\202\323\344\223\0021\022" +
      "//v4beta1/{parent=projects/*/tenants/*}/" +
      "profiles\022\244\001\n\rCreateProfile\0221.google.clou" +
      "d.talent.v4beta1.CreateProfileRequest\032$." +
      "google.cloud.talent.v4beta1.Profile\":\202\323\344" +
      "\223\0024\"//v4beta1/{parent=projects/*/tenants" +
      "/*}/profiles:\001*\022\233\001\n\nGetProfile\022..google." +
      "cloud.talent.v4beta1.GetProfileRequest\032$" +
      ".google.cloud.talent.v4beta1.Profile\"7\202\323" +
      "\344\223\0021\022//v4beta1/{name=projects/*/tenants/" +
      "*/profiles/*}\022\254\001\n\rUpdateProfile\0221.google" +
      ".cloud.talent.v4beta1.UpdateProfileReque" +
      "st\032$.google.cloud.talent.v4beta1.Profile" +
      "\"B\202\323\344\223\002<27/v4beta1/{profile.name=project" +
      "s/*/tenants/*/profiles/*}:\001*\022\223\001\n\rDeleteP" +
      "rofile\0221.google.cloud.talent.v4beta1.Del" +
      "eteProfileRequest\032\026.google.protobuf.Empt" +
      "y\"7\202\323\344\223\0021*//v4beta1/{name=projects/*/ten" +
      "ants/*/profiles/*}\022\263\001\n\016SearchProfiles\0222." +
      "google.cloud.talent.v4beta1.SearchProfil" +
      "esRequest\0323.google.cloud.talent.v4beta1." +
      "SearchProfilesResponse\"8\202\323\344\223\0022\"-/v4beta1" +
      "/{parent=projects/*/tenants/*}:search:\001*" +
      "\032l\312A\023jobs.googleapis.com\322AShttps://www.g" +
      "oogleapis.com/auth/cloud-platform,https:" +
      "//www.googleapis.com/auth/jobsB\201\001\n\037com.g" +
      "oogle.cloud.talent.v4beta1B\023ProfileServi" +
      "ceProtoP\001ZAgoogle.golang.org/genproto/go" +
      "ogleapis/cloud/talent/v4beta1;talent\242\002\003C" +
      "TSb\006proto3"
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
          com.google.cloud.talent.v4beta1.FiltersProto.getDescriptor(),
          com.google.cloud.talent.v4beta1.HistogramProto.getDescriptor(),
          com.google.cloud.talent.v4beta1.ProfileResourceProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        }, assigner);
    internal_static_google_cloud_talent_v4beta1_ListProfilesRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_talent_v4beta1_ListProfilesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_ListProfilesRequest_descriptor,
        new java.lang.String[] { "Parent", "Filter", "PageToken", "PageSize", "ReadMask", });
    internal_static_google_cloud_talent_v4beta1_ListProfilesResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_talent_v4beta1_ListProfilesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_ListProfilesResponse_descriptor,
        new java.lang.String[] { "Profiles", "NextPageToken", });
    internal_static_google_cloud_talent_v4beta1_CreateProfileRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_talent_v4beta1_CreateProfileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_CreateProfileRequest_descriptor,
        new java.lang.String[] { "Parent", "Profile", });
    internal_static_google_cloud_talent_v4beta1_GetProfileRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_talent_v4beta1_GetProfileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_GetProfileRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_talent_v4beta1_UpdateProfileRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_talent_v4beta1_UpdateProfileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_UpdateProfileRequest_descriptor,
        new java.lang.String[] { "Profile", "UpdateMask", });
    internal_static_google_cloud_talent_v4beta1_DeleteProfileRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_talent_v4beta1_DeleteProfileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_DeleteProfileRequest_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_google_cloud_talent_v4beta1_SearchProfilesRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_talent_v4beta1_SearchProfilesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_SearchProfilesRequest_descriptor,
        new java.lang.String[] { "Parent", "RequestMetadata", "ProfileQuery", "PageSize", "PageToken", "Offset", "DisableSpellCheck", "OrderBy", "CaseSensitiveSort", "HistogramQueries", "ResultSetId", "StrictKeywordsSearch", });
    internal_static_google_cloud_talent_v4beta1_SearchProfilesResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_talent_v4beta1_SearchProfilesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_SearchProfilesResponse_descriptor,
        new java.lang.String[] { "EstimatedTotalSize", "SpellCorrection", "Metadata", "NextPageToken", "HistogramQueryResults", "SummarizedProfiles", "ResultSetId", });
    internal_static_google_cloud_talent_v4beta1_SummarizedProfile_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_talent_v4beta1_SummarizedProfile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_cloud_talent_v4beta1_SummarizedProfile_descriptor,
        new java.lang.String[] { "Profiles", "Summary", });
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
    com.google.cloud.talent.v4beta1.FiltersProto.getDescriptor();
    com.google.cloud.talent.v4beta1.HistogramProto.getDescriptor();
    com.google.cloud.talent.v4beta1.ProfileResourceProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}