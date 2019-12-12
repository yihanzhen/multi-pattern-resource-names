<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1beta1/source/source.proto

namespace Grafeas\V1beta1\Source;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * A unique identifier for a Cloud Repo.
 *
 * Generated from protobuf message <code>grafeas.v1beta1.source.RepoId</code>
 */
final class RepoId extends \Google\Protobuf\Internal\Message
{
    protected $id;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Grafeas\V1beta1\Source\ProjectRepoId $project_repo_id
     *           A combination of a project ID and a repo name.
     *     @type string $uid
     *           A server-assigned, globally unique identifier.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Devtools\Containeranalysis\V1Beta1\Source\Source::initOnce();
        parent::__construct($data);
    }

    /**
     * A combination of a project ID and a repo name.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.source.ProjectRepoId project_repo_id = 1;</code>
     * @return \Grafeas\V1beta1\Source\ProjectRepoId
     */
    public function getProjectRepoId()
    {
        return $this->readOneof(1);
    }

    /**
     * A combination of a project ID and a repo name.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.source.ProjectRepoId project_repo_id = 1;</code>
     * @param \Grafeas\V1beta1\Source\ProjectRepoId $var
     * @return $this
     */
    public function setProjectRepoId($var)
    {
        GPBUtil::checkMessage($var, \Grafeas\V1beta1\Source\ProjectRepoId::class);
        $this->writeOneof(1, $var);

        return $this;
    }

    /**
     * A server-assigned, globally unique identifier.
     *
     * Generated from protobuf field <code>string uid = 2;</code>
     * @return string
     */
    public function getUid()
    {
        return $this->readOneof(2);
    }

    /**
     * A server-assigned, globally unique identifier.
     *
     * Generated from protobuf field <code>string uid = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setUid($var)
    {
        GPBUtil::checkString($var, True);
        $this->writeOneof(2, $var);

        return $this;
    }

    /**
     * @return string
     */
    public function getId()
    {
        return $this->whichOneof("id");
    }

}

