// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/containeranalysis/v1beta1/grafeas/grafeas.proto

package io.grafeas.v1beta1;

public interface CreateOccurrenceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1beta1.CreateOccurrenceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The name of the project in the form of `projects/[PROJECT_ID]`, under which
   * the occurrence is to be created.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * The name of the project in the form of `projects/[PROJECT_ID]`, under which
   * the occurrence is to be created.
   * </pre>
   *
   * <code>string parent = 1;</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * The occurrence to create.
   * </pre>
   *
   * <code>.grafeas.v1beta1.Occurrence occurrence = 2;</code>
   * @return Whether the occurrence field is set.
   */
  boolean hasOccurrence();
  /**
   * <pre>
   * The occurrence to create.
   * </pre>
   *
   * <code>.grafeas.v1beta1.Occurrence occurrence = 2;</code>
   * @return The occurrence.
   */
  io.grafeas.v1beta1.Occurrence getOccurrence();
  /**
   * <pre>
   * The occurrence to create.
   * </pre>
   *
   * <code>.grafeas.v1beta1.Occurrence occurrence = 2;</code>
   */
  io.grafeas.v1beta1.OccurrenceOrBuilder getOccurrenceOrBuilder();
}
