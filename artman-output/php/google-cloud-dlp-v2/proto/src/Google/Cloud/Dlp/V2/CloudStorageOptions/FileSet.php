<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/privacy/dlp/v2/storage.proto

namespace Google\Cloud\Dlp\V2\CloudStorageOptions;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * Set of files to scan.
 *
 * Generated from protobuf message <code>google.privacy.dlp.v2.CloudStorageOptions.FileSet</code>
 */
class FileSet extends \Google\Protobuf\Internal\Message
{
    /**
     * The Cloud Storage url of the file(s) to scan, in the format
     * `gs://<bucket>/<path>`. Trailing wildcard in the path is allowed.
     * If the url ends in a trailing slash, the bucket or directory represented
     * by the url will be scanned non-recursively (content in sub-directories
     * will not be scanned). This means that `gs://mybucket/` is equivalent to
     * `gs://mybucket/&#42;`, and `gs://mybucket/directory/` is equivalent to
     * `gs://mybucket/directory/&#42;`.
     * Exactly one of `url` or `regex_file_set` must be set.
     *
     * Generated from protobuf field <code>string url = 1;</code>
     */
    protected $url = '';
    /**
     * The regex-filtered set of files to scan. Exactly one of `url` or
     * `regex_file_set` must be set.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.CloudStorageRegexFileSet regex_file_set = 2;</code>
     */
    protected $regex_file_set = null;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $url
     *           The Cloud Storage url of the file(s) to scan, in the format
     *           `gs://<bucket>/<path>`. Trailing wildcard in the path is allowed.
     *           If the url ends in a trailing slash, the bucket or directory represented
     *           by the url will be scanned non-recursively (content in sub-directories
     *           will not be scanned). This means that `gs://mybucket/` is equivalent to
     *           `gs://mybucket/&#42;`, and `gs://mybucket/directory/` is equivalent to
     *           `gs://mybucket/directory/&#42;`.
     *           Exactly one of `url` or `regex_file_set` must be set.
     *     @type \Google\Cloud\Dlp\V2\CloudStorageRegexFileSet $regex_file_set
     *           The regex-filtered set of files to scan. Exactly one of `url` or
     *           `regex_file_set` must be set.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Privacy\Dlp\V2\Storage::initOnce();
        parent::__construct($data);
    }

    /**
     * The Cloud Storage url of the file(s) to scan, in the format
     * `gs://<bucket>/<path>`. Trailing wildcard in the path is allowed.
     * If the url ends in a trailing slash, the bucket or directory represented
     * by the url will be scanned non-recursively (content in sub-directories
     * will not be scanned). This means that `gs://mybucket/` is equivalent to
     * `gs://mybucket/&#42;`, and `gs://mybucket/directory/` is equivalent to
     * `gs://mybucket/directory/&#42;`.
     * Exactly one of `url` or `regex_file_set` must be set.
     *
     * Generated from protobuf field <code>string url = 1;</code>
     * @return string
     */
    public function getUrl()
    {
        return $this->url;
    }

    /**
     * The Cloud Storage url of the file(s) to scan, in the format
     * `gs://<bucket>/<path>`. Trailing wildcard in the path is allowed.
     * If the url ends in a trailing slash, the bucket or directory represented
     * by the url will be scanned non-recursively (content in sub-directories
     * will not be scanned). This means that `gs://mybucket/` is equivalent to
     * `gs://mybucket/&#42;`, and `gs://mybucket/directory/` is equivalent to
     * `gs://mybucket/directory/&#42;`.
     * Exactly one of `url` or `regex_file_set` must be set.
     *
     * Generated from protobuf field <code>string url = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setUrl($var)
    {
        GPBUtil::checkString($var, True);
        $this->url = $var;

        return $this;
    }

    /**
     * The regex-filtered set of files to scan. Exactly one of `url` or
     * `regex_file_set` must be set.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.CloudStorageRegexFileSet regex_file_set = 2;</code>
     * @return \Google\Cloud\Dlp\V2\CloudStorageRegexFileSet
     */
    public function getRegexFileSet()
    {
        return $this->regex_file_set;
    }

    /**
     * The regex-filtered set of files to scan. Exactly one of `url` or
     * `regex_file_set` must be set.
     *
     * Generated from protobuf field <code>.google.privacy.dlp.v2.CloudStorageRegexFileSet regex_file_set = 2;</code>
     * @param \Google\Cloud\Dlp\V2\CloudStorageRegexFileSet $var
     * @return $this
     */
    public function setRegexFileSet($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dlp\V2\CloudStorageRegexFileSet::class);
        $this->regex_file_set = $var;

        return $this;
    }

}

// Adding a class alias for backwards compatibility with the previous class name.
class_alias(FileSet::class, \Google\Cloud\Dlp\V2\CloudStorageOptions_FileSet::class);

