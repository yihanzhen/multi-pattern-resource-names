<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1alpha1/containeranalysis.proto

namespace Google\Devtools\Containeranalysis\V1alpha1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Response including listed occurrences for a note.
 *
 * Generated from protobuf message <code>google.devtools.containeranalysis.v1alpha1.ListNoteOccurrencesResponse</code>
 */
final class ListNoteOccurrencesResponse extends \Google\Protobuf\Internal\Message
{
    /**
     * The occurrences attached to the specified note.
     *
     * Generated from protobuf field <code>repeated .google.devtools.containeranalysis.v1alpha1.Occurrence occurrences = 1;</code>
     */
    private $occurrences;
    /**
     * Token to receive the next page of notes.
     *
     * Generated from protobuf field <code>string next_page_token = 2;</code>
     */
    private $next_page_token = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type \Google\Devtools\Containeranalysis\V1alpha1\Occurrence[]|\Google\Protobuf\Internal\RepeatedField $occurrences
     *           The occurrences attached to the specified note.
     *     @type string $next_page_token
     *           Token to receive the next page of notes.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Devtools\Containeranalysis\V1Alpha1\Containeranalysis::initOnce();
        parent::__construct($data);
    }

    /**
     * The occurrences attached to the specified note.
     *
     * Generated from protobuf field <code>repeated .google.devtools.containeranalysis.v1alpha1.Occurrence occurrences = 1;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getOccurrences()
    {
        return $this->occurrences;
    }

    /**
     * The occurrences attached to the specified note.
     *
     * Generated from protobuf field <code>repeated .google.devtools.containeranalysis.v1alpha1.Occurrence occurrences = 1;</code>
     * @param \Google\Devtools\Containeranalysis\V1alpha1\Occurrence[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setOccurrences($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Google\Devtools\Containeranalysis\V1alpha1\Occurrence::class);
        $this->occurrences = $arr;

        return $this;
    }

    /**
     * Token to receive the next page of notes.
     *
     * Generated from protobuf field <code>string next_page_token = 2;</code>
     * @return string
     */
    public function getNextPageToken()
    {
        return $this->next_page_token;
    }

    /**
     * Token to receive the next page of notes.
     *
     * Generated from protobuf field <code>string next_page_token = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setNextPageToken($var)
    {
        GPBUtil::checkString($var, True);
        $this->next_page_token = $var;

        return $this;
    }

}

