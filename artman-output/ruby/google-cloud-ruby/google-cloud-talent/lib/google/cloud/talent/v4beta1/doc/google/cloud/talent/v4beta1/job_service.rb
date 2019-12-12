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
    module Talent
      module V4beta1
        # Create job request.
        # @!attribute [rw] parent
        #   @return [String]
        #     Required. The resource name of the tenant under which the job is created.
        #
        #     The format is "projects/{project_id}/tenants/{tenant_id}". For example,
        #     "projects/foo/tenant/bar". If tenant id is unspecified a default tenant
        #     is created. For example, "projects/foo".
        # @!attribute [rw] job
        #   @return [Google::Cloud::Talent::V4beta1::Job]
        #     Required. The Job to be created.
        class CreateJobRequest; end

        # Get job request.
        # @!attribute [rw] name
        #   @return [String]
        #     Required. The resource name of the job to retrieve.
        #
        #     The format is
        #     "projects/{project_id}/tenants/{tenant_id}/jobs/{job_id}". For
        #     example, "projects/foo/tenants/bar/jobs/baz".
        #
        #     If tenant id is unspecified, the default tenant is used. For
        #     example, "projects/foo/jobs/bar".
        class GetJobRequest; end

        # Update job request.
        # @!attribute [rw] job
        #   @return [Google::Cloud::Talent::V4beta1::Job]
        #     Required. The Job to be updated.
        # @!attribute [rw] update_mask
        #   @return [Google::Protobuf::FieldMask]
        #     Strongly recommended for the best service experience.
        #
        #     If {Google::Cloud::Talent::V4beta1::UpdateJobRequest#update_mask update_mask}
        #     is provided, only the specified fields in
        #     {Google::Cloud::Talent::V4beta1::UpdateJobRequest#job job} are updated.
        #     Otherwise all the fields are updated.
        #
        #     A field mask to restrict the fields that are updated. Only
        #     top level fields of {Google::Cloud::Talent::V4beta1::Job Job} are supported.
        class UpdateJobRequest; end

        # Delete job request.
        # @!attribute [rw] name
        #   @return [String]
        #     Required. The resource name of the job to be deleted.
        #
        #     The format is
        #     "projects/{project_id}/tenants/{tenant_id}/jobs/{job_id}". For
        #     example, "projects/foo/tenants/bar/jobs/baz".
        #
        #     If tenant id is unspecified, the default tenant is used. For
        #     example, "projects/foo/jobs/bar".
        class DeleteJobRequest; end

        # Batch delete jobs request.
        # @!attribute [rw] parent
        #   @return [String]
        #     Required. The resource name of the tenant under which the job is created.
        #
        #     The format is "projects/{project_id}/tenants/{tenant_id}". For example,
        #     "projects/foo/tenant/bar". If tenant id is unspecified, a default tenant
        #     is created. For example, "projects/foo".
        # @!attribute [rw] filter
        #   @return [String]
        #     Required. The filter string specifies the jobs to be deleted.
        #
        #     Supported operator: =, AND
        #
        #     The fields eligible for filtering are:
        #
        #     * `companyName` (Required)
        #     * `requisitionId` (Required)
        #
        #     Sample Query: companyName = "projects/foo/companies/bar" AND
        #     requisitionId = "req-1"
        class BatchDeleteJobsRequest; end

        # List jobs request.
        # @!attribute [rw] parent
        #   @return [String]
        #     Required. The resource name of the tenant under which the job is created.
        #
        #     The format is "projects/{project_id}/tenants/{tenant_id}". For example,
        #     "projects/foo/tenant/bar". If tenant id is unspecified, a default tenant
        #     is created. For example, "projects/foo".
        # @!attribute [rw] filter
        #   @return [String]
        #     Required. The filter string specifies the jobs to be enumerated.
        #
        #     Supported operator: =, AND
        #
        #     The fields eligible for filtering are:
        #
        #     * `companyName` (Required)
        #     * `requisitionId`
        #     * `status` Available values: OPEN, EXPIRED, ALL. Defaults to
        #       OPEN if no value is specified.
        #
        #     Sample Query:
        #
        #     * companyName = "projects/foo/tenants/bar/companies/baz"
        #     * companyName = "projects/foo/tenants/bar/companies/baz" AND
        #       requisitionId = "req-1"
        #     * companyName = "projects/foo/tenants/bar/companies/baz" AND
        #       status = "EXPIRED"
        # @!attribute [rw] page_token
        #   @return [String]
        #     The starting point of a query result.
        # @!attribute [rw] page_size
        #   @return [Integer]
        #     The maximum number of jobs to be returned per page of results.
        #
        #     If {Google::Cloud::Talent::V4beta1::ListJobsRequest#job_view job_view} is set
        #     to
        #     {Google::Cloud::Talent::V4beta1::JobView::JOB_VIEW_ID_ONLY JobView::JOB_VIEW_ID_ONLY},
        #     the maximum allowed page size is 1000. Otherwise, the maximum allowed page
        #     size is 100.
        #
        #     Default is 100 if empty or a number < 1 is specified.
        # @!attribute [rw] job_view
        #   @return [Google::Cloud::Talent::V4beta1::JobView]
        #     The desired job attributes returned for jobs in the
        #     search response. Defaults to
        #     {Google::Cloud::Talent::V4beta1::JobView::JOB_VIEW_FULL JobView::JOB_VIEW_FULL}
        #     if no value is specified.
        class ListJobsRequest; end

        # List jobs response.
        # @!attribute [rw] jobs
        #   @return [Array<Google::Cloud::Talent::V4beta1::Job>]
        #     The Jobs for a given company.
        #
        #     The maximum number of items returned is based on the limit field
        #     provided in the request.
        # @!attribute [rw] next_page_token
        #   @return [String]
        #     A token to retrieve the next page of results.
        # @!attribute [rw] metadata
        #   @return [Google::Cloud::Talent::V4beta1::ResponseMetadata]
        #     Additional information for the API invocation, such as the request
        #     tracking id.
        class ListJobsResponse; end

        # The Request body of the `SearchJobs` call.
        # @!attribute [rw] parent
        #   @return [String]
        #     Required. The resource name of the tenant to search within.
        #
        #     The format is "projects/{project_id}/tenants/{tenant_id}". For example,
        #     "projects/foo/tenant/bar". If tenant id is unspecified, a default tenant
        #     is created. For example, "projects/foo".
        # @!attribute [rw] search_mode
        #   @return [Google::Cloud::Talent::V4beta1::SearchJobsRequest::SearchMode]
        #     Mode of a search.
        #
        #     Defaults to
        #     {Google::Cloud::Talent::V4beta1::SearchJobsRequest::SearchMode::JOB_SEARCH SearchMode::JOB_SEARCH}.
        # @!attribute [rw] request_metadata
        #   @return [Google::Cloud::Talent::V4beta1::RequestMetadata]
        #     Required. The meta information collected about the job searcher, used to
        #     improve the search quality of the service. The identifiers (such as
        #     `user_id`) are provided by users, and must be unique and consistent.
        # @!attribute [rw] job_query
        #   @return [Google::Cloud::Talent::V4beta1::JobQuery]
        #     Query used to search against jobs, such as keyword, location filters, etc.
        # @!attribute [rw] enable_broadening
        #   @return [true, false]
        #     Controls whether to broaden the search when it produces sparse results.
        #     Broadened queries append results to the end of the matching results
        #     list.
        #
        #     Defaults to false.
        # @!attribute [rw] require_precise_result_size
        #   @return [true, false]
        #     Controls if the search job request requires the return of a precise
        #     count of the first 300 results. Setting this to `true` ensures
        #     consistency in the number of results per page. Best practice is to set this
        #     value to true if a client allows users to jump directly to a
        #     non-sequential search results page.
        #
        #     Enabling this flag may adversely impact performance.
        #
        #     Defaults to false.
        # @!attribute [rw] histogram_queries
        #   @return [Array<Google::Cloud::Talent::V4beta1::HistogramQuery>]
        #     An expression specifies a histogram request against matching jobs.
        #
        #     Expression syntax is an aggregation function call with histogram facets and
        #     other options.
        #
        #     Available aggregation function calls are:
        #     * `count(string_histogram_facet)`: Count the number of matching entities,
        #       for each distinct attribute value.
        #     * `count(numeric_histogram_facet, list of buckets)`: Count the number of
        #       matching entities within each bucket.
        #
        #     Data types:
        #
        #     * Histogram facet: facet names with format [a-zA-Z][a-zA-Z0-9_]+.
        #     * String: string like "any string with backslash escape for quote(\")."
        #     * Number: whole number and floating point number like 10, -1 and -0.01.
        #     * List: list of elements with comma(,) separator surrounded by square
        #       brackets, for example, [1, 2, 3] and ["one", "two", "three"].
        #
        #     Built-in constants:
        #
        #     * MIN (minimum number similar to java Double.MIN_VALUE)
        #     * MAX (maximum number similar to java Double.MAX_VALUE)
        #
        #     Built-in functions:
        #
        #     * bucket(start, end[, label]): bucket built-in function creates a bucket
        #       with range of [start, end). Note that the end is exclusive, for example,
        #       bucket(1, MAX, "positive number") or bucket(1, 10).
        #
        #     Job histogram facets:
        #
        #     * company_display_name: histogram by
        #       {Google::Cloud::Talent::V4beta1::Job#company_display_name Job#company_display_name}.
        #     * employment_type: histogram by
        #       {Google::Cloud::Talent::V4beta1::Job#employment_types Job#employment_types},
        #       for example,
        #       "FULL_TIME", "PART_TIME".
        #     * company_size: histogram by
        #       {Google::Cloud::Talent::V4beta1::CompanySize CompanySize}, for example,
        #       "SMALL", "MEDIUM", "BIG".
        #     * publish_time_in_month: histogram by the
        #       {Google::Cloud::Talent::V4beta1::Job#posting_publish_time Job#posting_publish_time}
        #       in months.
        #       Must specify list of numeric buckets in spec.
        #     * publish_time_in_year: histogram by the
        #       {Google::Cloud::Talent::V4beta1::Job#posting_publish_time Job#posting_publish_time}
        #       in years.
        #       Must specify list of numeric buckets in spec.
        #     * degree_types: histogram by the
        #       {Google::Cloud::Talent::V4beta1::Job#degree_types Job#degree_types}, for
        #       example,
        #       "Bachelors", "Masters".
        #     * job_level: histogram by the
        #       {Google::Cloud::Talent::V4beta1::Job#job_level Job#job_level}, for example,
        #       "Entry
        #       Level".
        #     * country: histogram by the country code of jobs, for example, "US", "FR".
        #     * admin1: histogram by the admin1 code of jobs, which is a global
        #       placeholder referring to the state, province, or the particular term a
        #       country uses to define the geographic structure below the country level,
        #       for example, "CA", "IL".
        #     * city: histogram by a combination of the "city name, admin1 code". For
        #       example,  "Mountain View, CA", "New York, NY".
        #     * admin1_country: histogram by a combination of the "admin1 code, country",
        #       for example, "CA, US", "IL, US".
        #     * city_coordinate: histogram by the city center's GPS coordinates (latitude
        #       and longitude), for example, 37.4038522,-122.0987765. Since the
        #       coordinates of a city center can change, customers may need to refresh
        #       them periodically.
        #     * locale: histogram by the
        #       {Google::Cloud::Talent::V4beta1::Job#language_code Job#language_code}, for
        #       example, "en-US",
        #       "fr-FR".
        #     * language: histogram by the language subtag of the
        #       {Google::Cloud::Talent::V4beta1::Job#language_code Job#language_code},
        #       for example, "en", "fr".
        #     * category: histogram by the
        #       {Google::Cloud::Talent::V4beta1::JobCategory JobCategory}, for example,
        #       "COMPUTER_AND_IT", "HEALTHCARE".
        #     * base_compensation_unit: histogram by the
        #       {Google::Cloud::Talent::V4beta1::CompensationInfo::CompensationUnit CompensationInfo::CompensationUnit}
        #       of base salary, for example, "WEEKLY", "MONTHLY".
        #     * base_compensation: histogram by the base salary. Must specify list of
        #       numeric buckets to group results by.
        #     * annualized_base_compensation: histogram by the base annualized salary.
        #       Must specify list of numeric buckets to group results by.
        #     * annualized_total_compensation: histogram by the total annualized salary.
        #       Must specify list of numeric buckets to group results by.
        #     * string_custom_attribute: histogram by string
        #       {Google::Cloud::Talent::V4beta1::Job#custom_attributes Job#custom_attributes}.
        #       Values can be accessed via square bracket notations like
        #       string_custom_attribute["key1"].
        #     * numeric_custom_attribute: histogram by numeric
        #       {Google::Cloud::Talent::V4beta1::Job#custom_attributes Job#custom_attributes}.
        #       Values can be accessed via square bracket notations like
        #       numeric_custom_attribute["key1"]. Must specify list of numeric buckets to
        #       group results by.
        #
        #     Example expressions:
        #
        #     * `count(admin1)`
        #     * `count(base_compensation, [bucket(1000, 10000), bucket(10000, 100000),
        #       bucket(100000, MAX)])`
        #     * `count(string_custom_attribute["some-string-custom-attribute"])`
        #     * `count(numeric_custom_attribute["some-numeric-custom-attribute"],
        #       [bucket(MIN, 0, "negative"), bucket(0, MAX, "non-negative"])`
        # @!attribute [rw] job_view
        #   @return [Google::Cloud::Talent::V4beta1::JobView]
        #     The desired job attributes returned for jobs in the search response.
        #     Defaults to
        #     {Google::Cloud::Talent::V4beta1::JobView::JOB_VIEW_SMALL JobView::JOB_VIEW_SMALL}
        #     if no value is specified.
        # @!attribute [rw] offset
        #   @return [Integer]
        #     An integer that specifies the current offset (that is, starting result
        #     location, amongst the jobs deemed by the API as relevant) in search
        #     results. This field is only considered if
        #     {Google::Cloud::Talent::V4beta1::SearchJobsRequest#page_token page_token} is
        #     unset.
        #
        #     For example, 0 means to  return results starting from the first matching
        #     job, and 10 means to return from the 11th job. This can be used for
        #     pagination, (for example, pageSize = 10 and offset = 10 means to return
        #     from the second page).
        # @!attribute [rw] page_size
        #   @return [Integer]
        #     A limit on the number of jobs returned in the search results.
        #     Increasing this value above the default value of 10 can increase search
        #     response time. The value can be between 1 and 100.
        # @!attribute [rw] page_token
        #   @return [String]
        #     The token specifying the current offset within
        #     search results. See
        #     {Google::Cloud::Talent::V4beta1::SearchJobsResponse#next_page_token SearchJobsResponse#next_page_token}
        #     for an explanation of how to obtain the next set of query results.
        # @!attribute [rw] order_by
        #   @return [String]
        #     The criteria determining how search results are sorted. Default is
        #     `"relevance desc"`.
        #
        #     Supported options are:
        #
        #     * `"relevance desc"`: By relevance descending, as determined by the API
        #       algorithms. Relevance thresholding of query results is only available
        #       with this ordering.
        #     * `"posting_publish_time desc"`: By
        #       {Google::Cloud::Talent::V4beta1::Job#posting_publish_time Job#posting_publish_time}
        #       descending.
        #     * `"posting_update_time desc"`: By
        #       {Google::Cloud::Talent::V4beta1::Job#posting_update_time Job#posting_update_time}
        #       descending.
        #     * `"title"`: By {Google::Cloud::Talent::V4beta1::Job#title Job#title}
        #       ascending.
        #     * `"title desc"`: By {Google::Cloud::Talent::V4beta1::Job#title Job#title}
        #       descending.
        #     * `"annualized_base_compensation"`: By job's
        #       {Google::Cloud::Talent::V4beta1::CompensationInfo#annualized_base_compensation_range CompensationInfo#annualized_base_compensation_range}
        #       ascending. Jobs whose annualized base compensation is unspecified are put
        #       at the end of search results.
        #     * `"annualized_base_compensation desc"`: By job's
        #       {Google::Cloud::Talent::V4beta1::CompensationInfo#annualized_base_compensation_range CompensationInfo#annualized_base_compensation_range}
        #       descending. Jobs whose annualized base compensation is unspecified are
        #       put at the end of search results.
        #     * `"annualized_total_compensation"`: By job's
        #       {Google::Cloud::Talent::V4beta1::CompensationInfo#annualized_total_compensation_range CompensationInfo#annualized_total_compensation_range}
        #       ascending. Jobs whose annualized base compensation is unspecified are put
        #       at the end of search results.
        #     * `"annualized_total_compensation desc"`: By job's
        #       {Google::Cloud::Talent::V4beta1::CompensationInfo#annualized_total_compensation_range CompensationInfo#annualized_total_compensation_range}
        #       descending. Jobs whose annualized base compensation is unspecified are
        #       put at the end of search results.
        #     * `"custom_ranking desc"`: By the relevance score adjusted to the
        #       {Google::Cloud::Talent::V4beta1::SearchJobsRequest::CustomRankingInfo#ranking_expression SearchJobsRequest::CustomRankingInfo#ranking_expression}
        #       with weight factor assigned by
        #       {Google::Cloud::Talent::V4beta1::SearchJobsRequest::CustomRankingInfo#importance_level SearchJobsRequest::CustomRankingInfo#importance_level}
        #       in descending order.
        #     * Location sorting: Use the special syntax to order jobs by distance:<br>
        #       `"distance_from('Hawaii')"`: Order by distance from Hawaii.<br>
        #       `"distance_from(19.89, 155.5)"`: Order by distance from a coordinate.<br>
        #       `"distance_from('Hawaii'), distance_from('Puerto Rico')"`: Order by
        #       multiple locations. See details below.<br>
        #       `"distance_from('Hawaii'), distance_from(19.89, 155.5)"`: Order by
        #       multiple locations. See details below.<br>
        #       The string can have a maximum of 256 characters. When multiple distance
        #       centers are provided, a job that is close to any of the distance centers
        #       would have a high rank. When a job has multiple locations, the job
        #       location closest to one of the distance centers will be used. Jobs that
        #       don't have locations will be ranked at the bottom. Distance is calculated
        #       with a precision of 11.3 meters (37.4 feet). Diversification strategy is
        #       still applied unless explicitly disabled in
        #       {Google::Cloud::Talent::V4beta1::SearchJobsRequest#diversification_level diversification_level}.
        # @!attribute [rw] diversification_level
        #   @return [Google::Cloud::Talent::V4beta1::SearchJobsRequest::DiversificationLevel]
        #     Controls whether highly similar jobs are returned next to each other in
        #     the search results. Jobs are identified as highly similar based on
        #     their titles, job categories, and locations. Highly similar results are
        #     clustered so that only one representative job of the cluster is
        #     displayed to the job seeker higher up in the results, with the other jobs
        #     being displayed lower down in the results.
        #
        #     Defaults to
        #     {Google::Cloud::Talent::V4beta1::SearchJobsRequest::DiversificationLevel::SIMPLE DiversificationLevel::SIMPLE}
        #     if no value is specified.
        # @!attribute [rw] custom_ranking_info
        #   @return [Google::Cloud::Talent::V4beta1::SearchJobsRequest::CustomRankingInfo]
        #     Controls over how job documents get ranked on top of existing relevance
        #     score (determined by API algorithm).
        # @!attribute [rw] disable_keyword_match
        #   @return [true, false]
        #     Controls whether to disable exact keyword match on
        #     {Google::Cloud::Talent::V4beta1::Job#title Job#title},
        #     {Google::Cloud::Talent::V4beta1::Job#description Job#description},
        #     {Google::Cloud::Talent::V4beta1::Job#company_display_name Job#company_display_name},
        #     {Google::Cloud::Talent::V4beta1::Job#addresses Job#addresses},
        #     {Google::Cloud::Talent::V4beta1::Job#qualifications Job#qualifications}. When
        #     disable keyword match is turned off, a keyword match returns jobs that do
        #     not match given category filters when there are matching keywords. For
        #     example, for the query "program manager," a result is returned even if the
        #     job posting has the title "software developer," which doesn't fall into
        #     "program manager" ontology, but does have "program manager" appearing in
        #     its description.
        #
        #     For queries like "cloud" that don't contain title or
        #     location specific ontology, jobs with "cloud" keyword matches are returned
        #     regardless of this flag's value.
        #
        #     Use
        #     {Google::Cloud::Talent::V4beta1::Company#keyword_searchable_job_custom_attributes Company#keyword_searchable_job_custom_attributes}
        #     if company-specific globally matched custom field/attribute string values
        #     are needed. Enabling keyword match improves recall of subsequent search
        #     requests.
        #
        #     Defaults to false.
        class SearchJobsRequest
          # Custom ranking information for
          # {Google::Cloud::Talent::V4beta1::SearchJobsRequest SearchJobsRequest}.
          # @!attribute [rw] importance_level
          #   @return [Google::Cloud::Talent::V4beta1::SearchJobsRequest::CustomRankingInfo::ImportanceLevel]
          #     Required. Controls over how important the score of
          #     {Google::Cloud::Talent::V4beta1::SearchJobsRequest::CustomRankingInfo#ranking_expression CustomRankingInfo#ranking_expression}
          #     gets applied to job's final ranking position.
          #
          #     An error is thrown if not specified.
          # @!attribute [rw] ranking_expression
          #   @return [String]
          #     Required. Controls over how job documents get ranked on top of existing
          #     relevance score (determined by API algorithm). The product of ranking
          #     expression and relevance score is used to determine job's final ranking
          #     position.
          #
          #     The syntax for this expression is a subset of Google SQL syntax.
          #
          #     Supported operators are: +, -, *, /, where the left and right side of
          #     the operator is either a numeric
          #     {Google::Cloud::Talent::V4beta1::Job#custom_attributes Job#custom_attributes}
          #     key, integer/double value or an expression that can be evaluated to a
          #     number.
          #
          #     Parenthesis are supported to adjust calculation precedence. The
          #     expression must be < 100 characters in length.
          #
          #     Sample ranking expression
          #     (year + 25) * 0.25 - (freshness / 0.5)
          class CustomRankingInfo
            # The importance level for
            # {Google::Cloud::Talent::V4beta1::SearchJobsRequest::CustomRankingInfo#ranking_expression CustomRankingInfo#ranking_expression}.
            module ImportanceLevel
              # Default value if the importance level isn't specified.
              IMPORTANCE_LEVEL_UNSPECIFIED = 0

              # The given ranking expression is of None importance, existing relevance
              # score (determined by API algorithm) dominates job's final ranking
              # position.
              NONE = 1

              # The given ranking expression is of Low importance in terms of job's
              # final ranking position compared to existing relevance
              # score (determined by API algorithm).
              LOW = 2

              # The given ranking expression is of Mild importance in terms of job's
              # final ranking position compared to existing relevance
              # score (determined by API algorithm).
              MILD = 3

              # The given ranking expression is of Medium importance in terms of job's
              # final ranking position compared to existing relevance
              # score (determined by API algorithm).
              MEDIUM = 4

              # The given ranking expression is of High importance in terms of job's
              # final ranking position compared to existing relevance
              # score (determined by API algorithm).
              HIGH = 5

              # The given ranking expression is of Extreme importance, and dominates
              # job's final ranking position with existing relevance
              # score (determined by API algorithm) ignored.
              EXTREME = 6
            end
          end

          # Controls whether highly similar jobs are returned next to each other in
          # the search results. Jobs are identified as highly similar based on
          # their titles, job categories, and locations. Highly similar results are
          # clustered so that only one representative job of the cluster is
          # displayed to the job seeker higher up in the results, with the other jobs
          # being displayed lower down in the results.
          module DiversificationLevel
            # The diversification level isn't specified.
            DIVERSIFICATION_LEVEL_UNSPECIFIED = 0

            # Disables diversification. Jobs that would normally be pushed to the last
            # page would not have their positions altered. This may result in highly
            # similar jobs appearing in sequence in the search results.
            DISABLED = 1

            # Default diversifying behavior. The result list is ordered so that
            # highly similar results are pushed to the end of the last page of search
            # results. If you are using pageToken to page through the result set,
            # latency might be lower but we can't guarantee that all results are
            # returned. If you are using page offset, latency might be higher but all
            # results are returned.
            SIMPLE = 2
          end

          # A string-represented enumeration of the job search mode. The service
          # operate differently for different modes of service.
          module SearchMode
            # The mode of the search method isn't specified. The default search
            # behavior is identical to JOB_SEARCH search behavior.
            SEARCH_MODE_UNSPECIFIED = 0

            # The job search matches against all jobs, and featured jobs
            # (jobs with promotionValue > 0) are not specially handled.
            JOB_SEARCH = 1

            # The job search matches only against featured jobs (jobs with a
            # promotionValue > 0). This method doesn't return any jobs having a
            # promotionValue <= 0. The search results order is determined by the
            # promotionValue (jobs with a higher promotionValue are returned higher up
            # in the search results), with relevance being used as a tiebreaker.
            FEATURED_JOB_SEARCH = 2
          end
        end

        # Response for SearchJob method.
        # @!attribute [rw] matching_jobs
        #   @return [Array<Google::Cloud::Talent::V4beta1::SearchJobsResponse::MatchingJob>]
        #     The Job entities that match the specified
        #     {Google::Cloud::Talent::V4beta1::SearchJobsRequest SearchJobsRequest}.
        # @!attribute [rw] histogram_query_results
        #   @return [Array<Google::Cloud::Talent::V4beta1::HistogramQueryResult>]
        #     The histogram results that match with specified
        #     {Google::Cloud::Talent::V4beta1::SearchJobsRequest#histogram_queries SearchJobsRequest#histogram_queries}.
        # @!attribute [rw] next_page_token
        #   @return [String]
        #     The token that specifies the starting position of the next page of results.
        #     This field is empty if there are no more results.
        # @!attribute [rw] location_filters
        #   @return [Array<Google::Cloud::Talent::V4beta1::Location>]
        #     The location filters that the service applied to the specified query. If
        #     any filters are lat-lng based, the
        #     {Google::Cloud::Talent::V4beta1::Location#location_type Location#location_type}
        #     is
        #     {Google::Cloud::Talent::V4beta1::Location::LocationType::LOCATION_TYPE_UNSPECIFIED Location::LocationType::LOCATION_TYPE_UNSPECIFIED}.
        # @!attribute [rw] estimated_total_size
        #   @return [Integer]
        #     An estimation of the number of jobs that match the specified query.
        #
        #     This number isn't guaranteed to be accurate. For accurate results,
        #     see
        #     {Google::Cloud::Talent::V4beta1::SearchJobsRequest#require_precise_result_size SearchJobsRequest#require_precise_result_size}.
        # @!attribute [rw] total_size
        #   @return [Integer]
        #     The precise result count, which is available only if the client set
        #     {Google::Cloud::Talent::V4beta1::SearchJobsRequest#require_precise_result_size SearchJobsRequest#require_precise_result_size}
        #     to `true`, or if the response is the last page of results. Otherwise, the
        #     value is `-1`.
        # @!attribute [rw] metadata
        #   @return [Google::Cloud::Talent::V4beta1::ResponseMetadata]
        #     Additional information for the API invocation, such as the request
        #     tracking id.
        # @!attribute [rw] broadened_query_jobs_count
        #   @return [Integer]
        #     If query broadening is enabled, we may append additional results from the
        #     broadened query. This number indicates how many of the jobs returned in the
        #     jobs field are from the broadened query. These results are always at the
        #     end of the jobs list. In particular, a value of 0, or if the field isn't
        #     set, all the jobs in the jobs list are from the original
        #     (without broadening) query. If this field is non-zero, subsequent requests
        #     with offset after this result set should contain all broadened results.
        # @!attribute [rw] spell_correction
        #   @return [Google::Cloud::Talent::V4beta1::SpellingCorrection]
        #     The spell checking result, and correction.
        class SearchJobsResponse
          # Job entry with metadata inside
          # {Google::Cloud::Talent::V4beta1::SearchJobsResponse SearchJobsResponse}.
          # @!attribute [rw] job
          #   @return [Google::Cloud::Talent::V4beta1::Job]
          #     Job resource that matches the specified
          #     {Google::Cloud::Talent::V4beta1::SearchJobsRequest SearchJobsRequest}.
          # @!attribute [rw] job_summary
          #   @return [String]
          #     A summary of the job with core information that's displayed on the search
          #     results listing page.
          # @!attribute [rw] job_title_snippet
          #   @return [String]
          #     Contains snippets of text from the
          #     {Google::Cloud::Talent::V4beta1::Job#title Job#title} field most closely
          #     matching a search query's keywords, if available. The matching query
          #     keywords are enclosed in HTML bold tags.
          # @!attribute [rw] search_text_snippet
          #   @return [String]
          #     Contains snippets of text from the
          #     {Google::Cloud::Talent::V4beta1::Job#description Job#description} and
          #     similar fields that most closely match a search query's keywords, if
          #     available. All HTML tags in the original fields are stripped when
          #     returned in this field, and matching query keywords are enclosed in HTML
          #     bold tags.
          # @!attribute [rw] commute_info
          #   @return [Google::Cloud::Talent::V4beta1::SearchJobsResponse::CommuteInfo]
          #     Commute information which is generated based on specified
          #      {Google::Cloud::Talent::V4beta1::CommuteFilter CommuteFilter}.
          class MatchingJob; end

          # Commute details related to this job.
          # @!attribute [rw] job_location
          #   @return [Google::Cloud::Talent::V4beta1::Location]
          #     Location used as the destination in the commute calculation.
          # @!attribute [rw] travel_duration
          #   @return [Google::Protobuf::Duration]
          #     The number of seconds required to travel to the job location from the
          #     query location. A duration of 0 seconds indicates that the job isn't
          #     reachable within the requested duration, but was returned as part of an
          #     expanded query.
          class CommuteInfo; end
        end

        # Request to create a batch of jobs.
        # @!attribute [rw] parent
        #   @return [String]
        #     Required. The resource name of the tenant under which the job is created.
        #
        #     The format is "projects/{project_id}/tenants/{tenant_id}". For example,
        #     "projects/foo/tenant/bar". If tenant id is unspecified, a default tenant
        #     is created. For example, "projects/foo".
        # @!attribute [rw] jobs
        #   @return [Array<Google::Cloud::Talent::V4beta1::Job>]
        #     Required. The jobs to be created.
        class BatchCreateJobsRequest; end

        # Request to update a batch of jobs.
        # @!attribute [rw] parent
        #   @return [String]
        #     Required. The resource name of the tenant under which the job is created.
        #
        #     The format is "projects/{project_id}/tenants/{tenant_id}". For example,
        #     "projects/foo/tenant/bar". If tenant id is unspecified, a default tenant
        #     is created. For example, "projects/foo".
        # @!attribute [rw] jobs
        #   @return [Array<Google::Cloud::Talent::V4beta1::Job>]
        #     Required. The jobs to be updated.
        # @!attribute [rw] update_mask
        #   @return [Google::Protobuf::FieldMask]
        #     Strongly recommended for the best service experience. Be aware that it will
        #     also increase latency when checking the status of a batch operation.
        #
        #     If
        #     {Google::Cloud::Talent::V4beta1::BatchUpdateJobsRequest#update_mask update_mask}
        #     is provided, only the specified fields in
        #     {Google::Cloud::Talent::V4beta1::Job Job} are updated. Otherwise all the
        #     fields are updated.
        #
        #     A field mask to restrict the fields that are updated. Only
        #     top level fields of {Google::Cloud::Talent::V4beta1::Job Job} are supported.
        #
        #     If
        #     {Google::Cloud::Talent::V4beta1::BatchUpdateJobsRequest#update_mask update_mask}
        #     is provided, The {Google::Cloud::Talent::V4beta1::Job Job} inside
        #     {Google::Cloud::Talent::V4beta1::JobOperationResult::JobResult JobResult}
        #     will only contains fields that is updated, plus the Id of the Job.
        #     Otherwise,  {Google::Cloud::Talent::V4beta1::Job Job} will include all fields,
        #     which can yield a very large response.
        class BatchUpdateJobsRequest; end

        # The result of
        # {Google::Cloud::Talent::V4beta1::JobService::BatchCreateJobs JobService::BatchCreateJobs}
        # or
        # {Google::Cloud::Talent::V4beta1::JobService::BatchUpdateJobs JobService::BatchUpdateJobs}
        # APIs. It's used to replace
        # {Google::Longrunning::Operation#response}
        # in case of success.
        # @!attribute [rw] job_results
        #   @return [Array<Google::Cloud::Talent::V4beta1::JobOperationResult::JobResult>]
        #     List of job mutation results from a batch mutate operation. It can change
        #     until operation status is FINISHED, FAILED or CANCELLED.
        class JobOperationResult
          # Mutation result of a job.
          # @!attribute [rw] job
          #   @return [Google::Cloud::Talent::V4beta1::Job]
          #     Here {Google::Cloud::Talent::V4beta1::Job Job} only contains basic
          #     information including {Google::Cloud::Talent::V4beta1::Job#name name},
          #     {Google::Cloud::Talent::V4beta1::Job#company company},
          #     {Google::Cloud::Talent::V4beta1::Job#language_code language_code} and
          #     {Google::Cloud::Talent::V4beta1::Job#requisition_id requisition_id}, use
          #     getJob method to retrieve detailed information of the created/updated
          #     job.
          # @!attribute [rw] status
          #   @return [Google::Rpc::Status]
          #     The status of the job processed. This field is populated if the
          #     processing of the
          #     {Google::Cloud::Talent::V4beta1::JobOperationResult::JobResult#job job}
          #     fails.
          class JobResult; end
        end

        # An enum that specifies the job attributes that are returned in the
        # {Google::Cloud::Talent::V4beta1::SearchJobsResponse::MatchingJob#job MatchingJob#job}
        # or {Google::Cloud::Talent::V4beta1::ListJobsResponse#jobs ListJobsResponse#jobs}
        # fields.
        module JobView
          # Default value.
          JOB_VIEW_UNSPECIFIED = 0

          # A ID only view of job, with following attributes:
          # {Google::Cloud::Talent::V4beta1::Job#name Job#name},
          # {Google::Cloud::Talent::V4beta1::Job#requisition_id Job#requisition_id},
          # {Google::Cloud::Talent::V4beta1::Job#language_code Job#language_code}.
          JOB_VIEW_ID_ONLY = 1

          # A minimal view of the job, with the following attributes:
          # {Google::Cloud::Talent::V4beta1::Job#name Job#name},
          # {Google::Cloud::Talent::V4beta1::Job#requisition_id Job#requisition_id},
          # {Google::Cloud::Talent::V4beta1::Job#title Job#title},
          # {Google::Cloud::Talent::V4beta1::Job#company Job#company},
          # {Google::Cloud::Talent::V4beta1::Job::DerivedInfo#locations Job::DerivedInfo#locations},
          # {Google::Cloud::Talent::V4beta1::Job#language_code Job#language_code}.
          JOB_VIEW_MINIMAL = 2

          # A small view of the job, with the following attributes in the search
          # results: {Google::Cloud::Talent::V4beta1::Job#name Job#name},
          # {Google::Cloud::Talent::V4beta1::Job#requisition_id Job#requisition_id},
          # {Google::Cloud::Talent::V4beta1::Job#title Job#title},
          # {Google::Cloud::Talent::V4beta1::Job#company Job#company},
          # {Google::Cloud::Talent::V4beta1::Job::DerivedInfo#locations Job::DerivedInfo#locations},
          # {Google::Cloud::Talent::V4beta1::Job#visibility Job#visibility},
          # {Google::Cloud::Talent::V4beta1::Job#language_code Job#language_code},
          # {Google::Cloud::Talent::V4beta1::Job#description Job#description}.
          JOB_VIEW_SMALL = 3

          # All available attributes are included in the search results.
          JOB_VIEW_FULL = 4
        end
      end
    end
  end
end