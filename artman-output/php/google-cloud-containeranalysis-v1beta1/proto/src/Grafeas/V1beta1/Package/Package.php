<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1beta1/package/package.proto

namespace Grafeas\V1beta1\Package;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * This represents a particular package that is distributed over various
 * channels. E.g., glibc (aka libc6) is distributed by many, at various
 * versions.
 *
 * Generated from protobuf message <code>grafeas.v1beta1.package.Package</code>
 */
final class Package extends \Google\Protobuf\Internal\Message
{
    /**
     * The name of the package.
     *
     * Generated from protobuf field <code>string name = 1;</code>
     */
    private $name = '';
    /**
     * The various channels by which a package is distributed.
     *
     * Generated from protobuf field <code>repeated .grafeas.v1beta1.package.Distribution distribution = 10;</code>
     */
    private $distribution;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $name
     *           The name of the package.
     *     @type \Grafeas\V1beta1\Package\Distribution[]|\Google\Protobuf\Internal\RepeatedField $distribution
     *           The various channels by which a package is distributed.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Devtools\Containeranalysis\V1Beta1\Package\Package::initOnce();
        parent::__construct($data);
    }

    /**
     * The name of the package.
     *
     * Generated from protobuf field <code>string name = 1;</code>
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * The name of the package.
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

    /**
     * The various channels by which a package is distributed.
     *
     * Generated from protobuf field <code>repeated .grafeas.v1beta1.package.Distribution distribution = 10;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getDistribution()
    {
        return $this->distribution;
    }

    /**
     * The various channels by which a package is distributed.
     *
     * Generated from protobuf field <code>repeated .grafeas.v1beta1.package.Distribution distribution = 10;</code>
     * @param \Grafeas\V1beta1\Package\Distribution[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setDistribution($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Grafeas\V1beta1\Package\Distribution::class);
        $this->distribution = $arr;

        return $this;
    }

}
