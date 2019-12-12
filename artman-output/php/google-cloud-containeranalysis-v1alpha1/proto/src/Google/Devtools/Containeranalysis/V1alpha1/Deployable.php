<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1alpha1/containeranalysis.proto

namespace Google\Devtools\Containeranalysis\V1alpha1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * An artifact that can be deployed in some runtime.
 *
 * Generated from protobuf message <code>google.devtools.containeranalysis.v1alpha1.Deployable</code>
 */
final class Deployable extends \Google\Protobuf\Internal\Message
{
    /**
     * Resource URI for the artifact being deployed.
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
     *           Resource URI for the artifact being deployed.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Devtools\Containeranalysis\V1Alpha1\Containeranalysis::initOnce();
        parent::__construct($data);
    }

    /**
     * Resource URI for the artifact being deployed.
     *
     * Generated from protobuf field <code>repeated string resource_uri = 1;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getResourceUri()
    {
        return $this->resource_uri;
    }

    /**
     * Resource URI for the artifact being deployed.
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

