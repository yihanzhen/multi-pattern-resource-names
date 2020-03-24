// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: google/cloud/talent/v4beta1/tenant.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace Google.Cloud.Talent.V4Beta1 {

  /// <summary>Holder for reflection information generated from google/cloud/talent/v4beta1/tenant.proto</summary>
  public static partial class TenantReflection {

    #region Descriptor
    /// <summary>File descriptor for google/cloud/talent/v4beta1/tenant.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static TenantReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "Cihnb29nbGUvY2xvdWQvdGFsZW50L3Y0YmV0YTEvdGVuYW50LnByb3RvEhtn",
            "b29nbGUuY2xvdWQudGFsZW50LnY0YmV0YTEaH2dvb2dsZS9hcGkvZmllbGRf",
            "YmVoYXZpb3IucHJvdG8aGWdvb2dsZS9hcGkvcmVzb3VyY2UucHJvdG8aH2dv",
            "b2dsZS9wcm90b2J1Zi90aW1lc3RhbXAucHJvdG8aHGdvb2dsZS9hcGkvYW5u",
            "b3RhdGlvbnMucHJvdG8iwwIKBlRlbmFudBIMCgRuYW1lGAEgASgJEhgKC2V4",
            "dGVybmFsX2lkGAIgASgJQgPgQQISRQoKdXNhZ2VfdHlwZRgDIAEoDjIxLmdv",
            "b2dsZS5jbG91ZC50YWxlbnQudjRiZXRhMS5UZW5hbnQuRGF0YVVzYWdlVHlw",
            "ZRI0CixrZXl3b3JkX3NlYXJjaGFibGVfcHJvZmlsZV9jdXN0b21fYXR0cmli",
            "dXRlcxgEIAMoCSJOCg1EYXRhVXNhZ2VUeXBlEh8KG0RBVEFfVVNBR0VfVFlQ",
            "RV9VTlNQRUNJRklFRBAAEg4KCkFHR1JFR0FURUQQARIMCghJU09MQVRFRBAC",
            "OkTqQUEKGmpvYnMuZ29vZ2xlYXBpcy5jb20vVGVuYW50EiNwcm9qZWN0cy97",
            "cHJvamVjdH0vdGVuYW50cy97dGVuYW50fUKBAQofY29tLmdvb2dsZS5jbG91",
            "ZC50YWxlbnQudjRiZXRhMUITVGVuYW50UmVzb3VyY2VQcm90b1ABWkFnb29n",
            "bGUuZ29sYW5nLm9yZy9nZW5wcm90by9nb29nbGVhcGlzL2Nsb3VkL3RhbGVu",
            "dC92NGJldGExO3RhbGVudKICA0NUU2IGcHJvdG8z"));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { global::Google.Api.FieldBehaviorReflection.Descriptor, global::Google.Api.ResourceReflection.Descriptor, global::Google.Protobuf.WellKnownTypes.TimestampReflection.Descriptor, global::Google.Api.AnnotationsReflection.Descriptor, },
          new pbr::GeneratedClrTypeInfo(null, null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::Google.Cloud.Talent.V4Beta1.Tenant), global::Google.Cloud.Talent.V4Beta1.Tenant.Parser, new[]{ "Name", "ExternalId", "UsageType", "KeywordSearchableProfileCustomAttributes" }, null, new[]{ typeof(global::Google.Cloud.Talent.V4Beta1.Tenant.Types.DataUsageType) }, null, null)
          }));
    }
    #endregion

  }
  #region Messages
  /// <summary>
  /// A Tenant resource represents a tenant in the service. A tenant is a group or
  /// entity that shares common access with specific privileges for resources like
  /// profiles. Customer may create multiple tenants to provide data isolation for
  /// different groups.
  /// </summary>
  public sealed partial class Tenant : pb::IMessage<Tenant> {
    private static readonly pb::MessageParser<Tenant> _parser = new pb::MessageParser<Tenant>(() => new Tenant());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<Tenant> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Google.Cloud.Talent.V4Beta1.TenantReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Tenant() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Tenant(Tenant other) : this() {
      name_ = other.name_;
      externalId_ = other.externalId_;
      usageType_ = other.usageType_;
      keywordSearchableProfileCustomAttributes_ = other.keywordSearchableProfileCustomAttributes_.Clone();
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Tenant Clone() {
      return new Tenant(this);
    }

    /// <summary>Field number for the "name" field.</summary>
    public const int NameFieldNumber = 1;
    private string name_ = "";
    /// <summary>
    /// Required during tenant update.
    ///
    /// The resource name for a tenant. This is generated by the service when a
    /// tenant is created.
    ///
    /// The format is "projects/{project_id}/tenants/{tenant_id}", for example,
    /// "projects/foo/tenants/bar".
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string Name {
      get { return name_; }
      set {
        name_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "external_id" field.</summary>
    public const int ExternalIdFieldNumber = 2;
    private string externalId_ = "";
    /// <summary>
    /// Required. Client side tenant identifier, used to uniquely identify the tenant.
    ///
    /// The maximum number of allowed characters is 255.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string ExternalId {
      get { return externalId_; }
      set {
        externalId_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "usage_type" field.</summary>
    public const int UsageTypeFieldNumber = 3;
    private global::Google.Cloud.Talent.V4Beta1.Tenant.Types.DataUsageType usageType_ = global::Google.Cloud.Talent.V4Beta1.Tenant.Types.DataUsageType.Unspecified;
    /// <summary>
    /// Indicates whether data owned by this tenant may be used to provide product
    /// improvements across other tenants.
    ///
    /// Defaults behavior is [DataUsageType.ISOLATED][google.cloud.talent.v4beta1.Tenant.DataUsageType.ISOLATED] if it's unset.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::Google.Cloud.Talent.V4Beta1.Tenant.Types.DataUsageType UsageType {
      get { return usageType_; }
      set {
        usageType_ = value;
      }
    }

    /// <summary>Field number for the "keyword_searchable_profile_custom_attributes" field.</summary>
    public const int KeywordSearchableProfileCustomAttributesFieldNumber = 4;
    private static readonly pb::FieldCodec<string> _repeated_keywordSearchableProfileCustomAttributes_codec
        = pb::FieldCodec.ForString(34);
    private readonly pbc::RepeatedField<string> keywordSearchableProfileCustomAttributes_ = new pbc::RepeatedField<string>();
    /// <summary>
    /// A list of keys of filterable [Profile.custom_attributes][google.cloud.talent.v4beta1.Profile.custom_attributes], whose
    /// corresponding `string_values` are used in keyword searches. Profiles with
    /// `string_values` under these specified field keys are returned if any
    /// of the values match the search keyword. Custom field values with
    /// parenthesis, brackets and special symbols are not searchable as-is,
    /// and must be surrounded by quotes.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public pbc::RepeatedField<string> KeywordSearchableProfileCustomAttributes {
      get { return keywordSearchableProfileCustomAttributes_; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as Tenant);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(Tenant other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (Name != other.Name) return false;
      if (ExternalId != other.ExternalId) return false;
      if (UsageType != other.UsageType) return false;
      if(!keywordSearchableProfileCustomAttributes_.Equals(other.keywordSearchableProfileCustomAttributes_)) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (Name.Length != 0) hash ^= Name.GetHashCode();
      if (ExternalId.Length != 0) hash ^= ExternalId.GetHashCode();
      if (UsageType != global::Google.Cloud.Talent.V4Beta1.Tenant.Types.DataUsageType.Unspecified) hash ^= UsageType.GetHashCode();
      hash ^= keywordSearchableProfileCustomAttributes_.GetHashCode();
      if (_unknownFields != null) {
        hash ^= _unknownFields.GetHashCode();
      }
      return hash;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override string ToString() {
      return pb::JsonFormatter.ToDiagnosticString(this);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void WriteTo(pb::CodedOutputStream output) {
      if (Name.Length != 0) {
        output.WriteRawTag(10);
        output.WriteString(Name);
      }
      if (ExternalId.Length != 0) {
        output.WriteRawTag(18);
        output.WriteString(ExternalId);
      }
      if (UsageType != global::Google.Cloud.Talent.V4Beta1.Tenant.Types.DataUsageType.Unspecified) {
        output.WriteRawTag(24);
        output.WriteEnum((int) UsageType);
      }
      keywordSearchableProfileCustomAttributes_.WriteTo(output, _repeated_keywordSearchableProfileCustomAttributes_codec);
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (Name.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Name);
      }
      if (ExternalId.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(ExternalId);
      }
      if (UsageType != global::Google.Cloud.Talent.V4Beta1.Tenant.Types.DataUsageType.Unspecified) {
        size += 1 + pb::CodedOutputStream.ComputeEnumSize((int) UsageType);
      }
      size += keywordSearchableProfileCustomAttributes_.CalculateSize(_repeated_keywordSearchableProfileCustomAttributes_codec);
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(Tenant other) {
      if (other == null) {
        return;
      }
      if (other.Name.Length != 0) {
        Name = other.Name;
      }
      if (other.ExternalId.Length != 0) {
        ExternalId = other.ExternalId;
      }
      if (other.UsageType != global::Google.Cloud.Talent.V4Beta1.Tenant.Types.DataUsageType.Unspecified) {
        UsageType = other.UsageType;
      }
      keywordSearchableProfileCustomAttributes_.Add(other.keywordSearchableProfileCustomAttributes_);
      _unknownFields = pb::UnknownFieldSet.MergeFrom(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(pb::CodedInputStream input) {
      uint tag;
      while ((tag = input.ReadTag()) != 0) {
        switch(tag) {
          default:
            _unknownFields = pb::UnknownFieldSet.MergeFieldFrom(_unknownFields, input);
            break;
          case 10: {
            Name = input.ReadString();
            break;
          }
          case 18: {
            ExternalId = input.ReadString();
            break;
          }
          case 24: {
            UsageType = (global::Google.Cloud.Talent.V4Beta1.Tenant.Types.DataUsageType) input.ReadEnum();
            break;
          }
          case 34: {
            keywordSearchableProfileCustomAttributes_.AddEntriesFrom(input, _repeated_keywordSearchableProfileCustomAttributes_codec);
            break;
          }
        }
      }
    }

    #region Nested types
    /// <summary>Container for nested types declared in the Tenant message type.</summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static partial class Types {
      /// <summary>
      /// Enum that represents how user data owned by the tenant is used.
      /// </summary>
      public enum DataUsageType {
        /// <summary>
        /// Default value.
        /// </summary>
        [pbr::OriginalName("DATA_USAGE_TYPE_UNSPECIFIED")] Unspecified = 0,
        /// <summary>
        /// Data owned by this tenant is used to improve search/recommendation
        /// quality across tenants.
        /// </summary>
        [pbr::OriginalName("AGGREGATED")] Aggregated = 1,
        /// <summary>
        /// Data owned by this tenant is used to improve search/recommendation
        /// quality for this tenant only.
        /// </summary>
        [pbr::OriginalName("ISOLATED")] Isolated = 2,
      }

    }
    #endregion

  }

  #endregion

}

#endregion Designer generated code
