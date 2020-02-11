<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/bigquery/datatransfer/v1/datatransfer.proto

namespace Google\Cloud\BigQuery\DataTransfer\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * A request to get data transfer information.
 *
 * Generated from protobuf message <code>google.cloud.bigquery.datatransfer.v1.GetTransferConfigRequest</code>
 */
class GetTransferConfigRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Required. The field will contain name of the resource requested, for example:
     * `projects/{project_id}/transferConfigs/{config_id}` or
     * `projects/{project_id}/locations/{location_id}/transferConfigs/{config_id}`
     *
     * Generated from protobuf field <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = {</code>
     */
    protected $name = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $name
     *           Required. The field will contain name of the resource requested, for example:
     *           `projects/{project_id}/transferConfigs/{config_id}` or
     *           `projects/{project_id}/locations/{location_id}/transferConfigs/{config_id}`
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Cloud\Bigquery\Datatransfer\V1\Datatransfer::initOnce();
        parent::__construct($data);
    }

    /**
     * Required. The field will contain name of the resource requested, for example:
     * `projects/{project_id}/transferConfigs/{config_id}` or
     * `projects/{project_id}/locations/{location_id}/transferConfigs/{config_id}`
     *
     * Generated from protobuf field <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = {</code>
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * Required. The field will contain name of the resource requested, for example:
     * `projects/{project_id}/transferConfigs/{config_id}` or
     * `projects/{project_id}/locations/{location_id}/transferConfigs/{config_id}`
     *
     * Generated from protobuf field <code>string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = {</code>
     * @param string $var
     * @return $this
     */
    public function setName($var)
    {
        GPBUtil::checkString($var, True);
        $this->name = $var;

        return $this;
    }

}

