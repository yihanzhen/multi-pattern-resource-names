<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/talent/v4beta1/job_service.proto

namespace Google\Cloud\Talent\V4beta1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * List jobs request.
 *
 * Generated from protobuf message <code>google.cloud.talent.v4beta1.ListJobsRequest</code>
 */
final class ListJobsRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Required. The resource name of the tenant under which the job is created.
     * The format is "projects/{project_id}/tenants/{tenant_id}". For example,
     * "projects/foo/tenant/bar". If tenant id is unspecified, a default tenant
     * is created. For example, "projects/foo".
     *
     * Generated from protobuf field <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private $parent = '';
    /**
     * Required. The filter string specifies the jobs to be enumerated.
     * Supported operator: =, AND
     * The fields eligible for filtering are:
     * * `companyName` (Required)
     * * `requisitionId`
     * * `status` Available values: OPEN, EXPIRED, ALL. Defaults to
     * OPEN if no value is specified.
     * Sample Query:
     * * companyName = "projects/foo/tenants/bar/companies/baz"
     * * companyName = "projects/foo/tenants/bar/companies/baz" AND
     * requisitionId = "req-1"
     * * companyName = "projects/foo/tenants/bar/companies/baz" AND
     * status = "EXPIRED"
     *
     * Generated from protobuf field <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private $filter = '';
    /**
     * The starting point of a query result.
     *
     * Generated from protobuf field <code>string page_token = 3;</code>
     */
    private $page_token = '';
    /**
     * The maximum number of jobs to be returned per page of results.
     * If [job_view][google.cloud.talent.v4beta1.ListJobsRequest.job_view] is set
     * to
     * [JobView.JOB_VIEW_ID_ONLY][google.cloud.talent.v4beta1.JobView.JOB_VIEW_ID_ONLY],
     * the maximum allowed page size is 1000. Otherwise, the maximum allowed page
     * size is 100.
     * Default is 100 if empty or a number < 1 is specified.
     *
     * Generated from protobuf field <code>int32 page_size = 4;</code>
     */
    private $page_size = 0;
    /**
     * The desired job attributes returned for jobs in the
     * search response. Defaults to
     * [JobView.JOB_VIEW_FULL][google.cloud.talent.v4beta1.JobView.JOB_VIEW_FULL]
     * if no value is specified.
     *
     * Generated from protobuf field <code>.google.cloud.talent.v4beta1.JobView job_view = 5;</code>
     */
    private $job_view = 0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $parent
     *           Required. The resource name of the tenant under which the job is created.
     *           The format is "projects/{project_id}/tenants/{tenant_id}". For example,
     *           "projects/foo/tenant/bar". If tenant id is unspecified, a default tenant
     *           is created. For example, "projects/foo".
     *     @type string $filter
     *           Required. The filter string specifies the jobs to be enumerated.
     *           Supported operator: =, AND
     *           The fields eligible for filtering are:
     *           * `companyName` (Required)
     *           * `requisitionId`
     *           * `status` Available values: OPEN, EXPIRED, ALL. Defaults to
     *           OPEN if no value is specified.
     *           Sample Query:
     *           * companyName = "projects/foo/tenants/bar/companies/baz"
     *           * companyName = "projects/foo/tenants/bar/companies/baz" AND
     *           requisitionId = "req-1"
     *           * companyName = "projects/foo/tenants/bar/companies/baz" AND
     *           status = "EXPIRED"
     *     @type string $page_token
     *           The starting point of a query result.
     *     @type int $page_size
     *           The maximum number of jobs to be returned per page of results.
     *           If [job_view][google.cloud.talent.v4beta1.ListJobsRequest.job_view] is set
     *           to
     *           [JobView.JOB_VIEW_ID_ONLY][google.cloud.talent.v4beta1.JobView.JOB_VIEW_ID_ONLY],
     *           the maximum allowed page size is 1000. Otherwise, the maximum allowed page
     *           size is 100.
     *           Default is 100 if empty or a number < 1 is specified.
     *     @type int $job_view
     *           The desired job attributes returned for jobs in the
     *           search response. Defaults to
     *           [JobView.JOB_VIEW_FULL][google.cloud.talent.v4beta1.JobView.JOB_VIEW_FULL]
     *           if no value is specified.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Cloud\Talent\V4Beta1\JobService::initOnce();
        parent::__construct($data);
    }

    /**
     * Required. The resource name of the tenant under which the job is created.
     * The format is "projects/{project_id}/tenants/{tenant_id}". For example,
     * "projects/foo/tenant/bar". If tenant id is unspecified, a default tenant
     * is created. For example, "projects/foo".
     *
     * Generated from protobuf field <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return string
     */
    public function getParent()
    {
        return $this->parent;
    }

    /**
     * Required. The resource name of the tenant under which the job is created.
     * The format is "projects/{project_id}/tenants/{tenant_id}". For example,
     * "projects/foo/tenant/bar". If tenant id is unspecified, a default tenant
     * is created. For example, "projects/foo".
     *
     * Generated from protobuf field <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param string $var
     * @return $this
     */
    public function setParent($var)
    {
        GPBUtil::checkString($var, True);
        $this->parent = $var;

        return $this;
    }

    /**
     * Required. The filter string specifies the jobs to be enumerated.
     * Supported operator: =, AND
     * The fields eligible for filtering are:
     * * `companyName` (Required)
     * * `requisitionId`
     * * `status` Available values: OPEN, EXPIRED, ALL. Defaults to
     * OPEN if no value is specified.
     * Sample Query:
     * * companyName = "projects/foo/tenants/bar/companies/baz"
     * * companyName = "projects/foo/tenants/bar/companies/baz" AND
     * requisitionId = "req-1"
     * * companyName = "projects/foo/tenants/bar/companies/baz" AND
     * status = "EXPIRED"
     *
     * Generated from protobuf field <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return string
     */
    public function getFilter()
    {
        return $this->filter;
    }

    /**
     * Required. The filter string specifies the jobs to be enumerated.
     * Supported operator: =, AND
     * The fields eligible for filtering are:
     * * `companyName` (Required)
     * * `requisitionId`
     * * `status` Available values: OPEN, EXPIRED, ALL. Defaults to
     * OPEN if no value is specified.
     * Sample Query:
     * * companyName = "projects/foo/tenants/bar/companies/baz"
     * * companyName = "projects/foo/tenants/bar/companies/baz" AND
     * requisitionId = "req-1"
     * * companyName = "projects/foo/tenants/bar/companies/baz" AND
     * status = "EXPIRED"
     *
     * Generated from protobuf field <code>string filter = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param string $var
     * @return $this
     */
    public function setFilter($var)
    {
        GPBUtil::checkString($var, True);
        $this->filter = $var;

        return $this;
    }

    /**
     * The starting point of a query result.
     *
     * Generated from protobuf field <code>string page_token = 3;</code>
     * @return string
     */
    public function getPageToken()
    {
        return $this->page_token;
    }

    /**
     * The starting point of a query result.
     *
     * Generated from protobuf field <code>string page_token = 3;</code>
     * @param string $var
     * @return $this
     */
    public function setPageToken($var)
    {
        GPBUtil::checkString($var, True);
        $this->page_token = $var;

        return $this;
    }

    /**
     * The maximum number of jobs to be returned per page of results.
     * If [job_view][google.cloud.talent.v4beta1.ListJobsRequest.job_view] is set
     * to
     * [JobView.JOB_VIEW_ID_ONLY][google.cloud.talent.v4beta1.JobView.JOB_VIEW_ID_ONLY],
     * the maximum allowed page size is 1000. Otherwise, the maximum allowed page
     * size is 100.
     * Default is 100 if empty or a number < 1 is specified.
     *
     * Generated from protobuf field <code>int32 page_size = 4;</code>
     * @return int
     */
    public function getPageSize()
    {
        return $this->page_size;
    }

    /**
     * The maximum number of jobs to be returned per page of results.
     * If [job_view][google.cloud.talent.v4beta1.ListJobsRequest.job_view] is set
     * to
     * [JobView.JOB_VIEW_ID_ONLY][google.cloud.talent.v4beta1.JobView.JOB_VIEW_ID_ONLY],
     * the maximum allowed page size is 1000. Otherwise, the maximum allowed page
     * size is 100.
     * Default is 100 if empty or a number < 1 is specified.
     *
     * Generated from protobuf field <code>int32 page_size = 4;</code>
     * @param int $var
     * @return $this
     */
    public function setPageSize($var)
    {
        GPBUtil::checkInt32($var);
        $this->page_size = $var;

        return $this;
    }

    /**
     * The desired job attributes returned for jobs in the
     * search response. Defaults to
     * [JobView.JOB_VIEW_FULL][google.cloud.talent.v4beta1.JobView.JOB_VIEW_FULL]
     * if no value is specified.
     *
     * Generated from protobuf field <code>.google.cloud.talent.v4beta1.JobView job_view = 5;</code>
     * @return int
     */
    public function getJobView()
    {
        return $this->job_view;
    }

    /**
     * The desired job attributes returned for jobs in the
     * search response. Defaults to
     * [JobView.JOB_VIEW_FULL][google.cloud.talent.v4beta1.JobView.JOB_VIEW_FULL]
     * if no value is specified.
     *
     * Generated from protobuf field <code>.google.cloud.talent.v4beta1.JobView job_view = 5;</code>
     * @param int $var
     * @return $this
     */
    public function setJobView($var)
    {
        GPBUtil::checkEnum($var, \Google\Cloud\Talent\V4beta1\JobView::class);
        $this->job_view = $var;

        return $this;
    }

}

