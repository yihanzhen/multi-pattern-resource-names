// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

public interface PushConfigOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.PushConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * A URL locating the endpoint to which messages should be pushed.
   * For example, a Webhook endpoint might use "https://example.com/push".
   * </pre>
   *
   * <code>string push_endpoint = 1;</code>
   */
  java.lang.String getPushEndpoint();
  /**
   * <pre>
   * A URL locating the endpoint to which messages should be pushed.
   * For example, a Webhook endpoint might use "https://example.com/push".
   * </pre>
   *
   * <code>string push_endpoint = 1;</code>
   */
  com.google.protobuf.ByteString
      getPushEndpointBytes();

  /**
   * <pre>
   * Endpoint configuration attributes that can be used to control different
   * aspects of the message delivery.
   * The only currently supported attribute is `x-goog-version`, which you can
   * use to change the format of the pushed message. This attribute
   * indicates the version of the data expected by the endpoint. This
   * controls the shape of the pushed message (i.e., its fields and metadata).
   * If not present during the `CreateSubscription` call, it will default to
   * the version of the Pub/Sub API used to make such call. If not present in a
   * `ModifyPushConfig` call, its value will not be changed. `GetSubscription`
   * calls will always return a valid version, even if the subscription was
   * created without this attribute.
   * The only supported values for the `x-goog-version` attribute are:
   * * `v1beta1`: uses the push format defined in the v1beta1 Pub/Sub API.
   * * `v1` or `v1beta2`: uses the push format defined in the v1 Pub/Sub API.
   * For example:
   * &lt;pre&gt;&lt;code&gt;attributes { "x-goog-version": "v1" } &lt;/code&gt;&lt;/pre&gt;
   * </pre>
   *
   * <code>map&lt;string, string&gt; attributes = 2;</code>
   */
  int getAttributesCount();
  /**
   * <pre>
   * Endpoint configuration attributes that can be used to control different
   * aspects of the message delivery.
   * The only currently supported attribute is `x-goog-version`, which you can
   * use to change the format of the pushed message. This attribute
   * indicates the version of the data expected by the endpoint. This
   * controls the shape of the pushed message (i.e., its fields and metadata).
   * If not present during the `CreateSubscription` call, it will default to
   * the version of the Pub/Sub API used to make such call. If not present in a
   * `ModifyPushConfig` call, its value will not be changed. `GetSubscription`
   * calls will always return a valid version, even if the subscription was
   * created without this attribute.
   * The only supported values for the `x-goog-version` attribute are:
   * * `v1beta1`: uses the push format defined in the v1beta1 Pub/Sub API.
   * * `v1` or `v1beta2`: uses the push format defined in the v1 Pub/Sub API.
   * For example:
   * &lt;pre&gt;&lt;code&gt;attributes { "x-goog-version": "v1" } &lt;/code&gt;&lt;/pre&gt;
   * </pre>
   *
   * <code>map&lt;string, string&gt; attributes = 2;</code>
   */
  boolean containsAttributes(
      java.lang.String key);
  /**
   * Use {@link #getAttributesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getAttributes();
  /**
   * <pre>
   * Endpoint configuration attributes that can be used to control different
   * aspects of the message delivery.
   * The only currently supported attribute is `x-goog-version`, which you can
   * use to change the format of the pushed message. This attribute
   * indicates the version of the data expected by the endpoint. This
   * controls the shape of the pushed message (i.e., its fields and metadata).
   * If not present during the `CreateSubscription` call, it will default to
   * the version of the Pub/Sub API used to make such call. If not present in a
   * `ModifyPushConfig` call, its value will not be changed. `GetSubscription`
   * calls will always return a valid version, even if the subscription was
   * created without this attribute.
   * The only supported values for the `x-goog-version` attribute are:
   * * `v1beta1`: uses the push format defined in the v1beta1 Pub/Sub API.
   * * `v1` or `v1beta2`: uses the push format defined in the v1 Pub/Sub API.
   * For example:
   * &lt;pre&gt;&lt;code&gt;attributes { "x-goog-version": "v1" } &lt;/code&gt;&lt;/pre&gt;
   * </pre>
   *
   * <code>map&lt;string, string&gt; attributes = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getAttributesMap();
  /**
   * <pre>
   * Endpoint configuration attributes that can be used to control different
   * aspects of the message delivery.
   * The only currently supported attribute is `x-goog-version`, which you can
   * use to change the format of the pushed message. This attribute
   * indicates the version of the data expected by the endpoint. This
   * controls the shape of the pushed message (i.e., its fields and metadata).
   * If not present during the `CreateSubscription` call, it will default to
   * the version of the Pub/Sub API used to make such call. If not present in a
   * `ModifyPushConfig` call, its value will not be changed. `GetSubscription`
   * calls will always return a valid version, even if the subscription was
   * created without this attribute.
   * The only supported values for the `x-goog-version` attribute are:
   * * `v1beta1`: uses the push format defined in the v1beta1 Pub/Sub API.
   * * `v1` or `v1beta2`: uses the push format defined in the v1 Pub/Sub API.
   * For example:
   * &lt;pre&gt;&lt;code&gt;attributes { "x-goog-version": "v1" } &lt;/code&gt;&lt;/pre&gt;
   * </pre>
   *
   * <code>map&lt;string, string&gt; attributes = 2;</code>
   */

  java.lang.String getAttributesOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * Endpoint configuration attributes that can be used to control different
   * aspects of the message delivery.
   * The only currently supported attribute is `x-goog-version`, which you can
   * use to change the format of the pushed message. This attribute
   * indicates the version of the data expected by the endpoint. This
   * controls the shape of the pushed message (i.e., its fields and metadata).
   * If not present during the `CreateSubscription` call, it will default to
   * the version of the Pub/Sub API used to make such call. If not present in a
   * `ModifyPushConfig` call, its value will not be changed. `GetSubscription`
   * calls will always return a valid version, even if the subscription was
   * created without this attribute.
   * The only supported values for the `x-goog-version` attribute are:
   * * `v1beta1`: uses the push format defined in the v1beta1 Pub/Sub API.
   * * `v1` or `v1beta2`: uses the push format defined in the v1 Pub/Sub API.
   * For example:
   * &lt;pre&gt;&lt;code&gt;attributes { "x-goog-version": "v1" } &lt;/code&gt;&lt;/pre&gt;
   * </pre>
   *
   * <code>map&lt;string, string&gt; attributes = 2;</code>
   */

  java.lang.String getAttributesOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * If specified, Pub/Sub will generate and attach an OIDC JWT token as an
   * `Authorization` header in the HTTP request for every pushed message.
   * </pre>
   *
   * <code>.google.pubsub.v1.PushConfig.OidcToken oidc_token = 3;</code>
   */
  boolean hasOidcToken();
  /**
   * <pre>
   * If specified, Pub/Sub will generate and attach an OIDC JWT token as an
   * `Authorization` header in the HTTP request for every pushed message.
   * </pre>
   *
   * <code>.google.pubsub.v1.PushConfig.OidcToken oidc_token = 3;</code>
   */
  com.google.pubsub.v1.PushConfig.OidcToken getOidcToken();
  /**
   * <pre>
   * If specified, Pub/Sub will generate and attach an OIDC JWT token as an
   * `Authorization` header in the HTTP request for every pushed message.
   * </pre>
   *
   * <code>.google.pubsub.v1.PushConfig.OidcToken oidc_token = 3;</code>
   */
  com.google.pubsub.v1.PushConfig.OidcTokenOrBuilder getOidcTokenOrBuilder();

  public com.google.pubsub.v1.PushConfig.AuthenticationMethodCase getAuthenticationMethodCase();
}
