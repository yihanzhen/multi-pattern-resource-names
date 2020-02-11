<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/devtools/containeranalysis/v1beta1/grafeas/grafeas.proto

namespace Grafeas\V1beta1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * A type of analysis that can be done for a resource.
 *
 * Generated from protobuf message <code>grafeas.v1beta1.Note</code>
 */
class Note extends \Google\Protobuf\Internal\Message
{
    /**
     * Output only. The name of the note in the form of
     * `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
     *
     * Generated from protobuf field <code>string name = 1;</code>
     */
    protected $name = '';
    /**
     * A one sentence description of this note.
     *
     * Generated from protobuf field <code>string short_description = 2;</code>
     */
    protected $short_description = '';
    /**
     * A detailed description of this note.
     *
     * Generated from protobuf field <code>string long_description = 3;</code>
     */
    protected $long_description = '';
    /**
     * Output only. The type of analysis. This field can be used as a filter in
     * list requests.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.NoteKind kind = 4;</code>
     */
    protected $kind = 0;
    /**
     * URLs associated with this note.
     *
     * Generated from protobuf field <code>repeated .grafeas.v1beta1.RelatedUrl related_url = 5;</code>
     */
    private $related_url;
    /**
     * Time of expiration for this note. Empty if note does not expire.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp expiration_time = 6;</code>
     */
    protected $expiration_time = null;
    /**
     * Output only. The time this note was created. This field can be used as a
     * filter in list requests.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp create_time = 7;</code>
     */
    protected $create_time = null;
    /**
     * Output only. The time this note was last updated. This field can be used as
     * a filter in list requests.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp update_time = 8;</code>
     */
    protected $update_time = null;
    /**
     * Other notes related to this note.
     *
     * Generated from protobuf field <code>repeated string related_note_names = 9;</code>
     */
    private $related_note_names;
    protected $type;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $name
     *           Output only. The name of the note in the form of
     *           `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
     *     @type string $short_description
     *           A one sentence description of this note.
     *     @type string $long_description
     *           A detailed description of this note.
     *     @type int $kind
     *           Output only. The type of analysis. This field can be used as a filter in
     *           list requests.
     *     @type \Grafeas\V1beta1\RelatedUrl[]|\Google\Protobuf\Internal\RepeatedField $related_url
     *           URLs associated with this note.
     *     @type \Google\Protobuf\Timestamp $expiration_time
     *           Time of expiration for this note. Empty if note does not expire.
     *     @type \Google\Protobuf\Timestamp $create_time
     *           Output only. The time this note was created. This field can be used as a
     *           filter in list requests.
     *     @type \Google\Protobuf\Timestamp $update_time
     *           Output only. The time this note was last updated. This field can be used as
     *           a filter in list requests.
     *     @type string[]|\Google\Protobuf\Internal\RepeatedField $related_note_names
     *           Other notes related to this note.
     *     @type \Grafeas\V1beta1\Vulnerability\Vulnerability $vulnerability
     *           A note describing a package vulnerability.
     *     @type \Grafeas\V1beta1\Build\Build $build
     *           A note describing build provenance for a verifiable build.
     *     @type \Grafeas\V1beta1\Image\Basis $base_image
     *           A note describing a base image.
     *     @type \Grafeas\V1beta1\Package\Package $package
     *           A note describing a package hosted by various package managers.
     *     @type \Grafeas\V1beta1\Deployment\Deployable $deployable
     *           A note describing something that can be deployed.
     *     @type \Grafeas\V1beta1\Discovery\Discovery $discovery
     *           A note describing the initial analysis of a resource.
     *     @type \Grafeas\V1beta1\Attestation\Authority $attestation_authority
     *           A note describing an attestation role.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Devtools\Containeranalysis\V1Beta1\Grafeas\Grafeas::initOnce();
        parent::__construct($data);
    }

    /**
     * Output only. The name of the note in the form of
     * `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
     *
     * Generated from protobuf field <code>string name = 1;</code>
     * @return string
     */
    public function getName()
    {
        return $this->name;
    }

    /**
     * Output only. The name of the note in the form of
     * `projects/[PROVIDER_ID]/notes/[NOTE_ID]`.
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
     * A one sentence description of this note.
     *
     * Generated from protobuf field <code>string short_description = 2;</code>
     * @return string
     */
    public function getShortDescription()
    {
        return $this->short_description;
    }

    /**
     * A one sentence description of this note.
     *
     * Generated from protobuf field <code>string short_description = 2;</code>
     * @param string $var
     * @return $this
     */
    public function setShortDescription($var)
    {
        GPBUtil::checkString($var, True);
        $this->short_description = $var;

        return $this;
    }

    /**
     * A detailed description of this note.
     *
     * Generated from protobuf field <code>string long_description = 3;</code>
     * @return string
     */
    public function getLongDescription()
    {
        return $this->long_description;
    }

    /**
     * A detailed description of this note.
     *
     * Generated from protobuf field <code>string long_description = 3;</code>
     * @param string $var
     * @return $this
     */
    public function setLongDescription($var)
    {
        GPBUtil::checkString($var, True);
        $this->long_description = $var;

        return $this;
    }

    /**
     * Output only. The type of analysis. This field can be used as a filter in
     * list requests.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.NoteKind kind = 4;</code>
     * @return int
     */
    public function getKind()
    {
        return $this->kind;
    }

    /**
     * Output only. The type of analysis. This field can be used as a filter in
     * list requests.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.NoteKind kind = 4;</code>
     * @param int $var
     * @return $this
     */
    public function setKind($var)
    {
        GPBUtil::checkEnum($var, \Grafeas\V1beta1\NoteKind::class);
        $this->kind = $var;

        return $this;
    }

    /**
     * URLs associated with this note.
     *
     * Generated from protobuf field <code>repeated .grafeas.v1beta1.RelatedUrl related_url = 5;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getRelatedUrl()
    {
        return $this->related_url;
    }

    /**
     * URLs associated with this note.
     *
     * Generated from protobuf field <code>repeated .grafeas.v1beta1.RelatedUrl related_url = 5;</code>
     * @param \Grafeas\V1beta1\RelatedUrl[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setRelatedUrl($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::MESSAGE, \Grafeas\V1beta1\RelatedUrl::class);
        $this->related_url = $arr;

        return $this;
    }

    /**
     * Time of expiration for this note. Empty if note does not expire.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp expiration_time = 6;</code>
     * @return \Google\Protobuf\Timestamp
     */
    public function getExpirationTime()
    {
        return $this->expiration_time;
    }

    /**
     * Time of expiration for this note. Empty if note does not expire.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp expiration_time = 6;</code>
     * @param \Google\Protobuf\Timestamp $var
     * @return $this
     */
    public function setExpirationTime($var)
    {
        GPBUtil::checkMessage($var, \Google\Protobuf\Timestamp::class);
        $this->expiration_time = $var;

        return $this;
    }

    /**
     * Output only. The time this note was created. This field can be used as a
     * filter in list requests.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp create_time = 7;</code>
     * @return \Google\Protobuf\Timestamp
     */
    public function getCreateTime()
    {
        return $this->create_time;
    }

    /**
     * Output only. The time this note was created. This field can be used as a
     * filter in list requests.
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
     * Output only. The time this note was last updated. This field can be used as
     * a filter in list requests.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp update_time = 8;</code>
     * @return \Google\Protobuf\Timestamp
     */
    public function getUpdateTime()
    {
        return $this->update_time;
    }

    /**
     * Output only. The time this note was last updated. This field can be used as
     * a filter in list requests.
     *
     * Generated from protobuf field <code>.google.protobuf.Timestamp update_time = 8;</code>
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
     * Other notes related to this note.
     *
     * Generated from protobuf field <code>repeated string related_note_names = 9;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getRelatedNoteNames()
    {
        return $this->related_note_names;
    }

    /**
     * Other notes related to this note.
     *
     * Generated from protobuf field <code>repeated string related_note_names = 9;</code>
     * @param string[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setRelatedNoteNames($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::STRING);
        $this->related_note_names = $arr;

        return $this;
    }

    /**
     * A note describing a package vulnerability.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.vulnerability.Vulnerability vulnerability = 10;</code>
     * @return \Grafeas\V1beta1\Vulnerability\Vulnerability
     */
    public function getVulnerability()
    {
        return $this->readOneof(10);
    }

    /**
     * A note describing a package vulnerability.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.vulnerability.Vulnerability vulnerability = 10;</code>
     * @param \Grafeas\V1beta1\Vulnerability\Vulnerability $var
     * @return $this
     */
    public function setVulnerability($var)
    {
        GPBUtil::checkMessage($var, \Grafeas\V1beta1\Vulnerability\Vulnerability::class);
        $this->writeOneof(10, $var);

        return $this;
    }

    /**
     * A note describing build provenance for a verifiable build.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.build.Build build = 11;</code>
     * @return \Grafeas\V1beta1\Build\Build
     */
    public function getBuild()
    {
        return $this->readOneof(11);
    }

    /**
     * A note describing build provenance for a verifiable build.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.build.Build build = 11;</code>
     * @param \Grafeas\V1beta1\Build\Build $var
     * @return $this
     */
    public function setBuild($var)
    {
        GPBUtil::checkMessage($var, \Grafeas\V1beta1\Build\Build::class);
        $this->writeOneof(11, $var);

        return $this;
    }

    /**
     * A note describing a base image.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.image.Basis base_image = 12;</code>
     * @return \Grafeas\V1beta1\Image\Basis
     */
    public function getBaseImage()
    {
        return $this->readOneof(12);
    }

    /**
     * A note describing a base image.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.image.Basis base_image = 12;</code>
     * @param \Grafeas\V1beta1\Image\Basis $var
     * @return $this
     */
    public function setBaseImage($var)
    {
        GPBUtil::checkMessage($var, \Grafeas\V1beta1\Image\Basis::class);
        $this->writeOneof(12, $var);

        return $this;
    }

    /**
     * A note describing a package hosted by various package managers.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.package.Package package = 13;</code>
     * @return \Grafeas\V1beta1\Package\Package
     */
    public function getPackage()
    {
        return $this->readOneof(13);
    }

    /**
     * A note describing a package hosted by various package managers.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.package.Package package = 13;</code>
     * @param \Grafeas\V1beta1\Package\Package $var
     * @return $this
     */
    public function setPackage($var)
    {
        GPBUtil::checkMessage($var, \Grafeas\V1beta1\Package\Package::class);
        $this->writeOneof(13, $var);

        return $this;
    }

    /**
     * A note describing something that can be deployed.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.deployment.Deployable deployable = 14;</code>
     * @return \Grafeas\V1beta1\Deployment\Deployable
     */
    public function getDeployable()
    {
        return $this->readOneof(14);
    }

    /**
     * A note describing something that can be deployed.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.deployment.Deployable deployable = 14;</code>
     * @param \Grafeas\V1beta1\Deployment\Deployable $var
     * @return $this
     */
    public function setDeployable($var)
    {
        GPBUtil::checkMessage($var, \Grafeas\V1beta1\Deployment\Deployable::class);
        $this->writeOneof(14, $var);

        return $this;
    }

    /**
     * A note describing the initial analysis of a resource.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.discovery.Discovery discovery = 15;</code>
     * @return \Grafeas\V1beta1\Discovery\Discovery
     */
    public function getDiscovery()
    {
        return $this->readOneof(15);
    }

    /**
     * A note describing the initial analysis of a resource.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.discovery.Discovery discovery = 15;</code>
     * @param \Grafeas\V1beta1\Discovery\Discovery $var
     * @return $this
     */
    public function setDiscovery($var)
    {
        GPBUtil::checkMessage($var, \Grafeas\V1beta1\Discovery\Discovery::class);
        $this->writeOneof(15, $var);

        return $this;
    }

    /**
     * A note describing an attestation role.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.attestation.Authority attestation_authority = 16;</code>
     * @return \Grafeas\V1beta1\Attestation\Authority
     */
    public function getAttestationAuthority()
    {
        return $this->readOneof(16);
    }

    /**
     * A note describing an attestation role.
     *
     * Generated from protobuf field <code>.grafeas.v1beta1.attestation.Authority attestation_authority = 16;</code>
     * @param \Grafeas\V1beta1\Attestation\Authority $var
     * @return $this
     */
    public function setAttestationAuthority($var)
    {
        GPBUtil::checkMessage($var, \Grafeas\V1beta1\Attestation\Authority::class);
        $this->writeOneof(16, $var);

        return $this;
    }

    /**
     * @return string
     */
    public function getType()
    {
        return $this->whichOneof("type");
    }

}

