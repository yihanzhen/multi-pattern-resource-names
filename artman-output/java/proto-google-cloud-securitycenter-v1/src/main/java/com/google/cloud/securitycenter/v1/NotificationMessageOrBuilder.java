// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securitycenter/v1/notification_message.proto

package com.google.cloud.securitycenter.v1;

public interface NotificationMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1.NotificationMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the notification config that generated current notification.
   * </pre>
   *
   * <code>string notification_config_name = 1;</code>
   * @return The notificationConfigName.
   */
  java.lang.String getNotificationConfigName();
  /**
   * <pre>
   * Name of the notification config that generated current notification.
   * </pre>
   *
   * <code>string notification_config_name = 1;</code>
   * @return The bytes for notificationConfigName.
   */
  com.google.protobuf.ByteString
      getNotificationConfigNameBytes();

  /**
   * <pre>
   * If it's a Finding based notification config, this field will be
   * populated.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Finding finding = 2;</code>
   * @return Whether the finding field is set.
   */
  boolean hasFinding();
  /**
   * <pre>
   * If it's a Finding based notification config, this field will be
   * populated.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Finding finding = 2;</code>
   * @return The finding.
   */
  com.google.cloud.securitycenter.v1.Finding getFinding();
  /**
   * <pre>
   * If it's a Finding based notification config, this field will be
   * populated.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1.Finding finding = 2;</code>
   */
  com.google.cloud.securitycenter.v1.FindingOrBuilder getFindingOrBuilder();

  public com.google.cloud.securitycenter.v1.NotificationMessage.EventCase getEventCase();
}
