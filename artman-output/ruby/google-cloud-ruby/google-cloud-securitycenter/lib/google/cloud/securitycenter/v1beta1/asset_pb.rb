# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/securitycenter/v1beta1/asset.proto

require 'google/protobuf'

require 'google/api/field_behavior_pb'
require 'google/cloud/securitycenter/v1beta1/security_marks_pb'
require 'google/protobuf/struct_pb'
require 'google/protobuf/timestamp_pb'
require 'google/api/annotations_pb'
Google::Protobuf::DescriptorPool.generated_pool.build do
  add_message "google.cloud.securitycenter.v1beta1.Asset" do
    optional :name, :string, 1
    optional :security_center_properties, :message, 2, "google.cloud.securitycenter.v1beta1.Asset.SecurityCenterProperties"
    map :resource_properties, :string, :message, 7, "google.protobuf.Value"
    optional :security_marks, :message, 8, "google.cloud.securitycenter.v1beta1.SecurityMarks"
    optional :create_time, :message, 9, "google.protobuf.Timestamp"
    optional :update_time, :message, 10, "google.protobuf.Timestamp"
  end
  add_message "google.cloud.securitycenter.v1beta1.Asset.SecurityCenterProperties" do
    optional :resource_name, :string, 1
    optional :resource_type, :string, 2
    optional :resource_parent, :string, 3
    optional :resource_project, :string, 4
    repeated :resource_owners, :string, 5
  end
end

module Google
  module Cloud
    module Securitycenter
      module V1beta1
        Asset = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.securitycenter.v1beta1.Asset").msgclass
        Asset::SecurityCenterProperties = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.securitycenter.v1beta1.Asset.SecurityCenterProperties").msgclass
      end
    end
  end
end
