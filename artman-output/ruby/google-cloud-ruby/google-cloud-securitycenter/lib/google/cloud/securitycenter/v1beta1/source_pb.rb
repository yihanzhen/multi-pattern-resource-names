# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/securitycenter/v1beta1/source.proto

require 'google/protobuf'

require 'google/api/annotations_pb'
Google::Protobuf::DescriptorPool.generated_pool.build do
  add_message "google.cloud.securitycenter.v1beta1.Source" do
    optional :name, :string, 1
    optional :display_name, :string, 2
    optional :description, :string, 3
  end
end

module Google
  module Cloud
    module Securitycenter
      module V1beta1
        Source = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.securitycenter.v1beta1.Source").msgclass
      end
    end
  end
end
