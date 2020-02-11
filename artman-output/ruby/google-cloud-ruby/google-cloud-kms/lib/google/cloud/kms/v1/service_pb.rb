# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/kms/v1/service.proto

require 'google/protobuf'

require 'google/api/annotations_pb'
require 'google/api/client_pb'
require 'google/api/field_behavior_pb'
require 'google/api/resource_pb'
require 'google/cloud/kms/v1/resources_pb'
require 'google/protobuf/field_mask_pb'
Google::Protobuf::DescriptorPool.generated_pool.build do
  add_message "google.cloud.kms.v1.ListKeyRingsRequest" do
    optional :parent, :string, 1
    optional :page_size, :int32, 2
    optional :page_token, :string, 3
    optional :filter, :string, 4
    optional :order_by, :string, 5
  end
  add_message "google.cloud.kms.v1.ListCryptoKeysRequest" do
    optional :parent, :string, 1
    optional :page_size, :int32, 2
    optional :page_token, :string, 3
    optional :version_view, :enum, 4, "google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionView"
    optional :filter, :string, 5
    optional :order_by, :string, 6
  end
  add_message "google.cloud.kms.v1.ListCryptoKeyVersionsRequest" do
    optional :parent, :string, 1
    optional :page_size, :int32, 2
    optional :page_token, :string, 3
    optional :view, :enum, 4, "google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionView"
    optional :filter, :string, 5
    optional :order_by, :string, 6
  end
  add_message "google.cloud.kms.v1.ListImportJobsRequest" do
    optional :parent, :string, 1
    optional :page_size, :int32, 2
    optional :page_token, :string, 3
    optional :filter, :string, 4
    optional :order_by, :string, 5
  end
  add_message "google.cloud.kms.v1.ListKeyRingsResponse" do
    repeated :key_rings, :message, 1, "google.cloud.kms.v1.KeyRing"
    optional :next_page_token, :string, 2
    optional :total_size, :int32, 3
  end
  add_message "google.cloud.kms.v1.ListCryptoKeysResponse" do
    repeated :crypto_keys, :message, 1, "google.cloud.kms.v1.CryptoKey"
    optional :next_page_token, :string, 2
    optional :total_size, :int32, 3
  end
  add_message "google.cloud.kms.v1.ListCryptoKeyVersionsResponse" do
    repeated :crypto_key_versions, :message, 1, "google.cloud.kms.v1.CryptoKeyVersion"
    optional :next_page_token, :string, 2
    optional :total_size, :int32, 3
  end
  add_message "google.cloud.kms.v1.ListImportJobsResponse" do
    repeated :import_jobs, :message, 1, "google.cloud.kms.v1.ImportJob"
    optional :next_page_token, :string, 2
    optional :total_size, :int32, 3
  end
  add_message "google.cloud.kms.v1.GetKeyRingRequest" do
    optional :name, :string, 1
  end
  add_message "google.cloud.kms.v1.GetCryptoKeyRequest" do
    optional :name, :string, 1
  end
  add_message "google.cloud.kms.v1.GetCryptoKeyVersionRequest" do
    optional :name, :string, 1
  end
  add_message "google.cloud.kms.v1.GetPublicKeyRequest" do
    optional :name, :string, 1
  end
  add_message "google.cloud.kms.v1.GetImportJobRequest" do
    optional :name, :string, 1
  end
  add_message "google.cloud.kms.v1.CreateKeyRingRequest" do
    optional :parent, :string, 1
    optional :key_ring_id, :string, 2
    optional :key_ring, :message, 3, "google.cloud.kms.v1.KeyRing"
  end
  add_message "google.cloud.kms.v1.CreateCryptoKeyRequest" do
    optional :parent, :string, 1
    optional :crypto_key_id, :string, 2
    optional :crypto_key, :message, 3, "google.cloud.kms.v1.CryptoKey"
    optional :skip_initial_version_creation, :bool, 5
  end
  add_message "google.cloud.kms.v1.CreateCryptoKeyVersionRequest" do
    optional :parent, :string, 1
    optional :crypto_key_version, :message, 2, "google.cloud.kms.v1.CryptoKeyVersion"
  end
  add_message "google.cloud.kms.v1.ImportCryptoKeyVersionRequest" do
    optional :parent, :string, 1
    optional :algorithm, :enum, 2, "google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionAlgorithm"
    optional :import_job, :string, 4
    oneof :wrapped_key_material do
      optional :rsa_aes_wrapped_key, :bytes, 5
    end
  end
  add_message "google.cloud.kms.v1.CreateImportJobRequest" do
    optional :parent, :string, 1
    optional :import_job_id, :string, 2
    optional :import_job, :message, 3, "google.cloud.kms.v1.ImportJob"
  end
  add_message "google.cloud.kms.v1.UpdateCryptoKeyRequest" do
    optional :crypto_key, :message, 1, "google.cloud.kms.v1.CryptoKey"
    optional :update_mask, :message, 2, "google.protobuf.FieldMask"
  end
  add_message "google.cloud.kms.v1.UpdateCryptoKeyVersionRequest" do
    optional :crypto_key_version, :message, 1, "google.cloud.kms.v1.CryptoKeyVersion"
    optional :update_mask, :message, 2, "google.protobuf.FieldMask"
  end
  add_message "google.cloud.kms.v1.EncryptRequest" do
    optional :name, :string, 1
    optional :plaintext, :bytes, 2
    optional :additional_authenticated_data, :bytes, 3
  end
  add_message "google.cloud.kms.v1.DecryptRequest" do
    optional :name, :string, 1
    optional :ciphertext, :bytes, 2
    optional :additional_authenticated_data, :bytes, 3
  end
  add_message "google.cloud.kms.v1.AsymmetricSignRequest" do
    optional :name, :string, 1
    optional :digest, :message, 3, "google.cloud.kms.v1.Digest"
  end
  add_message "google.cloud.kms.v1.AsymmetricDecryptRequest" do
    optional :name, :string, 1
    optional :ciphertext, :bytes, 3
  end
  add_message "google.cloud.kms.v1.DecryptResponse" do
    optional :plaintext, :bytes, 1
  end
  add_message "google.cloud.kms.v1.EncryptResponse" do
    optional :name, :string, 1
    optional :ciphertext, :bytes, 2
  end
  add_message "google.cloud.kms.v1.AsymmetricSignResponse" do
    optional :signature, :bytes, 1
  end
  add_message "google.cloud.kms.v1.AsymmetricDecryptResponse" do
    optional :plaintext, :bytes, 1
  end
  add_message "google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest" do
    optional :name, :string, 1
    optional :crypto_key_version_id, :string, 2
  end
  add_message "google.cloud.kms.v1.DestroyCryptoKeyVersionRequest" do
    optional :name, :string, 1
  end
  add_message "google.cloud.kms.v1.RestoreCryptoKeyVersionRequest" do
    optional :name, :string, 1
  end
  add_message "google.cloud.kms.v1.Digest" do
    oneof :digest do
      optional :sha256, :bytes, 1
      optional :sha384, :bytes, 2
      optional :sha512, :bytes, 3
    end
  end
  add_message "google.cloud.kms.v1.LocationMetadata" do
    optional :hsm_available, :bool, 1
  end
end

module Google
  module Cloud
    module Kms
      module V1
        ListKeyRingsRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.kms.v1.ListKeyRingsRequest").msgclass
        ListCryptoKeysRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.kms.v1.ListCryptoKeysRequest").msgclass
        ListCryptoKeyVersionsRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.kms.v1.ListCryptoKeyVersionsRequest").msgclass
        ListImportJobsRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.kms.v1.ListImportJobsRequest").msgclass
        ListKeyRingsResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.kms.v1.ListKeyRingsResponse").msgclass
        ListCryptoKeysResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.kms.v1.ListCryptoKeysResponse").msgclass
        ListCryptoKeyVersionsResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.kms.v1.ListCryptoKeyVersionsResponse").msgclass
        ListImportJobsResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.kms.v1.ListImportJobsResponse").msgclass
        GetKeyRingRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.kms.v1.GetKeyRingRequest").msgclass
        GetCryptoKeyRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.kms.v1.GetCryptoKeyRequest").msgclass
        GetCryptoKeyVersionRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.kms.v1.GetCryptoKeyVersionRequest").msgclass
        GetPublicKeyRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.kms.v1.GetPublicKeyRequest").msgclass
        GetImportJobRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.kms.v1.GetImportJobRequest").msgclass
        CreateKeyRingRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.kms.v1.CreateKeyRingRequest").msgclass
        CreateCryptoKeyRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.kms.v1.CreateCryptoKeyRequest").msgclass
        CreateCryptoKeyVersionRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.kms.v1.CreateCryptoKeyVersionRequest").msgclass
        ImportCryptoKeyVersionRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.kms.v1.ImportCryptoKeyVersionRequest").msgclass
        CreateImportJobRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.kms.v1.CreateImportJobRequest").msgclass
        UpdateCryptoKeyRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.kms.v1.UpdateCryptoKeyRequest").msgclass
        UpdateCryptoKeyVersionRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.kms.v1.UpdateCryptoKeyVersionRequest").msgclass
        EncryptRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.kms.v1.EncryptRequest").msgclass
        DecryptRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.kms.v1.DecryptRequest").msgclass
        AsymmetricSignRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.kms.v1.AsymmetricSignRequest").msgclass
        AsymmetricDecryptRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.kms.v1.AsymmetricDecryptRequest").msgclass
        DecryptResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.kms.v1.DecryptResponse").msgclass
        EncryptResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.kms.v1.EncryptResponse").msgclass
        AsymmetricSignResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.kms.v1.AsymmetricSignResponse").msgclass
        AsymmetricDecryptResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.kms.v1.AsymmetricDecryptResponse").msgclass
        UpdateCryptoKeyPrimaryVersionRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.kms.v1.UpdateCryptoKeyPrimaryVersionRequest").msgclass
        DestroyCryptoKeyVersionRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.kms.v1.DestroyCryptoKeyVersionRequest").msgclass
        RestoreCryptoKeyVersionRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.kms.v1.RestoreCryptoKeyVersionRequest").msgclass
        Digest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.kms.v1.Digest").msgclass
        LocationMetadata = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.kms.v1.LocationMetadata").msgclass
      end
    end
  end
end
