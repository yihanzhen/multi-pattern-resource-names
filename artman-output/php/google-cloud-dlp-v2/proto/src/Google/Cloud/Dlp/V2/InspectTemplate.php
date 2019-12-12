<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/privacy/dlp/v2/dlp.proto

namespace Google\Cloud\Dlp\V2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * The inspectTemplate contains a configuration (set of types of sensitive data
 * to be detected) to be used anywhere you otherwise would normally specify
 * InspectConfig. See https://cloud.google.com/dlp/docs/concepts-templates
 * to learn more.
 *
 * Generated from protobuf message <code>google.privacy.dlp.v2.InspectTemplate</code>
 */
final class InspectTemplate extends \Google\Protobuf\Internal\Message
{
    /**
     * The template name. Output only.
     * The template will have one of the following formats:
     * `projects/PROJECT_ID/inspectTemplates/TEMPLATE_ID` OR
     * `organizations/ORGANIZATION_ID/inspectTemplates/TEMPLATE_ID`
     *
     * Generated from protobuf field <code>string name = 1;</code>
     */
    private $name = '';
    /**
     * Display name (max 256 chars).
     *
     * Generated from protobuf field <code>string display_name = 2;</code>
     */
    private $display_name = '';
    /**
     * Short description (max 256 chars).
     *
     * Generated from protobuf field <code>string description = 3;</code>
     */
    private $description = '';
    /**
     * The creation timestamp of an inspectTemplate, output only field.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp create_time = 4;</code>
     */
    private $create_time = null;
    /**
     * The last update timestamp of an inspectTemplate, output only field.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp update_time = 5;</code>
     */
    private $update_time = null;
    /**
     * The core content of the template. Configuration of the scanning process.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 6;</code>
     */
    private $inspect_config = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $name
     *           The template name. Output only.
     *           The template will have one of the following formats:
     *           `projects/PROJECT_ID/inspectTemplates/TEMPLATE_ID` OR
     *           `organizations/ORGANIZATION_ID/inspectTemplates/TEMPLATE_ID`
     *     @type string $display_name
     *           Display name (max 256 chars).
     *     @type string $description
     *           Short description (max 256 chars).
     *     @type \Google\Protobuf\Timestamp $create_time
     *           The creation timestamp of an inspectTemplate, output only field.
     *     @type \Google\Protobuf\Timestamp $update_time
     *           The last update timestamp of an inspectTemplate, output only field.
     *     @type \Google\Cloud\Dlp\V2\InspectConfig $inspect_config
     *           The core content of the template. Configuration of the scanning process.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Privacy\Dlp\V2\Dlp::initOnce();
        parent::__construct($data);
    }

    /**
     * The template name. Output only.
     * The template will have one of the following formats:
     * `projects/PROJECT_ID/inspectTemplates/TEMPLATE_ID` OR
     * `organizations/ORGANIZATION_ID/inspectTemplates/TEMPLATE_ID`
     *
     * Generated from protobuf field <code>string name = 1;</code>
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * The template name. Output only.
     * The template will have one of the following formats:
     * `projects/PROJECT_ID/inspectTemplates/TEMPLATE_ID` OR
     * `organizations/ORGANIZATION_ID/inspectTemplates/TEMPLATE_ID`
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
     * Display name (max 256 chars).
     *
     * Generated from protobuf field <code>string display_name = 2;</code>
     * @return string
     */
    public function getDisplayName()
    {
        return $this->display_name;
    }

    /**
     * Display name (max 256 chars).
     *
     * Generated from protobuf field <code>string display_name = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setDisplayName($var)
    {
        GPBUtil::checkString($var, True);
        $this->display_name = $var;

        return $this;
    }

    /**
     * Short description (max 256 chars).
     *
     * Generated from protobuf field <code>string description = 3;</code>
     * @return string
     */
    public function getDescription()
    {
        return $this->description;
    }

    /**
     * Short description (max 256 chars).
     *
     * Generated from protobuf field <code>string description = 3;</code>
     * @param string $var
     * @return $this
     */
    public function setDescription($var)
    {
        GPBUtil::checkString($var, True);
        $this->description = $var;

        return $this;
    }

    /**
     * The creation timestamp of an inspectTemplate, output only field.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp create_time = 4;</code>
     * @return \Google\Protobuf\Timestamp
     */
    public function getCreateTime()
    {
        return $this->create_time;
    }

    /**
     * The creation timestamp of an inspectTemplate, output only field.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp create_time = 4;</code>
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
     * The last update timestamp of an inspectTemplate, output only field.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp update_time = 5;</code>
     * @return \Google\Protobuf\Timestamp
     */
    public function getUpdateTime()
    {
        return $this->update_time;
    }

    /**
     * The last update timestamp of an inspectTemplate, output only field.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp update_time = 5;</code>
     * @param \Google\Protobuf\Timestamp $var
     * @return $this
     */
    public function setUpdateTime($var)
    {
        GPBUtil::checkMessage($var, \Google\Protobuf\Timestamp::class);
        $this->update_time = $var;

        return $this;
    }

    /**
     * The core content of the template. Configuration of the scanning process.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 6;</code>
     * @return \Google\Cloud\Dlp\V2\InspectConfig
     */
    public function getInspectConfig()
    {
        return $this->inspect_config;
    }

    /**
     * The core content of the template. Configuration of the scanning process.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 6;</code>
     * @param \Google\Cloud\Dlp\V2\InspectConfig $var
     * @return $this
     */
    public function setInspectConfig($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dlp\V2\InspectConfig::class);
        $this->inspect_config = $var;

        return $this;
    }

}

