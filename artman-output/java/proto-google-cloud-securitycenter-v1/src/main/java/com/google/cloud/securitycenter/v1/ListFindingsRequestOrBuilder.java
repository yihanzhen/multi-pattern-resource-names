// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1/securitycenter_service.proto

package com.google.cloud.securitycenter.v1;

public interface ListFindingsRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1.ListFindingsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Name of the source the findings belong to. Its format is
   * "organizations/[organization_id]/sources/[source_id]". To list across all
   * sources provide a source_id of `-`. For example:
   * organizations/{organization_id}/sources/-
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. Name of the source the findings belong to. Its format is
   * "organizations/[organization_id]/sources/[source_id]". To list across all
   * sources provide a source_id of `-`. For example:
   * organizations/{organization_id}/sources/-
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Expression that defines the filter to apply across findings.
   * The expression is a list of one or more restrictions combined via logical
   * operators `AND` and `OR`.
   * Parentheses are supported, and `OR` has higher precedence than `AND`.
   * Restrictions have the form `&lt;field&gt; &lt;operator&gt; &lt;value&gt;` and may have a `-`
   * character in front of them to indicate negation. Examples include:
   *  * name
   *  * source_properties.a_property
   *  * security_marks.marks.marka
   * The supported operators are:
   * * `=` for all value types.
   * * `&gt;`, `&lt;`, `&gt;=`, `&lt;=` for integer values.
   * * `:`, meaning substring matching, for strings.
   * The supported value types are:
   * * string literals in quotes.
   * * integer literals without quotes.
   * * boolean literals `true` and `false` without quotes.
   * The following field and operator combinations are supported:
   * name: `=`
   * parent: `=`, `:`
   * resource_name: `=`, `:`
   * state: `=`, `:`
   * category: `=`, `:`
   * external_uri: `=`, `:`
   * event_time: `=`, `&gt;`, `&lt;`, `&gt;=`, `&lt;=`
   *   Usage: This should be milliseconds since epoch or an RFC3339 string.
   *   Examples:
   *     "event_time = &#92;"2019-06-10T16:07:18-07:00&#92;""
   *     "event_time = 1560208038000"
   * security_marks.marks: `=`, `:`
   * source_properties: `=`, `:`, `&gt;`, `&lt;`, `&gt;=`, `&lt;=`
   * For example, `source_properties.size = 100` is a valid filter string.
   * </pre>
   *
   * <code>string filter = 2;</code>
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   * <pre>
   * Expression that defines the filter to apply across findings.
   * The expression is a list of one or more restrictions combined via logical
   * operators `AND` and `OR`.
   * Parentheses are supported, and `OR` has higher precedence than `AND`.
   * Restrictions have the form `&lt;field&gt; &lt;operator&gt; &lt;value&gt;` and may have a `-`
   * character in front of them to indicate negation. Examples include:
   *  * name
   *  * source_properties.a_property
   *  * security_marks.marks.marka
   * The supported operators are:
   * * `=` for all value types.
   * * `&gt;`, `&lt;`, `&gt;=`, `&lt;=` for integer values.
   * * `:`, meaning substring matching, for strings.
   * The supported value types are:
   * * string literals in quotes.
   * * integer literals without quotes.
   * * boolean literals `true` and `false` without quotes.
   * The following field and operator combinations are supported:
   * name: `=`
   * parent: `=`, `:`
   * resource_name: `=`, `:`
   * state: `=`, `:`
   * category: `=`, `:`
   * external_uri: `=`, `:`
   * event_time: `=`, `&gt;`, `&lt;`, `&gt;=`, `&lt;=`
   *   Usage: This should be milliseconds since epoch or an RFC3339 string.
   *   Examples:
   *     "event_time = &#92;"2019-06-10T16:07:18-07:00&#92;""
   *     "event_time = 1560208038000"
   * security_marks.marks: `=`, `:`
   * source_properties: `=`, `:`, `&gt;`, `&lt;`, `&gt;=`, `&lt;=`
   * For example, `source_properties.size = 100` is a valid filter string.
   * </pre>
   *
   * <code>string filter = 2;</code>
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString
      getFilterBytes();

  /**
   * <pre>
   * Expression that defines what fields and order to use for sorting. The
   * string value should follow SQL syntax: comma separated list of fields. For
   * example: "name,resource_properties.a_property". The default sorting order
   * is ascending. To specify descending order for a field, a suffix " desc"
   * should be appended to the field name. For example: "name
   * desc,source_properties.a_property". Redundant space characters in the
   * syntax are insignificant. "name desc,source_properties.a_property" and "
   * name     desc  ,   source_properties.a_property  " are equivalent.
   * The following fields are supported:
   * name
   * parent
   * state
   * category
   * resource_name
   * event_time
   * source_properties
   * security_marks.marks
   * </pre>
   *
   * <code>string order_by = 3;</code>
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   * <pre>
   * Expression that defines what fields and order to use for sorting. The
   * string value should follow SQL syntax: comma separated list of fields. For
   * example: "name,resource_properties.a_property". The default sorting order
   * is ascending. To specify descending order for a field, a suffix " desc"
   * should be appended to the field name. For example: "name
   * desc,source_properties.a_property". Redundant space characters in the
   * syntax are insignificant. "name desc,source_properties.a_property" and "
   * name     desc  ,   source_properties.a_property  " are equivalent.
   * The following fields are supported:
   * name
   * parent
   * state
   * category
   * resource_name
   * event_time
   * source_properties
   * security_marks.marks
   * </pre>
   *
   * <code>string order_by = 3;</code>
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString
      getOrderByBytes();

  /**
   * <pre>
   * Time used as a reference point when filtering findings. The filter is
   * limited to findings existing at the supplied time and their values are
   * those at that specific time. Absence of this field will default to the
   * API's version of NOW.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 4;</code>
   * @return Whether the readTime field is set.
   */
  boolean hasReadTime();
  /**
   * <pre>
   * Time used as a reference point when filtering findings. The filter is
   * limited to findings existing at the supplied time and their values are
   * those at that specific time. Absence of this field will default to the
   * API's version of NOW.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 4;</code>
   * @return The readTime.
   */
  com.google.protobuf.Timestamp getReadTime();
  /**
   * <pre>
   * Time used as a reference point when filtering findings. The filter is
   * limited to findings existing at the supplied time and their values are
   * those at that specific time. Absence of this field will default to the
   * API's version of NOW.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp read_time = 4;</code>
   */
  com.google.protobuf.TimestampOrBuilder getReadTimeOrBuilder();

  /**
   * <pre>
   * When compare_duration is set, the ListFindingsResult's "state_change"
   * attribute is updated to indicate whether the finding had its state changed,
   * the finding's state remained unchanged, or if the finding was added in any
   * state during the compare_duration period of time that precedes the
   * read_time. This is the time between (read_time - compare_duration) and
   * read_time.
   * The state_change value is derived based on the presence and state of the
   * finding at the two points in time. Intermediate state changes between the
   * two times don't affect the result. For example, the results aren't affected
   * if the finding is made inactive and then active again.
   * Possible "state_change" values when compare_duration is specified:
   * * "CHANGED":   indicates that the finding was present and matched the given
   *                  filter at the start of compare_duration, but changed its
   *                  state at read_time.
   * * "UNCHANGED": indicates that the finding was present and matched the given
   *                  filter at the start of compare_duration and did not change
   *                  state at read_time.
   * * "ADDED":     indicates that the finding did not match the given filter or
   *                  was not present at the start of compare_duration, but was
   *                  present at read_time.
   * * "REMOVED":   indicates that the finding was present and matched the
   *                  filter at the start of compare_duration, but did not match
   *                  the filter at read_time.
   * If compare_duration is not specified, then the only possible state_change
   * is "UNUSED", which will be the state_change set for all findings present at
   * read_time.
   * </pre>
   *
   * <code>.google.protobuf.Duration compare_duration = 5;</code>
   * @return Whether the compareDuration field is set.
   */
  boolean hasCompareDuration();
  /**
   * <pre>
   * When compare_duration is set, the ListFindingsResult's "state_change"
   * attribute is updated to indicate whether the finding had its state changed,
   * the finding's state remained unchanged, or if the finding was added in any
   * state during the compare_duration period of time that precedes the
   * read_time. This is the time between (read_time - compare_duration) and
   * read_time.
   * The state_change value is derived based on the presence and state of the
   * finding at the two points in time. Intermediate state changes between the
   * two times don't affect the result. For example, the results aren't affected
   * if the finding is made inactive and then active again.
   * Possible "state_change" values when compare_duration is specified:
   * * "CHANGED":   indicates that the finding was present and matched the given
   *                  filter at the start of compare_duration, but changed its
   *                  state at read_time.
   * * "UNCHANGED": indicates that the finding was present and matched the given
   *                  filter at the start of compare_duration and did not change
   *                  state at read_time.
   * * "ADDED":     indicates that the finding did not match the given filter or
   *                  was not present at the start of compare_duration, but was
   *                  present at read_time.
   * * "REMOVED":   indicates that the finding was present and matched the
   *                  filter at the start of compare_duration, but did not match
   *                  the filter at read_time.
   * If compare_duration is not specified, then the only possible state_change
   * is "UNUSED", which will be the state_change set for all findings present at
   * read_time.
   * </pre>
   *
   * <code>.google.protobuf.Duration compare_duration = 5;</code>
   * @return The compareDuration.
   */
  com.google.protobuf.Duration getCompareDuration();
  /**
   * <pre>
   * When compare_duration is set, the ListFindingsResult's "state_change"
   * attribute is updated to indicate whether the finding had its state changed,
   * the finding's state remained unchanged, or if the finding was added in any
   * state during the compare_duration period of time that precedes the
   * read_time. This is the time between (read_time - compare_duration) and
   * read_time.
   * The state_change value is derived based on the presence and state of the
   * finding at the two points in time. Intermediate state changes between the
   * two times don't affect the result. For example, the results aren't affected
   * if the finding is made inactive and then active again.
   * Possible "state_change" values when compare_duration is specified:
   * * "CHANGED":   indicates that the finding was present and matched the given
   *                  filter at the start of compare_duration, but changed its
   *                  state at read_time.
   * * "UNCHANGED": indicates that the finding was present and matched the given
   *                  filter at the start of compare_duration and did not change
   *                  state at read_time.
   * * "ADDED":     indicates that the finding did not match the given filter or
   *                  was not present at the start of compare_duration, but was
   *                  present at read_time.
   * * "REMOVED":   indicates that the finding was present and matched the
   *                  filter at the start of compare_duration, but did not match
   *                  the filter at read_time.
   * If compare_duration is not specified, then the only possible state_change
   * is "UNUSED", which will be the state_change set for all findings present at
   * read_time.
   * </pre>
   *
   * <code>.google.protobuf.Duration compare_duration = 5;</code>
   */
  com.google.protobuf.DurationOrBuilder getCompareDurationOrBuilder();

  /**
   * <pre>
   * Optional. A field mask to specify the Finding fields to be listed in the
   * response. An empty field mask will list all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return Whether the fieldMask field is set.
   */
  boolean hasFieldMask();
  /**
   * <pre>
   * Optional. A field mask to specify the Finding fields to be listed in the
   * response. An empty field mask will list all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   * @return The fieldMask.
   */
  com.google.protobuf.FieldMask getFieldMask();
  /**
   * <pre>
   * Optional. A field mask to specify the Finding fields to be listed in the
   * response. An empty field mask will list all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask field_mask = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getFieldMaskOrBuilder();

  /**
   * <pre>
   * The value returned by the last `ListFindingsResponse`; indicates
   * that this is a continuation of a prior `ListFindings` call, and
   * that the system should return the next page of data.
   * </pre>
   *
   * <code>string page_token = 8;</code>
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   * <pre>
   * The value returned by the last `ListFindingsResponse`; indicates
   * that this is a continuation of a prior `ListFindings` call, and
   * that the system should return the next page of data.
   * </pre>
   *
   * <code>string page_token = 8;</code>
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString
      getPageTokenBytes();

  /**
   * <pre>
   * The maximum number of results to return in a single response. Default is
   * 10, minimum is 1, maximum is 1000.
   * </pre>
   *
   * <code>int32 page_size = 9;</code>
   * @return The pageSize.
   */
  int getPageSize();
}
