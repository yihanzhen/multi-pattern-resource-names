<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1beta1/source/source.proto

namespace Grafeas\V1beta1\Source;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Selects a repo using a Google Cloud Platform project ID (e.g.,
 * winged-cargo-31) and a repo name within that project.
 *
 * Generated from protobuf message <code>grafeas.v1beta1.source.ProjectRepoId</code>
 */
class ProjectRepoId extends \Google\Protobuf\Internal\Message
{
    /**
     * The ID of the project.
     *
     * Generated from protobuf field <code>string project_id = 1;</code>
     */
    protected $project_id = '';
    /**
     * The name of the repo. Leave empty for the default repo.
     *
     * Generated from protobuf field <code>string repo_name = 2;</code>
     */
    protected $repo_name = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $project_id
     *           The ID of the project.
     *     @type string $repo_name
     *           The name of the repo. Leave empty for the default repo.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Devtools\Containeranalysis\V1Beta1\Source\Source::initOnce();
        parent::__construct($data);
    }

    /**
     * The ID of the project.
     *
     * Generated from protobuf field <code>string project_id = 1;</code>
     * @return string
     */
    public function getProjectId()
    {
        return $this->project_id;
    }

    /**
     * The ID of the project.
     *
     * Generated from protobuf field <code>string project_id = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setProjectId($var)
    {
        GPBUtil::checkString($var, True);
        $this->project_id = $var;

        return $this;
    }

    /**
     * The name of the repo. Leave empty for the default repo.
     *
     * Generated from protobuf field <code>string repo_name = 2;</code>
     * @return string
     */
    public function getRepoName()
    {
        return $this->repo_name;
    }

    /**
     * The name of the repo. Leave empty for the default repo.
     *
     * Generated from protobuf field <code>string repo_name = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setRepoName($var)
    {
        GPBUtil::checkString($var, True);
        $this->repo_name = $var;

        return $this;
    }

}

