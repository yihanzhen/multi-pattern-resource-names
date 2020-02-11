// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/attestation/attestation.proto

package io.grafeas.v1beta1.attestation;

public interface GenericSignedAttestationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.attestation.GenericSignedAttestation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Type (for example schema) of the attestation payload that was signed.
   * The verifier must ensure that the provided type is one that the verifier
   * supports, and that the attestation payload is a valid instantiation of that
   * type (for example by validating a JSON schema).
   * </pre>
   *
   * <code>.grafeas.v1beta1.attestation.GenericSignedAttestation.ContentType content_type = 1;</code>
   * @return The enum numeric value on the wire for contentType.
   */
  int getContentTypeValue();
  /**
   * <pre>
   * Type (for example schema) of the attestation payload that was signed.
   * The verifier must ensure that the provided type is one that the verifier
   * supports, and that the attestation payload is a valid instantiation of that
   * type (for example by validating a JSON schema).
   * </pre>
   *
   * <code>.grafeas.v1beta1.attestation.GenericSignedAttestation.ContentType content_type = 1;</code>
   * @return The contentType.
   */
  io.grafeas.v1beta1.attestation.GenericSignedAttestation.ContentType getContentType();

  /**
   * <pre>
   * The serialized payload that is verified by one or more `signatures`.
   * The encoding and semantic meaning of this payload must match what is set in
   * `content_type`.
   * </pre>
   *
   * <code>bytes serialized_payload = 2;</code>
   * @return The serializedPayload.
   */
  com.google.protobuf.ByteString getSerializedPayload();

  /**
   * <pre>
   * One or more signatures over `serialized_payload`.  Verifier implementations
   * should consider this attestation message verified if at least one
   * `signature` verifies `serialized_payload`.  See `Signature` in common.proto
   * for more details on signature structure and verification.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.Signature signatures = 3;</code>
   */
  java.util.List<io.grafeas.v1beta1.common.Signature> 
      getSignaturesList();
  /**
   * <pre>
   * One or more signatures over `serialized_payload`.  Verifier implementations
   * should consider this attestation message verified if at least one
   * `signature` verifies `serialized_payload`.  See `Signature` in common.proto
   * for more details on signature structure and verification.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.Signature signatures = 3;</code>
   */
  io.grafeas.v1beta1.common.Signature getSignatures(int index);
  /**
   * <pre>
   * One or more signatures over `serialized_payload`.  Verifier implementations
   * should consider this attestation message verified if at least one
   * `signature` verifies `serialized_payload`.  See `Signature` in common.proto
   * for more details on signature structure and verification.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.Signature signatures = 3;</code>
   */
  int getSignaturesCount();
  /**
   * <pre>
   * One or more signatures over `serialized_payload`.  Verifier implementations
   * should consider this attestation message verified if at least one
   * `signature` verifies `serialized_payload`.  See `Signature` in common.proto
   * for more details on signature structure and verification.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.Signature signatures = 3;</code>
   */
  java.util.List<? extends io.grafeas.v1beta1.common.SignatureOrBuilder> 
      getSignaturesOrBuilderList();
  /**
   * <pre>
   * One or more signatures over `serialized_payload`.  Verifier implementations
   * should consider this attestation message verified if at least one
   * `signature` verifies `serialized_payload`.  See `Signature` in common.proto
   * for more details on signature structure and verification.
   * </pre>
   *
   * <code>repeated .grafeas.v1beta1.Signature signatures = 3;</code>
   */
  io.grafeas.v1beta1.common.SignatureOrBuilder getSignaturesOrBuilder(
      int index);
}
