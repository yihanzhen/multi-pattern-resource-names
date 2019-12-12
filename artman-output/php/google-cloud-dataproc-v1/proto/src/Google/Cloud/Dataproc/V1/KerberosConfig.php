<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/dataproc/v1/clusters.proto

namespace Google\Cloud\Dataproc\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Specifies Kerberos related configuration.
 *
 * Generated from protobuf message <code>google.cloud.dataproc.v1.KerberosConfig</code>
 */
final class KerberosConfig extends \Google\Protobuf\Internal\Message
{
    /**
     * Optional. Flag to indicate whether to Kerberize the cluster.
     *
     * Generated from protobuf field <code>bool enable_kerberos = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private $enable_kerberos = false;
    /**
     * Required. The Cloud Storage URI of a KMS encrypted file containing the root
     * principal password.
     *
     * Generated from protobuf field <code>string root_principal_password_uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private $root_principal_password_uri = '';
    /**
     * Required. The uri of the KMS key used to encrypt various sensitive
     * files.
     *
     * Generated from protobuf field <code>string kms_key_uri = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private $kms_key_uri = '';
    /**
     * Optional. The Cloud Storage URI of the keystore file used for SSL
     * encryption. If not provided, Dataproc will provide a self-signed
     * certificate.
     *
     * Generated from protobuf field <code>string keystore_uri = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private $keystore_uri = '';
    /**
     * Optional. The Cloud Storage URI of the truststore file used for SSL
     * encryption. If not provided, Dataproc will provide a self-signed
     * certificate.
     *
     * Generated from protobuf field <code>string truststore_uri = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private $truststore_uri = '';
    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the
     * password to the user provided keystore. For the self-signed certificate,
     * this password is generated by Dataproc.
     *
     * Generated from protobuf field <code>string keystore_password_uri = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private $keystore_password_uri = '';
    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the
     * password to the user provided key. For the self-signed certificate, this
     * password is generated by Dataproc.
     *
     * Generated from protobuf field <code>string key_password_uri = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private $key_password_uri = '';
    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the
     * password to the user provided truststore. For the self-signed certificate,
     * this password is generated by Dataproc.
     *
     * Generated from protobuf field <code>string truststore_password_uri = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private $truststore_password_uri = '';
    /**
     * Optional. The remote realm the Dataproc on-cluster KDC will trust, should
     * the user enable cross realm trust.
     *
     * Generated from protobuf field <code>string cross_realm_trust_realm = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private $cross_realm_trust_realm = '';
    /**
     * Optional. The KDC (IP or hostname) for the remote trusted realm in a cross
     * realm trust relationship.
     *
     * Generated from protobuf field <code>string cross_realm_trust_kdc = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private $cross_realm_trust_kdc = '';
    /**
     * Optional. The admin server (IP or hostname) for the remote trusted realm in
     * a cross realm trust relationship.
     *
     * Generated from protobuf field <code>string cross_realm_trust_admin_server = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private $cross_realm_trust_admin_server = '';
    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the
     * shared password between the on-cluster Kerberos realm and the remote
     * trusted realm, in a cross realm trust relationship.
     *
     * Generated from protobuf field <code>string cross_realm_trust_shared_password_uri = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private $cross_realm_trust_shared_password_uri = '';
    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the
     * master key of the KDC database.
     *
     * Generated from protobuf field <code>string kdc_db_key_uri = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private $kdc_db_key_uri = '';
    /**
     * Optional. The lifetime of the ticket granting ticket, in hours.
     * If not specified, or user specifies 0, then default value 10
     * will be used.
     *
     * Generated from protobuf field <code>int32 tgt_lifetime_hours = 14 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private $tgt_lifetime_hours = 0;
    /**
     * Optional. The name of the on-cluster Kerberos realm.
     * If not specified, the uppercased domain of hostnames will be the realm.
     *
     * Generated from protobuf field <code>string realm = 15 [(.google.api.field_behavior) = OPTIONAL];</code>
     */
    private $realm = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type bool $enable_kerberos
     *           Optional. Flag to indicate whether to Kerberize the cluster.
     *     @type string $root_principal_password_uri
     *           Required. The Cloud Storage URI of a KMS encrypted file containing the root
     *           principal password.
     *     @type string $kms_key_uri
     *           Required. The uri of the KMS key used to encrypt various sensitive
     *           files.
     *     @type string $keystore_uri
     *           Optional. The Cloud Storage URI of the keystore file used for SSL
     *           encryption. If not provided, Dataproc will provide a self-signed
     *           certificate.
     *     @type string $truststore_uri
     *           Optional. The Cloud Storage URI of the truststore file used for SSL
     *           encryption. If not provided, Dataproc will provide a self-signed
     *           certificate.
     *     @type string $keystore_password_uri
     *           Optional. The Cloud Storage URI of a KMS encrypted file containing the
     *           password to the user provided keystore. For the self-signed certificate,
     *           this password is generated by Dataproc.
     *     @type string $key_password_uri
     *           Optional. The Cloud Storage URI of a KMS encrypted file containing the
     *           password to the user provided key. For the self-signed certificate, this
     *           password is generated by Dataproc.
     *     @type string $truststore_password_uri
     *           Optional. The Cloud Storage URI of a KMS encrypted file containing the
     *           password to the user provided truststore. For the self-signed certificate,
     *           this password is generated by Dataproc.
     *     @type string $cross_realm_trust_realm
     *           Optional. The remote realm the Dataproc on-cluster KDC will trust, should
     *           the user enable cross realm trust.
     *     @type string $cross_realm_trust_kdc
     *           Optional. The KDC (IP or hostname) for the remote trusted realm in a cross
     *           realm trust relationship.
     *     @type string $cross_realm_trust_admin_server
     *           Optional. The admin server (IP or hostname) for the remote trusted realm in
     *           a cross realm trust relationship.
     *     @type string $cross_realm_trust_shared_password_uri
     *           Optional. The Cloud Storage URI of a KMS encrypted file containing the
     *           shared password between the on-cluster Kerberos realm and the remote
     *           trusted realm, in a cross realm trust relationship.
     *     @type string $kdc_db_key_uri
     *           Optional. The Cloud Storage URI of a KMS encrypted file containing the
     *           master key of the KDC database.
     *     @type int $tgt_lifetime_hours
     *           Optional. The lifetime of the ticket granting ticket, in hours.
     *           If not specified, or user specifies 0, then default value 10
     *           will be used.
     *     @type string $realm
     *           Optional. The name of the on-cluster Kerberos realm.
     *           If not specified, the uppercased domain of hostnames will be the realm.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Cloud\Dataproc\V1\Clusters::initOnce();
        parent::__construct($data);
    }

    /**
     * Optional. Flag to indicate whether to Kerberize the cluster.
     *
     * Generated from protobuf field <code>bool enable_kerberos = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return bool
     */
    public function getEnableKerberos()
    {
        return $this->enable_kerberos;
    }

    /**
     * Optional. Flag to indicate whether to Kerberize the cluster.
     *
     * Generated from protobuf field <code>bool enable_kerberos = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param bool $var
     * @return $this
     */
    public function setEnableKerberos($var)
    {
        GPBUtil::checkBool($var);
        $this->enable_kerberos = $var;

        return $this;
    }

    /**
     * Required. The Cloud Storage URI of a KMS encrypted file containing the root
     * principal password.
     *
     * Generated from protobuf field <code>string root_principal_password_uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return string
     */
    public function getRootPrincipalPasswordUri()
    {
        return $this->root_principal_password_uri;
    }

    /**
     * Required. The Cloud Storage URI of a KMS encrypted file containing the root
     * principal password.
     *
     * Generated from protobuf field <code>string root_principal_password_uri = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param string $var
     * @return $this
     */
    public function setRootPrincipalPasswordUri($var)
    {
        GPBUtil::checkString($var, True);
        $this->root_principal_password_uri = $var;

        return $this;
    }

    /**
     * Required. The uri of the KMS key used to encrypt various sensitive
     * files.
     *
     * Generated from protobuf field <code>string kms_key_uri = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @return string
     */
    public function getKmsKeyUri()
    {
        return $this->kms_key_uri;
    }

    /**
     * Required. The uri of the KMS key used to encrypt various sensitive
     * files.
     *
     * Generated from protobuf field <code>string kms_key_uri = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     * @param string $var
     * @return $this
     */
    public function setKmsKeyUri($var)
    {
        GPBUtil::checkString($var, True);
        $this->kms_key_uri = $var;

        return $this;
    }

    /**
     * Optional. The Cloud Storage URI of the keystore file used for SSL
     * encryption. If not provided, Dataproc will provide a self-signed
     * certificate.
     *
     * Generated from protobuf field <code>string keystore_uri = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return string
     */
    public function getKeystoreUri()
    {
        return $this->keystore_uri;
    }

    /**
     * Optional. The Cloud Storage URI of the keystore file used for SSL
     * encryption. If not provided, Dataproc will provide a self-signed
     * certificate.
     *
     * Generated from protobuf field <code>string keystore_uri = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param string $var
     * @return $this
     */
    public function setKeystoreUri($var)
    {
        GPBUtil::checkString($var, True);
        $this->keystore_uri = $var;

        return $this;
    }

    /**
     * Optional. The Cloud Storage URI of the truststore file used for SSL
     * encryption. If not provided, Dataproc will provide a self-signed
     * certificate.
     *
     * Generated from protobuf field <code>string truststore_uri = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return string
     */
    public function getTruststoreUri()
    {
        return $this->truststore_uri;
    }

    /**
     * Optional. The Cloud Storage URI of the truststore file used for SSL
     * encryption. If not provided, Dataproc will provide a self-signed
     * certificate.
     *
     * Generated from protobuf field <code>string truststore_uri = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param string $var
     * @return $this
     */
    public function setTruststoreUri($var)
    {
        GPBUtil::checkString($var, True);
        $this->truststore_uri = $var;

        return $this;
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the
     * password to the user provided keystore. For the self-signed certificate,
     * this password is generated by Dataproc.
     *
     * Generated from protobuf field <code>string keystore_password_uri = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return string
     */
    public function getKeystorePasswordUri()
    {
        return $this->keystore_password_uri;
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the
     * password to the user provided keystore. For the self-signed certificate,
     * this password is generated by Dataproc.
     *
     * Generated from protobuf field <code>string keystore_password_uri = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param string $var
     * @return $this
     */
    public function setKeystorePasswordUri($var)
    {
        GPBUtil::checkString($var, True);
        $this->keystore_password_uri = $var;

        return $this;
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the
     * password to the user provided key. For the self-signed certificate, this
     * password is generated by Dataproc.
     *
     * Generated from protobuf field <code>string key_password_uri = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return string
     */
    public function getKeyPasswordUri()
    {
        return $this->key_password_uri;
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the
     * password to the user provided key. For the self-signed certificate, this
     * password is generated by Dataproc.
     *
     * Generated from protobuf field <code>string key_password_uri = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param string $var
     * @return $this
     */
    public function setKeyPasswordUri($var)
    {
        GPBUtil::checkString($var, True);
        $this->key_password_uri = $var;

        return $this;
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the
     * password to the user provided truststore. For the self-signed certificate,
     * this password is generated by Dataproc.
     *
     * Generated from protobuf field <code>string truststore_password_uri = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return string
     */
    public function getTruststorePasswordUri()
    {
        return $this->truststore_password_uri;
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the
     * password to the user provided truststore. For the self-signed certificate,
     * this password is generated by Dataproc.
     *
     * Generated from protobuf field <code>string truststore_password_uri = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param string $var
     * @return $this
     */
    public function setTruststorePasswordUri($var)
    {
        GPBUtil::checkString($var, True);
        $this->truststore_password_uri = $var;

        return $this;
    }

    /**
     * Optional. The remote realm the Dataproc on-cluster KDC will trust, should
     * the user enable cross realm trust.
     *
     * Generated from protobuf field <code>string cross_realm_trust_realm = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return string
     */
    public function getCrossRealmTrustRealm()
    {
        return $this->cross_realm_trust_realm;
    }

    /**
     * Optional. The remote realm the Dataproc on-cluster KDC will trust, should
     * the user enable cross realm trust.
     *
     * Generated from protobuf field <code>string cross_realm_trust_realm = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param string $var
     * @return $this
     */
    public function setCrossRealmTrustRealm($var)
    {
        GPBUtil::checkString($var, True);
        $this->cross_realm_trust_realm = $var;

        return $this;
    }

    /**
     * Optional. The KDC (IP or hostname) for the remote trusted realm in a cross
     * realm trust relationship.
     *
     * Generated from protobuf field <code>string cross_realm_trust_kdc = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return string
     */
    public function getCrossRealmTrustKdc()
    {
        return $this->cross_realm_trust_kdc;
    }

    /**
     * Optional. The KDC (IP or hostname) for the remote trusted realm in a cross
     * realm trust relationship.
     *
     * Generated from protobuf field <code>string cross_realm_trust_kdc = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param string $var
     * @return $this
     */
    public function setCrossRealmTrustKdc($var)
    {
        GPBUtil::checkString($var, True);
        $this->cross_realm_trust_kdc = $var;

        return $this;
    }

    /**
     * Optional. The admin server (IP or hostname) for the remote trusted realm in
     * a cross realm trust relationship.
     *
     * Generated from protobuf field <code>string cross_realm_trust_admin_server = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return string
     */
    public function getCrossRealmTrustAdminServer()
    {
        return $this->cross_realm_trust_admin_server;
    }

    /**
     * Optional. The admin server (IP or hostname) for the remote trusted realm in
     * a cross realm trust relationship.
     *
     * Generated from protobuf field <code>string cross_realm_trust_admin_server = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param string $var
     * @return $this
     */
    public function setCrossRealmTrustAdminServer($var)
    {
        GPBUtil::checkString($var, True);
        $this->cross_realm_trust_admin_server = $var;

        return $this;
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the
     * shared password between the on-cluster Kerberos realm and the remote
     * trusted realm, in a cross realm trust relationship.
     *
     * Generated from protobuf field <code>string cross_realm_trust_shared_password_uri = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return string
     */
    public function getCrossRealmTrustSharedPasswordUri()
    {
        return $this->cross_realm_trust_shared_password_uri;
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the
     * shared password between the on-cluster Kerberos realm and the remote
     * trusted realm, in a cross realm trust relationship.
     *
     * Generated from protobuf field <code>string cross_realm_trust_shared_password_uri = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param string $var
     * @return $this
     */
    public function setCrossRealmTrustSharedPasswordUri($var)
    {
        GPBUtil::checkString($var, True);
        $this->cross_realm_trust_shared_password_uri = $var;

        return $this;
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the
     * master key of the KDC database.
     *
     * Generated from protobuf field <code>string kdc_db_key_uri = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return string
     */
    public function getKdcDbKeyUri()
    {
        return $this->kdc_db_key_uri;
    }

    /**
     * Optional. The Cloud Storage URI of a KMS encrypted file containing the
     * master key of the KDC database.
     *
     * Generated from protobuf field <code>string kdc_db_key_uri = 13 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param string $var
     * @return $this
     */
    public function setKdcDbKeyUri($var)
    {
        GPBUtil::checkString($var, True);
        $this->kdc_db_key_uri = $var;

        return $this;
    }

    /**
     * Optional. The lifetime of the ticket granting ticket, in hours.
     * If not specified, or user specifies 0, then default value 10
     * will be used.
     *
     * Generated from protobuf field <code>int32 tgt_lifetime_hours = 14 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return int
     */
    public function getTgtLifetimeHours()
    {
        return $this->tgt_lifetime_hours;
    }

    /**
     * Optional. The lifetime of the ticket granting ticket, in hours.
     * If not specified, or user specifies 0, then default value 10
     * will be used.
     *
     * Generated from protobuf field <code>int32 tgt_lifetime_hours = 14 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param int $var
     * @return $this
     */
    public function setTgtLifetimeHours($var)
    {
        GPBUtil::checkInt32($var);
        $this->tgt_lifetime_hours = $var;

        return $this;
    }

    /**
     * Optional. The name of the on-cluster Kerberos realm.
     * If not specified, the uppercased domain of hostnames will be the realm.
     *
     * Generated from protobuf field <code>string realm = 15 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @return string
     */
    public function getRealm()
    {
        return $this->realm;
    }

    /**
     * Optional. The name of the on-cluster Kerberos realm.
     * If not specified, the uppercased domain of hostnames will be the realm.
     *
     * Generated from protobuf field <code>string realm = 15 [(.google.api.field_behavior) = OPTIONAL];</code>
     * @param string $var
     * @return $this
     */
    public function setRealm($var)
    {
        GPBUtil::checkString($var, True);
        $this->realm = $var;

        return $this;
    }

}

