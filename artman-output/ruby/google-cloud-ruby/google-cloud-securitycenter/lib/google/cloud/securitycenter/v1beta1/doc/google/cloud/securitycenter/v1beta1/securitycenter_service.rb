# Copyright 2019 Google LLC
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     https://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

module Google
  module Cloud
    module Securitycenter
      module V1beta1
        # Request message for creating a finding.
        # @!attribute [rw] parent
        #   @return [String]
        #     Resource name of the new finding's parent. Its format should be
        #     "organizations/[organization_id]/sources/[source_id]".
        # @!attribute [rw] finding_id
        #   @return [String]
        #     Unique identifier provided by the client within the parent scope.
        #     It must be alphanumeric and less than or equal to 32 characters and
        #     greater than 0 characters in length.
        # @!attribute [rw] finding
        #   @return [Google::Cloud::Securitycenter::V1beta1::Finding]
        #     The Finding being created. The name and security_marks will be ignored as
        #     they are both output only fields on this resource.
        class CreateFindingRequest; end

        # Request message for creating a source.
        # @!attribute [rw] parent
        #   @return [String]
        #     Resource name of the new source's parent. Its format should be
        #     "organizations/[organization_id]".
        # @!attribute [rw] source
        #   @return [Google::Cloud::Securitycenter::V1beta1::Source]
        #     The Source being created, only the display_name and description will be
        #     used. All other fields will be ignored.
        class CreateSourceRequest; end

        # Request message for getting organization settings.
        # @!attribute [rw] name
        #   @return [String]
        #     Name of the organization to get organization settings for. Its format is
        #     "organizations/[organization_id]/organizationSettings".
        class GetOrganizationSettingsRequest; end

        # Request message for getting a source.
        # @!attribute [rw] name
        #   @return [String]
        #     Relative resource name of the source. Its format is
        #     "organizations/[organization_id]/source/[source_id]".
        class GetSourceRequest; end

        # Request message for grouping by assets.
        # @!attribute [rw] parent
        #   @return [String]
        #     Name of the organization to groupBy. Its format is
        #     "organizations/[organization_id]".
        # @!attribute [rw] filter
        #   @return [String]
        #     Expression that defines the filter to apply across assets.
        #     The expression is a list of zero or more restrictions combined via logical
        #     operators `AND` and `OR`.
        #     Parentheses are not supported, and `OR` has higher precedence than `AND`.
        #
        #     Restrictions have the form `<field> <operator> <value>` and may have a `-`
        #     character in front of them to indicate negation. The fields map to those
        #     defined in the Asset resource. Examples include:
        #
        #     * name
        #     * security_center_properties.resource_name
        #     * resource_properties.a_property
        #     * security_marks.marks.marka
        #
        #     The supported operators are:
        #
        #     * `=` for all value types.
        #     * `>`, `<`, `>=`, `<=` for integer values.
        #     * `:`, meaning substring matching, for strings.
        #
        #     The supported value types are:
        #
        #     * string literals in quotes.
        #     * integer literals without quotes.
        #     * boolean literals `true` and `false` without quotes.
        #
        #     For example, `resource_properties.size = 100` is a valid filter string.
        # @!attribute [rw] group_by
        #   @return [String]
        #     Expression that defines what assets fields to use for grouping. The string
        #     value should follow SQL syntax: comma separated list of fields. For
        #     example:
        #     "security_center_properties.resource_project,security_center_properties.project".
        #
        #     The following fields are supported when compare_duration is not set:
        #
        #     * security_center_properties.resource_project
        #     * security_center_properties.resource_type
        #     * security_center_properties.resource_parent
        #
        #     The following fields are supported when compare_duration is set:
        #
        #     * security_center_properties.resource_type
        # @!attribute [rw] compare_duration
        #   @return [Google::Protobuf::Duration]
        #     When compare_duration is set, the Asset's "state" property is updated to
        #     indicate whether the asset was added, removed, or remained present during
        #     the compare_duration period of time that precedes the read_time. This is
        #     the time between (read_time - compare_duration) and read_time.
        #
        #     The state value is derived based on the presence of the asset at the two
        #     points in time. Intermediate state changes between the two times don't
        #     affect the result. For example, the results aren't affected if the asset is
        #     removed and re-created again.
        #
        #     Possible "state" values when compare_duration is specified:
        #
        #     * "ADDED": indicates that the asset was not present before
        #       compare_duration, but present at reference_time.
        #     * "REMOVED": indicates that the asset was present at the start of
        #       compare_duration, but not present at reference_time.
        #     * "ACTIVE": indicates that the asset was present at both the
        #       start and the end of the time period defined by
        #       compare_duration and reference_time.
        #
        #     This field is ignored if `state` is not a field in `group_by`.
        # @!attribute [rw] read_time
        #   @return [Google::Protobuf::Timestamp]
        #     Time used as a reference point when filtering assets. The filter is limited
        #     to assets existing at the supplied time and their values are those at that
        #     specific time. Absence of this field will default to the API's version of
        #     NOW.
        # @!attribute [rw] page_token
        #   @return [String]
        #     The value returned by the last `GroupAssetsResponse`; indicates
        #     that this is a continuation of a prior `GroupAssets` call, and that the
        #     system should return the next page of data.
        # @!attribute [rw] page_size
        #   @return [Integer]
        #     The maximum number of results to return in a single response. Default is
        #     10, minimum is 1, maximum is 1000.
        class GroupAssetsRequest; end

        # Response message for grouping by assets.
        # @!attribute [rw] group_by_results
        #   @return [Array<Google::Cloud::Securitycenter::V1beta1::GroupResult>]
        #     Group results. There exists an element for each existing unique
        #     combination of property/values. The element contains a count for the number
        #     of times those specific property/values appear.
        # @!attribute [rw] read_time
        #   @return [Google::Protobuf::Timestamp]
        #     Time used for executing the groupBy request.
        # @!attribute [rw] next_page_token
        #   @return [String]
        #     Token to retrieve the next page of results, or empty if there are no more
        #     results.
        class GroupAssetsResponse; end

        # Request message for grouping by findings.
        # @!attribute [rw] parent
        #   @return [String]
        #     Name of the source to groupBy. Its format is
        #     "organizations/[organization_id]/sources/[source_id]". To groupBy across
        #     all sources provide a source_id of `-`. For example:
        #     organizations/123/sources/-
        # @!attribute [rw] filter
        #   @return [String]
        #     Expression that defines the filter to apply across findings.
        #     The expression is a list of one or more restrictions combined via logical
        #     operators `AND` and `OR`.
        #     Parentheses are not supported, and `OR` has higher precedence than `AND`.
        #
        #     Restrictions have the form `<field> <operator> <value>` and may have a `-`
        #     character in front of them to indicate negation. Examples include:
        #
        #     * name
        #       * source_properties.a_property
        #     * security_marks.marks.marka
        #
        #     The supported operators are:
        #
        #     * `=` for all value types.
        #     * `>`, `<`, `>=`, `<=` for integer values.
        #     * `:`, meaning substring matching, for strings.
        #
        #     The supported value types are:
        #
        #     * string literals in quotes.
        #     * integer literals without quotes.
        #     * boolean literals `true` and `false` without quotes.
        #
        #     For example, `source_properties.size = 100` is a valid filter string.
        # @!attribute [rw] group_by
        #   @return [String]
        #     Expression that defines what assets fields to use for grouping (including
        #     `state`). The string value should follow SQL syntax: comma separated list
        #     of fields. For example:
        #     "parent,resource_name".
        #
        #     The following fields are supported:
        #
        #     * resource_name
        #     * category
        #     * state
        #     * parent
        # @!attribute [rw] read_time
        #   @return [Google::Protobuf::Timestamp]
        #     Time used as a reference point when filtering findings. The filter is
        #     limited to findings existing at the supplied time and their values are
        #     those at that specific time. Absence of this field will default to the
        #     API's version of NOW.
        # @!attribute [rw] page_token
        #   @return [String]
        #     The value returned by the last `GroupFindingsResponse`; indicates
        #     that this is a continuation of a prior `GroupFindings` call, and
        #     that the system should return the next page of data.
        # @!attribute [rw] page_size
        #   @return [Integer]
        #     The maximum number of results to return in a single response. Default is
        #     10, minimum is 1, maximum is 1000.
        class GroupFindingsRequest; end

        # Response message for group by findings.
        # @!attribute [rw] group_by_results
        #   @return [Array<Google::Cloud::Securitycenter::V1beta1::GroupResult>]
        #     Group results. There exists an element for each existing unique
        #     combination of property/values. The element contains a count for the number
        #     of times those specific property/values appear.
        # @!attribute [rw] read_time
        #   @return [Google::Protobuf::Timestamp]
        #     Time used for executing the groupBy request.
        # @!attribute [rw] next_page_token
        #   @return [String]
        #     Token to retrieve the next page of results, or empty if there are no more
        #     results.
        class GroupFindingsResponse; end

        # Result containing the properties and count of a groupBy request.
        # @!attribute [rw] properties
        #   @return [Hash{String => Google::Protobuf::Value}]
        #     Properties matching the groupBy fields in the request.
        # @!attribute [rw] count
        #   @return [Integer]
        #     Total count of resources for the given properties.
        class GroupResult; end

        # Request message for listing sources.
        # @!attribute [rw] parent
        #   @return [String]
        #     Resource name of the parent of sources to list. Its format should be
        #     "organizations/[organization_id]".
        # @!attribute [rw] page_token
        #   @return [String]
        #     The value returned by the last `ListSourcesResponse`; indicates
        #     that this is a continuation of a prior `ListSources` call, and
        #     that the system should return the next page of data.
        # @!attribute [rw] page_size
        #   @return [Integer]
        #     The maximum number of results to return in a single response. Default is
        #     10, minimum is 1, maximum is 1000.
        class ListSourcesRequest; end

        # Response message for listing sources.
        # @!attribute [rw] sources
        #   @return [Array<Google::Cloud::Securitycenter::V1beta1::Source>]
        #     Sources belonging to the requested parent.
        # @!attribute [rw] next_page_token
        #   @return [String]
        #     Token to retrieve the next page of results, or empty if there are no more
        #     results.
        class ListSourcesResponse; end

        # Request message for listing assets.
        # @!attribute [rw] parent
        #   @return [String]
        #     Name of the organization assets should belong to. Its format is
        #     "organizations/[organization_id]".
        # @!attribute [rw] filter
        #   @return [String]
        #     Expression that defines the filter to apply across assets.
        #     The expression is a list of zero or more restrictions combined via logical
        #     operators `AND` and `OR`.
        #     Parentheses are not supported, and `OR` has higher precedence than `AND`.
        #
        #     Restrictions have the form `<field> <operator> <value>` and may have a `-`
        #     character in front of them to indicate negation. The fields map to those
        #     defined in the Asset resource. Examples include:
        #
        #     * name
        #     * security_center_properties.resource_name
        #     * resource_properties.a_property
        #     * security_marks.marks.marka
        #
        #     The supported operators are:
        #
        #     * `=` for all value types.
        #     * `>`, `<`, `>=`, `<=` for integer values.
        #     * `:`, meaning substring matching, for strings.
        #
        #     The supported value types are:
        #
        #     * string literals in quotes.
        #     * integer literals without quotes.
        #     * boolean literals `true` and `false` without quotes.
        #
        #     For example, `resource_properties.size = 100` is a valid filter string.
        # @!attribute [rw] order_by
        #   @return [String]
        #     Expression that defines what fields and order to use for sorting. The
        #     string value should follow SQL syntax: comma separated list of fields. For
        #     example: "name,resource_properties.a_property". The default sorting order
        #     is ascending. To specify descending order for a field, a suffix " desc"
        #     should be appended to the field name. For example: "name
        #     desc,resource_properties.a_property". Redundant space characters in the
        #     syntax are insignificant. "name desc,resource_properties.a_property" and "
        #     name     desc  ,   resource_properties.a_property  " are equivalent.
        # @!attribute [rw] read_time
        #   @return [Google::Protobuf::Timestamp]
        #     Time used as a reference point when filtering assets. The filter is limited
        #     to assets existing at the supplied time and their values are those at that
        #     specific time. Absence of this field will default to the API's version of
        #     NOW.
        # @!attribute [rw] compare_duration
        #   @return [Google::Protobuf::Duration]
        #     When compare_duration is set, the ListAssetResult's "state" attribute is
        #     updated to indicate whether the asset was added, removed, or remained
        #     present during the compare_duration period of time that precedes the
        #     read_time. This is the time between (read_time -
        #     compare_duration) and read_time.
        #
        #     The state value is derived based on the presence of the asset at the two
        #     points in time. Intermediate state changes between the two times don't
        #     affect the result. For example, the results aren't affected if the asset is
        #     removed and re-created again.
        #
        #     Possible "state" values when compare_duration is specified:
        #
        #     * "ADDED": indicates that the asset was not present before
        #       compare_duration, but present at read_time.
        #     * "REMOVED": indicates that the asset was present at the start of
        #       compare_duration, but not present at read_time.
        #     * "ACTIVE": indicates that the asset was present at both the
        #       start and the end of the time period defined by
        #       compare_duration and read_time.
        #
        #     If compare_duration is not specified, then the only possible state is
        #     "UNUSED", which indicates that the asset is present at read_time.
        # @!attribute [rw] field_mask
        #   @return [Google::Protobuf::FieldMask]
        #     Optional.
        #
        #     A field mask to specify the ListAssetsResult fields to be listed in the
        #     response.
        #     An empty field mask will list all fields.
        # @!attribute [rw] page_token
        #   @return [String]
        #     The value returned by the last `ListAssetsResponse`; indicates
        #     that this is a continuation of a prior `ListAssets` call, and
        #     that the system should return the next page of data.
        # @!attribute [rw] page_size
        #   @return [Integer]
        #     The maximum number of results to return in a single response. Default is
        #     10, minimum is 1, maximum is 1000.
        class ListAssetsRequest; end

        # Response message for listing assets.
        # @!attribute [rw] list_assets_results
        #   @return [Array<Google::Cloud::Securitycenter::V1beta1::ListAssetsResponse::ListAssetsResult>]
        #     Assets matching the list request.
        # @!attribute [rw] read_time
        #   @return [Google::Protobuf::Timestamp]
        #     Time used for executing the list request.
        # @!attribute [rw] next_page_token
        #   @return [String]
        #     Token to retrieve the next page of results, or empty if there are no more
        #     results.
        # @!attribute [rw] total_size
        #   @return [Integer]
        #     The total number of assets matching the query.
        class ListAssetsResponse
          # Result containing the Asset and its State.
          # @!attribute [rw] asset
          #   @return [Google::Cloud::Securitycenter::V1beta1::Asset]
          #     Asset matching the search request.
          # @!attribute [rw] state
          #   @return [Google::Cloud::Securitycenter::V1beta1::ListAssetsResponse::ListAssetsResult::State]
          #     State of the asset.
          class ListAssetsResult
            # State of the asset.
            #
            # When querying across two points in time this describes
            # the change between the two points: ADDED, REMOVED, or ACTIVE.
            # If there was no compare_duration supplied in the request the state should
            # be: UNUSED
            module State
              # Unspecified state.
              STATE_UNSPECIFIED = 0

              # Request did not specify use of this field in the result.
              UNUSED = 1

              # Asset was added between the points in time.
              ADDED = 2

              # Asset was removed between the points in time.
              REMOVED = 3

              # Asset was active at both point(s) in time.
              ACTIVE = 4
            end
          end
        end

        # Request message for listing findings.
        # @!attribute [rw] parent
        #   @return [String]
        #     Name of the source the findings belong to. Its format is
        #     "organizations/[organization_id]/sources/[source_id]". To list across all
        #     sources provide a source_id of `-`. For example:
        #     organizations/123/sources/-
        # @!attribute [rw] filter
        #   @return [String]
        #     Expression that defines the filter to apply across findings.
        #     The expression is a list of one or more restrictions combined via logical
        #     operators `AND` and `OR`.
        #     Parentheses are not supported, and `OR` has higher precedence than `AND`.
        #
        #     Restrictions have the form `<field> <operator> <value>` and may have a `-`
        #     character in front of them to indicate negation. Examples include:
        #
        #     * name
        #       * source_properties.a_property
        #     * security_marks.marks.marka
        #
        #     The supported operators are:
        #
        #     * `=` for all value types.
        #     * `>`, `<`, `>=`, `<=` for integer values.
        #     * `:`, meaning substring matching, for strings.
        #
        #     The supported value types are:
        #
        #     * string literals in quotes.
        #     * integer literals without quotes.
        #     * boolean literals `true` and `false` without quotes.
        #
        #     For example, `source_properties.size = 100` is a valid filter string.
        # @!attribute [rw] order_by
        #   @return [String]
        #     Expression that defines what fields and order to use for sorting. The
        #     string value should follow SQL syntax: comma separated list of fields. For
        #     example: "name,resource_properties.a_property". The default sorting order
        #     is ascending. To specify descending order for a field, a suffix " desc"
        #     should be appended to the field name. For example: "name
        #     desc,source_properties.a_property". Redundant space characters in the
        #     syntax are insignificant. "name desc,source_properties.a_property" and "
        #     name     desc  ,   source_properties.a_property  " are equivalent.
        # @!attribute [rw] read_time
        #   @return [Google::Protobuf::Timestamp]
        #     Time used as a reference point when filtering findings. The filter is
        #     limited to findings existing at the supplied time and their values are
        #     those at that specific time. Absence of this field will default to the
        #     API's version of NOW.
        # @!attribute [rw] field_mask
        #   @return [Google::Protobuf::FieldMask]
        #     Optional.
        #
        #     A field mask to specify the Finding fields to be listed in the response.
        #     An empty field mask will list all fields.
        # @!attribute [rw] page_token
        #   @return [String]
        #     The value returned by the last `ListFindingsResponse`; indicates
        #     that this is a continuation of a prior `ListFindings` call, and
        #     that the system should return the next page of data.
        # @!attribute [rw] page_size
        #   @return [Integer]
        #     The maximum number of results to return in a single response. Default is
        #     10, minimum is 1, maximum is 1000.
        class ListFindingsRequest; end

        # Response message for listing findings.
        # @!attribute [rw] findings
        #   @return [Array<Google::Cloud::Securitycenter::V1beta1::Finding>]
        #     Findings matching the list request.
        # @!attribute [rw] read_time
        #   @return [Google::Protobuf::Timestamp]
        #     Time used for executing the list request.
        # @!attribute [rw] next_page_token
        #   @return [String]
        #     Token to retrieve the next page of results, or empty if there are no more
        #     results.
        # @!attribute [rw] total_size
        #   @return [Integer]
        #     The total number of findings matching the query.
        class ListFindingsResponse; end

        # Request message for updating a finding's state.
        # @!attribute [rw] name
        #   @return [String]
        #     The relative resource name of the finding. See:
        #     https://cloud.google.com/apis/design/resource_names#relative_resource_name
        #     Example:
        #     "organizations/123/sources/456/finding/789".
        # @!attribute [rw] state
        #   @return [Google::Cloud::Securitycenter::V1beta1::Finding::State]
        #     The desired State of the finding.
        # @!attribute [rw] start_time
        #   @return [Google::Protobuf::Timestamp]
        #     The time at which the updated state takes effect.
        class SetFindingStateRequest; end

        # Request message for running asset discovery for an organization.
        # @!attribute [rw] parent
        #   @return [String]
        #     Name of the organization to run asset discovery for. Its format is
        #     "organizations/[organization_id]".
        class RunAssetDiscoveryRequest; end

        # Request message for updating or creating a finding.
        # @!attribute [rw] finding
        #   @return [Google::Cloud::Securitycenter::V1beta1::Finding]
        #     The finding resource to update or create if it does not already exist.
        #     parent, security_marks, and update_time will be ignored.
        #
        #     In the case of creation, the finding id portion of the name must
        #     alphanumeric and less than or equal to 32 characters and greater than 0
        #     characters in length.
        # @!attribute [rw] update_mask
        #   @return [Google::Protobuf::FieldMask]
        #     The FieldMask to use when updating the finding resource. This field should
        #     not be specified when creating a finding.
        class UpdateFindingRequest; end

        # Request message for updating an organization's settings.
        # @!attribute [rw] organization_settings
        #   @return [Google::Cloud::Securitycenter::V1beta1::OrganizationSettings]
        #     The organization settings resource to update.
        # @!attribute [rw] update_mask
        #   @return [Google::Protobuf::FieldMask]
        #     The FieldMask to use when updating the settings resource.
        class UpdateOrganizationSettingsRequest; end

        # Request message for updating a source.
        # @!attribute [rw] source
        #   @return [Google::Cloud::Securitycenter::V1beta1::Source]
        #     The source resource to update.
        # @!attribute [rw] update_mask
        #   @return [Google::Protobuf::FieldMask]
        #     The FieldMask to use when updating the source resource.
        class UpdateSourceRequest; end

        # Request message for updating a SecurityMarks resource.
        # @!attribute [rw] security_marks
        #   @return [Google::Cloud::Securitycenter::V1beta1::SecurityMarks]
        #     The security marks resource to update.
        # @!attribute [rw] update_mask
        #   @return [Google::Protobuf::FieldMask]
        #     The FieldMask to use when updating the security marks resource.
        # @!attribute [rw] start_time
        #   @return [Google::Protobuf::Timestamp]
        #     The time at which the updated SecurityMarks take effect.
        class UpdateSecurityMarksRequest; end
      end
    end
  end
end