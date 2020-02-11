# Copyright 2020 Google LLC
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
        # The query required to perform a search query.
        # @!attribute [rw] query
        #   @return [String]
        #     The query string that matches against the job title, description, and
        #     location fields.
        #
        #     The maximum number of allowed characters is 255.
        # @!attribute [rw] query_language_code
        #   @return [String]
        #     The language code of {Google::Cloud::Talent::V4beta1::JobQuery#query query}. For example, "en-US". This field helps to
        #     better interpret the query.
        #
        #     If a value isn't specified, the query language code is automatically
        #     detected, which may not be accurate.
        #
        #     Language code should be in BCP-47 format, such as "en-US" or "sr-Latn".
        #     For more information, see
        #     [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47).
        # @!attribute [rw] companies
        #   @return [Array<String>]
        #     This filter specifies the company entities to search against.
        #
        #     If a value isn't specified, jobs are searched for against all
        #     companies.
        #
        #     If multiple values are specified, jobs are searched against the
        #     companies specified.
        #
        #     The format is
        #     "projects/{project_id}/tenants/{tenant_id}/companies/{company_id}". For
        #     example, "projects/foo/tenants/bar/companies/baz".
        #
        #     If tenant id is unspecified, the default tenant is used. For
        #     example, "projects/foo/companies/bar".
        #
        #     At most 20 company filters are allowed.
        # @!attribute [rw] location_filters
        #   @return [Array<Google::Cloud::Talent::V4beta1::LocationFilter>]
        #     The location filter specifies geo-regions containing the jobs to
        #     search against. See {Google::Cloud::Talent::V4beta1::LocationFilter LocationFilter} for more information.
        #
        #     If a location value isn't specified, jobs fitting the other search
        #     criteria are retrieved regardless of where they're located.
        #
        #     If multiple values are specified, jobs are retrieved from any of the
        #     specified locations. If different values are specified for the
        #     {Google::Cloud::Talent::V4beta1::LocationFilter#distance_in_miles LocationFilter#distance_in_miles} parameter, the maximum provided
        #     distance is used for all locations.
        #
        #     At most 5 location filters are allowed.
        # @!attribute [rw] job_categories
        #   @return [Array<Google::Cloud::Talent::V4beta1::JobCategory>]
        #     The category filter specifies the categories of jobs to search against.
        #     See {Google::Cloud::Talent::V4beta1::JobCategory JobCategory} for more information.
        #
        #     If a value isn't specified, jobs from any category are searched against.
        #
        #     If multiple values are specified, jobs from any of the specified
        #     categories are searched against.
        # @!attribute [rw] commute_filter
        #   @return [Google::Cloud::Talent::V4beta1::CommuteFilter]
        #     Allows filtering jobs by commute time with different travel methods (for
        #      example, driving or public transit).
        #
        #     Note: This only works when you specify a {Google::Cloud::Talent::V4beta1::CommuteMethod CommuteMethod}. In this case,
        #     {Google::Cloud::Talent::V4beta1::JobQuery#location_filters location_filters} is ignored.
        #
        #      Currently we don't support sorting by commute time.
        # @!attribute [rw] company_display_names
        #   @return [Array<String>]
        #     This filter specifies the exact company {Google::Cloud::Talent::V4beta1::Company#display_name Company#display_name}
        #     of the jobs to search against.
        #
        #     If a value isn't specified, jobs within the search results are
        #     associated with any company.
        #
        #     If multiple values are specified, jobs within the search results may be
        #     associated with any of the specified companies.
        #
        #     At most 20 company display name filters are allowed.
        # @!attribute [rw] compensation_filter
        #   @return [Google::Cloud::Talent::V4beta1::CompensationFilter]
        #     This search filter is applied only to
        #     {Google::Cloud::Talent::V4beta1::Job#compensation_info Job#compensation_info}. For example, if the filter is specified
        #     as "Hourly job with per-hour compensation > $15", only jobs meeting
        #     these criteria are searched. If a filter isn't defined, all open jobs
        #     are searched.
        # @!attribute [rw] custom_attribute_filter
        #   @return [String]
        #     This filter specifies a structured syntax to match against the
        #     {Google::Cloud::Talent::V4beta1::Job#custom_attributes Job#custom_attributes} marked as `filterable`.
        #
        #     The syntax for this expression is a subset of SQL syntax.
        #
        #     Supported operators are: `=`, `!=`, `<`, `<=`, `>`, and `>=` where the
        #     left of the operator is a custom field key and the right of the operator
        #     is a number or a quoted string. You must escape backslash (\\) and
        #     quote (\") characters.
        #
        #     Supported functions are `LOWER([field_name])` to
        #     perform a case insensitive match and `EMPTY([field_name])` to filter on the
        #     existence of a key.
        #
        #     Boolean expressions (AND/OR/NOT) are supported up to 3 levels of
        #     nesting (for example, "((A AND B AND C) OR NOT D) AND E"), a maximum of 100
        #     comparisons or functions are allowed in the expression. The expression
        #     must be < 6000 bytes in length.
        #
        #     Sample Query:
        #     `(LOWER(driving_license)="class \"a\"" OR EMPTY(driving_license)) AND
        #     driving_years > 10`
        # @!attribute [rw] disable_spell_check
        #   @return [true, false]
        #     This flag controls the spell-check feature. If false, the
        #     service attempts to correct a misspelled query,
        #     for example, "enginee" is corrected to "engineer".
        #
        #     Defaults to false: a spell check is performed.
        # @!attribute [rw] employment_types
        #   @return [Array<Google::Cloud::Talent::V4beta1::EmploymentType>]
        #     The employment type filter specifies the employment type of jobs to
        #     search against, such as {Google::Cloud::Talent::V4beta1::EmploymentType::FULL_TIME EmploymentType::FULL_TIME}.
        #
        #     If a value isn't specified, jobs in the search results includes any
        #     employment type.
        #
        #     If multiple values are specified, jobs in the search results include
        #     any of the specified employment types.
        # @!attribute [rw] language_codes
        #   @return [Array<String>]
        #     This filter specifies the locale of jobs to search against,
        #     for example, "en-US".
        #
        #     If a value isn't specified, the search results can contain jobs in any
        #     locale.
        #
        #
        #     Language codes should be in BCP-47 format, such as "en-US" or "sr-Latn".
        #     For more information, see
        #     [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47).
        #
        #     At most 10 language code filters are allowed.
        # @!attribute [rw] publish_time_range
        #   @return [Google::Cloud::Talent::V4beta1::TimestampRange]
        #     Jobs published within a range specified by this filter are searched
        #     against.
        # @!attribute [rw] excluded_jobs
        #   @return [Array<String>]
        #     This filter specifies a list of job names to be excluded during search.
        #
        #     At most 400 excluded job names are allowed.
        class JobQuery; end

        # Filters to apply when performing the search query.
        # @!attribute [rw] query
        #   @return [String]
        #     Keywords to match any text fields of profiles.
        #
        #     For example, "software engineer in Palo Alto".
        # @!attribute [rw] location_filters
        #   @return [Array<Google::Cloud::Talent::V4beta1::LocationFilter>]
        #     The location filter specifies geo-regions containing the profiles to
        #     search against.
        #
        #     One of {Google::Cloud::Talent::V4beta1::LocationFilter#address LocationFilter#address} or {Google::Cloud::Talent::V4beta1::LocationFilter#lat_lng LocationFilter#lat_lng} must be
        #     provided or an error is thrown. If both {Google::Cloud::Talent::V4beta1::LocationFilter#address LocationFilter#address} and
        #     {Google::Cloud::Talent::V4beta1::LocationFilter#lat_lng LocationFilter#lat_lng} are provided, an error is thrown.
        #
        #     The following logic is used to determine which locations in
        #     the profile to filter against:
        #
        #     1. All of the profile's geocoded {Google::Cloud::Talent::V4beta1::Profile#addresses Profile#addresses} where
        #     {Google::Cloud::Talent::V4beta1::Address#usage Address#usage} is PERSONAL and {Google::Cloud::Talent::V4beta1::Address#current Address#current} is true.
        #
        #     2. If the above set of locations is empty, all of the profile's geocoded
        #     {Google::Cloud::Talent::V4beta1::Profile#addresses Profile#addresses} where {Google::Cloud::Talent::V4beta1::Address#usage Address#usage} is
        #     CONTACT_INFO_USAGE_UNSPECIFIED and {Google::Cloud::Talent::V4beta1::Address#current Address#current} is true.
        #
        #     3. If the above set of locations is empty, all of the profile's geocoded
        #     {Google::Cloud::Talent::V4beta1::Profile#addresses Profile#addresses} where {Google::Cloud::Talent::V4beta1::Address#usage Address#usage} is PERSONAL or
        #     CONTACT_INFO_USAGE_UNSPECIFIED and {Google::Cloud::Talent::V4beta1::Address#current Address#current} is not set.
        #
        #     This means that any profiles without any {Google::Cloud::Talent::V4beta1::Profile#addresses Profile#addresses} that match
        #     any of the above criteria will not be included in a search with location
        #     filter. Furthermore, any {Google::Cloud::Talent::V4beta1::Profile#addresses Profile#addresses} where {Google::Cloud::Talent::V4beta1::Address#usage Address#usage} is
        #     WORK or SCHOOL or where {Google::Cloud::Talent::V4beta1::Address#current Address#current} is false are not considered for
        #     location filter.
        #
        #     If a location filter isn't specified, profiles fitting the other search
        #     criteria are retrieved regardless of where they're located.
        #
        #     If {Google::Cloud::Talent::V4beta1::LocationFilter#negated LocationFilter#negated} is specified, the result doesn't contain
        #     profiles from that location.
        #
        #     If {Google::Cloud::Talent::V4beta1::LocationFilter#address LocationFilter#address} is provided, the
        #     {Google::Cloud::Talent::V4beta1::Location::LocationType LocationType}, center
        #     point (latitude and longitude), and radius are automatically detected by
        #     the Google Maps Geocoding API and included as well. If
        #     {Google::Cloud::Talent::V4beta1::LocationFilter#address LocationFilter#address} cannot be geocoded, the filter
        #     falls back to keyword search.
        #
        #     If the detected
        #     {Google::Cloud::Talent::V4beta1::Location::LocationType LocationType} is
        #     {Google::Cloud::Talent::V4beta1::Location::LocationType::SUB_ADMINISTRATIVE_AREA LocationType::SUB_ADMINISTRATIVE_AREA},
        #     {Google::Cloud::Talent::V4beta1::Location::LocationType::ADMINISTRATIVE_AREA LocationType::ADMINISTRATIVE_AREA},
        #     or
        #     {Google::Cloud::Talent::V4beta1::Location::LocationType::COUNTRY LocationType::COUNTRY},
        #     the filter is performed against the detected location name (using exact
        #     text matching). Otherwise, the filter is performed against the detected
        #     center point and a radius of detected location radius +
        #     {Google::Cloud::Talent::V4beta1::LocationFilter#distance_in_miles LocationFilter#distance_in_miles}.
        #
        #     If {Google::Cloud::Talent::V4beta1::LocationFilter#address LocationFilter#address} is provided,
        #     {Google::Cloud::Talent::V4beta1::LocationFilter#distance_in_miles LocationFilter#distance_in_miles} is the additional radius on top of the
        #     radius of the location geocoded from {Google::Cloud::Talent::V4beta1::LocationFilter#address LocationFilter#address}. If
        #     {Google::Cloud::Talent::V4beta1::LocationFilter#lat_lng LocationFilter#lat_lng} is provided,
        #     {Google::Cloud::Talent::V4beta1::LocationFilter#distance_in_miles LocationFilter#distance_in_miles} is the only radius that is used.
        #
        #     {Google::Cloud::Talent::V4beta1::LocationFilter#distance_in_miles LocationFilter#distance_in_miles} is 10 by default. Note that the value
        #     of {Google::Cloud::Talent::V4beta1::LocationFilter#distance_in_miles LocationFilter#distance_in_miles} is 0 if it is unset, so the server
        #     does not differentiate {Google::Cloud::Talent::V4beta1::LocationFilter#distance_in_miles LocationFilter#distance_in_miles} that is
        #     explicitly set to 0 and {Google::Cloud::Talent::V4beta1::LocationFilter#distance_in_miles LocationFilter#distance_in_miles} that is not
        #     set. Which means that if {Google::Cloud::Talent::V4beta1::LocationFilter#distance_in_miles LocationFilter#distance_in_miles} is explicitly
        #     set to 0, the server will use the default value of
        #     {Google::Cloud::Talent::V4beta1::LocationFilter#distance_in_miles LocationFilter#distance_in_miles} which is 10. To work around this and
        #     effectively set {Google::Cloud::Talent::V4beta1::LocationFilter#distance_in_miles LocationFilter#distance_in_miles} to 0, we recommend
        #     setting {Google::Cloud::Talent::V4beta1::LocationFilter#distance_in_miles LocationFilter#distance_in_miles} to a very small decimal number
        #     (such as 0.00001).
        #
        #     If {Google::Cloud::Talent::V4beta1::LocationFilter#distance_in_miles LocationFilter#distance_in_miles} is negative, an error is thrown.
        # @!attribute [rw] job_title_filters
        #   @return [Array<Google::Cloud::Talent::V4beta1::JobTitleFilter>]
        #     Job title filter specifies job titles of profiles to match on.
        #
        #     If a job title isn't specified, profiles with any titles are retrieved.
        #
        #     If multiple values are specified, profiles are retrieved with any of the
        #     specified job titles.
        #
        #     If {Google::Cloud::Talent::V4beta1::JobTitleFilter#negated JobTitleFilter#negated} is specified, the result won't contain
        #     profiles with the job titles.
        #
        #     For example, search for profiles with a job title "Product Manager".
        # @!attribute [rw] employer_filters
        #   @return [Array<Google::Cloud::Talent::V4beta1::EmployerFilter>]
        #     Employer filter specifies employers of profiles to match on.
        #
        #     If an employer filter isn't specified, profiles with any employers are
        #     retrieved.
        #
        #     If multiple employer filters are specified, profiles with any matching
        #     employers are retrieved.
        #
        #     If {Google::Cloud::Talent::V4beta1::EmployerFilter#negated EmployerFilter#negated} is specified, the result won't contain
        #     profiles that match the employers.
        #
        #     For example, search for profiles that have working experience at "Google
        #     LLC".
        # @!attribute [rw] education_filters
        #   @return [Array<Google::Cloud::Talent::V4beta1::EducationFilter>]
        #     Education filter specifies education of profiles to match on.
        #
        #     If an education filter isn't specified, profiles with any education are
        #     retrieved.
        #
        #     If multiple education filters are specified, profiles that match any
        #     education filters are retrieved.
        #
        #     If {Google::Cloud::Talent::V4beta1::EducationFilter#negated EducationFilter#negated} is specified, the result won't contain
        #     profiles that match the educations.
        #
        #     For example, search for profiles with a master degree.
        # @!attribute [rw] skill_filters
        #   @return [Array<Google::Cloud::Talent::V4beta1::SkillFilter>]
        #     Skill filter specifies skill of profiles to match on.
        #
        #     If a skill filter isn't specified, profiles with any skills are retrieved.
        #
        #     If multiple skill filters are specified, profiles that match any skill
        #     filters are retrieved.
        #
        #     If {Google::Cloud::Talent::V4beta1::SkillFilter#negated SkillFilter#negated} is specified, the result won't contain profiles
        #     that match the skills.
        #
        #     For example, search for profiles that have "Java" and "Python" in skill
        #     list.
        # @!attribute [rw] work_experience_filter
        #   @return [Array<Google::Cloud::Talent::V4beta1::WorkExperienceFilter>]
        #     Work experience filter specifies the total working experience of profiles
        #     to match on.
        #
        #     If a work experience filter isn't specified, profiles with any
        #     professional experience are retrieved.
        #
        #     If multiple work experience filters are specified, profiles that match any
        #     work experience filters are retrieved.
        #
        #     For example, search for profiles with 10 years of work experience.
        # @!attribute [rw] time_filters
        #   @return [Array<Google::Cloud::Talent::V4beta1::TimeFilter>]
        #     Time filter specifies the create/update timestamp of the profiles to match
        #     on.
        #
        #     For example, search for profiles created since "2018-1-1".
        # @!attribute [rw] hirable_filter
        #   @return [Google::Protobuf::BoolValue]
        #     The hirable filter specifies the profile's hirable status to match on.
        # @!attribute [rw] application_date_filters
        #   @return [Array<Google::Cloud::Talent::V4beta1::ApplicationDateFilter>]
        #     The application date filters specify application date ranges to match on.
        # @!attribute [rw] application_outcome_notes_filters
        #   @return [Array<Google::Cloud::Talent::V4beta1::ApplicationOutcomeNotesFilter>]
        #     The application outcome notes filters specify the notes for the outcome of
        #     the job application.
        # @!attribute [rw] application_job_filters
        #   @return [Array<Google::Cloud::Talent::V4beta1::ApplicationJobFilter>]
        #     The application job filters specify the job applied for in the application.
        # @!attribute [rw] custom_attribute_filter
        #   @return [String]
        #     This filter specifies a structured syntax to match against the
        #     {Google::Cloud::Talent::V4beta1::Profile#custom_attributes Profile#custom_attributes} that are marked as `filterable`.
        #
        #     The syntax for this expression is a subset of Google SQL syntax.
        #
        #     String custom attributes: supported operators are =, != where the left of
        #     the operator is a custom field key and the right of the operator is a
        #     string (surrounded by quotes) value.
        #
        #     Numeric custom attributes: Supported operators are '>', '<' or '='
        #     operators where the left of the operator is a custom field key and the
        #     right of the operator is a numeric value.
        #
        #     Supported functions are LOWER(<field_name>) to
        #     perform case insensitive match and EMPTY(<field_name>) to filter on the
        #     existence of a key.
        #
        #     Boolean expressions (AND/OR/NOT) are supported up to 3 levels of
        #     nesting (for example "((A AND B AND C) OR NOT D) AND E"), and there can be
        #     a maximum of 50 comparisons/functions in the expression. The expression
        #     must be < 2000 characters in length.
        #
        #     Sample Query:
        #     (key1 = "TEST" OR LOWER(key1)="test" OR NOT EMPTY(key1))
        # @!attribute [rw] candidate_availability_filter
        #   @return [Google::Cloud::Talent::V4beta1::CandidateAvailabilityFilter]
        #     Deprecated. Use availability_filters instead.
        #
        #     The candidate availability filter which filters based on availability
        #     signals.
        #
        #     Signal 1: Number of days since most recent job application.  See
        #     {Google::Cloud::Talent::V4beta1::Availability::JobApplicationAvailabilitySignal Availability::JobApplicationAvailabilitySignal} for the details of this
        #     signal.
        #
        #     Signal 2: Number of days since last profile update. See
        #     {Google::Cloud::Talent::V4beta1::Availability::ProfileUpdateAvailabilitySignal Availability::ProfileUpdateAvailabilitySignal}
        #     for the details of this signal.
        #
        #     The candidate availability filter helps a recruiter understand if a
        #     specific candidate is likely to be actively seeking new job opportunities
        #     based on an aggregated set of signals.  Specifically, the intent is NOT to
        #     indicate the candidate's potential qualification / interest / close ability
        #     for a specific job.
        # @!attribute [rw] availability_filters
        #   @return [Array<Google::Cloud::Talent::V4beta1::AvailabilityFilter>]
        #     The availability filter which filters based on
        #     {Google::Cloud::Talent::V4beta1::Profile#availability_signals Profile#availability_signals}.
        #
        #     The availability filter helps a recruiter understand if a
        #     specific candidate is likely to be actively seeking new job opportunities
        #     based on an aggregated set of signals.  Specifically, the intent is NOT to
        #     indicate the candidate's potential qualification / interest / close ability
        #     for a specific job.
        #
        #     There can be at most one {Google::Cloud::Talent::V4beta1::AvailabilityFilter AvailabilityFilter} per
        #     {Google::Cloud::Talent::V4beta1::AvailabilityFilter#signal_type signal_type}. If there are multiple
        #     {Google::Cloud::Talent::V4beta1::AvailabilityFilter AvailabilityFilter} for a {Google::Cloud::Talent::V4beta1::AvailabilityFilter#signal_type signal_type},
        #     an error is thrown.
        # @!attribute [rw] person_name_filters
        #   @return [Array<Google::Cloud::Talent::V4beta1::PersonNameFilter>]
        #     Person name filter specifies person name of profiles to match on.
        #
        #     If multiple person name filters are specified, profiles that match any
        #     person name filters are retrieved.
        #
        #     For example, search for profiles of candidates with name "John Smith".
        class ProfileQuery; end

        # Geographic region of the search.
        # @!attribute [rw] address
        #   @return [String]
        #     The address name, such as "Mountain View" or "Bay Area".
        # @!attribute [rw] region_code
        #   @return [String]
        #     CLDR region code of the country/region of the address. This is used
        #     to address ambiguity of the user-input location, for example, "Liverpool"
        #     against "Liverpool, NY, US" or "Liverpool, UK".
        #
        #     Set this field to bias location resolution toward a specific country
        #     or territory. If this field is not set, application behavior is biased
        #     toward the United States by default.
        #
        #     See https://cldr.unicode.org/ and
        #     https://www.unicode.org/cldr/charts/30/supplemental/territory_information.html
        #     for details. Example: "CH" for Switzerland.
        #     Note that this filter is not applicable for Profile Search related queries.
        # @!attribute [rw] lat_lng
        #   @return [Google::Type::LatLng]
        #     The latitude and longitude of the geographic center to search from. This
        #     field is ignored if `address` is provided.
        # @!attribute [rw] distance_in_miles
        #   @return [Float]
        #     The distance_in_miles is applied when the location being searched for is
        #     identified as a city or smaller. This field is ignored if the location
        #     being searched for is a state or larger.
        # @!attribute [rw] telecommute_preference
        #   @return [Google::Cloud::Talent::V4beta1::LocationFilter::TelecommutePreference]
        #     Allows the client to return jobs without a
        #     set location, specifically, telecommuting jobs (telecommuting is considered
        #     by the service as a special location.
        #     {Google::Cloud::Talent::V4beta1::Job#posting_region Job#posting_region} indicates if a job permits telecommuting.
        #     If this field is set to {Google::Cloud::Talent::V4beta1::LocationFilter::TelecommutePreference::TELECOMMUTE_ALLOWED TelecommutePreference::TELECOMMUTE_ALLOWED},
        #     telecommuting jobs are searched, and {Google::Cloud::Talent::V4beta1::LocationFilter#address address} and {Google::Cloud::Talent::V4beta1::LocationFilter#lat_lng lat_lng} are
        #     ignored. If not set or set to
        #     {Google::Cloud::Talent::V4beta1::LocationFilter::TelecommutePreference::TELECOMMUTE_EXCLUDED TelecommutePreference::TELECOMMUTE_EXCLUDED}, telecommute job are not
        #     searched.
        #
        #     This filter can be used by itself to search exclusively for telecommuting
        #     jobs, or it can be combined with another location
        #     filter to search for a combination of job locations,
        #     such as "Mountain View" or "telecommuting" jobs. However, when used in
        #     combination with other location filters, telecommuting jobs can be
        #     treated as less relevant than other jobs in the search response.
        #
        #     This field is only used for job search requests.
        # @!attribute [rw] negated
        #   @return [true, false]
        #     Whether to apply negation to the filter so profiles matching the filter
        #     are excluded.
        #
        #     Currently only supported in profile search.
        class LocationFilter
          # Specify whether to include telecommute jobs.
          module TelecommutePreference
            # Default value if the telecommute preference isn't specified.
            TELECOMMUTE_PREFERENCE_UNSPECIFIED = 0

            # Exclude telecommute jobs.
            TELECOMMUTE_EXCLUDED = 1

            # Allow telecommute jobs.
            TELECOMMUTE_ALLOWED = 2
          end
        end

        # Filter on job compensation type and amount.
        # @!attribute [rw] type
        #   @return [Google::Cloud::Talent::V4beta1::CompensationFilter::FilterType]
        #     Required. Type of filter.
        # @!attribute [rw] units
        #   @return [Array<Google::Cloud::Talent::V4beta1::CompensationInfo::CompensationUnit>]
        #     Required. Specify desired `base compensation entry's`
        #     {Google::Cloud::Talent::V4beta1::CompensationInfo::CompensationUnit CompensationInfo::CompensationUnit}.
        # @!attribute [rw] range
        #   @return [Google::Cloud::Talent::V4beta1::CompensationInfo::CompensationRange]
        #     Compensation range.
        # @!attribute [rw] include_jobs_with_unspecified_compensation_range
        #   @return [true, false]
        #     If set to true, jobs with unspecified compensation range fields are
        #     included.
        class CompensationFilter
          # Specify the type of filtering.
          module FilterType
            # Filter type unspecified. Position holder, INVALID, should never be used.
            FILTER_TYPE_UNSPECIFIED = 0

            # Filter by `base compensation entry's` unit. A job is a match if and
            # only if the job contains a base CompensationEntry and the base
            # CompensationEntry's unit matches provided {Google::Cloud::Talent::V4beta1::CompensationFilter#units units}.
            # Populate one or more {Google::Cloud::Talent::V4beta1::CompensationFilter#units units}.
            #
            # See {Google::Cloud::Talent::V4beta1::CompensationInfo::CompensationEntry CompensationInfo::CompensationEntry} for definition of
            # base compensation entry.
            UNIT_ONLY = 1

            # Filter by `base compensation entry's` unit and amount / range. A job
            # is a match if and only if the job contains a base CompensationEntry, and
            # the base entry's unit matches provided
            # {Google::Cloud::Talent::V4beta1::CompensationInfo::CompensationUnit CompensationUnit} and
            # amount or range overlaps with provided
            # {Google::Cloud::Talent::V4beta1::CompensationInfo::CompensationRange CompensationRange}.
            #
            # See {Google::Cloud::Talent::V4beta1::CompensationInfo::CompensationEntry CompensationInfo::CompensationEntry} for definition of
            # base compensation entry.
            #
            # Set exactly one {Google::Cloud::Talent::V4beta1::CompensationFilter#units units} and populate {Google::Cloud::Talent::V4beta1::CompensationFilter#range range}.
            UNIT_AND_AMOUNT = 2

            # Filter by annualized base compensation amount and `base compensation
            # entry's` unit. Populate {Google::Cloud::Talent::V4beta1::CompensationFilter#range range} and zero or more {Google::Cloud::Talent::V4beta1::CompensationFilter#units units}.
            ANNUALIZED_BASE_AMOUNT = 3

            # Filter by annualized total compensation amount and `base compensation
            # entry's` unit . Populate {Google::Cloud::Talent::V4beta1::CompensationFilter#range range} and zero or more {Google::Cloud::Talent::V4beta1::CompensationFilter#units units}.
            ANNUALIZED_TOTAL_AMOUNT = 4
          end
        end

        # Parameters needed for commute search.
        # @!attribute [rw] commute_method
        #   @return [Google::Cloud::Talent::V4beta1::CommuteMethod]
        #     Required. The method of transportation to calculate the commute time for.
        # @!attribute [rw] start_coordinates
        #   @return [Google::Type::LatLng]
        #     Required. The latitude and longitude of the location to calculate the
        #     commute time from.
        # @!attribute [rw] travel_duration
        #   @return [Google::Protobuf::Duration]
        #     Required. The maximum travel time in seconds. The maximum allowed value is `3600s`
        #     (one hour). Format is `123s`.
        # @!attribute [rw] allow_imprecise_addresses
        #   @return [true, false]
        #     If `true`, jobs without street level addresses may also be returned.
        #     For city level addresses, the city center is used. For state and coarser
        #     level addresses, text matching is used.
        #     If this field is set to `false` or isn't specified, only jobs that include
        #     street level addresses will be returned by commute search.
        # @!attribute [rw] road_traffic
        #   @return [Google::Cloud::Talent::V4beta1::CommuteFilter::RoadTraffic]
        #     Specifies the traffic density to use when calculating commute time.
        # @!attribute [rw] departure_time
        #   @return [Google::Type::TimeOfDay]
        #     The departure time used to calculate traffic impact, represented as
        #     {Google::Type::TimeOfDay} in local time zone.
        #
        #     Currently traffic model is restricted to hour level resolution.
        class CommuteFilter
          # The traffic density to use when calculating commute time.
          module RoadTraffic
            # Road traffic situation isn't specified.
            ROAD_TRAFFIC_UNSPECIFIED = 0

            # Optimal commute time without considering any traffic impact.
            TRAFFIC_FREE = 1

            # Commute time calculation takes in account the peak traffic impact.
            BUSY_HOUR = 2
          end
        end

        # Job title of the search.
        # @!attribute [rw] job_title
        #   @return [String]
        #     Required. The job title. For example, "Software engineer", or "Product manager".
        # @!attribute [rw] negated
        #   @return [true, false]
        #     Whether to apply negation to the filter so profiles matching the filter
        #     are excluded.
        class JobTitleFilter; end

        # Skill filter of the search.
        # @!attribute [rw] skill
        #   @return [String]
        #     Required. The skill name. For example, "java", "j2ee", and so on.
        # @!attribute [rw] negated
        #   @return [true, false]
        #     Whether to apply negation to the filter so profiles matching the filter
        #     are excluded.
        class SkillFilter; end

        # Employer filter of the search.
        # @!attribute [rw] employer
        #   @return [String]
        #     Required. The name of the employer, for example "Google", "Alphabet".
        # @!attribute [rw] mode
        #   @return [Google::Cloud::Talent::V4beta1::EmployerFilter::EmployerFilterMode]
        #     Define set of {Google::Cloud::Talent::V4beta1::EmploymentRecord EmploymentRecord}s to search against.
        #
        #     Defaults to {Google::Cloud::Talent::V4beta1::EmployerFilter::EmployerFilterMode::ALL_EMPLOYMENT_RECORDS EmployerFilterMode::ALL_EMPLOYMENT_RECORDS}.
        # @!attribute [rw] negated
        #   @return [true, false]
        #     Whether to apply negation to the filter so profiles matching the filter
        #     is excluded.
        class EmployerFilter
          # Enum indicating which set of {Google::Cloud::Talent::V4beta1::Profile#employment_records Profile#employment_records} to search
          # against.
          module EmployerFilterMode
            # Default value.
            EMPLOYER_FILTER_MODE_UNSPECIFIED = 0

            # Apply to all employers in {Google::Cloud::Talent::V4beta1::Profile#employment_records Profile#employment_records}.
            ALL_EMPLOYMENT_RECORDS = 1

            # Apply only to current employer in {Google::Cloud::Talent::V4beta1::Profile#employment_records Profile#employment_records}.
            CURRENT_EMPLOYMENT_RECORDS_ONLY = 2

            # Apply only to past (not current) employers in
            # {Google::Cloud::Talent::V4beta1::Profile#employment_records Profile#employment_records}.
            PAST_EMPLOYMENT_RECORDS_ONLY = 3
          end
        end

        # Education filter of the search.
        # @!attribute [rw] school
        #   @return [String]
        #     The school name. For example "MIT", "University of California, Berkeley".
        # @!attribute [rw] field_of_study
        #   @return [String]
        #     The field of study. This is to search against value provided in
        #     {Google::Cloud::Talent::V4beta1::Degree#fields_of_study Degree#fields_of_study}.
        #     For example "Computer Science", "Mathematics".
        # @!attribute [rw] degree_type
        #   @return [Google::Cloud::Talent::V4beta1::DegreeType]
        #     Education degree in ISCED code. Each value in degree covers a specific
        #     level of education, without any expansion to upper nor lower levels of
        #     education degree.
        # @!attribute [rw] negated
        #   @return [true, false]
        #     Whether to apply negation to the filter so profiles matching the filter
        #     is excluded.
        class EducationFilter; end

        # Work experience filter.
        #
        # This filter is used to search for profiles with working experience length
        # between {Google::Cloud::Talent::V4beta1::WorkExperienceFilter#min_experience min_experience} and {Google::Cloud::Talent::V4beta1::WorkExperienceFilter#max_experience max_experience}.
        # @!attribute [rw] min_experience
        #   @return [Google::Protobuf::Duration]
        #     The minimum duration of the work experience (inclusive).
        # @!attribute [rw] max_experience
        #   @return [Google::Protobuf::Duration]
        #     The maximum duration of the work experience (exclusive).
        class WorkExperienceFilter; end

        # Application Date Range Filter.
        #
        # The API matches profiles with {Google::Cloud::Talent::V4beta1::Application#application_date Application#application_date} between
        # start date and end date (both boundaries are inclusive). The filter is
        # ignored if both {Google::Cloud::Talent::V4beta1::ApplicationDateFilter#start_date start_date} and {Google::Cloud::Talent::V4beta1::ApplicationDateFilter#end_date end_date} are missing.
        # @!attribute [rw] start_date
        #   @return [Google::Type::Date]
        #     Start date. If it's missing, The API matches profiles with application date
        #     not after the end date.
        # @!attribute [rw] end_date
        #   @return [Google::Type::Date]
        #     End date. If it's missing, The API matches profiles with application date
        #     not before the start date.
        class ApplicationDateFilter; end

        # Outcome Notes Filter.
        # @!attribute [rw] outcome_notes
        #   @return [String]
        #     Required. User entered or selected outcome reason. The API does an exact match on the
        #     {Google::Cloud::Talent::V4beta1::Application#outcome_notes Application#outcome_notes} in profiles.
        # @!attribute [rw] negated
        #   @return [true, false]
        #     If true, The API excludes all candidates with any
        #     {Google::Cloud::Talent::V4beta1::Application#outcome_notes Application#outcome_notes} matching the outcome reason specified in
        #     the filter.
        class ApplicationOutcomeNotesFilter; end

        # Filter on the job information of Application.
        # @!attribute [rw] job_requisition_id
        #   @return [String]
        #     The job requisition id in the application. The API does an exact match on
        #     the {Google::Cloud::Talent::V4beta1::Job#requisition_id Job#requisition_id} of {Google::Cloud::Talent::V4beta1::Application#job Application#job} in profiles.
        # @!attribute [rw] job_title
        #   @return [String]
        #     The job title in the application. The API does an exact match on the
        #     {Google::Cloud::Talent::V4beta1::Job#title Job#title} of {Google::Cloud::Talent::V4beta1::Application#job Application#job} in profiles.
        # @!attribute [rw] negated
        #   @return [true, false]
        #     If true, the API excludes all profiles with any {Google::Cloud::Talent::V4beta1::Application#job Application#job}
        #     matching the filters.
        class ApplicationJobFilter; end

        # Filter on create timestamp or update timestamp of profiles.
        # @!attribute [rw] start_time
        #   @return [Google::Protobuf::Timestamp]
        #     Start timestamp, matching profiles with the start time. If this field
        #     missing, The API matches profiles with create / update timestamp before the
        #     end timestamp.
        # @!attribute [rw] end_time
        #   @return [Google::Protobuf::Timestamp]
        #     End timestamp, matching profiles with the end time. If this field
        #     missing, The API matches profiles with create / update timestamp after the
        #     start timestamp.
        # @!attribute [rw] time_field
        #   @return [Google::Cloud::Talent::V4beta1::TimeFilter::TimeField]
        #     Specifies which time field to filter profiles.
        #
        #     Defaults to {Google::Cloud::Talent::V4beta1::TimeFilter::TimeField::CREATE_TIME TimeField::CREATE_TIME}.
        class TimeFilter
          # Time fields can be used in TimeFilter.
          module TimeField
            # Default value.
            TIME_FIELD_UNSPECIFIED = 0

            # Earliest profile create time.
            CREATE_TIME = 1

            # Latest profile update time.
            UPDATE_TIME = 2
          end
        end

        # Deprecated. Use AvailabilityFilter instead.
        #
        # Filter on availability signals.
        # @!attribute [rw] negated
        #   @return [true, false]
        #     It is false by default. If true, API excludes all the potential available
        #     profiles.
        class CandidateAvailabilityFilter; end

        # Filter on availability signals.
        # @!attribute [rw] signal_type
        #   @return [Google::Cloud::Talent::V4beta1::AvailabilitySignalType]
        #     Required. Type of signal to apply filter on.
        # @!attribute [rw] range
        #   @return [Google::Cloud::Talent::V4beta1::TimestampRange]
        #     Required. Range of times to filter candidate signals by.
        # @!attribute [rw] required
        #   @return [true, false]
        #     If multiple {Google::Cloud::Talent::V4beta1::AvailabilityFilter AvailabilityFilter} are provided, the default
        #     behavior is to OR all filters, but if this field is set to true, this
        #     particular {Google::Cloud::Talent::V4beta1::AvailabilityFilter AvailabilityFilter} will be AND'ed against other
        #     {Google::Cloud::Talent::V4beta1::AvailabilityFilter AvailabilityFilter}.
        class AvailabilityFilter; end

        # Filter on person name.
        # @!attribute [rw] person_name
        #   @return [String]
        #     Required. The person name. For example, "John Smith".
        #
        #     Can be any combination of {PersonName#structured_name#given_name},
        #     {PersonName#structured_name#middle_initial},
        #     {PersonName#structured_name#family_name}, and
        #     {Google::Cloud::Talent::V4beta1::PersonName#formatted_name PersonName#formatted_name}.
        class PersonNameFilter; end
      end
    end
  end
end