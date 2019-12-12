<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1beta1/attestation/attestation.proto

namespace Grafeas\V1beta1\Attestation;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Details of an attestation occurrence.
 *
 * Generated from protobuf message <code>grafeas.v1beta1.attestation.Details</code>
 */
final class Details extends \Google\Protobuf\Internal\Message
{
    /**
     * Attestation for the resource.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.attestation.Attestation attestation = 1;</code>
     */
    private $attestation = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Grafeas\V1beta1\Attestation\Attestation $attestation
     *           Attestation for the resource.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Devtools\Containeranalysis\V1Beta1\Attestation\Attestation::initOnce();
        parent::__construct($data);
    }

    /**
     * Attestation for the resource.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.attestation.Attestation attestation = 1;</code>
     * @return \Grafeas\V1beta1\Attestation\Attestation
     */
    public function getAttestation()
    {
        return $this->attestation;
    }

    /**
     * Attestation for the resource.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.attestation.Attestation attestation = 1;</code>
     * @param \Grafeas\V1beta1\Attestation\Attestation $var
     * @return $this
     */
    public function setAttestation($var)
    {
        GPBUtil::checkMessage($var, \Grafeas\V1beta1\Attestation\Attestation::class);
        $this->attestation = $var;

        return $this;
    }

}

