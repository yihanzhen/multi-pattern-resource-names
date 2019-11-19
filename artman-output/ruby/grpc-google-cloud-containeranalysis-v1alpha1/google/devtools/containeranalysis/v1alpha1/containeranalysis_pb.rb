# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1alpha1/containeranalysis.proto

require 'google/protobuf'

require 'google/api/annotations_pb'
require 'google/devtools/containeranalysis/v1alpha1/bill_of_materials_pb'
require 'google/devtools/containeranalysis/v1alpha1/image_basis_pb'
require 'google/devtools/containeranalysis/v1alpha1/package_vulnerability_pb'
require 'google/devtools/containeranalysis/v1alpha1/provenance_pb'
require 'google/iam/v1/iam_policy_pb'
require 'google/iam/v1/policy_pb'
require 'google/longrunning/operations_pb'
require 'google/protobuf/any_pb'
require 'google/protobuf/empty_pb'
require 'google/protobuf/field_mask_pb'
require 'google/protobuf/timestamp_pb'
require 'google/rpc/status_pb'
Google::Protobuf::DescriptorPool.generated_pool.build do
  add_message "google.devtools.containeranalysis.v1alpha1.Occurrence" do
    optional :name, :string, 1
    optional :resource_url, :string, 2
    optional :resource, :message, 17, "google.devtools.containeranalysis.v1alpha1.Resource"
    optional :note_name, :string, 3
    optional :kind, :enum, 6, "google.devtools.containeranalysis.v1alpha1.Note.Kind"
    optional :remediation, :string, 5
    optional :create_time, :message, 9, "google.protobuf.Timestamp"
    optional :update_time, :message, 10, "google.protobuf.Timestamp"
    oneof :details do
      optional :vulnerability_details, :message, 8, "google.devtools.containeranalysis.v1alpha1.VulnerabilityType.VulnerabilityDetails"
      optional :build_details, :message, 7, "google.devtools.containeranalysis.v1alpha1.BuildDetails"
      optional :derived_image, :message, 11, "google.devtools.containeranalysis.v1alpha1.DockerImage.Derived"
      optional :installation, :message, 12, "google.devtools.containeranalysis.v1alpha1.PackageManager.Installation"
      optional :deployment, :message, 14, "google.devtools.containeranalysis.v1alpha1.Deployable.Deployment"
      optional :discovered, :message, 15, "google.devtools.containeranalysis.v1alpha1.Discovery.Discovered"
      optional :attestation, :message, 16, "google.devtools.containeranalysis.v1alpha1.AttestationAuthority.Attestation"
    end
  end
  add_message "google.devtools.containeranalysis.v1alpha1.Resource" do
    optional :name, :string, 1
    optional :uri, :string, 2
    optional :content_hash, :message, 3, "google.devtools.containeranalysis.v1alpha1.Hash"
  end
  add_message "google.devtools.containeranalysis.v1alpha1.Note" do
    optional :name, :string, 1
    optional :short_description, :string, 3
    optional :long_description, :string, 4
    optional :kind, :enum, 9, "google.devtools.containeranalysis.v1alpha1.Note.Kind"
    repeated :related_url, :message, 7, "google.devtools.containeranalysis.v1alpha1.Note.RelatedUrl"
    optional :expiration_time, :message, 10, "google.protobuf.Timestamp"
    optional :create_time, :message, 11, "google.protobuf.Timestamp"
    optional :update_time, :message, 12, "google.protobuf.Timestamp"
    oneof :note_type do
      optional :vulnerability_type, :message, 6, "google.devtools.containeranalysis.v1alpha1.VulnerabilityType"
      optional :build_type, :message, 8, "google.devtools.containeranalysis.v1alpha1.BuildType"
      optional :base_image, :message, 13, "google.devtools.containeranalysis.v1alpha1.DockerImage.Basis"
      optional :package, :message, 14, "google.devtools.containeranalysis.v1alpha1.PackageManager.Package"
      optional :deployable, :message, 17, "google.devtools.containeranalysis.v1alpha1.Deployable"
      optional :discovery, :message, 18, "google.devtools.containeranalysis.v1alpha1.Discovery"
      optional :attestation_authority, :message, 19, "google.devtools.containeranalysis.v1alpha1.AttestationAuthority"
    end
  end
  add_message "google.devtools.containeranalysis.v1alpha1.Note.RelatedUrl" do
    optional :url, :string, 1
    optional :label, :string, 2
  end
  add_enum "google.devtools.containeranalysis.v1alpha1.Note.Kind" do
    value :KIND_UNSPECIFIED, 0
    value :PACKAGE_VULNERABILITY, 2
    value :BUILD_DETAILS, 3
    value :IMAGE_BASIS, 4
    value :PACKAGE_MANAGER, 5
    value :DEPLOYABLE, 6
    value :DISCOVERY, 7
    value :ATTESTATION_AUTHORITY, 8
  end
  add_message "google.devtools.containeranalysis.v1alpha1.Deployable" do
    repeated :resource_uri, :string, 1
  end
  add_message "google.devtools.containeranalysis.v1alpha1.Deployable.Deployment" do
    optional :user_email, :string, 1
    optional :deploy_time, :message, 2, "google.protobuf.Timestamp"
    optional :undeploy_time, :message, 3, "google.protobuf.Timestamp"
    optional :config, :string, 8
    optional :address, :string, 5
    repeated :resource_uri, :string, 6
    optional :platform, :enum, 7, "google.devtools.containeranalysis.v1alpha1.Deployable.Deployment.Platform"
  end
  add_enum "google.devtools.containeranalysis.v1alpha1.Deployable.Deployment.Platform" do
    value :PLATFORM_UNSPECIFIED, 0
    value :GKE, 1
    value :FLEX, 2
    value :CUSTOM, 3
  end
  add_message "google.devtools.containeranalysis.v1alpha1.Discovery" do
    optional :analysis_kind, :enum, 1, "google.devtools.containeranalysis.v1alpha1.Note.Kind"
  end
  add_message "google.devtools.containeranalysis.v1alpha1.Discovery.Discovered" do
    optional :operation, :message, 1, "google.longrunning.Operation"
    optional :analysis_status, :enum, 5, "google.devtools.containeranalysis.v1alpha1.Discovery.Discovered.AnalysisStatus"
    optional :analysis_status_error, :message, 6, "google.rpc.Status"
  end
  add_enum "google.devtools.containeranalysis.v1alpha1.Discovery.Discovered.AnalysisStatus" do
    value :ANALYSIS_STATUS_UNSPECIFIED, 0
    value :PENDING, 1
    value :SCANNING, 2
    value :FINISHED_SUCCESS, 3
    value :FINISHED_FAILED, 4
    value :UNSUPPORTED_RESOURCE, 5
  end
  add_message "google.devtools.containeranalysis.v1alpha1.BuildType" do
    optional :builder_version, :string, 1
    optional :signature, :message, 2, "google.devtools.containeranalysis.v1alpha1.BuildSignature"
  end
  add_message "google.devtools.containeranalysis.v1alpha1.BuildSignature" do
    optional :public_key, :string, 1
    optional :signature, :string, 2
    optional :key_id, :string, 3
    optional :key_type, :enum, 4, "google.devtools.containeranalysis.v1alpha1.BuildSignature.KeyType"
  end
  add_enum "google.devtools.containeranalysis.v1alpha1.BuildSignature.KeyType" do
    value :KEY_TYPE_UNSPECIFIED, 0
    value :PGP_ASCII_ARMORED, 1
    value :PKIX_PEM, 2
  end
  add_message "google.devtools.containeranalysis.v1alpha1.PgpSignedAttestation" do
    optional :signature, :string, 1
    optional :content_type, :enum, 3, "google.devtools.containeranalysis.v1alpha1.PgpSignedAttestation.ContentType"
    oneof :key_id do
      optional :pgp_key_id, :string, 2
    end
  end
  add_enum "google.devtools.containeranalysis.v1alpha1.PgpSignedAttestation.ContentType" do
    value :CONTENT_TYPE_UNSPECIFIED, 0
    value :SIMPLE_SIGNING_JSON, 1
  end
  add_message "google.devtools.containeranalysis.v1alpha1.AttestationAuthority" do
    optional :hint, :message, 1, "google.devtools.containeranalysis.v1alpha1.AttestationAuthority.AttestationAuthorityHint"
  end
  add_message "google.devtools.containeranalysis.v1alpha1.AttestationAuthority.AttestationAuthorityHint" do
    optional :human_readable_name, :string, 1
  end
  add_message "google.devtools.containeranalysis.v1alpha1.AttestationAuthority.Attestation" do
    oneof :signature do
      optional :pgp_signed_attestation, :message, 1, "google.devtools.containeranalysis.v1alpha1.PgpSignedAttestation"
    end
  end
  add_message "google.devtools.containeranalysis.v1alpha1.BuildDetails" do
    optional :provenance, :message, 1, "google.devtools.containeranalysis.v1alpha1.BuildProvenance"
    optional :provenance_bytes, :string, 2
  end
  add_message "google.devtools.containeranalysis.v1alpha1.ScanConfig" do
    optional :name, :string, 1
    optional :description, :string, 2
    optional :enabled, :bool, 3
  end
  add_message "google.devtools.containeranalysis.v1alpha1.GetOccurrenceRequest" do
    optional :name, :string, 1
  end
  add_message "google.devtools.containeranalysis.v1alpha1.ListOccurrencesRequest" do
    optional :name, :string, 1
    optional :parent, :string, 5
    optional :filter, :string, 2
    optional :page_size, :int32, 3
    optional :page_token, :string, 4
    optional :kind, :enum, 6, "google.devtools.containeranalysis.v1alpha1.Note.Kind"
  end
  add_message "google.devtools.containeranalysis.v1alpha1.ListOccurrencesResponse" do
    repeated :occurrences, :message, 1, "google.devtools.containeranalysis.v1alpha1.Occurrence"
    optional :next_page_token, :string, 2
  end
  add_message "google.devtools.containeranalysis.v1alpha1.DeleteOccurrenceRequest" do
    optional :name, :string, 1
  end
  add_message "google.devtools.containeranalysis.v1alpha1.CreateOccurrenceRequest" do
    optional :name, :string, 1
    optional :parent, :string, 3
    optional :occurrence, :message, 2, "google.devtools.containeranalysis.v1alpha1.Occurrence"
  end
  add_message "google.devtools.containeranalysis.v1alpha1.UpdateOccurrenceRequest" do
    optional :name, :string, 1
    optional :occurrence, :message, 2, "google.devtools.containeranalysis.v1alpha1.Occurrence"
    optional :update_mask, :message, 3, "google.protobuf.FieldMask"
  end
  add_message "google.devtools.containeranalysis.v1alpha1.GetNoteRequest" do
    optional :name, :string, 1
  end
  add_message "google.devtools.containeranalysis.v1alpha1.GetOccurrenceNoteRequest" do
    optional :name, :string, 1
  end
  add_message "google.devtools.containeranalysis.v1alpha1.ListNotesRequest" do
    optional :name, :string, 1
    optional :parent, :string, 5
    optional :filter, :string, 2
    optional :page_size, :int32, 3
    optional :page_token, :string, 4
  end
  add_message "google.devtools.containeranalysis.v1alpha1.ListNotesResponse" do
    repeated :notes, :message, 1, "google.devtools.containeranalysis.v1alpha1.Note"
    optional :next_page_token, :string, 2
  end
  add_message "google.devtools.containeranalysis.v1alpha1.DeleteNoteRequest" do
    optional :name, :string, 1
  end
  add_message "google.devtools.containeranalysis.v1alpha1.CreateNoteRequest" do
    optional :name, :string, 1
    optional :parent, :string, 4
    optional :note_id, :string, 2
    optional :note, :message, 3, "google.devtools.containeranalysis.v1alpha1.Note"
  end
  add_message "google.devtools.containeranalysis.v1alpha1.UpdateNoteRequest" do
    optional :name, :string, 1
    optional :note, :message, 2, "google.devtools.containeranalysis.v1alpha1.Note"
    optional :update_mask, :message, 3, "google.protobuf.FieldMask"
  end
  add_message "google.devtools.containeranalysis.v1alpha1.ListNoteOccurrencesRequest" do
    optional :name, :string, 1
    optional :filter, :string, 2
    optional :page_size, :int32, 3
    optional :page_token, :string, 4
  end
  add_message "google.devtools.containeranalysis.v1alpha1.ListNoteOccurrencesResponse" do
    repeated :occurrences, :message, 1, "google.devtools.containeranalysis.v1alpha1.Occurrence"
    optional :next_page_token, :string, 2
  end
  add_message "google.devtools.containeranalysis.v1alpha1.CreateOperationRequest" do
    optional :parent, :string, 1
    optional :operation_id, :string, 2
    optional :operation, :message, 3, "google.longrunning.Operation"
  end
  add_message "google.devtools.containeranalysis.v1alpha1.UpdateOperationRequest" do
    optional :name, :string, 1
    optional :operation, :message, 3, "google.longrunning.Operation"
    optional :update_mask, :message, 4, "google.protobuf.FieldMask"
  end
  add_message "google.devtools.containeranalysis.v1alpha1.OperationMetadata" do
    optional :create_time, :message, 1, "google.protobuf.Timestamp"
    optional :end_time, :message, 2, "google.protobuf.Timestamp"
  end
  add_message "google.devtools.containeranalysis.v1alpha1.GetVulnzOccurrencesSummaryRequest" do
    optional :parent, :string, 1
    optional :filter, :string, 2
  end
  add_message "google.devtools.containeranalysis.v1alpha1.GetVulnzOccurrencesSummaryResponse" do
    repeated :counts, :message, 1, "google.devtools.containeranalysis.v1alpha1.GetVulnzOccurrencesSummaryResponse.SeverityCount"
  end
  add_message "google.devtools.containeranalysis.v1alpha1.GetVulnzOccurrencesSummaryResponse.SeverityCount" do
    optional :severity, :enum, 1, "google.devtools.containeranalysis.v1alpha1.VulnerabilityType.Severity"
    optional :count, :int64, 2
  end
  add_message "google.devtools.containeranalysis.v1alpha1.GetScanConfigRequest" do
    optional :name, :string, 1
  end
  add_message "google.devtools.containeranalysis.v1alpha1.ListScanConfigsRequest" do
    optional :parent, :string, 1
    optional :filter, :string, 2
    optional :page_size, :int32, 3
    optional :page_token, :string, 4
  end
  add_message "google.devtools.containeranalysis.v1alpha1.ListScanConfigsResponse" do
    repeated :scan_configs, :message, 1, "google.devtools.containeranalysis.v1alpha1.ScanConfig"
    optional :next_page_token, :string, 2
  end
  add_message "google.devtools.containeranalysis.v1alpha1.UpdateScanConfigRequest" do
    optional :name, :string, 1
    optional :scan_config, :message, 2, "google.devtools.containeranalysis.v1alpha1.ScanConfig"
    optional :update_mask, :message, 3, "google.protobuf.FieldMask"
  end
end

module Google
  module Devtools
    module Containeranalysis
      module V1alpha1
        Occurrence = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.Occurrence").msgclass
        Resource = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.Resource").msgclass
        Note = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.Note").msgclass
        Note::RelatedUrl = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.Note.RelatedUrl").msgclass
        Note::Kind = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.Note.Kind").enummodule
        Deployable = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.Deployable").msgclass
        Deployable::Deployment = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.Deployable.Deployment").msgclass
        Deployable::Deployment::Platform = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.Deployable.Deployment.Platform").enummodule
        Discovery = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.Discovery").msgclass
        Discovery::Discovered = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.Discovery.Discovered").msgclass
        Discovery::Discovered::AnalysisStatus = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.Discovery.Discovered.AnalysisStatus").enummodule
        BuildType = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.BuildType").msgclass
        BuildSignature = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.BuildSignature").msgclass
        BuildSignature::KeyType = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.BuildSignature.KeyType").enummodule
        PgpSignedAttestation = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.PgpSignedAttestation").msgclass
        PgpSignedAttestation::ContentType = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.PgpSignedAttestation.ContentType").enummodule
        AttestationAuthority = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.AttestationAuthority").msgclass
        AttestationAuthority::AttestationAuthorityHint = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.AttestationAuthority.AttestationAuthorityHint").msgclass
        AttestationAuthority::Attestation = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.AttestationAuthority.Attestation").msgclass
        BuildDetails = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.BuildDetails").msgclass
        ScanConfig = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.ScanConfig").msgclass
        GetOccurrenceRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.GetOccurrenceRequest").msgclass
        ListOccurrencesRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.ListOccurrencesRequest").msgclass
        ListOccurrencesResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.ListOccurrencesResponse").msgclass
        DeleteOccurrenceRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.DeleteOccurrenceRequest").msgclass
        CreateOccurrenceRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.CreateOccurrenceRequest").msgclass
        UpdateOccurrenceRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.UpdateOccurrenceRequest").msgclass
        GetNoteRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.GetNoteRequest").msgclass
        GetOccurrenceNoteRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.GetOccurrenceNoteRequest").msgclass
        ListNotesRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.ListNotesRequest").msgclass
        ListNotesResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.ListNotesResponse").msgclass
        DeleteNoteRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.DeleteNoteRequest").msgclass
        CreateNoteRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.CreateNoteRequest").msgclass
        UpdateNoteRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.UpdateNoteRequest").msgclass
        ListNoteOccurrencesRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.ListNoteOccurrencesRequest").msgclass
        ListNoteOccurrencesResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.ListNoteOccurrencesResponse").msgclass
        CreateOperationRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.CreateOperationRequest").msgclass
        UpdateOperationRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.UpdateOperationRequest").msgclass
        OperationMetadata = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.OperationMetadata").msgclass
        GetVulnzOccurrencesSummaryRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.GetVulnzOccurrencesSummaryRequest").msgclass
        GetVulnzOccurrencesSummaryResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.GetVulnzOccurrencesSummaryResponse").msgclass
        GetVulnzOccurrencesSummaryResponse::SeverityCount = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.GetVulnzOccurrencesSummaryResponse.SeverityCount").msgclass
        GetScanConfigRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.GetScanConfigRequest").msgclass
        ListScanConfigsRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.ListScanConfigsRequest").msgclass
        ListScanConfigsResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.ListScanConfigsResponse").msgclass
        UpdateScanConfigRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1alpha1.UpdateScanConfigRequest").msgclass
      end
    end
  end
end