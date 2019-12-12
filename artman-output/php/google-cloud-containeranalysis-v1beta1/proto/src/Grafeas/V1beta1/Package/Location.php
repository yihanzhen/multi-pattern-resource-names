<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1beta1/package/package.proto

namespace Grafeas\V1beta1\Package;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * An occurrence of a particular package installation found within a system's
 * filesystem. E.g., glibc was found in /var/lib/dpkg/status.
 *
 * Generated from protobuf message <code>grafeas.v1beta1.package.Location</code>
 */
final class Location extends \Google\Protobuf\Internal\Message
{
    /**
     * The cpe_uri in [cpe format](https://cpe.mitre.org/specification/)
     * denoting the package manager version distributing a package.
     *
     * Generated from protobuf field <code>string cpe_uri = 1;</code>
     */
    private $cpe_uri = '';
    /**
     * The version installed at this location.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.package.Version version = 2;</code>
     */
    private $version = null;
    /**
     * The path from which we gathered that this package/version is installed.
     *
     * Generated from protobuf field <code>string path = 3;</code>
     */
    private $path = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $cpe_uri
     *           The cpe_uri in [cpe format](https://cpe.mitre.org/specification/)
     *           denoting the package manager version distributing a package.
     *     @type \Grafeas\V1beta1\Package\Version $version
     *           The version installed at this location.
     *     @type string $path
     *           The path from which we gathered that this package/version is installed.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Devtools\Containeranalysis\V1Beta1\Package\Package::initOnce();
        parent::__construct($data);
    }

    /**
     * The cpe_uri in [cpe format](https://cpe.mitre.org/specification/)
     * denoting the package manager version distributing a package.
     *
     * Generated from protobuf field <code>string cpe_uri = 1;</code>
     * @return string
     */
    public function getCpeUri()
    {
        return $this->cpe_uri;
    }

    /**
     * The cpe_uri in [cpe format](https://cpe.mitre.org/specification/)
     * denoting the package manager version distributing a package.
     *
     * Generated from protobuf field <code>string cpe_uri = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setCpeUri($var)
    {
        GPBUtil::checkString($var, True);
        $this->cpe_uri = $var;

        return $this;
    }

    /**
     * The version installed at this location.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.package.Version version = 2;</code>
     * @return \Grafeas\V1beta1\Package\Version
     */
    public function getVersion()
    {
        return $this->version;
    }

    /**
     * The version installed at this location.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.package.Version version = 2;</code>
     * @param \Grafeas\V1beta1\Package\Version $var
     * @return $this
     */
    public function setVersion($var)
    {
        GPBUtil::checkMessage($var, \Grafeas\V1beta1\Package\Version::class);
        $this->version = $var;

        return $this;
    }

    /**
     * The path from which we gathered that this package/version is installed.
     *
     * Generated from protobuf field <code>string path = 3;</code>
     * @return string
     */
    public function getPath()
    {
        return $this->path;
    }

    /**
     * The path from which we gathered that this package/version is installed.
     *
     * Generated from protobuf field <code>string path = 3;</code>
     * @param string $var
     * @return $this
     */
    public function setPath($var)
    {
        GPBUtil::checkString($var, True);
        $this->path = $var;

        return $this;
    }

}

