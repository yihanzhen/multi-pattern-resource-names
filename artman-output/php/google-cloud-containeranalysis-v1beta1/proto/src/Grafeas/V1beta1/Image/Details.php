<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1beta1/image/image.proto

namespace Grafeas\V1beta1\Image;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Details of an image occurrence.
 *
 * Generated from protobuf message <code>grafeas.v1beta1.image.Details</code>
 */
class Details extends \Google\Protobuf\Internal\Message
{
    /**
     * Required. Immutable. The child image derived from the base image.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.image.Derived derived_image = 1;</code>
     */
    protected $derived_image = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Grafeas\V1beta1\Image\Derived $derived_image
     *           Required. Immutable. The child image derived from the base image.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Devtools\Containeranalysis\V1Beta1\Image\Image::initOnce();
        parent::__construct($data);
    }

    /**
     * Required. Immutable. The child image derived from the base image.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.image.Derived derived_image = 1;</code>
     * @return \Grafeas\V1beta1\Image\Derived
     */
    public function getDerivedImage()
    {
        return $this->derived_image;
    }

    /**
     * Required. Immutable. The child image derived from the base image.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.image.Derived derived_image = 1;</code>
     * @param \Grafeas\V1beta1\Image\Derived $var
     * @return $this
     */
    public function setDerivedImage($var)
    {
        GPBUtil::checkMessage($var, \Grafeas\V1beta1\Image\Derived::class);
        $this->derived_image = $var;

        return $this;
    }

}

