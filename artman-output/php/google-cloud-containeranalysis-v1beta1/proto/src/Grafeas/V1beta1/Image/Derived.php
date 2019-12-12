<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1beta1/image/image.proto

namespace Grafeas\V1beta1\Image;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Derived describes the derived image portion (Occurrence) of the DockerImage
 * relationship. This image would be produced from a Dockerfile with FROM
 * <DockerImage.Basis in attached Note>.
 *
 * Generated from protobuf message <code>grafeas.v1beta1.image.Derived</code>
 */
final class Derived extends \Google\Protobuf\Internal\Message
{
    /**
     * The fingerprint of the derived image.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.image.Fingerprint fingerprint = 1;</code>
     */
    private $fingerprint = null;
    /**
     * Output only. The number of layers by which this image differs from the
     * associated image basis.
     *
     * Generated from protobuf field <code>int32 distance = 2;</code>
     */
    private $distance = 0;
    /**
     * This contains layer-specific metadata, if populated it has length
     * "distance" and is ordered with [distance] being the layer immediately
     * following the base image and [1] being the final layer.
     *
     * Generated from protobuf field <code>repeated .grafeas.v1beta1.image.Layer layer_info = 3;</code>
     */
    private $layer_info;
    /**
     * Output only. This contains the base image URL for the derived image
     * occurrence.
     *
     * Generated from protobuf field <code>string base_resource_url = 4;</code>
     */
    private $base_resource_url = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Grafeas\V1beta1\Image\Fingerprint $fingerprint
     *           The fingerprint of the derived image.
     *     @type int $distance
     *           Output only. The number of layers by which this image differs from the
     *           associated image basis.
     *     @type \Grafeas\V1beta1\Image\Layer[]|\Google\Protobuf\Internal\RepeatedField $layer_info
     *           This contains layer-specific metadata, if populated it has length
     *           "distance" and is ordered with [distance] being the layer immediately
     *           following the base image and [1] being the final layer.
     *     @type string $base_resource_url
     *           Output only. This contains the base image URL for the derived image
     *           occurrence.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Devtools\Containeranalysis\V1Beta1\Image\Image::initOnce();
        parent::__construct($data);
    }

    /**
     * The fingerprint of the derived image.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.image.Fingerprint fingerprint = 1;</code>
     * @return \Grafeas\V1beta1\Image\Fingerprint
     */
    public function getFingerprint()
    {
        return $this->fingerprint;
    }

    /**
     * The fingerprint of the derived image.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.image.Fingerprint fingerprint = 1;</code>
     * @param \Grafeas\V1beta1\Image\Fingerprint $var
     * @return $this
     */
    public function setFingerprint($var)
    {
        GPBUtil::checkMessage($var, \Grafeas\V1beta1\Image\Fingerprint::class);
        $this->fingerprint = $var;

        return $this;
    }

    /**
     * Output only. The number of layers by which this image differs from the
     * associated image basis.
     *
     * Generated from protobuf field <code>int32 distance = 2;</code>
     * @return int
     */
    public function getDistance()
    {
        return $this->distance;
    }

    /**
     * Output only. The number of layers by which this image differs from the
     * associated image basis.
     *
     * Generated from protobuf field <code>int32 distance = 2;</code>
     * @param int $var
     * @return $this
     */
    public function setDistance($var)
    {
        GPBUtil::checkInt32($var);
        $this->distance = $var;

        return $this;
    }

    /**
     * This contains layer-specific metadata, if populated it has length
     * "distance" and is ordered with [distance] being the layer immediately
     * following the base image and [1] being the final layer.
     *
     * Generated from protobuf field <code>repeated .grafeas.v1beta1.image.Layer layer_info = 3;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getLayerInfo()
    {
        return $this->layer_info;
    }

    /**
     * This contains layer-specific metadata, if populated it has length
     * "distance" and is ordered with [distance] being the layer immediately
     * following the base image and [1] being the final layer.
     *
     * Generated from protobuf field <code>repeated .grafeas.v1beta1.image.Layer layer_info = 3;</code>
     * @param \Grafeas\V1beta1\Image\Layer[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setLayerInfo($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Grafeas\V1beta1\Image\Layer::class);
        $this->layer_info = $arr;

        return $this;
    }

    /**
     * Output only. This contains the base image URL for the derived image
     * occurrence.
     *
     * Generated from protobuf field <code>string base_resource_url = 4;</code>
     * @return string
     */
    public function getBaseResourceUrl()
    {
        return $this->base_resource_url;
    }

    /**
     * Output only. This contains the base image URL for the derived image
     * occurrence.
     *
     * Generated from protobuf field <code>string base_resource_url = 4;</code>
     * @param string $var
     * @return $this
     */
    public function setBaseResourceUrl($var)
    {
        GPBUtil::checkString($var, True);
        $this->base_resource_url = $var;

        return $this;
    }

}

