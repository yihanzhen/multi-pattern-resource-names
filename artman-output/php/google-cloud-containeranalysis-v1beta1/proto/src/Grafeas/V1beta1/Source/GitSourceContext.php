<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1beta1/source/source.proto

namespace Grafeas\V1beta1\Source;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * A GitSourceContext denotes a particular revision in a third party Git
 * repository (e.g., GitHub).
 *
 * Generated from protobuf message <code>grafeas.v1beta1.source.GitSourceContext</code>
 */
final class GitSourceContext extends \Google\Protobuf\Internal\Message
{
    /**
     * Git repository URL.
     *
     * Generated from protobuf field <code>string url = 1;</code>
     */
    private $url = '';
    /**
     * Git commit hash.
     *
     * Generated from protobuf field <code>string revision_id = 2;</code>
     */
    private $revision_id = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $url
     *           Git repository URL.
     *     @type string $revision_id
     *           Git commit hash.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Devtools\Containeranalysis\V1Beta1\Source\Source::initOnce();
        parent::__construct($data);
    }

    /**
     * Git repository URL.
     *
     * Generated from protobuf field <code>string url = 1;</code>
     * @return string
     */
    public function getUrl()
    {
        return $this->url;
    }

    /**
     * Git repository URL.
     *
     * Generated from protobuf field <code>string url = 1;</code>
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
     * Git commit hash.
     *
     * Generated from protobuf field <code>string revision_id = 2;</code>
     * @return string
     */
    public function getRevisionId()
    {
        return $this->revision_id;
    }

    /**
     * Git commit hash.
     *
     * Generated from protobuf field <code>string revision_id = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setRevisionId($var)
    {
        GPBUtil::checkString($var, True);
        $this->revision_id = $var;

        return $this;
    }

}

