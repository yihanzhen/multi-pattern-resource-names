<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/logging/v2/logging.proto

namespace Google\Cloud\Logging\V2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * The parameters to DeleteLog.
 *
 * Generated from protobuf message <code>google.logging.v2.DeleteLogRequest</code>
 */
class DeleteLogRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Required. The resource name of the log to delete:
     *     "projects/[PROJECT_ID]/logs/[LOG_ID]"
     *     "organizations/[ORGANIZATION_ID]/logs/[LOG_ID]"
     *     "billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID]"
     *     "folders/[FOLDER_ID]/logs/[LOG_ID]"
     * `[LOG_ID]` must be URL-encoded. For example,
     * `"projects/my-project-id/logs/syslog"`,
     * `"organizations/1234567890/logs/cloudresourcemanager.googleapis.com%2Factivity"`.
     * For more information about log names, see
     * [LogEntry][google.logging.v2.LogEntry].
     *
     * Generated from protobuf field <code>string log_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = {</code>
     */
    protected $log_name = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $log_name
     *           Required. The resource name of the log to delete:
     *               "projects/[PROJECT_ID]/logs/[LOG_ID]"
     *               "organizations/[ORGANIZATION_ID]/logs/[LOG_ID]"
     *               "billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID]"
     *               "folders/[FOLDER_ID]/logs/[LOG_ID]"
     *           `[LOG_ID]` must be URL-encoded. For example,
     *           `"projects/my-project-id/logs/syslog"`,
     *           `"organizations/1234567890/logs/cloudresourcemanager.googleapis.com%2Factivity"`.
     *           For more information about log names, see
     *           [LogEntry][google.logging.v2.LogEntry].
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Logging\V2\Logging::initOnce();
        parent::__construct($data);
    }

    /**
     * Required. The resource name of the log to delete:
     *     "projects/[PROJECT_ID]/logs/[LOG_ID]"
     *     "organizations/[ORGANIZATION_ID]/logs/[LOG_ID]"
     *     "billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID]"
     *     "folders/[FOLDER_ID]/logs/[LOG_ID]"
     * `[LOG_ID]` must be URL-encoded. For example,
     * `"projects/my-project-id/logs/syslog"`,
     * `"organizations/1234567890/logs/cloudresourcemanager.googleapis.com%2Factivity"`.
     * For more information about log names, see
     * [LogEntry][google.logging.v2.LogEntry].
     *
     * Generated from protobuf field <code>string log_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = {</code>
     * @return string
     */
    public function getLogName()
    {
        return $this->log_name;
    }

    /**
     * Required. The resource name of the log to delete:
     *     "projects/[PROJECT_ID]/logs/[LOG_ID]"
     *     "organizations/[ORGANIZATION_ID]/logs/[LOG_ID]"
     *     "billingAccounts/[BILLING_ACCOUNT_ID]/logs/[LOG_ID]"
     *     "folders/[FOLDER_ID]/logs/[LOG_ID]"
     * `[LOG_ID]` must be URL-encoded. For example,
     * `"projects/my-project-id/logs/syslog"`,
     * `"organizations/1234567890/logs/cloudresourcemanager.googleapis.com%2Factivity"`.
     * For more information about log names, see
     * [LogEntry][google.logging.v2.LogEntry].
     *
     * Generated from protobuf field <code>string log_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = {</code>
     * @param string $var
     * @return $this
     */
    public function setLogName($var)
    {
        GPBUtil::checkString($var, True);
        $this->log_name = $var;

        return $this;
    }

}

