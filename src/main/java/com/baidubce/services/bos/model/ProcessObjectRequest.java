/*
 * Copyright 2014 Baidu, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.baidubce.services.bos.model;

import com.baidubce.auth.BceCredentials;

public class ProcessObjectRequest extends GenericObjectRequest {

    public ProcessObjectRequest(String bucketName, String key, String parameter) {
        super(bucketName, key);
        this.parameter = parameter;
    }

    @Override
    public ProcessObjectRequest withRequestCredentials(BceCredentials credentials) {
        this.setRequestCredentials(credentials);
        return this;
    }

    @Override
    public ProcessObjectRequest withBucketName(String bucketName) {
        this.setBucketName(bucketName);
        return this;
    }

    @Override
    public ProcessObjectRequest withKey(String key) {
        this.setKey(key);
        return this;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public String getParameter() {
        return this.parameter;
    }

    private String parameter;
}
