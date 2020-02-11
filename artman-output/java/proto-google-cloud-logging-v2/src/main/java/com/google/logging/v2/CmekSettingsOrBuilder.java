// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/logging_config.proto

package com.google.logging.v2;

public interface CmekSettingsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.CmekSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Output Only. The resource name of the CMEK settings.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Output Only. The resource name of the CMEK settings.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * The resource name for the configured Cloud KMS key.
   * KMS key name format:
   *     "projects/[PROJECT_ID]/locations/[LOCATION]/keyRings/[KEYRING]/cryptoKeys/[KEY]"
   * For example:
   *     `"projects/my-project-id/locations/my-region/keyRings/key-ring-name/cryptoKeys/key-name"`
   * To enable CMEK for the Logs Router, set this field to a valid
   * `kms_key_name` for which the associated service account has the required
   * `roles/cloudkms.cryptoKeyEncrypterDecrypter` role assigned for the key.
   * The Cloud KMS key used by the Log Router can be updated by changing the
   * `kms_key_name` to a new valid key name. Encryption operations that are in
   * progress will be completed with the key that was in use when they started.
   * Decryption operations will be completed using the key that was used at the
   * time of encryption unless access to that key has been revoked.
   * To disable CMEK for the Logs Router, set this field to an empty string.
   * See [Enabling CMEK for Logs
   * Router](/logging/docs/routing/managed-encryption) for more information.
   * </pre>
   *
   * <code>string kms_key_name = 2;</code>
   * @return The kmsKeyName.
   */
  java.lang.String getKmsKeyName();
  /**
   * <pre>
   * The resource name for the configured Cloud KMS key.
   * KMS key name format:
   *     "projects/[PROJECT_ID]/locations/[LOCATION]/keyRings/[KEYRING]/cryptoKeys/[KEY]"
   * For example:
   *     `"projects/my-project-id/locations/my-region/keyRings/key-ring-name/cryptoKeys/key-name"`
   * To enable CMEK for the Logs Router, set this field to a valid
   * `kms_key_name` for which the associated service account has the required
   * `roles/cloudkms.cryptoKeyEncrypterDecrypter` role assigned for the key.
   * The Cloud KMS key used by the Log Router can be updated by changing the
   * `kms_key_name` to a new valid key name. Encryption operations that are in
   * progress will be completed with the key that was in use when they started.
   * Decryption operations will be completed using the key that was used at the
   * time of encryption unless access to that key has been revoked.
   * To disable CMEK for the Logs Router, set this field to an empty string.
   * See [Enabling CMEK for Logs
   * Router](/logging/docs/routing/managed-encryption) for more information.
   * </pre>
   *
   * <code>string kms_key_name = 2;</code>
   * @return The bytes for kmsKeyName.
   */
  com.google.protobuf.ByteString
      getKmsKeyNameBytes();

  /**
   * <pre>
   * Output Only. The service account that will be used by the Logs Router to
   * access your Cloud KMS key.
   * Before enabling CMEK for Logs Router, you must first assign the role
   * `roles/cloudkms.cryptoKeyEncrypterDecrypter` to the service account that
   * the Logs Router will use to access your Cloud KMS key. Use
   * [GetCmekSettings][google.logging.v2.ConfigServiceV2.GetCmekSettings] to
   * obtain the service account ID.
   * See [Enabling CMEK for Logs
   * Router](/logging/docs/routing/managed-encryption) for more information.
   * </pre>
   *
   * <code>string service_account_id = 3;</code>
   * @return The serviceAccountId.
   */
  java.lang.String getServiceAccountId();
  /**
   * <pre>
   * Output Only. The service account that will be used by the Logs Router to
   * access your Cloud KMS key.
   * Before enabling CMEK for Logs Router, you must first assign the role
   * `roles/cloudkms.cryptoKeyEncrypterDecrypter` to the service account that
   * the Logs Router will use to access your Cloud KMS key. Use
   * [GetCmekSettings][google.logging.v2.ConfigServiceV2.GetCmekSettings] to
   * obtain the service account ID.
   * See [Enabling CMEK for Logs
   * Router](/logging/docs/routing/managed-encryption) for more information.
   * </pre>
   *
   * <code>string service_account_id = 3;</code>
   * @return The bytes for serviceAccountId.
   */
  com.google.protobuf.ByteString
      getServiceAccountIdBytes();
}
