<?php
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: google/cloud/dataproc/v1beta2/workflow_templates.proto

namespace Google\Cloud\Dataproc\V1beta2;

use Google\Protobuf\Internal\GPBType;
use Google\Protobuf\Internal\RepeatedField;
use Google\Protobuf\Internal\GPBUtil;

/**
 * A job executed by the workflow.
 *
 * Generated from protobuf message <code>google.cloud.dataproc.v1beta2.OrderedJob</code>
 */
final class OrderedJob extends \Google\Protobuf\Internal\Message
{
    /**
     * Required. The step id. The id must be unique among all jobs
     * within the template.
     * The step id is used as prefix for job id, as job
     * `goog-dataproc-workflow-step-id` label, and in
     * [prerequisiteStepIds][google.cloud.dataproc.v1beta2.OrderedJob.prerequisite_step_ids] field from other
     * steps.
     * The id must contain only letters (a-z, A-Z), numbers (0-9),
     * underscores (_), and hyphens (-). Cannot begin or end with underscore
     * or hyphen. Must consist of between 3 and 50 characters.
     *
     * Generated from protobuf field <code>string step_id = 1;</code>
     */
    private $step_id = '';
    /**
     * Optional. The labels to associate with this job.
     * Label keys must be between 1 and 63 characters long, and must conform to
     * the following regular expression:
     * [\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}
     * Label values must be between 1 and 63 characters long, and must conform to
     * the following regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}
     * No more than 32 labels can be associated with a given job.
     *
     * Generated from protobuf field <code>map<string, string> labels = 8;</code>
     */
    private $labels;
    /**
     * Optional. Job scheduling configuration.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.JobScheduling scheduling = 9;</code>
     */
    private $scheduling = null;
    /**
     * Optional. The optional list of prerequisite job step_ids.
     * If not specified, the job will start at the beginning of workflow.
     *
     * Generated from protobuf field <code>repeated string prerequisite_step_ids = 10;</code>
     */
    private $prerequisite_step_ids;
    protected $job_type;

    /**
     * Constructor.
     *
     * @param array $data {
     *     Optional. Data for populating the Message object.
     *
     *     @type string $step_id
     *           Required. The step id. The id must be unique among all jobs
     *           within the template.
     *           The step id is used as prefix for job id, as job
     *           `goog-dataproc-workflow-step-id` label, and in
     *           [prerequisiteStepIds][google.cloud.dataproc.v1beta2.OrderedJob.prerequisite_step_ids] field from other
     *           steps.
     *           The id must contain only letters (a-z, A-Z), numbers (0-9),
     *           underscores (_), and hyphens (-). Cannot begin or end with underscore
     *           or hyphen. Must consist of between 3 and 50 characters.
     *     @type \Google\Cloud\Dataproc\V1beta2\HadoopJob $hadoop_job
     *           Job is a Hadoop job.
     *     @type \Google\Cloud\Dataproc\V1beta2\SparkJob $spark_job
     *           Job is a Spark job.
     *     @type \Google\Cloud\Dataproc\V1beta2\PySparkJob $pyspark_job
     *           Job is a Pyspark job.
     *     @type \Google\Cloud\Dataproc\V1beta2\HiveJob $hive_job
     *           Job is a Hive job.
     *     @type \Google\Cloud\Dataproc\V1beta2\PigJob $pig_job
     *           Job is a Pig job.
     *     @type \Google\Cloud\Dataproc\V1beta2\SparkSqlJob $spark_sql_job
     *           Job is a SparkSql job.
     *     @type array|\Google\Protobuf\Internal\MapField $labels
     *           Optional. The labels to associate with this job.
     *           Label keys must be between 1 and 63 characters long, and must conform to
     *           the following regular expression:
     *           [\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}
     *           Label values must be between 1 and 63 characters long, and must conform to
     *           the following regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}
     *           No more than 32 labels can be associated with a given job.
     *     @type \Google\Cloud\Dataproc\V1beta2\JobScheduling $scheduling
     *           Optional. Job scheduling configuration.
     *     @type string[]|\Google\Protobuf\Internal\RepeatedField $prerequisite_step_ids
     *           Optional. The optional list of prerequisite job step_ids.
     *           If not specified, the job will start at the beginning of workflow.
     * }
     */
    public function __construct($data = NULL) {
        \GPBMetadata\Google\Cloud\Dataproc\V1Beta2\WorkflowTemplates::initOnce();
        parent::__construct($data);
    }

    /**
     * Required. The step id. The id must be unique among all jobs
     * within the template.
     * The step id is used as prefix for job id, as job
     * `goog-dataproc-workflow-step-id` label, and in
     * [prerequisiteStepIds][google.cloud.dataproc.v1beta2.OrderedJob.prerequisite_step_ids] field from other
     * steps.
     * The id must contain only letters (a-z, A-Z), numbers (0-9),
     * underscores (_), and hyphens (-). Cannot begin or end with underscore
     * or hyphen. Must consist of between 3 and 50 characters.
     *
     * Generated from protobuf field <code>string step_id = 1;</code>
     * @return string
     */
    public function getStepId()
    {
        return $this->step_id;
    }

    /**
     * Required. The step id. The id must be unique among all jobs
     * within the template.
     * The step id is used as prefix for job id, as job
     * `goog-dataproc-workflow-step-id` label, and in
     * [prerequisiteStepIds][google.cloud.dataproc.v1beta2.OrderedJob.prerequisite_step_ids] field from other
     * steps.
     * The id must contain only letters (a-z, A-Z), numbers (0-9),
     * underscores (_), and hyphens (-). Cannot begin or end with underscore
     * or hyphen. Must consist of between 3 and 50 characters.
     *
     * Generated from protobuf field <code>string step_id = 1;</code>
     * @param string $var
     * @return $this
     */
    public function setStepId($var)
    {
        GPBUtil::checkString($var, True);
        $this->step_id = $var;

        return $this;
    }

    /**
     * Job is a Hadoop job.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.HadoopJob hadoop_job = 2;</code>
     * @return \Google\Cloud\Dataproc\V1beta2\HadoopJob
     */
    public function getHadoopJob()
    {
        return $this->readOneof(2);
    }

    /**
     * Job is a Hadoop job.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.HadoopJob hadoop_job = 2;</code>
     * @param \Google\Cloud\Dataproc\V1beta2\HadoopJob $var
     * @return $this
     */
    public function setHadoopJob($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dataproc\V1beta2\HadoopJob::class);
        $this->writeOneof(2, $var);

        return $this;
    }

    /**
     * Job is a Spark job.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.SparkJob spark_job = 3;</code>
     * @return \Google\Cloud\Dataproc\V1beta2\SparkJob
     */
    public function getSparkJob()
    {
        return $this->readOneof(3);
    }

    /**
     * Job is a Spark job.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.SparkJob spark_job = 3;</code>
     * @param \Google\Cloud\Dataproc\V1beta2\SparkJob $var
     * @return $this
     */
    public function setSparkJob($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dataproc\V1beta2\SparkJob::class);
        $this->writeOneof(3, $var);

        return $this;
    }

    /**
     * Job is a Pyspark job.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.PySparkJob pyspark_job = 4;</code>
     * @return \Google\Cloud\Dataproc\V1beta2\PySparkJob
     */
    public function getPysparkJob()
    {
        return $this->readOneof(4);
    }

    /**
     * Job is a Pyspark job.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.PySparkJob pyspark_job = 4;</code>
     * @param \Google\Cloud\Dataproc\V1beta2\PySparkJob $var
     * @return $this
     */
    public function setPysparkJob($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dataproc\V1beta2\PySparkJob::class);
        $this->writeOneof(4, $var);

        return $this;
    }

    /**
     * Job is a Hive job.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.HiveJob hive_job = 5;</code>
     * @return \Google\Cloud\Dataproc\V1beta2\HiveJob
     */
    public function getHiveJob()
    {
        return $this->readOneof(5);
    }

    /**
     * Job is a Hive job.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.HiveJob hive_job = 5;</code>
     * @param \Google\Cloud\Dataproc\V1beta2\HiveJob $var
     * @return $this
     */
    public function setHiveJob($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dataproc\V1beta2\HiveJob::class);
        $this->writeOneof(5, $var);

        return $this;
    }

    /**
     * Job is a Pig job.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.PigJob pig_job = 6;</code>
     * @return \Google\Cloud\Dataproc\V1beta2\PigJob
     */
    public function getPigJob()
    {
        return $this->readOneof(6);
    }

    /**
     * Job is a Pig job.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.PigJob pig_job = 6;</code>
     * @param \Google\Cloud\Dataproc\V1beta2\PigJob $var
     * @return $this
     */
    public function setPigJob($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dataproc\V1beta2\PigJob::class);
        $this->writeOneof(6, $var);

        return $this;
    }

    /**
     * Job is a SparkSql job.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.SparkSqlJob spark_sql_job = 7;</code>
     * @return \Google\Cloud\Dataproc\V1beta2\SparkSqlJob
     */
    public function getSparkSqlJob()
    {
        return $this->readOneof(7);
    }

    /**
     * Job is a SparkSql job.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.SparkSqlJob spark_sql_job = 7;</code>
     * @param \Google\Cloud\Dataproc\V1beta2\SparkSqlJob $var
     * @return $this
     */
    public function setSparkSqlJob($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dataproc\V1beta2\SparkSqlJob::class);
        $this->writeOneof(7, $var);

        return $this;
    }

    /**
     * Optional. The labels to associate with this job.
     * Label keys must be between 1 and 63 characters long, and must conform to
     * the following regular expression:
     * [\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}
     * Label values must be between 1 and 63 characters long, and must conform to
     * the following regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}
     * No more than 32 labels can be associated with a given job.
     *
     * Generated from protobuf field <code>map<string, string> labels = 8;</code>
     * @return \Google\Protobuf\Internal\MapField
     */
    public function getLabels()
    {
        return $this->labels;
    }

    /**
     * Optional. The labels to associate with this job.
     * Label keys must be between 1 and 63 characters long, and must conform to
     * the following regular expression:
     * [\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}
     * Label values must be between 1 and 63 characters long, and must conform to
     * the following regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}
     * No more than 32 labels can be associated with a given job.
     *
     * Generated from protobuf field <code>map<string, string> labels = 8;</code>
     * @param array|\Google\Protobuf\Internal\MapField $var
     * @return $this
     */
    public function setLabels($var)
    {
        $arr = GPBUtil::checkMapField($var, \Google\Protobuf\Internal\GPBType::STRING, \Google\Protobuf\Internal\GPBType::STRING);
        $this->labels = $arr;

        return $this;
    }

    /**
     * Optional. Job scheduling configuration.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.JobScheduling scheduling = 9;</code>
     * @return \Google\Cloud\Dataproc\V1beta2\JobScheduling
     */
    public function getScheduling()
    {
        return $this->scheduling;
    }

    /**
     * Optional. Job scheduling configuration.
     *
     * Generated from protobuf field <code>.google.cloud.dataproc.v1beta2.JobScheduling scheduling = 9;</code>
     * @param \Google\Cloud\Dataproc\V1beta2\JobScheduling $var
     * @return $this
     */
    public function setScheduling($var)
    {
        GPBUtil::checkMessage($var, \Google\Cloud\Dataproc\V1beta2\JobScheduling::class);
        $this->scheduling = $var;

        return $this;
    }

    /**
     * Optional. The optional list of prerequisite job step_ids.
     * If not specified, the job will start at the beginning of workflow.
     *
     * Generated from protobuf field <code>repeated string prerequisite_step_ids = 10;</code>
     * @return \Google\Protobuf\Internal\RepeatedField
     */
    public function getPrerequisiteStepIds()
    {
        return $this->prerequisite_step_ids;
    }

    /**
     * Optional. The optional list of prerequisite job step_ids.
     * If not specified, the job will start at the beginning of workflow.
     *
     * Generated from protobuf field <code>repeated string prerequisite_step_ids = 10;</code>
     * @param string[]|\Google\Protobuf\Internal\RepeatedField $var
     * @return $this
     */
    public function setPrerequisiteStepIds($var)
    {
        $arr = GPBUtil::checkRepeatedField($var, \Google\Protobuf\Internal\GPBType::STRING);
        $this->prerequisite_step_ids = $arr;

        return $this;
    }

    /**
     * @return string
     */
    public function getJobType()
    {
        return $this->whichOneof("job_type");
    }

}

