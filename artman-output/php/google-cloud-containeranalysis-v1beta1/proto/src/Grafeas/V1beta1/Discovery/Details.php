<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1beta1/discovery/discovery.proto

namespace Grafeas\V1beta1\Discovery;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Details of a discovery occurrence.
 *
 * Generated from protobuf message <code>grafeas.v1beta1.discovery.Details</code>
 */
final class Details extends \Google\Protobuf\Internal\Message
{
    /**
     * Analysis status for the discovered resource.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.discovery.Discovered discovered = 1;</code>
     */
    private $discovered = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Grafeas\V1beta1\Discovery\Discovered $discovered
     *           Analysis status for the discovered resource.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Devtools\Containeranalysis\V1Beta1\Discovery\Discovery::initOnce();
        parent::__construct($data);
    }

    /**
     * Analysis status for the discovered resource.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.discovery.Discovered discovered = 1;</code>
     * @return \Grafeas\V1beta1\Discovery\Discovered
     */
    public function getDiscovered()
    {
        return $this->discovered;
    }

    /**
     * Analysis status for the discovered resource.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.discovery.Discovered discovered = 1;</code>
     * @param \Grafeas\V1beta1\Discovery\Discovered $var
     * @return $this
     */
    public function setDiscovered($var)
    {
        GPBUtil::checkMessage($var, \Grafeas\V1beta1\Discovery\Discovered::class);
        $this->discovered = $var;

        return $this;
    }

}

