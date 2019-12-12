// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: google/devtools/containeranalysis/v1beta1/deployment/deployment.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace Grafeas.V1Beta1.Deployment {

  /// <summary>Holder for reflection information generated from google/devtools/containeranalysis/v1beta1/deployment/deployment.proto</summary>
  public static partial class DeploymentReflection {

    #region Descriptor
    /// <summary>File descriptor for google/devtools/containeranalysis/v1beta1/deployment/deployment.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static DeploymentReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "CkVnb29nbGUvZGV2dG9vbHMvY29udGFpbmVyYW5hbHlzaXMvdjFiZXRhMS9k",
            "ZXBsb3ltZW50L2RlcGxveW1lbnQucHJvdG8SGmdyYWZlYXMudjFiZXRhMS5k",
            "ZXBsb3ltZW50Gh9nb29nbGUvcHJvdG9idWYvdGltZXN0YW1wLnByb3RvIiIK",
            "CkRlcGxveWFibGUSFAoMcmVzb3VyY2VfdXJpGAEgAygJIkUKB0RldGFpbHMS",
            "OgoKZGVwbG95bWVudBgBIAEoCzImLmdyYWZlYXMudjFiZXRhMS5kZXBsb3lt",
            "ZW50LkRlcGxveW1lbnQiwwIKCkRlcGxveW1lbnQSEgoKdXNlcl9lbWFpbBgB",
            "IAEoCRIvCgtkZXBsb3lfdGltZRgCIAEoCzIaLmdvb2dsZS5wcm90b2J1Zi5U",
            "aW1lc3RhbXASMQoNdW5kZXBsb3lfdGltZRgDIAEoCzIaLmdvb2dsZS5wcm90",
            "b2J1Zi5UaW1lc3RhbXASDgoGY29uZmlnGAQgASgJEg8KB2FkZHJlc3MYBSAB",
            "KAkSFAoMcmVzb3VyY2VfdXJpGAYgAygJEkEKCHBsYXRmb3JtGAcgASgOMi8u",
            "Z3JhZmVhcy52MWJldGExLmRlcGxveW1lbnQuRGVwbG95bWVudC5QbGF0Zm9y",
            "bSJDCghQbGF0Zm9ybRIYChRQTEFURk9STV9VTlNQRUNJRklFRBAAEgcKA0dL",
            "RRABEggKBEZMRVgQAhIKCgZDVVNUT00QA0KHAQodaW8uZ3JhZmVhcy52MWJl",
            "dGExLmRlcGxveW1lbnRQAVpeZ29vZ2xlLmdvbGFuZy5vcmcvZ2VucHJvdG8v",
            "Z29vZ2xlYXBpcy9kZXZ0b29scy9jb250YWluZXJhbmFseXNpcy92MWJldGEx",
            "L2RlcGxveW1lbnQ7ZGVwbG95bWVudKICA0dSQWIGcHJvdG8z"));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { global::Google.Protobuf.WellKnownTypes.TimestampReflection.Descriptor, },
          new pbr::GeneratedClrTypeInfo(null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::Grafeas.V1Beta1.Deployment.Deployable), global::Grafeas.V1Beta1.Deployment.Deployable.Parser, new[]{ "ResourceUri" }, null, null, null),
            new pbr::GeneratedClrTypeInfo(typeof(global::Grafeas.V1Beta1.Deployment.Details), global::Grafeas.V1Beta1.Deployment.Details.Parser, new[]{ "Deployment" }, null, null, null),
            new pbr::GeneratedClrTypeInfo(typeof(global::Grafeas.V1Beta1.Deployment.Deployment), global::Grafeas.V1Beta1.Deployment.Deployment.Parser, new[]{ "UserEmail", "DeployTime", "UndeployTime", "Config", "Address", "ResourceUri", "Platform" }, null, new[]{ typeof(global::Grafeas.V1Beta1.Deployment.Deployment.Types.Platform) }, null)
          }));
    }
    #endregion

  }
  #region Messages
  /// <summary>
  /// An artifact that can be deployed in some runtime.
  /// </summary>
  public sealed partial class Deployable : pb::IMessage<Deployable> {
    private static readonly pb::MessageParser<Deployable> _parser = new pb::MessageParser<Deployable>(() => new Deployable());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<Deployable> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Grafeas.V1Beta1.Deployment.DeploymentReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Deployable() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Deployable(Deployable other) : this() {
      resourceUri_ = other.resourceUri_.Clone();
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Deployable Clone() {
      return new Deployable(this);
    }

    /// <summary>Field number for the "resource_uri" field.</summary>
    public const int ResourceUriFieldNumber = 1;
    private static readonly pb::FieldCodec<string> _repeated_resourceUri_codec
        = pb::FieldCodec.ForString(10);
    private readonly pbc::RepeatedField<string> resourceUri_ = new pbc::RepeatedField<string>();
    /// <summary>
    /// Resource URI for the artifact being deployed.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public pbc::RepeatedField<string> ResourceUri {
      get { return resourceUri_; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as Deployable);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(Deployable other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if(!resourceUri_.Equals(other.resourceUri_)) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      hash ^= resourceUri_.GetHashCode();
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
      resourceUri_.WriteTo(output, _repeated_resourceUri_codec);
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      size += resourceUri_.CalculateSize(_repeated_resourceUri_codec);
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(Deployable other) {
      if (other == null) {
        return;
      }
      resourceUri_.Add(other.resourceUri_);
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
            resourceUri_.AddEntriesFrom(input, _repeated_resourceUri_codec);
            break;
          }
        }
      }
    }

  }

  /// <summary>
  /// Details of a deployment occurrence.
  /// </summary>
  public sealed partial class Details : pb::IMessage<Details> {
    private static readonly pb::MessageParser<Details> _parser = new pb::MessageParser<Details>(() => new Details());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<Details> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Grafeas.V1Beta1.Deployment.DeploymentReflection.Descriptor.MessageTypes[1]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Details() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Details(Details other) : this() {
      deployment_ = other.deployment_ != null ? other.deployment_.Clone() : null;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Details Clone() {
      return new Details(this);
    }

    /// <summary>Field number for the "deployment" field.</summary>
    public const int DeploymentFieldNumber = 1;
    private global::Grafeas.V1Beta1.Deployment.Deployment deployment_;
    /// <summary>
    /// Deployment history for the resource.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::Grafeas.V1Beta1.Deployment.Deployment Deployment {
      get { return deployment_; }
      set {
        deployment_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as Details);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(Details other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (!object.Equals(Deployment, other.Deployment)) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (deployment_ != null) hash ^= Deployment.GetHashCode();
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
      if (deployment_ != null) {
        output.WriteRawTag(10);
        output.WriteMessage(Deployment);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (deployment_ != null) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(Deployment);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(Details other) {
      if (other == null) {
        return;
      }
      if (other.deployment_ != null) {
        if (deployment_ == null) {
          Deployment = new global::Grafeas.V1Beta1.Deployment.Deployment();
        }
        Deployment.MergeFrom(other.Deployment);
      }
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
            if (deployment_ == null) {
              Deployment = new global::Grafeas.V1Beta1.Deployment.Deployment();
            }
            input.ReadMessage(Deployment);
            break;
          }
        }
      }
    }

  }

  /// <summary>
  /// The period during which some deployable was active in a runtime.
  /// </summary>
  public sealed partial class Deployment : pb::IMessage<Deployment> {
    private static readonly pb::MessageParser<Deployment> _parser = new pb::MessageParser<Deployment>(() => new Deployment());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<Deployment> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Grafeas.V1Beta1.Deployment.DeploymentReflection.Descriptor.MessageTypes[2]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Deployment() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Deployment(Deployment other) : this() {
      userEmail_ = other.userEmail_;
      deployTime_ = other.deployTime_ != null ? other.deployTime_.Clone() : null;
      undeployTime_ = other.undeployTime_ != null ? other.undeployTime_.Clone() : null;
      config_ = other.config_;
      address_ = other.address_;
      resourceUri_ = other.resourceUri_.Clone();
      platform_ = other.platform_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Deployment Clone() {
      return new Deployment(this);
    }

    /// <summary>Field number for the "user_email" field.</summary>
    public const int UserEmailFieldNumber = 1;
    private string userEmail_ = "";
    /// <summary>
    /// Identity of the user that triggered this deployment.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string UserEmail {
      get { return userEmail_; }
      set {
        userEmail_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "deploy_time" field.</summary>
    public const int DeployTimeFieldNumber = 2;
    private global::Google.Protobuf.WellKnownTypes.Timestamp deployTime_;
    /// <summary>
    /// Beginning of the lifetime of this deployment.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::Google.Protobuf.WellKnownTypes.Timestamp DeployTime {
      get { return deployTime_; }
      set {
        deployTime_ = value;
      }
    }

    /// <summary>Field number for the "undeploy_time" field.</summary>
    public const int UndeployTimeFieldNumber = 3;
    private global::Google.Protobuf.WellKnownTypes.Timestamp undeployTime_;
    /// <summary>
    /// End of the lifetime of this deployment.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::Google.Protobuf.WellKnownTypes.Timestamp UndeployTime {
      get { return undeployTime_; }
      set {
        undeployTime_ = value;
      }
    }

    /// <summary>Field number for the "config" field.</summary>
    public const int ConfigFieldNumber = 4;
    private string config_ = "";
    /// <summary>
    /// Configuration used to create this deployment.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string Config {
      get { return config_; }
      set {
        config_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "address" field.</summary>
    public const int AddressFieldNumber = 5;
    private string address_ = "";
    /// <summary>
    /// Address of the runtime element hosting this deployment.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public string Address {
      get { return address_; }
      set {
        address_ = pb::ProtoPreconditions.CheckNotNull(value, "value");
      }
    }

    /// <summary>Field number for the "resource_uri" field.</summary>
    public const int ResourceUriFieldNumber = 6;
    private static readonly pb::FieldCodec<string> _repeated_resourceUri_codec
        = pb::FieldCodec.ForString(50);
    private readonly pbc::RepeatedField<string> resourceUri_ = new pbc::RepeatedField<string>();
    /// <summary>
    /// Output only. Resource URI for the artifact being deployed taken from
    /// the deployable field with the same name.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public pbc::RepeatedField<string> ResourceUri {
      get { return resourceUri_; }
    }

    /// <summary>Field number for the "platform" field.</summary>
    public const int PlatformFieldNumber = 7;
    private global::Grafeas.V1Beta1.Deployment.Deployment.Types.Platform platform_ = 0;
    /// <summary>
    /// Platform hosting this deployment.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::Grafeas.V1Beta1.Deployment.Deployment.Types.Platform Platform {
      get { return platform_; }
      set {
        platform_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as Deployment);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(Deployment other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (UserEmail != other.UserEmail) return false;
      if (!object.Equals(DeployTime, other.DeployTime)) return false;
      if (!object.Equals(UndeployTime, other.UndeployTime)) return false;
      if (Config != other.Config) return false;
      if (Address != other.Address) return false;
      if(!resourceUri_.Equals(other.resourceUri_)) return false;
      if (Platform != other.Platform) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (UserEmail.Length != 0) hash ^= UserEmail.GetHashCode();
      if (deployTime_ != null) hash ^= DeployTime.GetHashCode();
      if (undeployTime_ != null) hash ^= UndeployTime.GetHashCode();
      if (Config.Length != 0) hash ^= Config.GetHashCode();
      if (Address.Length != 0) hash ^= Address.GetHashCode();
      hash ^= resourceUri_.GetHashCode();
      if (Platform != 0) hash ^= Platform.GetHashCode();
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
      if (UserEmail.Length != 0) {
        output.WriteRawTag(10);
        output.WriteString(UserEmail);
      }
      if (deployTime_ != null) {
        output.WriteRawTag(18);
        output.WriteMessage(DeployTime);
      }
      if (undeployTime_ != null) {
        output.WriteRawTag(26);
        output.WriteMessage(UndeployTime);
      }
      if (Config.Length != 0) {
        output.WriteRawTag(34);
        output.WriteString(Config);
      }
      if (Address.Length != 0) {
        output.WriteRawTag(42);
        output.WriteString(Address);
      }
      resourceUri_.WriteTo(output, _repeated_resourceUri_codec);
      if (Platform != 0) {
        output.WriteRawTag(56);
        output.WriteEnum((int) Platform);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (UserEmail.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(UserEmail);
      }
      if (deployTime_ != null) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(DeployTime);
      }
      if (undeployTime_ != null) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(UndeployTime);
      }
      if (Config.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Config);
      }
      if (Address.Length != 0) {
        size += 1 + pb::CodedOutputStream.ComputeStringSize(Address);
      }
      size += resourceUri_.CalculateSize(_repeated_resourceUri_codec);
      if (Platform != 0) {
        size += 1 + pb::CodedOutputStream.ComputeEnumSize((int) Platform);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(Deployment other) {
      if (other == null) {
        return;
      }
      if (other.UserEmail.Length != 0) {
        UserEmail = other.UserEmail;
      }
      if (other.deployTime_ != null) {
        if (deployTime_ == null) {
          DeployTime = new global::Google.Protobuf.WellKnownTypes.Timestamp();
        }
        DeployTime.MergeFrom(other.DeployTime);
      }
      if (other.undeployTime_ != null) {
        if (undeployTime_ == null) {
          UndeployTime = new global::Google.Protobuf.WellKnownTypes.Timestamp();
        }
        UndeployTime.MergeFrom(other.UndeployTime);
      }
      if (other.Config.Length != 0) {
        Config = other.Config;
      }
      if (other.Address.Length != 0) {
        Address = other.Address;
      }
      resourceUri_.Add(other.resourceUri_);
      if (other.Platform != 0) {
        Platform = other.Platform;
      }
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
            UserEmail = input.ReadString();
            break;
          }
          case 18: {
            if (deployTime_ == null) {
              DeployTime = new global::Google.Protobuf.WellKnownTypes.Timestamp();
            }
            input.ReadMessage(DeployTime);
            break;
          }
          case 26: {
            if (undeployTime_ == null) {
              UndeployTime = new global::Google.Protobuf.WellKnownTypes.Timestamp();
            }
            input.ReadMessage(UndeployTime);
            break;
          }
          case 34: {
            Config = input.ReadString();
            break;
          }
          case 42: {
            Address = input.ReadString();
            break;
          }
          case 50: {
            resourceUri_.AddEntriesFrom(input, _repeated_resourceUri_codec);
            break;
          }
          case 56: {
            Platform = (global::Grafeas.V1Beta1.Deployment.Deployment.Types.Platform) input.ReadEnum();
            break;
          }
        }
      }
    }

    #region Nested types
    /// <summary>Container for nested types declared in the Deployment message type.</summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static partial class Types {
      /// <summary>
      /// Types of platforms.
      /// </summary>
      public enum Platform {
        /// <summary>
        /// Unknown.
        /// </summary>
        [pbr::OriginalName("PLATFORM_UNSPECIFIED")] Unspecified = 0,
        /// <summary>
        /// Google Container Engine.
        /// </summary>
        [pbr::OriginalName("GKE")] Gke = 1,
        /// <summary>
        /// Google App Engine: Flexible Environment.
        /// </summary>
        [pbr::OriginalName("FLEX")] Flex = 2,
        /// <summary>
        /// Custom user-defined platform.
        /// </summary>
        [pbr::OriginalName("CUSTOM")] Custom = 3,
      }

    }
    #endregion

  }

  #endregion

}

#endregion Designer generated code
