# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/securitycenter/v1beta1/security_marks.proto

require 'google/protobuf'

require 'google/api/resource_pb'
require 'google/api/annotations_pb'
Google::Protobuf::DescriptorPool.generated_pool.build do
  add_message "google.cloud.securitycenter.v1beta1.SecurityMarks" do
    optional :name, :string, 1
    map :marks, :string, :string, 2
  end
end

module Google
  module Cloud
    module Securitycenter
      module V1beta1
        SecurityMarks = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.securitycenter.v1beta1.SecurityMarks").msgclass
      end
    end
  end
end
