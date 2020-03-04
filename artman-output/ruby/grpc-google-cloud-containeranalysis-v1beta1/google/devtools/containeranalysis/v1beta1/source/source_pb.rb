# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1beta1/source/source.proto

require 'google/protobuf'

Google::Protobuf::DescriptorPool.generated_pool.build do
  add_message "grafeas.v1beta1.source.SourceContext" do
    map :labels, :string, :string, 4
    oneof :context do
      optional :cloud_repo, :message, 1, "grafeas.v1beta1.source.CloudRepoSourceContext"
      optional :gerrit, :message, 2, "grafeas.v1beta1.source.GerritSourceContext"
      optional :git, :message, 3, "grafeas.v1beta1.source.GitSourceContext"
    end
  end
  add_message "grafeas.v1beta1.source.AliasContext" do
    optional :kind, :enum, 1, "grafeas.v1beta1.source.AliasContext.Kind"
    optional :name, :string, 2
  end
  add_enum "grafeas.v1beta1.source.AliasContext.Kind" do
    value :KIND_UNSPECIFIED, 0
    value :FIXED, 1
    value :MOVABLE, 2
    value :OTHER, 4
  end
  add_message "grafeas.v1beta1.source.CloudRepoSourceContext" do
    optional :repo_id, :message, 1, "grafeas.v1beta1.source.RepoId"
    oneof :revision do
      optional :revision_id, :string, 2
      optional :alias_context, :message, 3, "grafeas.v1beta1.source.AliasContext"
    end
  end
  add_message "grafeas.v1beta1.source.GerritSourceContext" do
    optional :host_uri, :string, 1
    optional :gerrit_project, :string, 2
    oneof :revision do
      optional :revision_id, :string, 3
      optional :alias_context, :message, 4, "grafeas.v1beta1.source.AliasContext"
    end
  end
  add_message "grafeas.v1beta1.source.GitSourceContext" do
    optional :url, :string, 1
    optional :revision_id, :string, 2
  end
  add_message "grafeas.v1beta1.source.RepoId" do
    oneof :id do
      optional :project_repo_id, :message, 1, "grafeas.v1beta1.source.ProjectRepoId"
      optional :uid, :string, 2
    end
  end
  add_message "grafeas.v1beta1.source.ProjectRepoId" do
    optional :project_id, :string, 1
    optional :repo_name, :string, 2
  end
end

module Grafeas
  module V1beta1
    module Source
      SourceContext = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.source.SourceContext").msgclass
      AliasContext = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.source.AliasContext").msgclass
      AliasContext::Kind = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.source.AliasContext.Kind").enummodule
      CloudRepoSourceContext = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.source.CloudRepoSourceContext").msgclass
      GerritSourceContext = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.source.GerritSourceContext").msgclass
      GitSourceContext = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.source.GitSourceContext").msgclass
      RepoId = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.source.RepoId").msgclass
      ProjectRepoId = Google::Protobuf::DescriptorPool.generated_pool.lookup("grafeas.v1beta1.source.ProjectRepoId").msgclass
    end
  end
end