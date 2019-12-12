<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/privacy/dlp/v2/dlp.proto

namespace Google\Cloud\Dlp\V2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * This is a data encryption key (DEK) (as opposed to
 * a key encryption key (KEK) stored by KMS).
 * When using KMS to wrap/unwrap DEKs, be sure to set an appropriate
 * IAM policy on the KMS CryptoKey (KEK) to ensure an attacker cannot
 * unwrap the data crypto key.
 *
 * Generated from protobuf message <code>google.privacy.dlp.v2.CryptoKey</code>
 */
final class CryptoKey extends \Google\Protobuf\Internal\Message
{
    protected $source;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Google\Cloud\Dlp\V2\TransientCryptoKey $transient
     *     @type \Google\Cloud\Dlp\V2\UnwrappedCryptoKey $unwrapped
     *     @type \Google\Cloud\Dlp\V2\KmsWrappedCryptoKey $kms_wrapped
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Privacy\Dlp\V2\Dlp::initOnce();
        parent::__construct($data);
    }

    /**
     * Generated from protobuf field <code>.google.privacy.dlp.v2.TransientCryptoKey transient = 1;</code>
     * @return \Google\Cloud\Dlp\V2\TransientCryptoKey
     */
    public function getTransient()
    {
        return $this->readOneof(1);
    }

    /**
     * Generated from protobuf field <code>.google.privacy.dlp.v2.TransientCryptoKey transient = 1;</code>
     * @param \Google\Cloud\Dlp\V2\TransientCryptoKey $var
     * @return $this
     */
    public function setTransient($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dlp\V2\TransientCryptoKey::class);
        $this->writeOneof(1, $var);

        return $this;
    }

    /**
     * Generated from protobuf field <code>.google.privacy.dlp.v2.UnwrappedCryptoKey unwrapped = 2;</code>
     * @return \Google\Cloud\Dlp\V2\UnwrappedCryptoKey
     */
    public function getUnwrapped()
    {
        return $this->readOneof(2);
    }

    /**
     * Generated from protobuf field <code>.google.privacy.dlp.v2.UnwrappedCryptoKey unwrapped = 2;</code>
     * @param \Google\Cloud\Dlp\V2\UnwrappedCryptoKey $var
     * @return $this
     */
    public function setUnwrapped($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dlp\V2\UnwrappedCryptoKey::class);
        $this->writeOneof(2, $var);

        return $this;
    }

    /**
     * Generated from protobuf field <code>.google.privacy.dlp.v2.KmsWrappedCryptoKey kms_wrapped = 3;</code>
     * @return \Google\Cloud\Dlp\V2\KmsWrappedCryptoKey
     */
    public function getKmsWrapped()
    {
        return $this->readOneof(3);
    }

    /**
     * Generated from protobuf field <code>.google.privacy.dlp.v2.KmsWrappedCryptoKey kms_wrapped = 3;</code>
     * @param \Google\Cloud\Dlp\V2\KmsWrappedCryptoKey $var
     * @return $this
     */
    public function setKmsWrapped($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dlp\V2\KmsWrappedCryptoKey::class);
        $this->writeOneof(3, $var);

        return $this;
    }

    /**
     * @return string
     */
    public function getSource()
    {
        return $this->whichOneof("source");
    }

}

