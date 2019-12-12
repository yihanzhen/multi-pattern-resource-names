<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1beta1/package/package.proto

namespace Grafeas\V1beta1\Package;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * This represents a particular channel of distribution for a given package.
 * E.g., Debian's jessie-backports dpkg mirror.
 *
 * Generated from protobuf message <code>grafeas.v1beta1.package.Distribution</code>
 */
final class Distribution extends \Google\Protobuf\Internal\Message
{
    /**
     * The cpe_uri in [cpe format](https://cpe.mitre.org/specification/)
     * denoting the package manager version distributing a package.
     *
     * Generated from protobuf field <code>string cpe_uri = 1;</code>
     */
    private $cpe_uri = '';
    /**
     * The CPU architecture for which packages in this distribution channel were
     * built.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.package.Architecture architecture = 2;</code>
     */
    private $architecture = 0;
    /**
     * The latest available version of this package in this distribution
     * channel.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.package.Version latest_version = 3;</code>
     */
    private $latest_version = null;
    /**
     * A freeform string denoting the maintainer of this package.
     *
     * Generated from protobuf field <code>string maintainer = 4;</code>
     */
    private $maintainer = '';
    /**
     * The distribution channel-specific homepage for this package.
     *
     * Generated from protobuf field <code>string url = 5;</code>
     */
    private $url = '';
    /**
     * The distribution channel-specific description of this package.
     *
     * Generated from protobuf field <code>string description = 6;</code>
     */
    private $description = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $cpe_uri
     *           The cpe_uri in [cpe format](https://cpe.mitre.org/specification/)
     *           denoting the package manager version distributing a package.
     *     @type int $architecture
     *           The CPU architecture for which packages in this distribution channel were
     *           built.
     *     @type \Grafeas\V1beta1\Package\Version $latest_version
     *           The latest available version of this package in this distribution
     *           channel.
     *     @type string $maintainer
     *           A freeform string denoting the maintainer of this package.
     *     @type string $url
     *           The distribution channel-specific homepage for this package.
     *     @type string $description
     *           The distribution channel-specific description of this package.
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
     * The CPU architecture for which packages in this distribution channel were
     * built.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.package.Architecture architecture = 2;</code>
     * @return int
     */
    public function getArchitecture()
    {
        return $this->architecture;
    }

    /**
     * The CPU architecture for which packages in this distribution channel were
     * built.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.package.Architecture architecture = 2;</code>
     * @param int $var
     * @return $this
     */
    public function setArchitecture($var)
    {
        GPBUtil::checkEnum($var, \Grafeas\V1beta1\Package\Architecture::class);
        $this->architecture = $var;

        return $this;
    }

    /**
     * The latest available version of this package in this distribution
     * channel.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.package.Version latest_version = 3;</code>
     * @return \Grafeas\V1beta1\Package\Version
     */
    public function getLatestVersion()
    {
        return $this->latest_version;
    }

    /**
     * The latest available version of this package in this distribution
     * channel.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.package.Version latest_version = 3;</code>
     * @param \Grafeas\V1beta1\Package\Version $var
     * @return $this
     */
    public function setLatestVersion($var)
    {
        GPBUtil::checkMessage($var, \Grafeas\V1beta1\Package\Version::class);
        $this->latest_version = $var;

        return $this;
    }

    /**
     * A freeform string denoting the maintainer of this package.
     *
     * Generated from protobuf field <code>string maintainer = 4;</code>
     * @return string
     */
    public function getMaintainer()
    {
        return $this->maintainer;
    }

    /**
     * A freeform string denoting the maintainer of this package.
     *
     * Generated from protobuf field <code>string maintainer = 4;</code>
     * @param string $var
     * @return $this
     */
    public function setMaintainer($var)
    {
        GPBUtil::checkString($var, True);
        $this->maintainer = $var;

        return $this;
    }

    /**
     * The distribution channel-specific homepage for this package.
     *
     * Generated from protobuf field <code>string url = 5;</code>
     * @return string
     */
    public function getUrl()
    {
        return $this->url;
    }

    /**
     * The distribution channel-specific homepage for this package.
     *
     * Generated from protobuf field <code>string url = 5;</code>
     * @param string $var
     * @return $this
     */
    public function setUrl($var)
    {
        GPBUtil::checkString($var, True);
        $this->url = $var;

        return $this;
    }

    /**
     * The distribution channel-specific description of this package.
     *
     * Generated from protobuf field <code>string description = 6;</code>
     * @return string
     */
    public function getDescription()
    {
        return $this->description;
    }

    /**
     * The distribution channel-specific description of this package.
     *
     * Generated from protobuf field <code>string description = 6;</code>
     * @param string $var
     * @return $this
     */
    public function setDescription($var)
    {
        GPBUtil::checkString($var, True);
        $this->description = $var;

        return $this;
    }

}

