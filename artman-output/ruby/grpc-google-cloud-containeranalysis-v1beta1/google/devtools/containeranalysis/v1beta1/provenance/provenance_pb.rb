# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1beta1/provenance/provenance.proto

require 'google/protobuf'

require 'google/devtools/containeranalysis/v1beta1/source/source_pb'
require 'google/protobuf/timestamp_pb'
Google::Protobuf::DescriptorPool.generated_pool.build do
  add_message "grafeas.v1beta1.provenance.BuildProvenance" do
    optional :id, :string, 1
    optional :project_id, :string, 2
    repeated :commands, :message, 3, "grafeas.v1beta1.provenance.Command"
    repeated :built_artifacts, :message, 4, "grafeas.v1beta1.provenance.Artifact"
    optional :create_time, :message, 5, "google.protobuf.Timestamp"
    optional :start_time, :message, 6, "google.protobuf.Timestamp"
    optional :end_time, :message, 7, "google.protobuf.Timestamp"
    optional :creator, :string, 8
    optional :logs_uri, :string, 9
    optional :source_provenance, :message, 10, "grafeas.v1beta1.provenance.Source"
    optional :trigger_id, :string, 11
    map :build_options, :string, :string, 12
    optional :builder_version, :string, 13
  end
  add_message "grafeas.v1beta1.provenance.Source" do
    optional :artifact_storage_source_uri, :string, 1
    map :file_hashes, :string, :message, 2, "grafeas.v1beta1.provenance.FileHashes"
    optional :context, :message, 3, "grafeas.v1beta1.source.SourceContext"
    repeated :additional_contexts, :message, 4, "grafeas.v1beta1.source.SourceContext"
  end
  add_message "grafeas.v1beta1.provenance.FileHashes" do
    repeated :file_hash, :message, 1, "grafeas.v1beta1.provenance.Hash"
  end
  add_message "grafeas.v1beta1.provenance.Hash" do
    optional :type, :enum, 1, "grafeas.v1beta1.provenance.Hash.HashType"
    optional :value, :bytes, 2
  end
  add_enum "grafeas.v1beta1.provenance.Hash.HashType" do
    value :HASH_TYPE_UNSPECIFIED, 0
    value :SHA256, 1
  end
  add_message "grafeas.v1beta1.provenance.Command" do
    optional :name, :string, 1
    repeated :env, :string, 2
    repeated :args, :string, 3
    optional :dir, :string, 4
    optional :id, :string, 5
    repeated :wait_for, :string, 6
  end
  add_message "grafeas.v1beta1.provenance.Artifact" do
    optional :checksum, :string, 1
    optional :id, :string, 2
    repeated :names, :string, 3
  end
end

module Grafeas
  module V1beta1
    module Provenance
      BuildProvenance = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.provenance.BuildProvenance").msgclass
      Source = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.provenance.Source").msgclass
      FileHashes = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.provenance.FileHashes").msgclass
      Hash = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.provenance.Hash").msgclass
      Hash::HashType = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.provenance.Hash.HashType").enummodule
      Command = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.provenance.Command").msgclass
      Artifact = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.provenance.Artifact").msgclass
    end
  end
end
