# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1beta1/attestation/attestation.proto

require 'google/protobuf'

require 'google/devtools/containeranalysis/v1beta1/common/common_pb'
Google::Protobuf::DescriptorPool.generated_pool.build do
  add_message "grafeas.v1beta1.attestation.PgpSignedAttestation" do
    optional :signature, :string, 1
    optional :content_type, :enum, 3, "grafeas.v1beta1.attestation.PgpSignedAttestation.ContentType"
    oneof :key_id do
      optional :pgp_key_id, :string, 2
    end
  end
  add_enum "grafeas.v1beta1.attestation.PgpSignedAttestation.ContentType" do
    value :CONTENT_TYPE_UNSPECIFIED, 0
    value :SIMPLE_SIGNING_JSON, 1
  end
  add_message "grafeas.v1beta1.attestation.GenericSignedAttestation" do
    optional :content_type, :enum, 1, "grafeas.v1beta1.attestation.GenericSignedAttestation.ContentType"
    optional :serialized_payload, :bytes, 2
    repeated :signatures, :message, 3, "grafeas.v1beta1.Signature"
  end
  add_enum "grafeas.v1beta1.attestation.GenericSignedAttestation.ContentType" do
    value :CONTENT_TYPE_UNSPECIFIED, 0
    value :SIMPLE_SIGNING_JSON, 1
  end
  add_message "grafeas.v1beta1.attestation.Authority" do
    optional :hint, :message, 1, "grafeas.v1beta1.attestation.Authority.Hint"
  end
  add_message "grafeas.v1beta1.attestation.Authority.Hint" do
    optional :human_readable_name, :string, 1
  end
  add_message "grafeas.v1beta1.attestation.Details" do
    optional :attestation, :message, 1, "grafeas.v1beta1.attestation.Attestation"
  end
  add_message "grafeas.v1beta1.attestation.Attestation" do
    oneof :signature do
      optional :pgp_signed_attestation, :message, 1, "grafeas.v1beta1.attestation.PgpSignedAttestation"
      optional :generic_signed_attestation, :message, 2, "grafeas.v1beta1.attestation.GenericSignedAttestation"
    end
  end
end

module Grafeas
  module V1beta1
    module Attestation
      PgpSignedAttestation = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.attestation.PgpSignedAttestation").msgclass
      PgpSignedAttestation::ContentType = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.attestation.PgpSignedAttestation.ContentType").enummodule
      GenericSignedAttestation = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.attestation.GenericSignedAttestation").msgclass
      GenericSignedAttestation::ContentType = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.attestation.GenericSignedAttestation.ContentType").enummodule
      Authority = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.attestation.Authority").msgclass
      Authority::Hint = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.attestation.Authority.Hint").msgclass
      Details = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.attestation.Details").msgclass
      Attestation = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.attestation.Attestation").msgclass
    end
  end
end
