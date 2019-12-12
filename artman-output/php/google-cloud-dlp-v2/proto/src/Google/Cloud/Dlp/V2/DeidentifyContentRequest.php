<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/privacy/dlp/v2/dlp.proto

namespace Google\Cloud\Dlp\V2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Request to de-identify a list of items.
 *
 * Generated from protobuf message <code>google.privacy.dlp.v2.DeidentifyContentRequest</code>
 */
final class DeidentifyContentRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * The parent resource name, for example projects/my-project-id.
     *
     * Generated from protobuf field <code>string parent = 1 [(.google.api.resource_reference) = {</code>
     */
    private $parent = '';
    /**
     * Configuration for the de-identification of the content item.
     * Items specified here will override the template referenced by the
     * deidentify_template_name argument.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.DeidentifyConfig deidentify_config = 2;</code>
     */
    private $deidentify_config = null;
    /**
     * Configuration for the inspector.
     * Items specified here will override the template referenced by the
     * inspect_template_name argument.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 3;</code>
     */
    private $inspect_config = null;
    /**
     * The item to de-identify. Will be treated as text.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.ContentItem item = 4;</code>
     */
    private $item = null;
    /**
     * Optional template to use. Any configuration directly specified in
     * inspect_config will override those set in the template. Singular fields
     * that are set in this request will replace their corresponding fields in the
     * template. Repeated fields are appended. Singular sub-messages and groups
     * are recursively merged.
     *
     * Generated from protobuf field <code>string inspect_template_name = 5;</code>
     */
    private $inspect_template_name = '';
    /**
     * Optional template to use. Any configuration directly specified in
     * deidentify_config will override those set in the template. Singular fields
     * that are set in this request will replace their corresponding fields in the
     * template. Repeated fields are appended. Singular sub-messages and groups
     * are recursively merged.
     *
     * Generated from protobuf field <code>string deidentify_template_name = 6;</code>
     */
    private $deidentify_template_name = '';
    /**
     * The geographic location to process de-identification. Reserved for future
     * extensions.
     *
     * Generated from protobuf field <code>string location_id = 7;</code>
     */
    private $location_id = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $parent
     *           The parent resource name, for example projects/my-project-id.
     *     @type \Google\Cloud\Dlp\V2\DeidentifyConfig $deidentify_config
     *           Configuration for the de-identification of the content item.
     *           Items specified here will override the template referenced by the
     *           deidentify_template_name argument.
     *     @type \Google\Cloud\Dlp\V2\InspectConfig $inspect_config
     *           Configuration for the inspector.
     *           Items specified here will override the template referenced by the
     *           inspect_template_name argument.
     *     @type \Google\Cloud\Dlp\V2\ContentItem $item
     *           The item to de-identify. Will be treated as text.
     *     @type string $inspect_template_name
     *           Optional template to use. Any configuration directly specified in
     *           inspect_config will override those set in the template. Singular fields
     *           that are set in this request will replace their corresponding fields in the
     *           template. Repeated fields are appended. Singular sub-messages and groups
     *           are recursively merged.
     *     @type string $deidentify_template_name
     *           Optional template to use. Any configuration directly specified in
     *           deidentify_config will override those set in the template. Singular fields
     *           that are set in this request will replace their corresponding fields in the
     *           template. Repeated fields are appended. Singular sub-messages and groups
     *           are recursively merged.
     *     @type string $location_id
     *           The geographic location to process de-identification. Reserved for future
     *           extensions.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Privacy\Dlp\V2\Dlp::initOnce();
        parent::__construct($data);
    }

    /**
     * The parent resource name, for example projects/my-project-id.
     *
     * Generated from protobuf field <code>string parent = 1 [(.google.api.resource_reference) = {</code>
     * @return string
     */
    public function getParent()
    {
        return $this->parent;
    }

    /**
     * The parent resource name, for example projects/my-project-id.
     *
     * Generated from protobuf field <code>string parent = 1 [(.google.api.resource_reference) = {</code>
     * @param string $var
     * @return $this
     */
    public function setParent($var)
    {
        GPBUtil::checkString($var, True);
        $this->parent = $var;

        return $this;
    }

    /**
     * Configuration for the de-identification of the content item.
     * Items specified here will override the template referenced by the
     * deidentify_template_name argument.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.DeidentifyConfig deidentify_config = 2;</code>
     * @return \Google\Cloud\Dlp\V2\DeidentifyConfig
     */
    public function getDeidentifyConfig()
    {
        return $this->deidentify_config;
    }

    /**
     * Configuration for the de-identification of the content item.
     * Items specified here will override the template referenced by the
     * deidentify_template_name argument.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.DeidentifyConfig deidentify_config = 2;</code>
     * @param \Google\Cloud\Dlp\V2\DeidentifyConfig $var
     * @return $this
     */
    public function setDeidentifyConfig($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dlp\V2\DeidentifyConfig::class);
        $this->deidentify_config = $var;

        return $this;
    }

    /**
     * Configuration for the inspector.
     * Items specified here will override the template referenced by the
     * inspect_template_name argument.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 3;</code>
     * @return \Google\Cloud\Dlp\V2\InspectConfig
     */
    public function getInspectConfig()
    {
        return $this->inspect_config;
    }

    /**
     * Configuration for the inspector.
     * Items specified here will override the template referenced by the
     * inspect_template_name argument.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 3;</code>
     * @param \Google\Cloud\Dlp\V2\InspectConfig $var
     * @return $this
     */
    public function setInspectConfig($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dlp\V2\InspectConfig::class);
        $this->inspect_config = $var;

        return $this;
    }

    /**
     * The item to de-identify. Will be treated as text.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.ContentItem item = 4;</code>
     * @return \Google\Cloud\Dlp\V2\ContentItem
     */
    public function getItem()
    {
        return $this->item;
    }

    /**
     * The item to de-identify. Will be treated as text.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.ContentItem item = 4;</code>
     * @param \Google\Cloud\Dlp\V2\ContentItem $var
     * @return $this
     */
    public function setItem($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dlp\V2\ContentItem::class);
        $this->item = $var;

        return $this;
    }

    /**
     * Optional template to use. Any configuration directly specified in
     * inspect_config will override those set in the template. Singular fields
     * that are set in this request will replace their corresponding fields in the
     * template. Repeated fields are appended. Singular sub-messages and groups
     * are recursively merged.
     *
     * Generated from protobuf field <code>string inspect_template_name = 5;</code>
     * @return string
     */
    public function getInspectTemplateName()
    {
        return $this->inspect_template_name;
    }

    /**
     * Optional template to use. Any configuration directly specified in
     * inspect_config will override those set in the template. Singular fields
     * that are set in this request will replace their corresponding fields in the
     * template. Repeated fields are appended. Singular sub-messages and groups
     * are recursively merged.
     *
     * Generated from protobuf field <code>string inspect_template_name = 5;</code>
     * @param string $var
     * @return $this
     */
    public function setInspectTemplateName($var)
    {
        GPBUtil::checkString($var, True);
        $this->inspect_template_name = $var;

        return $this;
    }

    /**
     * Optional template to use. Any configuration directly specified in
     * deidentify_config will override those set in the template. Singular fields
     * that are set in this request will replace their corresponding fields in the
     * template. Repeated fields are appended. Singular sub-messages and groups
     * are recursively merged.
     *
     * Generated from protobuf field <code>string deidentify_template_name = 6;</code>
     * @return string
     */
    public function getDeidentifyTemplateName()
    {
        return $this->deidentify_template_name;
    }

    /**
     * Optional template to use. Any configuration directly specified in
     * deidentify_config will override those set in the template. Singular fields
     * that are set in this request will replace their corresponding fields in the
     * template. Repeated fields are appended. Singular sub-messages and groups
     * are recursively merged.
     *
     * Generated from protobuf field <code>string deidentify_template_name = 6;</code>
     * @param string $var
     * @return $this
     */
    public function setDeidentifyTemplateName($var)
    {
        GPBUtil::checkString($var, True);
        $this->deidentify_template_name = $var;

        return $this;
    }

    /**
     * The geographic location to process de-identification. Reserved for future
     * extensions.
     *
     * Generated from protobuf field <code>string location_id = 7;</code>
     * @return string
     */
    public function getLocationId()
    {
        return $this->location_id;
    }

    /**
     * The geographic location to process de-identification. Reserved for future
     * extensions.
     *
     * Generated from protobuf field <code>string location_id = 7;</code>
     * @param string $var
     * @return $this
     */
    public function setLocationId($var)
    {
        GPBUtil::checkString($var, True);
        $this->location_id = $var;

        return $this;
    }

}
