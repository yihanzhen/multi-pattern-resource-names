// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

// Note: this file is purely for documentation. Any contents are not expected
// to be loaded as the JS file.

/**
 * A Company resource represents a company in the service. A company is the
 * entity that owns job postings, that is, the hiring entity responsible for
 * employing applicants for the job position.
 *
 * @property {string} name
 *   Required during company update.
 *
 *   The resource name for a company. This is generated by the service when a
 *   company is created.
 *
 *   The format is
 *   "projects/{project_id}/tenants/{tenant_id}/companies/{company_id}", for
 *   example, "projects/foo/tenants/bar/companies/baz".
 *
 *   If tenant id is unspecified, the default tenant is used. For
 *   example, "projects/foo/companies/bar".
 *
 * @property {string} displayName
 *   Required. The display name of the company, for example, "Google LLC".
 *
 * @property {string} externalId
 *   Required. Client side company identifier, used to uniquely identify the
 *   company.
 *
 *   The maximum number of allowed characters is 255.
 *
 * @property {number} size
 *   The employer's company size.
 *
 *   The number should be among the values of [CompanySize]{@link google.cloud.talent.v4beta1.CompanySize}
 *
 * @property {string} headquartersAddress
 *   The street address of the company's main headquarters, which may be
 *   different from the job location. The service attempts
 *   to geolocate the provided address, and populates a more specific
 *   location wherever possible in DerivedInfo.headquarters_location.
 *
 * @property {boolean} hiringAgency
 *   Set to true if it is the hiring agency that post jobs for other
 *   employers.
 *
 *   Defaults to false if not provided.
 *
 * @property {string} eeoText
 *   Equal Employment Opportunity legal disclaimer text to be
 *   associated with all jobs, and typically to be displayed in all
 *   roles.
 *
 *   The maximum number of allowed characters is 500.
 *
 * @property {string} websiteUri
 *   The URI representing the company's primary web site or home page,
 *   for example, "https://www.google.com".
 *
 *   The maximum number of allowed characters is 255.
 *
 * @property {string} careerSiteUri
 *   The URI to employer's career site or careers page on the employer's web
 *   site, for example, "https://careers.google.com".
 *
 * @property {string} imageUri
 *   A URI that hosts the employer's company logo.
 *
 * @property {string[]} keywordSearchableJobCustomAttributes
 *   A list of keys of filterable Job.custom_attributes, whose
 *   corresponding `string_values` are used in keyword searches. Jobs with
 *   `string_values` under these specified field keys are returned if any
 *   of the values match the search keyword. Custom field values with
 *   parenthesis, brackets and special symbols are not searchable as-is,
 *   and those keyword queries must be surrounded by quotes.
 *
 * @property {Object} derivedInfo
 *   Output only. Derived details about the company.
 *
 *   This object should have the same structure as [DerivedInfo]{@link google.cloud.talent.v4beta1.DerivedInfo}
 *
 * @property {boolean} suspended
 *   Output only. Indicates whether a company is flagged to be suspended from
 *   public availability by the service when job content appears suspicious,
 *   abusive, or spammy.
 *
 * @typedef Company
 * @memberof google.cloud.talent.v4beta1
 * @see [google.cloud.talent.v4beta1.Company definition in proto format]{@link https://github.com/googleapis/googleapis/blob/master/google/cloud/talent/v4beta1/company.proto}
 */
const Company = {
  // This is for documentation. Actual contents will be loaded by gRPC.

  /**
   * Derived details about the company.
   *
   * @property {Object} headquartersLocation
   *   A structured headquarters location of the company, resolved from
   *   Company.headquarters_address if provided.
   *
   *   This object should have the same structure as [Location]{@link google.cloud.talent.v4beta1.Location}
   *
   * @typedef DerivedInfo
   * @memberof google.cloud.talent.v4beta1
   * @see [google.cloud.talent.v4beta1.Company.DerivedInfo definition in proto format]{@link https://github.com/googleapis/googleapis/blob/master/google/cloud/talent/v4beta1/company.proto}
   */
  DerivedInfo: {
    // This is for documentation. Actual contents will be loaded by gRPC.
  }
};