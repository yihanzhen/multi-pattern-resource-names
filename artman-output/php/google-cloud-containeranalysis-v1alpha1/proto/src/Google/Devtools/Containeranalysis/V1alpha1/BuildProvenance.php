<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1alpha1/provenance.proto

namespace Google\Devtools\Containeranalysis\V1alpha1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Provenance of a build. Contains all information needed to verify the full
 * details about the build from source to completion.
 *
 * Generated from protobuf message <code>google.devtools.containeranalysis.v1alpha1.BuildProvenance</code>
 */
final class BuildProvenance extends \Google\Protobuf\Internal\Message
{
    /**
     * Unique identifier of the build.
     *
     * Generated from protobuf field <code>string id = 1;</code>
     */
    private $id = '';
    /**
     * ID of the project.
     *
     * Generated from protobuf field <code>string project_id = 2;</code>
     */
    private $project_id = '';
    /**
     * Commands requested by the build.
     *
     * Generated from protobuf field <code>repeated .google.devtools.containeranalysis.v1alpha1.Command commands = 5;</code>
     */
    private $commands;
    /**
     * Output of the build.
     *
     * Generated from protobuf field <code>repeated .google.devtools.containeranalysis.v1alpha1.Artifact built_artifacts = 6;</code>
     */
    private $built_artifacts;
    /**
     * Time at which the build was created.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp create_time = 7;</code>
     */
    private $create_time = null;
    /**
     * Time at which execution of the build was started.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp start_time = 8;</code>
     */
    private $start_time = null;
    /**
     * Time at which execution of the build was finished.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp finish_time = 9;</code>
     */
    private $finish_time = null;
    /**
     * E-mail address of the user who initiated this build. Note that this was the
     * user's e-mail address at the time the build was initiated; this address may
     * not represent the same end-user for all time.
     *
     * Generated from protobuf field <code>string creator = 11;</code>
     */
    private $creator = '';
    /**
     * Google Cloud Storage bucket where logs were written.
     *
     * Generated from protobuf field <code>string logs_bucket = 13;</code>
     */
    private $logs_bucket = '';
    /**
     * Details of the Source input to the build.
     *
     * Generated from protobuf field <code>.google.devtools.containeranalysis.v1alpha1.Source source_provenance = 14;</code>
     */
    private $source_provenance = null;
    /**
     * Trigger identifier if the build was triggered automatically; empty if not.
     *
     * Generated from protobuf field <code>string trigger_id = 15;</code>
     */
    private $trigger_id = '';
    /**
     * Special options applied to this build. This is a catch-all field where
     * build providers can enter any desired additional details.
     *
     * Generated from protobuf field <code>map<string, string> build_options = 16;</code>
     */
    private $build_options;
    /**
     * Version string of the builder at the time this build was executed.
     *
     * Generated from protobuf field <code>string builder_version = 17;</code>
     */
    private $builder_version = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $id
     *           Unique identifier of the build.
     *     @type string $project_id
     *           ID of the project.
     *     @type \Google\Devtools\Containeranalysis\V1alpha1\Command[]|\Google\Protobuf\Internal\RepeatedField $commands
     *           Commands requested by the build.
     *     @type \Google\Devtools\Containeranalysis\V1alpha1\Artifact[]|\Google\Protobuf\Internal\RepeatedField $built_artifacts
     *           Output of the build.
     *     @type \Google\Protobuf\Timestamp $create_time
     *           Time at which the build was created.
     *     @type \Google\Protobuf\Timestamp $start_time
     *           Time at which execution of the build was started.
     *     @type \Google\Protobuf\Timestamp $finish_time
     *           Time at which execution of the build was finished.
     *     @type string $creator
     *           E-mail address of the user who initiated this build. Note that this was the
     *           user's e-mail address at the time the build was initiated; this address may
     *           not represent the same end-user for all time.
     *     @type string $logs_bucket
     *           Google Cloud Storage bucket where logs were written.
     *     @type \Google\Devtools\Containeranalysis\V1alpha1\Source $source_provenance
     *           Details of the Source input to the build.
     *     @type string $trigger_id
     *           Trigger identifier if the build was triggered automatically; empty if not.
     *     @type array|\Google\Protobuf\Internal\MapField $build_options
     *           Special options applied to this build. This is a catch-all field where
     *           build providers can enter any desired additional details.
     *     @type string $builder_version
     *           Version string of the builder at the time this build was executed.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Devtools\Containeranalysis\V1Alpha1\Provenance::initOnce();
        parent::__construct($data);
    }

    /**
     * Unique identifier of the build.
     *
     * Generated from protobuf field <code>string id = 1;</code>
     * @return string
     */
    public function getId()
    {
        return $this->id;
    }

    /**
     * Unique identifier of the build.
     *
     * Generated from protobuf field <code>string id = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setId($var)
    {
        GPBUtil::checkString($var, True);
        $this->id = $var;

        return $this;
    }

    /**
     * ID of the project.
     *
     * Generated from protobuf field <code>string project_id = 2;</code>
     * @return string
     */
    public function getProjectId()
    {
        return $this->project_id;
    }

    /**
     * ID of the project.
     *
     * Generated from protobuf field <code>string project_id = 2;</code>
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
     * Commands requested by the build.
     *
     * Generated from protobuf field <code>repeated .google.devtools.containeranalysis.v1alpha1.Command commands = 5;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getCommands()
    {
        return $this->commands;
    }

    /**
     * Commands requested by the build.
     *
     * Generated from protobuf field <code>repeated .google.devtools.containeranalysis.v1alpha1.Command commands = 5;</code>
     * @param \Google\Devtools\Containeranalysis\V1alpha1\Command[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setCommands($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Google\Devtools\Containeranalysis\V1alpha1\Command::class);
        $this->commands = $arr;

        return $this;
    }

    /**
     * Output of the build.
     *
     * Generated from protobuf field <code>repeated .google.devtools.containeranalysis.v1alpha1.Artifact built_artifacts = 6;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getBuiltArtifacts()
    {
        return $this->built_artifacts;
    }

    /**
     * Output of the build.
     *
     * Generated from protobuf field <code>repeated .google.devtools.containeranalysis.v1alpha1.Artifact built_artifacts = 6;</code>
     * @param \Google\Devtools\Containeranalysis\V1alpha1\Artifact[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setBuiltArtifacts($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Google\Devtools\Containeranalysis\V1alpha1\Artifact::class);
        $this->built_artifacts = $arr;

        return $this;
    }

    /**
     * Time at which the build was created.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp create_time = 7;</code>
     * @return \Google\Protobuf\Timestamp
     */
    public function getCreateTime()
    {
        return $this->create_time;
    }

    /**
     * Time at which the build was created.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp create_time = 7;</code>
     * @param \Google\Protobuf\Timestamp $var
     * @return $this
     */
    public function setCreateTime($var)
    {
        GPBUtil::checkMessage($var, \Google\Protobuf\Timestamp::class);
        $this->create_time = $var;

        return $this;
    }

    /**
     * Time at which execution of the build was started.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp start_time = 8;</code>
     * @return \Google\Protobuf\Timestamp
     */
    public function getStartTime()
    {
        return $this->start_time;
    }

    /**
     * Time at which execution of the build was started.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp start_time = 8;</code>
     * @param \Google\Protobuf\Timestamp $var
     * @return $this
     */
    public function setStartTime($var)
    {
        GPBUtil::checkMessage($var, \Google\Protobuf\Timestamp::class);
        $this->start_time = $var;

        return $this;
    }

    /**
     * Time at which execution of the build was finished.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp finish_time = 9;</code>
     * @return \Google\Protobuf\Timestamp
     */
    public function getFinishTime()
    {
        return $this->finish_time;
    }

    /**
     * Time at which execution of the build was finished.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp finish_time = 9;</code>
     * @param \Google\Protobuf\Timestamp $var
     * @return $this
     */
    public function setFinishTime($var)
    {
        GPBUtil::checkMessage($var, \Google\Protobuf\Timestamp::class);
        $this->finish_time = $var;

        return $this;
    }

    /**
     * E-mail address of the user who initiated this build. Note that this was the
     * user's e-mail address at the time the build was initiated; this address may
     * not represent the same end-user for all time.
     *
     * Generated from protobuf field <code>string creator = 11;</code>
     * @return string
     */
    public function getCreator()
    {
        return $this->creator;
    }

    /**
     * E-mail address of the user who initiated this build. Note that this was the
     * user's e-mail address at the time the build was initiated; this address may
     * not represent the same end-user for all time.
     *
     * Generated from protobuf field <code>string creator = 11;</code>
     * @param string $var
     * @return $this
     */
    public function setCreator($var)
    {
        GPBUtil::checkString($var, True);
        $this->creator = $var;

        return $this;
    }

    /**
     * Google Cloud Storage bucket where logs were written.
     *
     * Generated from protobuf field <code>string logs_bucket = 13;</code>
     * @return string
     */
    public function getLogsBucket()
    {
        return $this->logs_bucket;
    }

    /**
     * Google Cloud Storage bucket where logs were written.
     *
     * Generated from protobuf field <code>string logs_bucket = 13;</code>
     * @param string $var
     * @return $this
     */
    public function setLogsBucket($var)
    {
        GPBUtil::checkString($var, True);
        $this->logs_bucket = $var;

        return $this;
    }

    /**
     * Details of the Source input to the build.
     *
     * Generated from protobuf field <code>.google.devtools.containeranalysis.v1alpha1.Source source_provenance = 14;</code>
     * @return \Google\Devtools\Containeranalysis\V1alpha1\Source
     */
    public function getSourceProvenance()
    {
        return $this->source_provenance;
    }

    /**
     * Details of the Source input to the build.
     *
     * Generated from protobuf field <code>.google.devtools.containeranalysis.v1alpha1.Source source_provenance = 14;</code>
     * @param \Google\Devtools\Containeranalysis\V1alpha1\Source $var
     * @return $this
     */
    public function setSourceProvenance($var)
    {
        GPBUtil::checkMessage($var, \Google\Devtools\Containeranalysis\V1alpha1\Source::class);
        $this->source_provenance = $var;

        return $this;
    }

    /**
     * Trigger identifier if the build was triggered automatically; empty if not.
     *
     * Generated from protobuf field <code>string trigger_id = 15;</code>
     * @return string
     */
    public function getTriggerId()
    {
        return $this->trigger_id;
    }

    /**
     * Trigger identifier if the build was triggered automatically; empty if not.
     *
     * Generated from protobuf field <code>string trigger_id = 15;</code>
     * @param string $var
     * @return $this
     */
    public function setTriggerId($var)
    {
        GPBUtil::checkString($var, True);
        $this->trigger_id = $var;

        return $this;
    }

    /**
     * Special options applied to this build. This is a catch-all field where
     * build providers can enter any desired additional details.
     *
     * Generated from protobuf field <code>map<string, string> build_options = 16;</code>
     * @return \Google\Protobuf\Internal\MapField
     */
    public function getBuildOptions()
    {
        return $this->build_options;
    }

    /**
     * Special options applied to this build. This is a catch-all field where
     * build providers can enter any desired additional details.
     *
     * Generated from protobuf field <code>map<string, string> build_options = 16;</code>
     * @param array|\Google\Protobuf\Internal\MapField $var
     * @return $this
     */
    public function setBuildOptions($var)
    {
        $arr = GPBUtil::checkMapField($var, \Google\Protobuf\Internal\GPBType::STRING, \Google\Protobuf\Internal\GPBType::STRING);
        $this->build_options = $arr;

        return $this;
    }

    /**
     * Version string of the builder at the time this build was executed.
     *
     * Generated from protobuf field <code>string builder_version = 17;</code>
     * @return string
     */
    public function getBuilderVersion()
    {
        return $this->builder_version;
    }

    /**
     * Version string of the builder at the time this build was executed.
     *
     * Generated from protobuf field <code>string builder_version = 17;</code>
     * @param string $var
     * @return $this
     */
    public function setBuilderVersion($var)
    {
        GPBUtil::checkString($var, True);
        $this->builder_version = $var;

        return $this;
    }

}
