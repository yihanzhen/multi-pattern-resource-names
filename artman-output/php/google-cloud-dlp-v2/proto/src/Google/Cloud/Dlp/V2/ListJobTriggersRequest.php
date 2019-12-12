<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/privacy/dlp/v2/dlp.proto

namespace Google\Cloud\Dlp\V2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Request message for ListJobTriggers.
 *
 * Generated from protobuf message <code>google.privacy.dlp.v2.ListJobTriggersRequest</code>
 */
final class ListJobTriggersRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Required. The parent resource name, for example `projects/my-project-id`.
     *
     * Generated from protobuf field <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = {</code>
     */
    private $parent = '';
    /**
     * Optional page token to continue retrieval. Comes from previous call
     * to ListJobTriggers. `order_by` field must not
     * change for subsequent calls.
     *
     * Generated from protobuf field <code>string page_token = 2;</code>
     */
    private $page_token = '';
    /**
     * Optional size of the page, can be limited by a server.
     *
     * Generated from protobuf field <code>int32 page_size = 3;</code>
     */
    private $page_size = 0;
    /**
     * Optional comma separated list of triggeredJob fields to order by,
     * followed by `asc` or `desc` postfix. This list is case-insensitive,
     * default sorting order is ascending, redundant space characters are
     * insignificant.
     * Example: `name asc,update_time, create_time desc`
     * Supported fields are:
     * - `create_time`: corresponds to time the JobTrigger was created.
     * - `update_time`: corresponds to time the JobTrigger was last updated.
     * - `last_run_time`: corresponds to the last time the JobTrigger ran.
     * - `name`: corresponds to JobTrigger's name.
     * - `display_name`: corresponds to JobTrigger's display name.
     * - `status`: corresponds to JobTrigger's status.
     *
     * Generated from protobuf field <code>string order_by = 4;</code>
     */
    private $order_by = '';
    /**
     * Optional. Allows filtering.
     * Supported syntax:
     * * Filter expressions are made up of one or more restrictions.
     * * Restrictions can be combined by `AND` or `OR` logical operators. A
     * sequence of restrictions implicitly uses `AND`.
     * * A restriction has the form of `<field> <operator> <value>`.
     * * Supported fields/values for inspect jobs:
     *     - `status` - HEALTHY|PAUSED|CANCELLED
     *     - `inspected_storage` - DATASTORE|CLOUD_STORAGE|BIGQUERY
     *     - 'last_run_time` - RFC 3339 formatted timestamp, surrounded by
     *     quotation marks. Nanoseconds are ignored.
     *     - 'error_count' - Number of errors that have occurred while running.
     * * The operator must be `=` or `!=` for status and inspected_storage.
     * Examples:
     * * inspected_storage = cloud_storage AND status = HEALTHY
     * * inspected_storage = cloud_storage OR inspected_storage = bigquery
     * * inspected_storage = cloud_storage AND (state = PAUSED OR state = HEALTHY)
     * * last_run_time > \"2017-12-12T00:00:00+00:00\"
     * The length of this field should be no more than 500 characters.
     *
     * Generated from protobuf field <code>string filter = 5;</code>
     */
    private $filter = '';
    /**
     * The geographic location where job triggers will be retrieved from.
     * Use `-` for all locations. Reserved for future extensions.
     *
     * Generated from protobuf field <code>string location_id = 7;</code>
     */
    private $location_id = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $parent
     *           Required. The parent resource name, for example `projects/my-project-id`.
     *     @type string $page_token
     *           Optional page token to continue retrieval. Comes from previous call
     *           to ListJobTriggers. `order_by` field must not
     *           change for subsequent calls.
     *     @type int $page_size
     *           Optional size of the page, can be limited by a server.
     *     @type string $order_by
     *           Optional comma separated list of triggeredJob fields to order by,
     *           followed by `asc` or `desc` postfix. This list is case-insensitive,
     *           default sorting order is ascending, redundant space characters are
     *           insignificant.
     *           Example: `name asc,update_time, create_time desc`
     *           Supported fields are:
     *           - `create_time`: corresponds to time the JobTrigger was created.
     *           - `update_time`: corresponds to time the JobTrigger was last updated.
     *           - `last_run_time`: corresponds to the last time the JobTrigger ran.
     *           - `name`: corresponds to JobTrigger's name.
     *           - `display_name`: corresponds to JobTrigger's display name.
     *           - `status`: corresponds to JobTrigger's status.
     *     @type string $filter
     *           Optional. Allows filtering.
     *           Supported syntax:
     *           * Filter expressions are made up of one or more restrictions.
     *           * Restrictions can be combined by `AND` or `OR` logical operators. A
     *           sequence of restrictions implicitly uses `AND`.
     *           * A restriction has the form of `<field> <operator> <value>`.
     *           * Supported fields/values for inspect jobs:
     *               - `status` - HEALTHY|PAUSED|CANCELLED
     *               - `inspected_storage` - DATASTORE|CLOUD_STORAGE|BIGQUERY
     *               - 'last_run_time` - RFC 3339 formatted timestamp, surrounded by
     *               quotation marks. Nanoseconds are ignored.
     *               - 'error_count' - Number of errors that have occurred while running.
     *           * The operator must be `=` or `!=` for status and inspected_storage.
     *           Examples:
     *           * inspected_storage = cloud_storage AND status = HEALTHY
     *           * inspected_storage = cloud_storage OR inspected_storage = bigquery
     *           * inspected_storage = cloud_storage AND (state = PAUSED OR state = HEALTHY)
     *           * last_run_time > \"2017-12-12T00:00:00+00:00\"
     *           The length of this field should be no more than 500 characters.
     *     @type string $location_id
     *           The geographic location where job triggers will be retrieved from.
     *           Use `-` for all locations. Reserved for future extensions.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Privacy\Dlp\V2\Dlp::initOnce();
        parent::__construct($data);
    }

    /**
     * Required. The parent resource name, for example `projects/my-project-id`.
     *
     * Generated from protobuf field <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = {</code>
     * @return string
     */
    public function getParent()
    {
        return $this->parent;
    }

    /**
     * Required. The parent resource name, for example `projects/my-project-id`.
     *
     * Generated from protobuf field <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = {</code>
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
     * Optional page token to continue retrieval. Comes from previous call
     * to ListJobTriggers. `order_by` field must not
     * change for subsequent calls.
     *
     * Generated from protobuf field <code>string page_token = 2;</code>
     * @return string
     */
    public function getPageToken()
    {
        return $this->page_token;
    }

    /**
     * Optional page token to continue retrieval. Comes from previous call
     * to ListJobTriggers. `order_by` field must not
     * change for subsequent calls.
     *
     * Generated from protobuf field <code>string page_token = 2;</code>
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
     * Optional size of the page, can be limited by a server.
     *
     * Generated from protobuf field <code>int32 page_size = 3;</code>
     * @return int
     */
    public function getPageSize()
    {
        return $this->page_size;
    }

    /**
     * Optional size of the page, can be limited by a server.
     *
     * Generated from protobuf field <code>int32 page_size = 3;</code>
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
     * Optional comma separated list of triggeredJob fields to order by,
     * followed by `asc` or `desc` postfix. This list is case-insensitive,
     * default sorting order is ascending, redundant space characters are
     * insignificant.
     * Example: `name asc,update_time, create_time desc`
     * Supported fields are:
     * - `create_time`: corresponds to time the JobTrigger was created.
     * - `update_time`: corresponds to time the JobTrigger was last updated.
     * - `last_run_time`: corresponds to the last time the JobTrigger ran.
     * - `name`: corresponds to JobTrigger's name.
     * - `display_name`: corresponds to JobTrigger's display name.
     * - `status`: corresponds to JobTrigger's status.
     *
     * Generated from protobuf field <code>string order_by = 4;</code>
     * @return string
     */
    public function getOrderBy()
    {
        return $this->order_by;
    }

    /**
     * Optional comma separated list of triggeredJob fields to order by,
     * followed by `asc` or `desc` postfix. This list is case-insensitive,
     * default sorting order is ascending, redundant space characters are
     * insignificant.
     * Example: `name asc,update_time, create_time desc`
     * Supported fields are:
     * - `create_time`: corresponds to time the JobTrigger was created.
     * - `update_time`: corresponds to time the JobTrigger was last updated.
     * - `last_run_time`: corresponds to the last time the JobTrigger ran.
     * - `name`: corresponds to JobTrigger's name.
     * - `display_name`: corresponds to JobTrigger's display name.
     * - `status`: corresponds to JobTrigger's status.
     *
     * Generated from protobuf field <code>string order_by = 4;</code>
     * @param string $var
     * @return $this
     */
    public function setOrderBy($var)
    {
        GPBUtil::checkString($var, True);
        $this->order_by = $var;

        return $this;
    }

    /**
     * Optional. Allows filtering.
     * Supported syntax:
     * * Filter expressions are made up of one or more restrictions.
     * * Restrictions can be combined by `AND` or `OR` logical operators. A
     * sequence of restrictions implicitly uses `AND`.
     * * A restriction has the form of `<field> <operator> <value>`.
     * * Supported fields/values for inspect jobs:
     *     - `status` - HEALTHY|PAUSED|CANCELLED
     *     - `inspected_storage` - DATASTORE|CLOUD_STORAGE|BIGQUERY
     *     - 'last_run_time` - RFC 3339 formatted timestamp, surrounded by
     *     quotation marks. Nanoseconds are ignored.
     *     - 'error_count' - Number of errors that have occurred while running.
     * * The operator must be `=` or `!=` for status and inspected_storage.
     * Examples:
     * * inspected_storage = cloud_storage AND status = HEALTHY
     * * inspected_storage = cloud_storage OR inspected_storage = bigquery
     * * inspected_storage = cloud_storage AND (state = PAUSED OR state = HEALTHY)
     * * last_run_time > \"2017-12-12T00:00:00+00:00\"
     * The length of this field should be no more than 500 characters.
     *
     * Generated from protobuf field <code>string filter = 5;</code>
     * @return string
     */
    public function getFilter()
    {
        return $this->filter;
    }

    /**
     * Optional. Allows filtering.
     * Supported syntax:
     * * Filter expressions are made up of one or more restrictions.
     * * Restrictions can be combined by `AND` or `OR` logical operators. A
     * sequence of restrictions implicitly uses `AND`.
     * * A restriction has the form of `<field> <operator> <value>`.
     * * Supported fields/values for inspect jobs:
     *     - `status` - HEALTHY|PAUSED|CANCELLED
     *     - `inspected_storage` - DATASTORE|CLOUD_STORAGE|BIGQUERY
     *     - 'last_run_time` - RFC 3339 formatted timestamp, surrounded by
     *     quotation marks. Nanoseconds are ignored.
     *     - 'error_count' - Number of errors that have occurred while running.
     * * The operator must be `=` or `!=` for status and inspected_storage.
     * Examples:
     * * inspected_storage = cloud_storage AND status = HEALTHY
     * * inspected_storage = cloud_storage OR inspected_storage = bigquery
     * * inspected_storage = cloud_storage AND (state = PAUSED OR state = HEALTHY)
     * * last_run_time > \"2017-12-12T00:00:00+00:00\"
     * The length of this field should be no more than 500 characters.
     *
     * Generated from protobuf field <code>string filter = 5;</code>
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
     * The geographic location where job triggers will be retrieved from.
     * Use `-` for all locations. Reserved for future extensions.
     *
     * Generated from protobuf field <code>string location_id = 7;</code>
     * @return string
     */
    public function getLocationId()
    {
        return $this->location_id;
    }

    /**
     * The geographic location where job triggers will be retrieved from.
     * Use `-` for all locations. Reserved for future extensions.
     *
     * Generated from protobuf field <code>string location_id = 7;</code>
     * @param string $var
     * @return $this
     */
    public function setLocationId($var)
    {
        GPBUtil::checkString($var, True);
        $this->location_id = $var;

        return $this;
    }

}

