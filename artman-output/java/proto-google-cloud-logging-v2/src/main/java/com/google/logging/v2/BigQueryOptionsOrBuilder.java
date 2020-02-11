// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/logging_config.proto

package com.google.logging.v2;

public interface BigQueryOptionsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.logging.v2.BigQueryOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Optional. Whether to use [BigQuery's partition
   * tables](/bigquery/docs/partitioned-tables). By default, Logging
   * creates dated tables based on the log entries' timestamps, e.g.
   * syslog_20170523. With partitioned tables the date suffix is no longer
   * present and [special query
   * syntax](/bigquery/docs/querying-partitioned-tables) has to be used instead.
   * In both cases, tables are sharded based on UTC timezone.
   * </pre>
   *
   * <code>bool use_partitioned_tables = 1;</code>
   * @return The usePartitionedTables.
   */
  boolean getUsePartitionedTables();

  /**
   * <pre>
   * Output only. True if new timestamp column based partitioning is in use,
   * false if legacy ingestion-time partitioning is in use.
   * All new sinks will have this field set true and will use timestamp column
   * based partitioning. If use_partitioned_tables is false, this value has no
   * meaning and will be false. Legacy sinks using partitioned tables will have
   * this field set to false.
   * </pre>
   *
   * <code>bool uses_timestamp_column_partitioning = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The usesTimestampColumnPartitioning.
   */
  boolean getUsesTimestampColumnPartitioning();
}
