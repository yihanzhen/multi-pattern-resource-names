<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1beta1/deployment/deployment.proto

namespace Grafeas\V1beta1\Deployment;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Details of a deployment occurrence.
 *
 * Generated from protobuf message <code>grafeas.v1beta1.deployment.Details</code>
 */
final class Details extends \Google\Protobuf\Internal\Message
{
    /**
     * Deployment history for the resource.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.deployment.Deployment deployment = 1;</code>
     */
    private $deployment = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Grafeas\V1beta1\Deployment\Deployment $deployment
     *           Deployment history for the resource.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Devtools\Containeranalysis\V1Beta1\Deployment\Deployment::initOnce();
        parent::__construct($data);
    }

    /**
     * Deployment history for the resource.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.deployment.Deployment deployment = 1;</code>
     * @return \Grafeas\V1beta1\Deployment\Deployment
     */
    public function getDeployment()
    {
        return $this->deployment;
    }

    /**
     * Deployment history for the resource.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.deployment.Deployment deployment = 1;</code>
     * @param \Grafeas\V1beta1\Deployment\Deployment $var
     * @return $this
     */
    public function setDeployment($var)
    {
        GPBUtil::checkMessage($var, \Grafeas\V1beta1\Deployment\Deployment::class);
        $this->deployment = $var;

        return $this;
    }

}

