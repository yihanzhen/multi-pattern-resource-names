<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/securitycenter/v1beta1/securitycenter_service.proto

namespace Google\Cloud\Securitycenter\V1beta1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Request message for getting a source.
 *
 * Generated from protobuf message <code>google.cloud.securitycenter.v1beta1.GetSourceRequest</code>
 */
final class GetSourceRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Relative resource name of the source. Its format is
     * "organizations/[organization_id]/source/[source_id]".
     *
     * Generated from protobuf field <code>string name = 1;</code>
     */
    private $name = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $name
     *           Relative resource name of the source. Its format is
     *           "organizations/[organization_id]/source/[source_id]".
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Cloud\Securitycenter\V1Beta1\SecuritycenterService::initOnce();
        parent::__construct($data);
    }

    /**
     * Relative resource name of the source. Its format is
     * "organizations/[organization_id]/source/[source_id]".
     *
     * Generated from protobuf field <code>string name = 1;</code>
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * Relative resource name of the source. Its format is
     * "organizations/[organization_id]/source/[source_id]".
     *
     * Generated from protobuf field <code>string name = 1;</code>
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

