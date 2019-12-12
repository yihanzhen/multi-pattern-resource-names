<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1beta1/source/source.proto

namespace Grafeas\V1beta1\Source;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * A SourceContext referring to a Gerrit project.
 *
 * Generated from protobuf message <code>grafeas.v1beta1.source.GerritSourceContext</code>
 */
final class GerritSourceContext extends \Google\Protobuf\Internal\Message
{
    /**
     * The URI of a running Gerrit instance.
     *
     * Generated from protobuf field <code>string host_uri = 1;</code>
     */
    private $host_uri = '';
    /**
     * The full project name within the host. Projects may be nested, so
     * "project/subproject" is a valid project name. The "repo name" is the
     * hostURI/project.
     *
     * Generated from protobuf field <code>string gerrit_project = 2;</code>
     */
    private $gerrit_project = '';
    protected $revision;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $host_uri
     *           The URI of a running Gerrit instance.
     *     @type string $gerrit_project
     *           The full project name within the host. Projects may be nested, so
     *           "project/subproject" is a valid project name. The "repo name" is the
     *           hostURI/project.
     *     @type string $revision_id
     *           A revision (commit) ID.
     *     @type \Grafeas\V1beta1\Source\AliasContext $alias_context
     *           An alias, which may be a branch or tag.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Devtools\Containeranalysis\V1Beta1\Source\Source::initOnce();
        parent::__construct($data);
    }

    /**
     * The URI of a running Gerrit instance.
     *
     * Generated from protobuf field <code>string host_uri = 1;</code>
     * @return string
     */
    public function getHostUri()
    {
        return $this->host_uri;
    }

    /**
     * The URI of a running Gerrit instance.
     *
     * Generated from protobuf field <code>string host_uri = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setHostUri($var)
    {
        GPBUtil::checkString($var, True);
        $this->host_uri = $var;

        return $this;
    }

    /**
     * The full project name within the host. Projects may be nested, so
     * "project/subproject" is a valid project name. The "repo name" is the
     * hostURI/project.
     *
     * Generated from protobuf field <code>string gerrit_project = 2;</code>
     * @return string
     */
    public function getGerritProject()
    {
        return $this->gerrit_project;
    }

    /**
     * The full project name within the host. Projects may be nested, so
     * "project/subproject" is a valid project name. The "repo name" is the
     * hostURI/project.
     *
     * Generated from protobuf field <code>string gerrit_project = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setGerritProject($var)
    {
        GPBUtil::checkString($var, True);
        $this->gerrit_project = $var;

        return $this;
    }

    /**
     * A revision (commit) ID.
     *
     * Generated from protobuf field <code>string revision_id = 3;</code>
     * @return string
     */
    public function getRevisionId()
    {
        return $this->readOneof(3);
    }

    /**
     * A revision (commit) ID.
     *
     * Generated from protobuf field <code>string revision_id = 3;</code>
     * @param string $var
     * @return $this
     */
    public function setRevisionId($var)
    {
        GPBUtil::checkString($var, True);
        $this->writeOneof(3, $var);

        return $this;
    }

    /**
     * An alias, which may be a branch or tag.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.source.AliasContext alias_context = 4;</code>
     * @return \Grafeas\V1beta1\Source\AliasContext
     */
    public function getAliasContext()
    {
        return $this->readOneof(4);
    }

    /**
     * An alias, which may be a branch or tag.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.source.AliasContext alias_context = 4;</code>
     * @param \Grafeas\V1beta1\Source\AliasContext $var
     * @return $this
     */
    public function setAliasContext($var)
    {
        GPBUtil::checkMessage($var, \Grafeas\V1beta1\Source\AliasContext::class);
        $this->writeOneof(4, $var);

        return $this;
    }

    /**
     * @return string
     */
    public function getRevision()
    {
        return $this->whichOneof("revision");
    }

}

