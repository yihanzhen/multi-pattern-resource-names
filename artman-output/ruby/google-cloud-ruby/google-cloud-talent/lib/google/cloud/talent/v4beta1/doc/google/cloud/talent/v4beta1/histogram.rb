# Copyright 2020 Google LLC
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     https://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

module Google
  module Cloud
    module Talent
      module V4beta1
        # The histogram request.
        # @!attribute [rw] histogram_query
        #   @return [String]
        #     An expression specifies a histogram request against matching resources
        #     (for example, jobs, profiles) for searches.
        #
        #     See {Google::Cloud::Talent::V4beta1::SearchJobsRequest#histogram_queries SearchJobsRequest#histogram_queries} and
        #     {Google::Cloud::Talent::V4beta1::SearchProfilesRequest#histogram_queries SearchProfilesRequest#histogram_queries} for details about syntax.
        class HistogramQuery; end

        # Histogram result that matches {Google::Cloud::Talent::V4beta1::HistogramQuery HistogramQuery} specified in searches.
        # @!attribute [rw] histogram_query
        #   @return [String]
        #     Requested histogram expression.
        # @!attribute [rw] histogram
        #   @return [Hash{String => Integer}]
        #     A map from the values of the facet associated with distinct values to the
        #     number of matching entries with corresponding value.
        #
        #     The key format is:
        #
        #     * (for string histogram) string values stored in the field.
        #     * (for named numeric bucket) name specified in `bucket()` function, like
        #       for `bucket(0, MAX, "non-negative")`, the key will be `non-negative`.
        #     * (for anonymous numeric bucket) range formatted as `<low>-<high>`, for
        #       example, `0-1000`, `MIN-0`, and `0-MAX`.
        class HistogramQueryResult; end
      end
    end
  end
end