<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1alpha1/containeranalysis.proto

namespace Google\Devtools\Containeranalysis\V1alpha1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Request to list notes.
 *
 * Generated from protobuf message <code>google.devtools.containeranalysis.v1alpha1.ListNotesRequest</code>
 */
final class ListNotesRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * The name field will contain the project Id for example:
     * "providers/{provider_id}
     * &#64;Deprecated
     *
     * Generated from protobuf field <code>string name = 1;</code>
     */
    private $name = '';
    /**
     * This field contains the project Id for example: "projects/{PROJECT_ID}".
     *
     * Generated from protobuf field <code>string parent = 5;</code>
     */
    private $parent = '';
    /**
     * The filter expression.
     *
     * Generated from protobuf field <code>string filter = 2;</code>
     */
    private $filter = '';
    /**
     * Number of notes to return in the list.
     *
     * Generated from protobuf field <code>int32 page_size = 3;</code>
     */
    private $page_size = 0;
    /**
     * Token to provide to skip to a particular spot in the list.
     *
     * Generated from protobuf field <code>string page_token = 4;</code>
     */
    private $page_token = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $name
     *           The name field will contain the project Id for example:
     *           "providers/{provider_id}
     *           &#64;Deprecated
     *     @type string $parent
     *           This field contains the project Id for example: "projects/{PROJECT_ID}".
     *     @type string $filter
     *           The filter expression.
     *     @type int $page_size
     *           Number of notes to return in the list.
     *     @type string $page_token
     *           Token to provide to skip to a particular spot in the list.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Devtools\Containeranalysis\V1Alpha1\Containeranalysis::initOnce();
        parent::__construct($data);
    }

    /**
     * The name field will contain the project Id for example:
     * "providers/{provider_id}
     * &#64;Deprecated
     *
     * Generated from protobuf field <code>string name = 1;</code>
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * The name field will contain the project Id for example:
     * "providers/{provider_id}
     * &#64;Deprecated
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
     * This field contains the project Id for example: "projects/{PROJECT_ID}".
     *
     * Generated from protobuf field <code>string parent = 5;</code>
     * @return string
     */
    public function getParent()
    {
        return $this->parent;
    }

    /**
     * This field contains the project Id for example: "projects/{PROJECT_ID}".
     *
     * Generated from protobuf field <code>string parent = 5;</code>
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
     * The filter expression.
     *
     * Generated from protobuf field <code>string filter = 2;</code>
     * @return string
     */
    public function getFilter()
    {
        return $this->filter;
    }

    /**
     * The filter expression.
     *
     * Generated from protobuf field <code>string filter = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setFilter($var)
    {
        GPBUtil::checkString($var, True);
        $this->filter = $var;

        return $this;
    }

    /**
     * Number of notes to return in the list.
     *
     * Generated from protobuf field <code>int32 page_size = 3;</code>
     * @return int
     */
    public function getPageSize()
    {
        return $this->page_size;
    }

    /**
     * Number of notes to return in the list.
     *
     * Generated from protobuf field <code>int32 page_size = 3;</code>
     * @param int $var
     * @return $this
     */
    public function setPageSize($var)
    {
        GPBUtil::checkInt32($var);
        $this->page_size = $var;

        return $this;
    }

    /**
     * Token to provide to skip to a particular spot in the list.
     *
     * Generated from protobuf field <code>string page_token = 4;</code>
     * @return string
     */
    public function getPageToken()
    {
        return $this->page_token;
    }

    /**
     * Token to provide to skip to a particular spot in the list.
     *
     * Generated from protobuf field <code>string page_token = 4;</code>
     * @param string $var
     * @return $this
     */
    public function setPageToken($var)
    {
        GPBUtil::checkString($var, True);
        $this->page_token = $var;

        return $this;
    }

}

