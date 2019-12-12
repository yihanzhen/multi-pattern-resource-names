# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/talent/v4beta1/company.proto

require 'google/protobuf'

require 'google/api/annotations_pb'
require 'google/api/field_behavior_pb'
require 'google/cloud/talent/v4beta1/common_pb'
Google::Protobuf::DescriptorPool.generated_pool.build do
  add_message "google.cloud.talent.v4beta1.Company" do
    optional :name, :string, 1
    optional :display_name, :string, 2
    optional :external_id, :string, 3
    optional :size, :enum, 4, "google.cloud.talent.v4beta1.CompanySize"
    optional :headquarters_address, :string, 5
    optional :hiring_agency, :bool, 6
    optional :eeo_text, :string, 7
    optional :website_uri, :string, 8
    optional :career_site_uri, :string, 9
    optional :image_uri, :string, 10
    repeated :keyword_searchable_job_custom_attributes, :string, 11
    optional :derived_info, :message, 12, "google.cloud.talent.v4beta1.Company.DerivedInfo"
    optional :suspended, :bool, 13
  end
  add_message "google.cloud.talent.v4beta1.Company.DerivedInfo" do
    optional :headquarters_location, :message, 1, "google.cloud.talent.v4beta1.Location"
  end
end

module Google
  module Cloud
    module Talent
      module V4beta1
        Company = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.talent.v4beta1.Company").msgclass
        Company::DerivedInfo = Google::Protobuf::DescriptorPool.generated_pool.lookup("google.cloud.talent.v4beta1.Company.DerivedInfo").msgclass
      end
    end
  end
end
