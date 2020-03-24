<?php
// GENERATED CODE -- DO NOT EDIT!

// Original file comments:
// Copyright 2020 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//
namespace Google\Cloud\Dataproc\V1beta2;

/**
 * The API interface for managing autoscaling policies in the
 * Cloud Dataproc API.
 */
class AutoscalingPolicyServiceGrpcClient extends \Grpc\BaseStub {

    /**
     * @param string $hostname hostname
     * @param array $opts channel options
     * @param \Grpc\Channel $channel (optional) re-use channel object
     */
    public function __construct($hostname, $opts, $channel = null) {
        parent::__construct($hostname, $opts, $channel);
    }

    /**
     * Creates new autoscaling policy.
     * @param \Google\Cloud\Dataproc\V1beta2\CreateAutoscalingPolicyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function CreateAutoscalingPolicy(\Google\Cloud\Dataproc\V1beta2\CreateAutoscalingPolicyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/google.cloud.dataproc.v1beta2.AutoscalingPolicyService/CreateAutoscalingPolicy',
        $argument,
        ['\Google\Cloud\Dataproc\V1beta2\AutoscalingPolicy', 'decode'],
        $metadata, $options);
    }

    /**
     * Updates (replaces) autoscaling policy.
     *
     * Disabled check for update_mask, because all updates will be full
     * replacements.
     * @param \Google\Cloud\Dataproc\V1beta2\UpdateAutoscalingPolicyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function UpdateAutoscalingPolicy(\Google\Cloud\Dataproc\V1beta2\UpdateAutoscalingPolicyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/google.cloud.dataproc.v1beta2.AutoscalingPolicyService/UpdateAutoscalingPolicy',
        $argument,
        ['\Google\Cloud\Dataproc\V1beta2\AutoscalingPolicy', 'decode'],
        $metadata, $options);
    }

    /**
     * Retrieves autoscaling policy.
     * @param \Google\Cloud\Dataproc\V1beta2\GetAutoscalingPolicyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function GetAutoscalingPolicy(\Google\Cloud\Dataproc\V1beta2\GetAutoscalingPolicyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/google.cloud.dataproc.v1beta2.AutoscalingPolicyService/GetAutoscalingPolicy',
        $argument,
        ['\Google\Cloud\Dataproc\V1beta2\AutoscalingPolicy', 'decode'],
        $metadata, $options);
    }

    /**
     * Lists autoscaling policies in the project.
     * @param \Google\Cloud\Dataproc\V1beta2\ListAutoscalingPoliciesRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function ListAutoscalingPolicies(\Google\Cloud\Dataproc\V1beta2\ListAutoscalingPoliciesRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/google.cloud.dataproc.v1beta2.AutoscalingPolicyService/ListAutoscalingPolicies',
        $argument,
        ['\Google\Cloud\Dataproc\V1beta2\ListAutoscalingPoliciesResponse', 'decode'],
        $metadata, $options);
    }

    /**
     * Deletes an autoscaling policy. It is an error to delete an autoscaling
     * policy that is in use by one or more clusters.
     * @param \Google\Cloud\Dataproc\V1beta2\DeleteAutoscalingPolicyRequest $argument input argument
     * @param array $metadata metadata
     * @param array $options call options
     */
    public function DeleteAutoscalingPolicy(\Google\Cloud\Dataproc\V1beta2\DeleteAutoscalingPolicyRequest $argument,
      $metadata = [], $options = []) {
        return $this->_simpleRequest('/google.cloud.dataproc.v1beta2.AutoscalingPolicyService/DeleteAutoscalingPolicy',
        $argument,
        ['\Google\Protobuf\GPBEmpty', 'decode'],
        $metadata, $options);
    }

}
