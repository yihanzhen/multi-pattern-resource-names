<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/kms/v1/service.proto

namespace Google\Cloud\Kms\V1;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Request message for [KeyManagementService.ListCryptoKeyVersions][google.cloud.kms.v1.KeyManagementService.ListCryptoKeyVersions].
 *
 * Generated from protobuf message <code>google.cloud.kms.v1.ListCryptoKeyVersionsRequest</code>
 */
final class ListCryptoKeyVersionsRequest extends \Google\Protobuf\Internal\Message
{
    /**
     * Required. The resource name of the [CryptoKey][google.cloud.kms.v1.CryptoKey] to list, in the format
     * `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;`.
     *
     * Generated from protobuf field <code>string parent = 1;</code>
     */
    private $parent = '';
    /**
     * Optional limit on the number of [CryptoKeyVersions][google.cloud.kms.v1.CryptoKeyVersion] to
     * include in the response. Further [CryptoKeyVersions][google.cloud.kms.v1.CryptoKeyVersion] can
     * subsequently be obtained by including the
     * [ListCryptoKeyVersionsResponse.next_page_token][google.cloud.kms.v1.ListCryptoKeyVersionsResponse.next_page_token] in a subsequent request.
     * If unspecified, the server will pick an appropriate default.
     *
     * Generated from protobuf field <code>int32 page_size = 2;</code>
     */
    private $page_size = 0;
    /**
     * Optional pagination token, returned earlier via
     * [ListCryptoKeyVersionsResponse.next_page_token][google.cloud.kms.v1.ListCryptoKeyVersionsResponse.next_page_token].
     *
     * Generated from protobuf field <code>string page_token = 3;</code>
     */
    private $page_token = '';
    /**
     * The fields to include in the response.
     *
     * Generated from protobuf field <code>.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionView view = 4;</code>
     */
    private $view = 0;
    /**
     * Optional. Only include resources that match the filter in the response.
     *
     * Generated from protobuf field <code>string filter = 5;</code>
     */
    private $filter = '';
    /**
     * Optional. Specify how the results should be sorted. If not specified, the
     * results will be sorted in the default order.
     *
     * Generated from protobuf field <code>string order_by = 6;</code>
     */
    private $order_by = '';

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $parent
     *           Required. The resource name of the [CryptoKey][google.cloud.kms.v1.CryptoKey] to list, in the format
     *           `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;`.
     *     @type int $page_size
     *           Optional limit on the number of [CryptoKeyVersions][google.cloud.kms.v1.CryptoKeyVersion] to
     *           include in the response. Further [CryptoKeyVersions][google.cloud.kms.v1.CryptoKeyVersion] can
     *           subsequently be obtained by including the
     *           [ListCryptoKeyVersionsResponse.next_page_token][google.cloud.kms.v1.ListCryptoKeyVersionsResponse.next_page_token] in a subsequent request.
     *           If unspecified, the server will pick an appropriate default.
     *     @type string $page_token
     *           Optional pagination token, returned earlier via
     *           [ListCryptoKeyVersionsResponse.next_page_token][google.cloud.kms.v1.ListCryptoKeyVersionsResponse.next_page_token].
     *     @type int $view
     *           The fields to include in the response.
     *     @type string $filter
     *           Optional. Only include resources that match the filter in the response.
     *     @type string $order_by
     *           Optional. Specify how the results should be sorted. If not specified, the
     *           results will be sorted in the default order.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Cloud\Kms\V1\Service::initOnce();
        parent::__construct($data);
    }

    /**
     * Required. The resource name of the [CryptoKey][google.cloud.kms.v1.CryptoKey] to list, in the format
     * `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;`.
     *
     * Generated from protobuf field <code>string parent = 1;</code>
     * @return string
     */
    public function getParent()
    {
        return $this->parent;
    }

    /**
     * Required. The resource name of the [CryptoKey][google.cloud.kms.v1.CryptoKey] to list, in the format
     * `projects/&#42;&#47;locations/&#42;&#47;keyRings/&#42;&#47;cryptoKeys/&#42;`.
     *
     * Generated from protobuf field <code>string parent = 1;</code>
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
     * Optional limit on the number of [CryptoKeyVersions][google.cloud.kms.v1.CryptoKeyVersion] to
     * include in the response. Further [CryptoKeyVersions][google.cloud.kms.v1.CryptoKeyVersion] can
     * subsequently be obtained by including the
     * [ListCryptoKeyVersionsResponse.next_page_token][google.cloud.kms.v1.ListCryptoKeyVersionsResponse.next_page_token] in a subsequent request.
     * If unspecified, the server will pick an appropriate default.
     *
     * Generated from protobuf field <code>int32 page_size = 2;</code>
     * @return int
     */
    public function getPageSize()
    {
        return $this->page_size;
    }

    /**
     * Optional limit on the number of [CryptoKeyVersions][google.cloud.kms.v1.CryptoKeyVersion] to
     * include in the response. Further [CryptoKeyVersions][google.cloud.kms.v1.CryptoKeyVersion] can
     * subsequently be obtained by including the
     * [ListCryptoKeyVersionsResponse.next_page_token][google.cloud.kms.v1.ListCryptoKeyVersionsResponse.next_page_token] in a subsequent request.
     * If unspecified, the server will pick an appropriate default.
     *
     * Generated from protobuf field <code>int32 page_size = 2;</code>
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
     * Optional pagination token, returned earlier via
     * [ListCryptoKeyVersionsResponse.next_page_token][google.cloud.kms.v1.ListCryptoKeyVersionsResponse.next_page_token].
     *
     * Generated from protobuf field <code>string page_token = 3;</code>
     * @return string
     */
    public function getPageToken()
    {
        return $this->page_token;
    }

    /**
     * Optional pagination token, returned earlier via
     * [ListCryptoKeyVersionsResponse.next_page_token][google.cloud.kms.v1.ListCryptoKeyVersionsResponse.next_page_token].
     *
     * Generated from protobuf field <code>string page_token = 3;</code>
     * @param string $var
     * @return $this
     */
    public function setPageToken($var)
    {
        GPBUtil::checkString($var, True);
        $this->page_token = $var;

        return $this;
    }

    /**
     * The fields to include in the response.
     *
     * Generated from protobuf field <code>.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionView view = 4;</code>
     * @return int
     */
    public function getView()
    {
        return $this->view;
    }

    /**
     * The fields to include in the response.
     *
     * Generated from protobuf field <code>.google.cloud.kms.v1.CryptoKeyVersion.CryptoKeyVersionView view = 4;</code>
     * @param int $var
     * @return $this
     */
    public function setView($var)
    {
        GPBUtil::checkEnum($var, \Google\Cloud\Kms\V1\CryptoKeyVersion_CryptoKeyVersionView::class);
        $this->view = $var;

        return $this;
    }

    /**
     * Optional. Only include resources that match the filter in the response.
     *
     * Generated from protobuf field <code>string filter = 5;</code>
     * @return string
     */
    public function getFilter()
    {
        return $this->filter;
    }

    /**
     * Optional. Only include resources that match the filter in the response.
     *
     * Generated from protobuf field <code>string filter = 5;</code>
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
     * Optional. Specify how the results should be sorted. If not specified, the
     * results will be sorted in the default order.
     *
     * Generated from protobuf field <code>string order_by = 6;</code>
     * @return string
     */
    public function getOrderBy()
    {
        return $this->order_by;
    }

    /**
     * Optional. Specify how the results should be sorted. If not specified, the
     * results will be sorted in the default order.
     *
     * Generated from protobuf field <code>string order_by = 6;</code>
     * @param string $var
     * @return $this
     */
    public function setOrderBy($var)
    {
        GPBUtil::checkString($var, True);
        $this->order_by = $var;

        return $this;
    }

}

