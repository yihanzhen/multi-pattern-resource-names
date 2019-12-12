// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/talent/v4beta1/completion_service.proto

package com.google.cloud.talent.v4beta1;

public interface CompleteQueryRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.CompleteQueryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Resource name of tenant the completion is performed within.
   * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
   * "projects/foo/tenant/bar".
   * If tenant id is unspecified, the default tenant is used, for
   * example, "projects/foo".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. Resource name of tenant the completion is performed within.
   * The format is "projects/{project_id}/tenants/{tenant_id}", for example,
   * "projects/foo/tenant/bar".
   * If tenant id is unspecified, the default tenant is used, for
   * example, "projects/foo".
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The query used to generate suggestions.
   * The maximum number of allowed characters is 255.
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getQuery();
  /**
   * <pre>
   * Required. The query used to generate suggestions.
   * The maximum number of allowed characters is 255.
   * </pre>
   *
   * <code>string query = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString
      getQueryBytes();

  /**
   * <pre>
   * The list of languages of the query. This is
   * the BCP-47 language code, such as "en-US" or "sr-Latn".
   * For more information, see
   * [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47).
   * For
   * [CompletionType.JOB_TITLE][google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType.JOB_TITLE]
   * type, only open jobs with the same
   * [language_codes][google.cloud.talent.v4beta1.CompleteQueryRequest.language_codes]
   * are returned.
   * For
   * [CompletionType.COMPANY_NAME][google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType.COMPANY_NAME]
   * type, only companies having open jobs with the same
   * [language_codes][google.cloud.talent.v4beta1.CompleteQueryRequest.language_codes]
   * are returned.
   * For
   * [CompletionType.COMBINED][google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType.COMBINED]
   * type, only open jobs with the same
   * [language_codes][google.cloud.talent.v4beta1.CompleteQueryRequest.language_codes]
   * or companies having open jobs with the same
   * [language_codes][google.cloud.talent.v4beta1.CompleteQueryRequest.language_codes]
   * are returned.
   * The maximum number of allowed characters is 255.
   * </pre>
   *
   * <code>repeated string language_codes = 3;</code>
   */
  java.util.List<java.lang.String>
      getLanguageCodesList();
  /**
   * <pre>
   * The list of languages of the query. This is
   * the BCP-47 language code, such as "en-US" or "sr-Latn".
   * For more information, see
   * [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47).
   * For
   * [CompletionType.JOB_TITLE][google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType.JOB_TITLE]
   * type, only open jobs with the same
   * [language_codes][google.cloud.talent.v4beta1.CompleteQueryRequest.language_codes]
   * are returned.
   * For
   * [CompletionType.COMPANY_NAME][google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType.COMPANY_NAME]
   * type, only companies having open jobs with the same
   * [language_codes][google.cloud.talent.v4beta1.CompleteQueryRequest.language_codes]
   * are returned.
   * For
   * [CompletionType.COMBINED][google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType.COMBINED]
   * type, only open jobs with the same
   * [language_codes][google.cloud.talent.v4beta1.CompleteQueryRequest.language_codes]
   * or companies having open jobs with the same
   * [language_codes][google.cloud.talent.v4beta1.CompleteQueryRequest.language_codes]
   * are returned.
   * The maximum number of allowed characters is 255.
   * </pre>
   *
   * <code>repeated string language_codes = 3;</code>
   */
  int getLanguageCodesCount();
  /**
   * <pre>
   * The list of languages of the query. This is
   * the BCP-47 language code, such as "en-US" or "sr-Latn".
   * For more information, see
   * [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47).
   * For
   * [CompletionType.JOB_TITLE][google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType.JOB_TITLE]
   * type, only open jobs with the same
   * [language_codes][google.cloud.talent.v4beta1.CompleteQueryRequest.language_codes]
   * are returned.
   * For
   * [CompletionType.COMPANY_NAME][google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType.COMPANY_NAME]
   * type, only companies having open jobs with the same
   * [language_codes][google.cloud.talent.v4beta1.CompleteQueryRequest.language_codes]
   * are returned.
   * For
   * [CompletionType.COMBINED][google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType.COMBINED]
   * type, only open jobs with the same
   * [language_codes][google.cloud.talent.v4beta1.CompleteQueryRequest.language_codes]
   * or companies having open jobs with the same
   * [language_codes][google.cloud.talent.v4beta1.CompleteQueryRequest.language_codes]
   * are returned.
   * The maximum number of allowed characters is 255.
   * </pre>
   *
   * <code>repeated string language_codes = 3;</code>
   */
  java.lang.String getLanguageCodes(int index);
  /**
   * <pre>
   * The list of languages of the query. This is
   * the BCP-47 language code, such as "en-US" or "sr-Latn".
   * For more information, see
   * [Tags for Identifying Languages](https://tools.ietf.org/html/bcp47).
   * For
   * [CompletionType.JOB_TITLE][google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType.JOB_TITLE]
   * type, only open jobs with the same
   * [language_codes][google.cloud.talent.v4beta1.CompleteQueryRequest.language_codes]
   * are returned.
   * For
   * [CompletionType.COMPANY_NAME][google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType.COMPANY_NAME]
   * type, only companies having open jobs with the same
   * [language_codes][google.cloud.talent.v4beta1.CompleteQueryRequest.language_codes]
   * are returned.
   * For
   * [CompletionType.COMBINED][google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType.COMBINED]
   * type, only open jobs with the same
   * [language_codes][google.cloud.talent.v4beta1.CompleteQueryRequest.language_codes]
   * or companies having open jobs with the same
   * [language_codes][google.cloud.talent.v4beta1.CompleteQueryRequest.language_codes]
   * are returned.
   * The maximum number of allowed characters is 255.
   * </pre>
   *
   * <code>repeated string language_codes = 3;</code>
   */
  com.google.protobuf.ByteString
      getLanguageCodesBytes(int index);

  /**
   * <pre>
   * Required. Completion result count.
   * The maximum allowed page size is 10.
   * </pre>
   *
   * <code>int32 page_size = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getPageSize();

  /**
   * <pre>
   * If provided, restricts completion to specified company.
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/companies/{company_id}", for
   * example, "projects/foo/tenants/bar/companies/baz".
   * If tenant id is unspecified, the default tenant is used, for
   * example, "projects/foo".
   * </pre>
   *
   * <code>string company = 5;</code>
   */
  java.lang.String getCompany();
  /**
   * <pre>
   * If provided, restricts completion to specified company.
   * The format is
   * "projects/{project_id}/tenants/{tenant_id}/companies/{company_id}", for
   * example, "projects/foo/tenants/bar/companies/baz".
   * If tenant id is unspecified, the default tenant is used, for
   * example, "projects/foo".
   * </pre>
   *
   * <code>string company = 5;</code>
   */
  com.google.protobuf.ByteString
      getCompanyBytes();

  /**
   * <pre>
   * The scope of the completion. The defaults is
   * [CompletionScope.PUBLIC][google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionScope.PUBLIC].
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionScope scope = 6;</code>
   */
  int getScopeValue();
  /**
   * <pre>
   * The scope of the completion. The defaults is
   * [CompletionScope.PUBLIC][google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionScope.PUBLIC].
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionScope scope = 6;</code>
   */
  com.google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionScope getScope();

  /**
   * <pre>
   * The completion topic. The default is
   * [CompletionType.COMBINED][google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType.COMBINED].
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType type = 7;</code>
   */
  int getTypeValue();
  /**
   * <pre>
   * The completion topic. The default is
   * [CompletionType.COMBINED][google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType.COMBINED].
   * </pre>
   *
   * <code>.google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType type = 7;</code>
   */
  com.google.cloud.talent.v4beta1.CompleteQueryRequest.CompletionType getType();
}
