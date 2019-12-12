<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/dataproc/v1beta2/clusters.proto

namespace Google\Cloud\Dataproc\V1beta2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Common config settings for resources of Compute Engine cluster
 * instances, applicable to all instances in the cluster.
 *
 * Generated from protobuf message <code>google.cloud.dataproc.v1beta2.GceClusterConfig</code>
 */
final class GceClusterConfig extends \Google\Protobuf\Internal\Message
{
    /**
     * Optional. The zone where the Compute Engine cluster will be located.
     * On a create request, it is required in the "global" region. If omitted
     * in a non-global Cloud Dataproc region, the service will pick a zone in the
     * corresponding Compute Engine region. On a get request, zone will always be
     * present.
     * A full URL, partial URI, or short name are valid. Examples:
     * * `https://www.googleapis.com/compute/v1/projects/[project_id]/zones/[zone]`
     * * `projects/[project_id]/zones/[zone]`
     * * `us-central1-f`
     *
     * Generated from protobuf field <code>string zone_uri = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private $zone_uri = '';
    /**
     * Optional. The Compute Engine network to be used for machine
     * communications. Cannot be specified with subnetwork_uri. If neither
     * `network_uri` nor `subnetwork_uri` is specified, the "default" network of
     * the project is used, if it exists. Cannot be a "Custom Subnet Network" (see
     * [Using Subnetworks](/compute/docs/subnetworks) for more information).
     * A full URL, partial URI, or short name are valid. Examples:
     * * `https://www.googleapis.com/compute/v1/projects/[project_id]/regions/global/default`
     * * `projects/[project_id]/regions/global/default`
     * * `default`
     *
     * Generated from protobuf field <code>string network_uri = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private $network_uri = '';
    /**
     * Optional. The Compute Engine subnetwork to be used for machine
     * communications. Cannot be specified with network_uri.
     * A full URL, partial URI, or short name are valid. Examples:
     * * `https://www.googleapis.com/compute/v1/projects/[project_id]/regions/us-east1/subnetworks/sub0`
     * * `projects/[project_id]/regions/us-east1/subnetworks/sub0`
     * * `sub0`
     *
     * Generated from protobuf field <code>string subnetwork_uri = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private $subnetwork_uri = '';
    /**
     * Optional. If true, all instances in the cluster will only have internal IP
     * addresses. By default, clusters are not restricted to internal IP
     * addresses, and will have ephemeral external IP addresses assigned to each
     * instance. This `internal_ip_only` restriction can only be enabled for
     * subnetwork enabled networks, and all off-cluster dependencies must be
     * configured to be accessible without external IP addresses.
     *
     * Generated from protobuf field <code>bool internal_ip_only = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private $internal_ip_only = false;
    /**
     * Optional. The service account of the instances. Defaults to the default
     * Compute Engine service account. Custom service accounts need
     * permissions equivalent to the following IAM roles:
     * * roles/logging.logWriter
     * * roles/storage.objectAdmin
     * (see
     * https://cloud.google.com/compute/docs/access/service-accounts#custom_service_accounts
     * for more information).
     * Example: `[account_id]&#64;[project_id].iam.gserviceaccount.com`
     *
     * Generated from protobuf field <code>string service_account = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private $service_account = '';
    /**
     * Optional. The URIs of service account scopes to be included in
     * Compute Engine instances. The following base set of scopes is always
     * included:
     * * https://www.googleapis.com/auth/cloud.useraccounts.readonly
     * * https://www.googleapis.com/auth/devstorage.read_write
     * * https://www.googleapis.com/auth/logging.write
     * If no scopes are specified, the following defaults are also provided:
     * * https://www.googleapis.com/auth/bigquery
     * * https://www.googleapis.com/auth/bigtable.admin.table
     * * https://www.googleapis.com/auth/bigtable.data
     * * https://www.googleapis.com/auth/devstorage.full_control
     *
     * Generated from protobuf field <code>repeated string service_account_scopes = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private $service_account_scopes;
    /**
     * The Compute Engine tags to add to all instances (see
     * [Tagging instances](/compute/docs/label-or-tag-resources#tags)).
     *
     * Generated from protobuf field <code>repeated string tags = 4;</code>
     */
    private $tags;
    /**
     * The Compute Engine metadata entries to add to all instances (see
     * [Project and instance
     * metadata](https://cloud.google.com/compute/docs/storing-retrieving-metadata#project_and_instance_metadata)).
     *
     * Generated from protobuf field <code>map<string, string> metadata = 5;</code>
     */
    private $metadata;
    /**
     * Optional. Reservation Affinity for consuming Zonal reservation.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.ReservationAffinity reservation_affinity = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private $reservation_affinity = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $zone_uri
     *           Optional. The zone where the Compute Engine cluster will be located.
     *           On a create request, it is required in the "global" region. If omitted
     *           in a non-global Cloud Dataproc region, the service will pick a zone in the
     *           corresponding Compute Engine region. On a get request, zone will always be
     *           present.
     *           A full URL, partial URI, or short name are valid. Examples:
     *           * `https://www.googleapis.com/compute/v1/projects/[project_id]/zones/[zone]`
     *           * `projects/[project_id]/zones/[zone]`
     *           * `us-central1-f`
     *     @type string $network_uri
     *           Optional. The Compute Engine network to be used for machine
     *           communications. Cannot be specified with subnetwork_uri. If neither
     *           `network_uri` nor `subnetwork_uri` is specified, the "default" network of
     *           the project is used, if it exists. Cannot be a "Custom Subnet Network" (see
     *           [Using Subnetworks](/compute/docs/subnetworks) for more information).
     *           A full URL, partial URI, or short name are valid. Examples:
     *           * `https://www.googleapis.com/compute/v1/projects/[project_id]/regions/global/default`
     *           * `projects/[project_id]/regions/global/default`
     *           * `default`
     *     @type string $subnetwork_uri
     *           Optional. The Compute Engine subnetwork to be used for machine
     *           communications. Cannot be specified with network_uri.
     *           A full URL, partial URI, or short name are valid. Examples:
     *           * `https://www.googleapis.com/compute/v1/projects/[project_id]/regions/us-east1/subnetworks/sub0`
     *           * `projects/[project_id]/regions/us-east1/subnetworks/sub0`
     *           * `sub0`
     *     @type bool $internal_ip_only
     *           Optional. If true, all instances in the cluster will only have internal IP
     *           addresses. By default, clusters are not restricted to internal IP
     *           addresses, and will have ephemeral external IP addresses assigned to each
     *           instance. This `internal_ip_only` restriction can only be enabled for
     *           subnetwork enabled networks, and all off-cluster dependencies must be
     *           configured to be accessible without external IP addresses.
     *     @type string $service_account
     *           Optional. The service account of the instances. Defaults to the default
     *           Compute Engine service account. Custom service accounts need
     *           permissions equivalent to the following IAM roles:
     *           * roles/logging.logWriter
     *           * roles/storage.objectAdmin
     *           (see
     *           https://cloud.google.com/compute/docs/access/service-accounts#custom_service_accounts
     *           for more information).
     *           Example: `[account_id]&#64;[project_id].iam.gserviceaccount.com`
     *     @type string[]|\Google\Protobuf\Internal\RepeatedField $service_account_scopes
     *           Optional. The URIs of service account scopes to be included in
     *           Compute Engine instances. The following base set of scopes is always
     *           included:
     *           * https://www.googleapis.com/auth/cloud.useraccounts.readonly
     *           * https://www.googleapis.com/auth/devstorage.read_write
     *           * https://www.googleapis.com/auth/logging.write
     *           If no scopes are specified, the following defaults are also provided:
     *           * https://www.googleapis.com/auth/bigquery
     *           * https://www.googleapis.com/auth/bigtable.admin.table
     *           * https://www.googleapis.com/auth/bigtable.data
     *           * https://www.googleapis.com/auth/devstorage.full_control
     *     @type string[]|\Google\Protobuf\Internal\RepeatedField $tags
     *           The Compute Engine tags to add to all instances (see
     *           [Tagging instances](/compute/docs/label-or-tag-resources#tags)).
     *     @type array|\Google\Protobuf\Internal\MapField $metadata
     *           The Compute Engine metadata entries to add to all instances (see
     *           [Project and instance
     *           metadata](https://cloud.google.com/compute/docs/storing-retrieving-metadata#project_and_instance_metadata)).
     *     @type \Google\Cloud\Dataproc\V1beta2\ReservationAffinity $reservation_affinity
     *           Optional. Reservation Affinity for consuming Zonal reservation.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Cloud\Dataproc\V1Beta2\Clusters::initOnce();
        parent::__construct($data);
    }

    /**
     * Optional. The zone where the Compute Engine cluster will be located.
     * On a create request, it is required in the "global" region. If omitted
     * in a non-global Cloud Dataproc region, the service will pick a zone in the
     * corresponding Compute Engine region. On a get request, zone will always be
     * present.
     * A full URL, partial URI, or short name are valid. Examples:
     * * `https://www.googleapis.com/compute/v1/projects/[project_id]/zones/[zone]`
     * * `projects/[project_id]/zones/[zone]`
     * * `us-central1-f`
     *
     * Generated from protobuf field <code>string zone_uri = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return string
     */
    public function getZoneUri()
    {
        return $this->zone_uri;
    }

    /**
     * Optional. The zone where the Compute Engine cluster will be located.
     * On a create request, it is required in the "global" region. If omitted
     * in a non-global Cloud Dataproc region, the service will pick a zone in the
     * corresponding Compute Engine region. On a get request, zone will always be
     * present.
     * A full URL, partial URI, or short name are valid. Examples:
     * * `https://www.googleapis.com/compute/v1/projects/[project_id]/zones/[zone]`
     * * `projects/[project_id]/zones/[zone]`
     * * `us-central1-f`
     *
     * Generated from protobuf field <code>string zone_uri = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param string $var
     * @return $this
     */
    public function setZoneUri($var)
    {
        GPBUtil::checkString($var, True);
        $this->zone_uri = $var;

        return $this;
    }

    /**
     * Optional. The Compute Engine network to be used for machine
     * communications. Cannot be specified with subnetwork_uri. If neither
     * `network_uri` nor `subnetwork_uri` is specified, the "default" network of
     * the project is used, if it exists. Cannot be a "Custom Subnet Network" (see
     * [Using Subnetworks](/compute/docs/subnetworks) for more information).
     * A full URL, partial URI, or short name are valid. Examples:
     * * `https://www.googleapis.com/compute/v1/projects/[project_id]/regions/global/default`
     * * `projects/[project_id]/regions/global/default`
     * * `default`
     *
     * Generated from protobuf field <code>string network_uri = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return string
     */
    public function getNetworkUri()
    {
        return $this->network_uri;
    }

    /**
     * Optional. The Compute Engine network to be used for machine
     * communications. Cannot be specified with subnetwork_uri. If neither
     * `network_uri` nor `subnetwork_uri` is specified, the "default" network of
     * the project is used, if it exists. Cannot be a "Custom Subnet Network" (see
     * [Using Subnetworks](/compute/docs/subnetworks) for more information).
     * A full URL, partial URI, or short name are valid. Examples:
     * * `https://www.googleapis.com/compute/v1/projects/[project_id]/regions/global/default`
     * * `projects/[project_id]/regions/global/default`
     * * `default`
     *
     * Generated from protobuf field <code>string network_uri = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param string $var
     * @return $this
     */
    public function setNetworkUri($var)
    {
        GPBUtil::checkString($var, True);
        $this->network_uri = $var;

        return $this;
    }

    /**
     * Optional. The Compute Engine subnetwork to be used for machine
     * communications. Cannot be specified with network_uri.
     * A full URL, partial URI, or short name are valid. Examples:
     * * `https://www.googleapis.com/compute/v1/projects/[project_id]/regions/us-east1/subnetworks/sub0`
     * * `projects/[project_id]/regions/us-east1/subnetworks/sub0`
     * * `sub0`
     *
     * Generated from protobuf field <code>string subnetwork_uri = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return string
     */
    public function getSubnetworkUri()
    {
        return $this->subnetwork_uri;
    }

    /**
     * Optional. The Compute Engine subnetwork to be used for machine
     * communications. Cannot be specified with network_uri.
     * A full URL, partial URI, or short name are valid. Examples:
     * * `https://www.googleapis.com/compute/v1/projects/[project_id]/regions/us-east1/subnetworks/sub0`
     * * `projects/[project_id]/regions/us-east1/subnetworks/sub0`
     * * `sub0`
     *
     * Generated from protobuf field <code>string subnetwork_uri = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param string $var
     * @return $this
     */
    public function setSubnetworkUri($var)
    {
        GPBUtil::checkString($var, True);
        $this->subnetwork_uri = $var;

        return $this;
    }

    /**
     * Optional. If true, all instances in the cluster will only have internal IP
     * addresses. By default, clusters are not restricted to internal IP
     * addresses, and will have ephemeral external IP addresses assigned to each
     * instance. This `internal_ip_only` restriction can only be enabled for
     * subnetwork enabled networks, and all off-cluster dependencies must be
     * configured to be accessible without external IP addresses.
     *
     * Generated from protobuf field <code>bool internal_ip_only = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return bool
     */
    public function getInternalIpOnly()
    {
        return $this->internal_ip_only;
    }

    /**
     * Optional. If true, all instances in the cluster will only have internal IP
     * addresses. By default, clusters are not restricted to internal IP
     * addresses, and will have ephemeral external IP addresses assigned to each
     * instance. This `internal_ip_only` restriction can only be enabled for
     * subnetwork enabled networks, and all off-cluster dependencies must be
     * configured to be accessible without external IP addresses.
     *
     * Generated from protobuf field <code>bool internal_ip_only = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param bool $var
     * @return $this
     */
    public function setInternalIpOnly($var)
    {
        GPBUtil::checkBool($var);
        $this->internal_ip_only = $var;

        return $this;
    }

    /**
     * Optional. The service account of the instances. Defaults to the default
     * Compute Engine service account. Custom service accounts need
     * permissions equivalent to the following IAM roles:
     * * roles/logging.logWriter
     * * roles/storage.objectAdmin
     * (see
     * https://cloud.google.com/compute/docs/access/service-accounts#custom_service_accounts
     * for more information).
     * Example: `[account_id]&#64;[project_id].iam.gserviceaccount.com`
     *
     * Generated from protobuf field <code>string service_account = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return string
     */
    public function getServiceAccount()
    {
        return $this->service_account;
    }

    /**
     * Optional. The service account of the instances. Defaults to the default
     * Compute Engine service account. Custom service accounts need
     * permissions equivalent to the following IAM roles:
     * * roles/logging.logWriter
     * * roles/storage.objectAdmin
     * (see
     * https://cloud.google.com/compute/docs/access/service-accounts#custom_service_accounts
     * for more information).
     * Example: `[account_id]&#64;[project_id].iam.gserviceaccount.com`
     *
     * Generated from protobuf field <code>string service_account = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param string $var
     * @return $this
     */
    public function setServiceAccount($var)
    {
        GPBUtil::checkString($var, True);
        $this->service_account = $var;

        return $this;
    }

    /**
     * Optional. The URIs of service account scopes to be included in
     * Compute Engine instances. The following base set of scopes is always
     * included:
     * * https://www.googleapis.com/auth/cloud.useraccounts.readonly
     * * https://www.googleapis.com/auth/devstorage.read_write
     * * https://www.googleapis.com/auth/logging.write
     * If no scopes are specified, the following defaults are also provided:
     * * https://www.googleapis.com/auth/bigquery
     * * https://www.googleapis.com/auth/bigtable.admin.table
     * * https://www.googleapis.com/auth/bigtable.data
     * * https://www.googleapis.com/auth/devstorage.full_control
     *
     * Generated from protobuf field <code>repeated string service_account_scopes = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getServiceAccountScopes()
    {
        return $this->service_account_scopes;
    }

    /**
     * Optional. The URIs of service account scopes to be included in
     * Compute Engine instances. The following base set of scopes is always
     * included:
     * * https://www.googleapis.com/auth/cloud.useraccounts.readonly
     * * https://www.googleapis.com/auth/devstorage.read_write
     * * https://www.googleapis.com/auth/logging.write
     * If no scopes are specified, the following defaults are also provided:
     * * https://www.googleapis.com/auth/bigquery
     * * https://www.googleapis.com/auth/bigtable.admin.table
     * * https://www.googleapis.com/auth/bigtable.data
     * * https://www.googleapis.com/auth/devstorage.full_control
     *
     * Generated from protobuf field <code>repeated string service_account_scopes = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param string[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setServiceAccountScopes($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::STRING);
        $this->service_account_scopes = $arr;

        return $this;
    }

    /**
     * The Compute Engine tags to add to all instances (see
     * [Tagging instances](/compute/docs/label-or-tag-resources#tags)).
     *
     * Generated from protobuf field <code>repeated string tags = 4;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getTags()
    {
        return $this->tags;
    }

    /**
     * The Compute Engine tags to add to all instances (see
     * [Tagging instances](/compute/docs/label-or-tag-resources#tags)).
     *
     * Generated from protobuf field <code>repeated string tags = 4;</code>
     * @param string[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setTags($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::STRING);
        $this->tags = $arr;

        return $this;
    }

    /**
     * The Compute Engine metadata entries to add to all instances (see
     * [Project and instance
     * metadata](https://cloud.google.com/compute/docs/storing-retrieving-metadata#project_and_instance_metadata)).
     *
     * Generated from protobuf field <code>map<string, string> metadata = 5;</code>
     * @return \Google\Protobuf\Internal\MapField
     */
    public function getMetadata()
    {
        return $this->metadata;
    }

    /**
     * The Compute Engine metadata entries to add to all instances (see
     * [Project and instance
     * metadata](https://cloud.google.com/compute/docs/storing-retrieving-metadata#project_and_instance_metadata)).
     *
     * Generated from protobuf field <code>map<string, string> metadata = 5;</code>
     * @param array|\Google\Protobuf\Internal\MapField $var
     * @return $this
     */
    public function setMetadata($var)
    {
        $arr = GPBUtil::checkMapField($var, \Google\Protobuf\Internal\GPBType::STRING, \Google\Protobuf\Internal\GPBType::STRING);
        $this->metadata = $arr;

        return $this;
    }

    /**
     * Optional. Reservation Affinity for consuming Zonal reservation.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.ReservationAffinity reservation_affinity = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return \Google\Cloud\Dataproc\V1beta2\ReservationAffinity
     */
    public function getReservationAffinity()
    {
        return $this->reservation_affinity;
    }

    /**
     * Optional. Reservation Affinity for consuming Zonal reservation.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.ReservationAffinity reservation_affinity = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param \Google\Cloud\Dataproc\V1beta2\ReservationAffinity $var
     * @return $this
     */
    public function setReservationAffinity($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dataproc\V1beta2\ReservationAffinity::class);
        $this->reservation_affinity = $var;

        return $this;
    }

}

