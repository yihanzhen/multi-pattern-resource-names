// <auto-generated>
//     Generated by the protocol buffer compiler.  DO NOT EDIT!
//     source: google/devtools/containeranalysis/v1beta1/discovery/discovery.proto
// </auto-generated>
#pragma warning disable 1591, 0612, 3021
#region Designer generated code

using pb = global::Google.Protobuf;
using pbc = global::Google.Protobuf.Collections;
using pbr = global::Google.Protobuf.Reflection;
using scg = global::System.Collections.Generic;
namespace Grafeas.V1Beta1.Discovery {

  /// <summary>Holder for reflection information generated from google/devtools/containeranalysis/v1beta1/discovery/discovery.proto</summary>
  public static partial class DiscoveryReflection {

    #region Descriptor
    /// <summary>File descriptor for google/devtools/containeranalysis/v1beta1/discovery/discovery.proto</summary>
    public static pbr::FileDescriptor Descriptor {
      get { return descriptor; }
    }
    private static pbr::FileDescriptor descriptor;

    static DiscoveryReflection() {
      byte[] descriptorData = global::System.Convert.FromBase64String(
          string.Concat(
            "CkNnb29nbGUvZGV2dG9vbHMvY29udGFpbmVyYW5hbHlzaXMvdjFiZXRhMS9k",
            "aXNjb3ZlcnkvZGlzY292ZXJ5LnByb3RvEhlncmFmZWFzLnYxYmV0YTEuZGlz",
            "Y292ZXJ5Gj1nb29nbGUvZGV2dG9vbHMvY29udGFpbmVyYW5hbHlzaXMvdjFi",
            "ZXRhMS9jb21tb24vY29tbW9uLnByb3RvGh9nb29nbGUvcHJvdG9idWYvdGlt",
            "ZXN0YW1wLnByb3RvGhdnb29nbGUvcnBjL3N0YXR1cy5wcm90byI9CglEaXNj",
            "b3ZlcnkSMAoNYW5hbHlzaXNfa2luZBgBIAEoDjIZLmdyYWZlYXMudjFiZXRh",
            "MS5Ob3RlS2luZCJECgdEZXRhaWxzEjkKCmRpc2NvdmVyZWQYASABKAsyJS5n",
            "cmFmZWFzLnYxYmV0YTEuZGlzY292ZXJ5LkRpc2NvdmVyZWQihgQKCkRpc2Nv",
            "dmVyZWQSVQoTY29udGludW91c19hbmFseXNpcxgBIAEoDjI4LmdyYWZlYXMu",
            "djFiZXRhMS5kaXNjb3ZlcnkuRGlzY292ZXJlZC5Db250aW51b3VzQW5hbHlz",
            "aXMSNgoSbGFzdF9hbmFseXNpc190aW1lGAIgASgLMhouZ29vZ2xlLnByb3Rv",
            "YnVmLlRpbWVzdGFtcBJNCg9hbmFseXNpc19zdGF0dXMYAyABKA4yNC5ncmFm",
            "ZWFzLnYxYmV0YTEuZGlzY292ZXJ5LkRpc2NvdmVyZWQuQW5hbHlzaXNTdGF0",
            "dXMSMQoVYW5hbHlzaXNfc3RhdHVzX2Vycm9yGAQgASgLMhIuZ29vZ2xlLnJw",
            "Yy5TdGF0dXMiUwoSQ29udGludW91c0FuYWx5c2lzEiMKH0NPTlRJTlVPVVNf",
            "QU5BTFlTSVNfVU5TUEVDSUZJRUQQABIKCgZBQ1RJVkUQARIMCghJTkFDVElW",
            "RRACIpEBCg5BbmFseXNpc1N0YXR1cxIfChtBTkFMWVNJU19TVEFUVVNfVU5T",
            "UEVDSUZJRUQQABILCgdQRU5ESU5HEAESDAoIU0NBTk5JTkcQAhIUChBGSU5J",
            "U0hFRF9TVUNDRVNTEAMSEwoPRklOSVNIRURfRkFJTEVEEAQSGAoURklOSVNI",
            "RURfVU5TVVBQT1JURUQQBUKEAQocaW8uZ3JhZmVhcy52MWJldGExLmRpc2Nv",
            "dmVyeVABWlxnb29nbGUuZ29sYW5nLm9yZy9nZW5wcm90by9nb29nbGVhcGlz",
            "L2RldnRvb2xzL2NvbnRhaW5lcmFuYWx5c2lzL3YxYmV0YTEvZGlzY292ZXJ5",
            "O2Rpc2NvdmVyeaICA0dSQWIGcHJvdG8z"));
      descriptor = pbr::FileDescriptor.FromGeneratedCode(descriptorData,
          new pbr::FileDescriptor[] { global::Grafeas.V1Beta1.CommonReflection.Descriptor, global::Google.Protobuf.WellKnownTypes.TimestampReflection.Descriptor, global::Google.Rpc.StatusReflection.Descriptor, },
          new pbr::GeneratedClrTypeInfo(null, new pbr::GeneratedClrTypeInfo[] {
            new pbr::GeneratedClrTypeInfo(typeof(global::Grafeas.V1Beta1.Discovery.Discovery), global::Grafeas.V1Beta1.Discovery.Discovery.Parser, new[]{ "AnalysisKind" }, null, null, null),
            new pbr::GeneratedClrTypeInfo(typeof(global::Grafeas.V1Beta1.Discovery.Details), global::Grafeas.V1Beta1.Discovery.Details.Parser, new[]{ "Discovered" }, null, null, null),
            new pbr::GeneratedClrTypeInfo(typeof(global::Grafeas.V1Beta1.Discovery.Discovered), global::Grafeas.V1Beta1.Discovery.Discovered.Parser, new[]{ "ContinuousAnalysis", "LastAnalysisTime", "AnalysisStatus", "AnalysisStatusError" }, null, new[]{ typeof(global::Grafeas.V1Beta1.Discovery.Discovered.Types.ContinuousAnalysis), typeof(global::Grafeas.V1Beta1.Discovery.Discovered.Types.AnalysisStatus) }, null)
          }));
    }
    #endregion

  }
  #region Messages
  /// <summary>
  /// A note that indicates a type of analysis a provider would perform. This note
  /// exists in a provider's project. A `Discovery` occurrence is created in a
  /// consumer's project at the start of analysis.
  /// </summary>
  public sealed partial class Discovery : pb::IMessage<Discovery> {
    private static readonly pb::MessageParser<Discovery> _parser = new pb::MessageParser<Discovery>(() => new Discovery());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<Discovery> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Grafeas.V1Beta1.Discovery.DiscoveryReflection.Descriptor.MessageTypes[0]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Discovery() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Discovery(Discovery other) : this() {
      analysisKind_ = other.analysisKind_;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Discovery Clone() {
      return new Discovery(this);
    }

    /// <summary>Field number for the "analysis_kind" field.</summary>
    public const int AnalysisKindFieldNumber = 1;
    private global::Grafeas.V1Beta1.NoteKind analysisKind_ = 0;
    /// <summary>
    /// The kind of analysis that is handled by this discovery.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::Grafeas.V1Beta1.NoteKind AnalysisKind {
      get { return analysisKind_; }
      set {
        analysisKind_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as Discovery);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(Discovery other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (AnalysisKind != other.AnalysisKind) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (AnalysisKind != 0) hash ^= AnalysisKind.GetHashCode();
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
      if (AnalysisKind != 0) {
        output.WriteRawTag(8);
        output.WriteEnum((int) AnalysisKind);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (AnalysisKind != 0) {
        size += 1 + pb::CodedOutputStream.ComputeEnumSize((int) AnalysisKind);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(Discovery other) {
      if (other == null) {
        return;
      }
      if (other.AnalysisKind != 0) {
        AnalysisKind = other.AnalysisKind;
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
          case 8: {
            AnalysisKind = (global::Grafeas.V1Beta1.NoteKind) input.ReadEnum();
            break;
          }
        }
      }
    }

  }

  /// <summary>
  /// Details of a discovery occurrence.
  /// </summary>
  public sealed partial class Details : pb::IMessage<Details> {
    private static readonly pb::MessageParser<Details> _parser = new pb::MessageParser<Details>(() => new Details());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<Details> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Grafeas.V1Beta1.Discovery.DiscoveryReflection.Descriptor.MessageTypes[1]; }
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
      discovered_ = other.discovered_ != null ? other.discovered_.Clone() : null;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Details Clone() {
      return new Details(this);
    }

    /// <summary>Field number for the "discovered" field.</summary>
    public const int DiscoveredFieldNumber = 1;
    private global::Grafeas.V1Beta1.Discovery.Discovered discovered_;
    /// <summary>
    /// Analysis status for the discovered resource.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::Grafeas.V1Beta1.Discovery.Discovered Discovered {
      get { return discovered_; }
      set {
        discovered_ = value;
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
      if (!object.Equals(Discovered, other.Discovered)) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (discovered_ != null) hash ^= Discovered.GetHashCode();
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
      if (discovered_ != null) {
        output.WriteRawTag(10);
        output.WriteMessage(Discovered);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (discovered_ != null) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(Discovered);
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
      if (other.discovered_ != null) {
        if (discovered_ == null) {
          Discovered = new global::Grafeas.V1Beta1.Discovery.Discovered();
        }
        Discovered.MergeFrom(other.Discovered);
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
            if (discovered_ == null) {
              Discovered = new global::Grafeas.V1Beta1.Discovery.Discovered();
            }
            input.ReadMessage(Discovered);
            break;
          }
        }
      }
    }

  }

  /// <summary>
  /// Provides information about the analysis status of a discovered resource.
  /// </summary>
  public sealed partial class Discovered : pb::IMessage<Discovered> {
    private static readonly pb::MessageParser<Discovered> _parser = new pb::MessageParser<Discovered>(() => new Discovered());
    private pb::UnknownFieldSet _unknownFields;
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pb::MessageParser<Discovered> Parser { get { return _parser; } }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static pbr::MessageDescriptor Descriptor {
      get { return global::Grafeas.V1Beta1.Discovery.DiscoveryReflection.Descriptor.MessageTypes[2]; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    pbr::MessageDescriptor pb::IMessage.Descriptor {
      get { return Descriptor; }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Discovered() {
      OnConstruction();
    }

    partial void OnConstruction();

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Discovered(Discovered other) : this() {
      continuousAnalysis_ = other.continuousAnalysis_;
      lastAnalysisTime_ = other.lastAnalysisTime_ != null ? other.lastAnalysisTime_.Clone() : null;
      analysisStatus_ = other.analysisStatus_;
      analysisStatusError_ = other.analysisStatusError_ != null ? other.analysisStatusError_.Clone() : null;
      _unknownFields = pb::UnknownFieldSet.Clone(other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public Discovered Clone() {
      return new Discovered(this);
    }

    /// <summary>Field number for the "continuous_analysis" field.</summary>
    public const int ContinuousAnalysisFieldNumber = 1;
    private global::Grafeas.V1Beta1.Discovery.Discovered.Types.ContinuousAnalysis continuousAnalysis_ = 0;
    /// <summary>
    /// Whether the resource is continuously analyzed.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::Grafeas.V1Beta1.Discovery.Discovered.Types.ContinuousAnalysis ContinuousAnalysis {
      get { return continuousAnalysis_; }
      set {
        continuousAnalysis_ = value;
      }
    }

    /// <summary>Field number for the "last_analysis_time" field.</summary>
    public const int LastAnalysisTimeFieldNumber = 2;
    private global::Google.Protobuf.WellKnownTypes.Timestamp lastAnalysisTime_;
    /// <summary>
    /// The last time continuous analysis was done for this resource.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::Google.Protobuf.WellKnownTypes.Timestamp LastAnalysisTime {
      get { return lastAnalysisTime_; }
      set {
        lastAnalysisTime_ = value;
      }
    }

    /// <summary>Field number for the "analysis_status" field.</summary>
    public const int AnalysisStatusFieldNumber = 3;
    private global::Grafeas.V1Beta1.Discovery.Discovered.Types.AnalysisStatus analysisStatus_ = 0;
    /// <summary>
    /// The status of discovery for the resource.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::Grafeas.V1Beta1.Discovery.Discovered.Types.AnalysisStatus AnalysisStatus {
      get { return analysisStatus_; }
      set {
        analysisStatus_ = value;
      }
    }

    /// <summary>Field number for the "analysis_status_error" field.</summary>
    public const int AnalysisStatusErrorFieldNumber = 4;
    private global::Google.Rpc.Status analysisStatusError_;
    /// <summary>
    /// When an error is encountered this will contain a LocalizedMessage under
    /// details to show to the user. The LocalizedMessage is output only and
    /// populated by the API.
    /// </summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public global::Google.Rpc.Status AnalysisStatusError {
      get { return analysisStatusError_; }
      set {
        analysisStatusError_ = value;
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override bool Equals(object other) {
      return Equals(other as Discovered);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public bool Equals(Discovered other) {
      if (ReferenceEquals(other, null)) {
        return false;
      }
      if (ReferenceEquals(other, this)) {
        return true;
      }
      if (ContinuousAnalysis != other.ContinuousAnalysis) return false;
      if (!object.Equals(LastAnalysisTime, other.LastAnalysisTime)) return false;
      if (AnalysisStatus != other.AnalysisStatus) return false;
      if (!object.Equals(AnalysisStatusError, other.AnalysisStatusError)) return false;
      return Equals(_unknownFields, other._unknownFields);
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public override int GetHashCode() {
      int hash = 1;
      if (ContinuousAnalysis != 0) hash ^= ContinuousAnalysis.GetHashCode();
      if (lastAnalysisTime_ != null) hash ^= LastAnalysisTime.GetHashCode();
      if (AnalysisStatus != 0) hash ^= AnalysisStatus.GetHashCode();
      if (analysisStatusError_ != null) hash ^= AnalysisStatusError.GetHashCode();
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
      if (ContinuousAnalysis != 0) {
        output.WriteRawTag(8);
        output.WriteEnum((int) ContinuousAnalysis);
      }
      if (lastAnalysisTime_ != null) {
        output.WriteRawTag(18);
        output.WriteMessage(LastAnalysisTime);
      }
      if (AnalysisStatus != 0) {
        output.WriteRawTag(24);
        output.WriteEnum((int) AnalysisStatus);
      }
      if (analysisStatusError_ != null) {
        output.WriteRawTag(34);
        output.WriteMessage(AnalysisStatusError);
      }
      if (_unknownFields != null) {
        _unknownFields.WriteTo(output);
      }
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public int CalculateSize() {
      int size = 0;
      if (ContinuousAnalysis != 0) {
        size += 1 + pb::CodedOutputStream.ComputeEnumSize((int) ContinuousAnalysis);
      }
      if (lastAnalysisTime_ != null) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(LastAnalysisTime);
      }
      if (AnalysisStatus != 0) {
        size += 1 + pb::CodedOutputStream.ComputeEnumSize((int) AnalysisStatus);
      }
      if (analysisStatusError_ != null) {
        size += 1 + pb::CodedOutputStream.ComputeMessageSize(AnalysisStatusError);
      }
      if (_unknownFields != null) {
        size += _unknownFields.CalculateSize();
      }
      return size;
    }

    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public void MergeFrom(Discovered other) {
      if (other == null) {
        return;
      }
      if (other.ContinuousAnalysis != 0) {
        ContinuousAnalysis = other.ContinuousAnalysis;
      }
      if (other.lastAnalysisTime_ != null) {
        if (lastAnalysisTime_ == null) {
          LastAnalysisTime = new global::Google.Protobuf.WellKnownTypes.Timestamp();
        }
        LastAnalysisTime.MergeFrom(other.LastAnalysisTime);
      }
      if (other.AnalysisStatus != 0) {
        AnalysisStatus = other.AnalysisStatus;
      }
      if (other.analysisStatusError_ != null) {
        if (analysisStatusError_ == null) {
          AnalysisStatusError = new global::Google.Rpc.Status();
        }
        AnalysisStatusError.MergeFrom(other.AnalysisStatusError);
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
          case 8: {
            ContinuousAnalysis = (global::Grafeas.V1Beta1.Discovery.Discovered.Types.ContinuousAnalysis) input.ReadEnum();
            break;
          }
          case 18: {
            if (lastAnalysisTime_ == null) {
              LastAnalysisTime = new global::Google.Protobuf.WellKnownTypes.Timestamp();
            }
            input.ReadMessage(LastAnalysisTime);
            break;
          }
          case 24: {
            AnalysisStatus = (global::Grafeas.V1Beta1.Discovery.Discovered.Types.AnalysisStatus) input.ReadEnum();
            break;
          }
          case 34: {
            if (analysisStatusError_ == null) {
              AnalysisStatusError = new global::Google.Rpc.Status();
            }
            input.ReadMessage(AnalysisStatusError);
            break;
          }
        }
      }
    }

    #region Nested types
    /// <summary>Container for nested types declared in the Discovered message type.</summary>
    [global::System.Diagnostics.DebuggerNonUserCodeAttribute]
    public static partial class Types {
      /// <summary>
      /// Whether the resource is continuously analyzed.
      /// </summary>
      public enum ContinuousAnalysis {
        /// <summary>
        /// Unknown.
        /// </summary>
        [pbr::OriginalName("CONTINUOUS_ANALYSIS_UNSPECIFIED")] Unspecified = 0,
        /// <summary>
        /// The resource is continuously analyzed.
        /// </summary>
        [pbr::OriginalName("ACTIVE")] Active = 1,
        /// <summary>
        /// The resource is ignored for continuous analysis.
        /// </summary>
        [pbr::OriginalName("INACTIVE")] Inactive = 2,
      }

      /// <summary>
      /// Analysis status for a resource. Currently for initial analysis only (not
      /// updated in continuous analysis).
      /// </summary>
      public enum AnalysisStatus {
        /// <summary>
        /// Unknown.
        /// </summary>
        [pbr::OriginalName("ANALYSIS_STATUS_UNSPECIFIED")] Unspecified = 0,
        /// <summary>
        /// Resource is known but no action has been taken yet.
        /// </summary>
        [pbr::OriginalName("PENDING")] Pending = 1,
        /// <summary>
        /// Resource is being analyzed.
        /// </summary>
        [pbr::OriginalName("SCANNING")] Scanning = 2,
        /// <summary>
        /// Analysis has finished successfully.
        /// </summary>
        [pbr::OriginalName("FINISHED_SUCCESS")] FinishedSuccess = 3,
        /// <summary>
        /// Analysis has finished unsuccessfully, the analysis itself is in a bad
        /// state.
        /// </summary>
        [pbr::OriginalName("FINISHED_FAILED")] FinishedFailed = 4,
        /// <summary>
        /// The resource is known not to be supported
        /// </summary>
        [pbr::OriginalName("FINISHED_UNSUPPORTED")] FinishedUnsupported = 5,
      }

    }
    #endregion

  }

  #endregion

}

#endregion Designer generated code
