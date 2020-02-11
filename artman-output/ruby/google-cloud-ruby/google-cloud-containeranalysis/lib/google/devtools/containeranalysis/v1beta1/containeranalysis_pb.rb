# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1beta1/containeranalysis.proto

require 'google/protobuf'

require 'google/api/annotations_pb'
require 'google/api/client_pb'
require 'google/api/field_behavior_pb'
require 'google/api/resource_pb'
require 'google/iam/v1/iam_policy_pb'
require 'google/iam/v1/policy_pb'
require 'google/protobuf/timestamp_pb'
Google::Protobuf::DescriptorPool.generated_pool.build do
  add_message "google.devtools.containeranalysis.v1beta1.ScanConfig" do
    optional :name, :string, 1
    optional :description, :string, 2
    optional :enabled, :bool, 3
    optional :create_time, :message, 4, "google.protobuf.Timestamp"
    optional :update_time, :message, 5, "google.protobuf.Timestamp"
  end
  add_message "google.devtools.containeranalysis.v1beta1.GetScanConfigRequest" do
    optional :name, :string, 1
  end
  add_message "google.devtools.containeranalysis.v1beta1.ListScanConfigsRequest" do
    optional :parent, :string, 1
    optional :filter, :string, 2
    optional :page_size, :int32, 3
    optional :page_token, :string, 4
  end
  add_message "google.devtools.containeranalysis.v1beta1.ListScanConfigsResponse" do
    repeated :scan_configs, :message, 1, "google.devtools.containeranalysis.v1beta1.ScanConfig"
    optional :next_page_token, :string, 2
  end
  add_message "google.devtools.containeranalysis.v1beta1.UpdateScanConfigRequest" do
    optional :name, :string, 1
    optional :scan_config, :message, 2, "google.devtools.containeranalysis.v1beta1.ScanConfig"
  end
end

module Google
  module Devtools
    module Containeranalysis
      module V1beta1
        ScanConfig = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1beta1.ScanConfig").msgclass
        GetScanConfigRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1beta1.GetScanConfigRequest").msgclass
        ListScanConfigsRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1beta1.ListScanConfigsRequest").msgclass
        ListScanConfigsResponse = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1beta1.ListScanConfigsResponse").msgclass
        UpdateScanConfigRequest = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.devtools.containeranalysis.v1beta1.UpdateScanConfigRequest").msgclass
      end
    end
  end
end
