<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1beta1/attestation/attestation.proto

namespace Grafeas\V1beta1\Attestation;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Occurrence that represents a single "attestation". The authenticity of an
 * attestation can be verified using the attached signature. If the verifier
 * trusts the public key of the signer, then verifying the signature is
 * sufficient to establish trust. In this circumstance, the authority to which
 * this attestation is attached is primarily useful for look-up (how to find
 * this attestation if you already know the authority and artifact to be
 * verified) and intent (which authority was this attestation intended to sign
 * for).
 *
 * Generated from protobuf message <code>grafeas.v1beta1.attestation.Attestation</code>
 */
class Attestation extends \Google\Protobuf\Internal\Message
{
    protected $signature;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Grafeas\V1beta1\Attestation\PgpSignedAttestation $pgp_signed_attestation
     *           A PGP signed attestation.
     *     @type \Grafeas\V1beta1\Attestation\GenericSignedAttestation $generic_signed_attestation
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Devtools\Containeranalysis\V1Beta1\Attestation\Attestation::initOnce();
        parent::__construct($data);
    }

    /**
     * A PGP signed attestation.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.attestation.PgpSignedAttestation pgp_signed_attestation = 1;</code>
     * @return \Grafeas\V1beta1\Attestation\PgpSignedAttestation
     */
    public function getPgpSignedAttestation()
    {
        return $this->readOneof(1);
    }

    /**
     * A PGP signed attestation.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.attestation.PgpSignedAttestation pgp_signed_attestation = 1;</code>
     * @param \Grafeas\V1beta1\Attestation\PgpSignedAttestation $var
     * @return $this
     */
    public function setPgpSignedAttestation($var)
    {
        GPBUtil::checkMessage($var, \Grafeas\V1beta1\Attestation\PgpSignedAttestation::class);
        $this->writeOneof(1, $var);

        return $this;
    }

    /**
     * Generated from protobuf field <code>.grafeas.v1beta1.attestation.GenericSignedAttestation generic_signed_attestation = 2;</code>
     * @return \Grafeas\V1beta1\Attestation\GenericSignedAttestation
     */
    public function getGenericSignedAttestation()
    {
        return $this->readOneof(2);
    }

    /**
     * Generated from protobuf field <code>.grafeas.v1beta1.attestation.GenericSignedAttestation generic_signed_attestation = 2;</code>
     * @param \Grafeas\V1beta1\Attestation\GenericSignedAttestation $var
     * @return $this
     */
    public function setGenericSignedAttestation($var)
    {
        GPBUtil::checkMessage($var, \Grafeas\V1beta1\Attestation\GenericSignedAttestation::class);
        $this->writeOneof(2, $var);

        return $this;
    }

    /**
     * @return string
     */
    public function getSignature()
    {
        return $this->whichOneof("signature");
    }

}

