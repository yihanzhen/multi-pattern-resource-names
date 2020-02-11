<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/securitycenter/v1beta1/securitycenter_service.proto

namespace Google\Cloud\Securitycenter\V1beta1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Result containing the properties and count of a groupBy request.
 *
 * Generated from protobuf message <code>google.cloud.securitycenter.v1beta1.GroupResult</code>
 */
class GroupResult extends \Google\Protobuf\Internal\Message
{
    /**
     * Properties matching the groupBy fields in the request.
     *
     * Generated from protobuf field <code>map<string, .google.protobuf.Value> properties = 1;</code>
     */
    private $properties;
    /**
     * Total count of resources for the given properties.
     *
     * Generated from protobuf field <code>int64 count = 2;</code>
     */
    protected $count = 0;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type array|\Google\Protobuf\Internal\MapField $properties
     *           Properties matching the groupBy fields in the request.
     *     @type int|string $count
     *           Total count of resources for the given properties.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Cloud\Securitycenter\V1Beta1\SecuritycenterService::initOnce();
        parent::__construct($data);
    }

    /**
     * Properties matching the groupBy fields in the request.
     *
     * Generated from protobuf field <code>map<string, .google.protobuf.Value> properties = 1;</code>
     * @return \Google\Protobuf\Internal\MapField
     */
    public function getProperties()
    {
        return $this->properties;
    }

    /**
     * Properties matching the groupBy fields in the request.
     *
     * Generated from protobuf field <code>map<string, .google.protobuf.Value> properties = 1;</code>
     * @param array|\Google\Protobuf\Internal\MapField $var
     * @return $this
     */
    public function setProperties($var)
    {
        $arr = GPBUtil::checkMapField($var, \Google\Protobuf\Internal\GPBType::STRING, \Google\Protobuf\Internal\GPBType::MESSAGE, \Google\Protobuf\Value::class);
        $this->properties = $arr;

        return $this;
    }

    /**
     * Total count of resources for the given properties.
     *
     * Generated from protobuf field <code>int64 count = 2;</code>
     * @return int|string
     */
    public function getCount()
    {
        return $this->count;
    }

    /**
     * Total count of resources for the given properties.
     *
     * Generated from protobuf field <code>int64 count = 2;</code>
     * @param int|string $var
     * @return $this
     */
    public function setCount($var)
    {
        GPBUtil::checkInt64($var);
        $this->count = $var;

        return $this;
    }

}

