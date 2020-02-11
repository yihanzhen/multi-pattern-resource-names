<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1beta1/deployment/deployment.proto

namespace Grafeas\V1beta1\Deployment;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * An artifact that can be deployed in some runtime.
 *
 * Generated from protobuf message <code>grafeas.v1beta1.deployment.Deployable</code>
 */
class Deployable extends \Google\Protobuf\Internal\Message
{
    /**
     * Required. Resource URI for the artifact being deployed.
     *
     * Generated from protobuf field <code>repeated string resource_uri = 1;</code>
     */
    private $resource_uri;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string[]|\Google\Protobuf\Internal\RepeatedField $resource_uri
     *           Required. Resource URI for the artifact being deployed.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Devtools\Containeranalysis\V1Beta1\Deployment\Deployment::initOnce();
        parent::__construct($data);
    }

    /**
     * Required. Resource URI for the artifact being deployed.
     *
     * Generated from protobuf field <code>repeated string resource_uri = 1;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getResourceUri()
    {
        return $this->resource_uri;
    }

    /**
     * Required. Resource URI for the artifact being deployed.
     *
     * Generated from protobuf field <code>repeated string resource_uri = 1;</code>
     * @param string[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setResourceUri($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::STRING);
        $this->resource_uri = $arr;

        return $this;
    }

}

