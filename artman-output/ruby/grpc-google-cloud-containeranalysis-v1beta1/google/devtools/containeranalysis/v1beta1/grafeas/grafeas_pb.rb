# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1beta1/grafeas/grafeas.proto

require 'google/protobuf'

require 'google/api/annotations_pb'
require 'google/api/client_pb'
require 'google/devtools/containeranalysis/v1beta1/attestation/attestation_pb'
require 'google/devtools/containeranalysis/v1beta1/build/build_pb'
require 'google/devtools/containeranalysis/v1beta1/common/common_pb'
require 'google/devtools/containeranalysis/v1beta1/deployment/deployment_pb'
require 'google/devtools/containeranalysis/v1beta1/discovery/discovery_pb'
require 'google/devtools/containeranalysis/v1beta1/image/image_pb'
require 'google/devtools/containeranalysis/v1beta1/package/package_pb'
require 'google/devtools/containeranalysis/v1beta1/provenance/provenance_pb'
require 'google/devtools/containeranalysis/v1beta1/vulnerability/vulnerability_pb'
require 'google/protobuf/empty_pb'
require 'google/protobuf/field_mask_pb'
require 'google/protobuf/timestamp_pb'
Google::Protobuf::DescriptorPool.generated_pool.build do
  add_message "grafeas.v1beta1.Occurrence" do
    optional :name, :string, 1
    optional :resource, :message, 2, "grafeas.v1beta1.Resource"
    optional :note_name, :string, 3
    optional :kind, :enum, 4, "grafeas.v1beta1.NoteKind"
    optional :remediation, :string, 5
    optional :create_time, :message, 6, "google.protobuf.Timestamp"
    optional :update_time, :message, 7, "google.protobuf.Timestamp"
    oneof :details do
      optional :vulnerability, :message, 8, "grafeas.v1beta1.vulnerability.Details"
      optional :build, :message, 9, "grafeas.v1beta1.build.Details"
      optional :derived_image, :message, 10, "grafeas.v1beta1.image.Details"
      optional :installation, :message, 11, "grafeas.v1beta1.package.Details"
      optional :deployment, :message, 12, "grafeas.v1beta1.deployment.Details"
      optional :discovered, :message, 13, "grafeas.v1beta1.discovery.Details"
      optional :attestation, :message, 14, "grafeas.v1beta1.attestation.Details"
    end
  end
  add_message "grafeas.v1beta1.Resource" do
    optional :name, :string, 1
    optional :uri, :string, 2
    optional :content_hash, :message, 3, "grafeas.v1beta1.provenance.Hash"
  end
  add_message "grafeas.v1beta1.Note" do
    optional :name, :string, 1
    optional :short_description, :string, 2
    optional :long_description, :string, 3
    optional :kind, :enum, 4, "grafeas.v1beta1.NoteKind"
    repeated :related_url, :message, 5, "grafeas.v1beta1.RelatedUrl"
    optional :expiration_time, :message, 6, "google.protobuf.Timestamp"
    optional :create_time, :message, 7, "google.protobuf.Timestamp"
    optional :update_time, :message, 8, "google.protobuf.Timestamp"
    repeated :related_note_names, :string, 9
    oneof :type do
      optional :vulnerability, :message, 10, "grafeas.v1beta1.vulnerability.Vulnerability"
      optional :build, :message, 11, "grafeas.v1beta1.build.Build"
      optional :base_image, :message, 12, "grafeas.v1beta1.image.Basis"
      optional :package, :message, 13, "grafeas.v1beta1.package.Package"
      optional :deployable, :message, 14, "grafeas.v1beta1.deployment.Deployable"
      optional :discovery, :message, 15, "grafeas.v1beta1.discovery.Discovery"
      optional :attestation_authority, :message, 16, "grafeas.v1beta1.attestation.Authority"
    end
  end
  add_message "grafeas.v1beta1.GetOccurrenceRequest" do
    optional :name, :string, 1
  end
  add_message "grafeas.v1beta1.ListOccurrencesRequest" do
    optional :parent, :string, 1
    optional :filter, :string, 2
    optional :page_size, :int32, 3
    optional :page_token, :string, 4
  end
  add_message "grafeas.v1beta1.ListOccurrencesResponse" do
    repeated :occurrences, :message, 1, "grafeas.v1beta1.Occurrence"
    optional :next_page_token, :string, 2
  end
  add_message "grafeas.v1beta1.DeleteOccurrenceRequest" do
    optional :name, :string, 1
  end
  add_message "grafeas.v1beta1.CreateOccurrenceRequest" do
    optional :parent, :string, 1
    optional :occurrence, :message, 2, "grafeas.v1beta1.Occurrence"
  end
  add_message "grafeas.v1beta1.UpdateOccurrenceRequest" do
    optional :name, :string, 1
    optional :occurrence, :message, 2, "grafeas.v1beta1.Occurrence"
    optional :update_mask, :message, 3, "google.protobuf.FieldMask"
  end
  add_message "grafeas.v1beta1.GetNoteRequest" do
    optional :name, :string, 1
  end
  add_message "grafeas.v1beta1.GetOccurrenceNoteRequest" do
    optional :name, :string, 1
  end
  add_message "grafeas.v1beta1.ListNotesRequest" do
    optional :parent, :string, 1
    optional :filter, :string, 2
    optional :page_size, :int32, 3
    optional :page_token, :string, 4
  end
  add_message "grafeas.v1beta1.ListNotesResponse" do
    repeated :notes, :message, 1, "grafeas.v1beta1.Note"
    optional :next_page_token, :string, 2
  end
  add_message "grafeas.v1beta1.DeleteNoteRequest" do
    optional :name, :string, 1
  end
  add_message "grafeas.v1beta1.CreateNoteRequest" do
    optional :parent, :string, 1
    optional :note_id, :string, 2
    optional :note, :message, 3, "grafeas.v1beta1.Note"
  end
  add_message "grafeas.v1beta1.UpdateNoteRequest" do
    optional :name, :string, 1
    optional :note, :message, 2, "grafeas.v1beta1.Note"
    optional :update_mask, :message, 3, "google.protobuf.FieldMask"
  end
  add_message "grafeas.v1beta1.ListNoteOccurrencesRequest" do
    optional :name, :string, 1
    optional :filter, :string, 2
    optional :page_size, :int32, 3
    optional :page_token, :string, 4
  end
  add_message "grafeas.v1beta1.ListNoteOccurrencesResponse" do
    repeated :occurrences, :message, 1, "grafeas.v1beta1.Occurrence"
    optional :next_page_token, :string, 2
  end
  add_message "grafeas.v1beta1.BatchCreateNotesRequest" do
    optional :parent, :string, 1
    map :notes, :string, :message, 2, "grafeas.v1beta1.Note"
  end
  add_message "grafeas.v1beta1.BatchCreateNotesResponse" do
    repeated :notes, :message, 1, "grafeas.v1beta1.Note"
  end
  add_message "grafeas.v1beta1.BatchCreateOccurrencesRequest" do
    optional :parent, :string, 1
    repeated :occurrences, :message, 2, "grafeas.v1beta1.Occurrence"
  end
  add_message "grafeas.v1beta1.BatchCreateOccurrencesResponse" do
    repeated :occurrences, :message, 1, "grafeas.v1beta1.Occurrence"
  end
  add_message "grafeas.v1beta1.GetVulnerabilityOccurrencesSummaryRequest" do
    optional :parent, :string, 1
    optional :filter, :string, 2
  end
  add_message "grafeas.v1beta1.VulnerabilityOccurrencesSummary" do
    repeated :counts, :message, 1, "grafeas.v1beta1.VulnerabilityOccurrencesSummary.FixableTotalByDigest"
  end
  add_message "grafeas.v1beta1.VulnerabilityOccurrencesSummary.FixableTotalByDigest" do
    optional :resource, :message, 1, "grafeas.v1beta1.Resource"
    optional :severity, :enum, 2, "grafeas.v1beta1.vulnerability.Severity"
    optional :fixable_count, :int64, 3
    optional :total_count, :int64, 4
  end
end

module Grafeas
  module V1beta1
    Occurrence = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.Occurrence").msgclass
    Resource = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.Resource").msgclass
    Note = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.Note").msgclass
    GetOccurrenceRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.GetOccurrenceRequest").msgclass
    ListOccurrencesRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.ListOccurrencesRequest").msgclass
    ListOccurrencesResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.ListOccurrencesResponse").msgclass
    DeleteOccurrenceRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.DeleteOccurrenceRequest").msgclass
    CreateOccurrenceRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.CreateOccurrenceRequest").msgclass
    UpdateOccurrenceRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.UpdateOccurrenceRequest").msgclass
    GetNoteRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.GetNoteRequest").msgclass
    GetOccurrenceNoteRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.GetOccurrenceNoteRequest").msgclass
    ListNotesRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.ListNotesRequest").msgclass
    ListNotesResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.ListNotesResponse").msgclass
    DeleteNoteRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.DeleteNoteRequest").msgclass
    CreateNoteRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.CreateNoteRequest").msgclass
    UpdateNoteRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.UpdateNoteRequest").msgclass
    ListNoteOccurrencesRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.ListNoteOccurrencesRequest").msgclass
    ListNoteOccurrencesResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.ListNoteOccurrencesResponse").msgclass
    BatchCreateNotesRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.BatchCreateNotesRequest").msgclass
    BatchCreateNotesResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.BatchCreateNotesResponse").msgclass
    BatchCreateOccurrencesRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.BatchCreateOccurrencesRequest").msgclass
    BatchCreateOccurrencesResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.BatchCreateOccurrencesResponse").msgclass
    GetVulnerabilityOccurrencesSummaryRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.GetVulnerabilityOccurrencesSummaryRequest").msgclass
    VulnerabilityOccurrencesSummary = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.VulnerabilityOccurrencesSummary").msgclass
    VulnerabilityOccurrencesSummary::FixableTotalByDigest = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.VulnerabilityOccurrencesSummary.FixableTotalByDigest").msgclass
  end
end
