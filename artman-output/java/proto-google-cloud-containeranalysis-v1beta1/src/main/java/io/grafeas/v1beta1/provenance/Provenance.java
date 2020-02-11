// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/provenance/provenance.proto

package io.grafeas.v1beta1.provenance;

public final class Provenance {
  private Provenance() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grafeas_v1beta1_provenance_BuildProvenance_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_provenance_BuildProvenance_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grafeas_v1beta1_provenance_BuildProvenance_BuildOptionsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_provenance_BuildProvenance_BuildOptionsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grafeas_v1beta1_provenance_Source_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_provenance_Source_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grafeas_v1beta1_provenance_Source_FileHashesEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_provenance_Source_FileHashesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grafeas_v1beta1_provenance_FileHashes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_provenance_FileHashes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grafeas_v1beta1_provenance_Hash_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_provenance_Hash_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grafeas_v1beta1_provenance_Command_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_provenance_Command_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_grafeas_v1beta1_provenance_Artifact_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_grafeas_v1beta1_provenance_Artifact_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nEgoogle/devtools/containeranalysis/v1be" +
      "ta1/provenance/provenance.proto\022\032grafeas" +
      ".v1beta1.provenance\032=google/devtools/con" +
      "taineranalysis/v1beta1/source/source.pro" +
      "to\032\037google/protobuf/timestamp.proto\"\320\004\n\017" +
      "BuildProvenance\022\n\n\002id\030\001 \001(\t\022\022\n\nproject_i" +
      "d\030\002 \001(\t\0225\n\010commands\030\003 \003(\0132#.grafeas.v1be" +
      "ta1.provenance.Command\022=\n\017built_artifact" +
      "s\030\004 \003(\0132$.grafeas.v1beta1.provenance.Art" +
      "ifact\022/\n\013create_time\030\005 \001(\0132\032.google.prot" +
      "obuf.Timestamp\022.\n\nstart_time\030\006 \001(\0132\032.goo" +
      "gle.protobuf.Timestamp\022,\n\010end_time\030\007 \001(\013" +
      "2\032.google.protobuf.Timestamp\022\017\n\007creator\030" +
      "\010 \001(\t\022\020\n\010logs_uri\030\t \001(\t\022=\n\021source_proven" +
      "ance\030\n \001(\0132\".grafeas.v1beta1.provenance." +
      "Source\022\022\n\ntrigger_id\030\013 \001(\t\022T\n\rbuild_opti" +
      "ons\030\014 \003(\0132=.grafeas.v1beta1.provenance.B" +
      "uildProvenance.BuildOptionsEntry\022\027\n\017buil" +
      "der_version\030\r \001(\t\0323\n\021BuildOptionsEntry\022\013" +
      "\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\315\002\n\006Sourc" +
      "e\022#\n\033artifact_storage_source_uri\030\001 \001(\t\022G" +
      "\n\013file_hashes\030\002 \003(\01322.grafeas.v1beta1.pr" +
      "ovenance.Source.FileHashesEntry\0226\n\007conte" +
      "xt\030\003 \001(\0132%.grafeas.v1beta1.source.Source" +
      "Context\022B\n\023additional_contexts\030\004 \003(\0132%.g" +
      "rafeas.v1beta1.source.SourceContext\032Y\n\017F" +
      "ileHashesEntry\022\013\n\003key\030\001 \001(\t\0225\n\005value\030\002 \001" +
      "(\0132&.grafeas.v1beta1.provenance.FileHash" +
      "es:\0028\001\"A\n\nFileHashes\0223\n\tfile_hash\030\001 \003(\0132" +
      " .grafeas.v1beta1.provenance.Hash\"\201\001\n\004Ha" +
      "sh\0227\n\004type\030\001 \001(\0162).grafeas.v1beta1.prove" +
      "nance.Hash.HashType\022\r\n\005value\030\002 \001(\014\"1\n\010Ha" +
      "shType\022\031\n\025HASH_TYPE_UNSPECIFIED\020\000\022\n\n\006SHA" +
      "256\020\001\"]\n\007Command\022\014\n\004name\030\001 \001(\t\022\013\n\003env\030\002 " +
      "\003(\t\022\014\n\004args\030\003 \003(\t\022\013\n\003dir\030\004 \001(\t\022\n\n\002id\030\005 \001" +
      "(\t\022\020\n\010wait_for\030\006 \003(\t\"7\n\010Artifact\022\020\n\010chec" +
      "ksum\030\001 \001(\t\022\n\n\002id\030\002 \001(\t\022\r\n\005names\030\003 \003(\tB\207\001" +
      "\n\035io.grafeas.v1beta1.provenanceP\001Z^googl" +
      "e.golang.org/genproto/googleapis/devtool" +
      "s/containeranalysis/v1beta1/provenance;p" +
      "rovenance\242\002\003GRAb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grafeas.v1beta1.source.Source.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_grafeas_v1beta1_provenance_BuildProvenance_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_grafeas_v1beta1_provenance_BuildProvenance_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grafeas_v1beta1_provenance_BuildProvenance_descriptor,
        new java.lang.String[] { "Id", "ProjectId", "Commands", "BuiltArtifacts", "CreateTime", "StartTime", "EndTime", "Creator", "LogsUri", "SourceProvenance", "TriggerId", "BuildOptions", "BuilderVersion", });
    internal_static_grafeas_v1beta1_provenance_BuildProvenance_BuildOptionsEntry_descriptor =
      internal_static_grafeas_v1beta1_provenance_BuildProvenance_descriptor.getNestedTypes().get(0);
    internal_static_grafeas_v1beta1_provenance_BuildProvenance_BuildOptionsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grafeas_v1beta1_provenance_BuildProvenance_BuildOptionsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_grafeas_v1beta1_provenance_Source_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_grafeas_v1beta1_provenance_Source_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grafeas_v1beta1_provenance_Source_descriptor,
        new java.lang.String[] { "ArtifactStorageSourceUri", "FileHashes", "Context", "AdditionalContexts", });
    internal_static_grafeas_v1beta1_provenance_Source_FileHashesEntry_descriptor =
      internal_static_grafeas_v1beta1_provenance_Source_descriptor.getNestedTypes().get(0);
    internal_static_grafeas_v1beta1_provenance_Source_FileHashesEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grafeas_v1beta1_provenance_Source_FileHashesEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_grafeas_v1beta1_provenance_FileHashes_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_grafeas_v1beta1_provenance_FileHashes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grafeas_v1beta1_provenance_FileHashes_descriptor,
        new java.lang.String[] { "FileHash", });
    internal_static_grafeas_v1beta1_provenance_Hash_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_grafeas_v1beta1_provenance_Hash_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grafeas_v1beta1_provenance_Hash_descriptor,
        new java.lang.String[] { "Type", "Value", });
    internal_static_grafeas_v1beta1_provenance_Command_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_grafeas_v1beta1_provenance_Command_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grafeas_v1beta1_provenance_Command_descriptor,
        new java.lang.String[] { "Name", "Env", "Args", "Dir", "Id", "WaitFor", });
    internal_static_grafeas_v1beta1_provenance_Artifact_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_grafeas_v1beta1_provenance_Artifact_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_grafeas_v1beta1_provenance_Artifact_descriptor,
        new java.lang.String[] { "Checksum", "Id", "Names", });
    io.grafeas.v1beta1.source.Source.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
