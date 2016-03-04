/*
 * Copyright (c) 2015 Baidu.com, Inc. All Rights Reserved
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

package com.baidubce.services.lss.model;

public class LivePublish {
    private String region = null;

    private String pullUrl = null;

    private String pushUrl = null;

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public LivePublish withRegion(String region) {
        this.region = region;
        return this;
    }

    public String getPullUrl() {
        return pullUrl;
    }

    public void setPullUrl(String pullUrl) {
        this.pullUrl = pullUrl;
    }

    public LivePublish withPullUrl(String pullUrl) {
        this.pullUrl = pullUrl;
        return this;
    }

    public String getPushUrl() {
        return pushUrl;
    }

    public void setPushUrl(String pushUrl) {
        this.pushUrl = pushUrl;
    }

    public LivePublish withPushUrl(String pushUrl) {
        this.pushUrl = pushUrl;
        return this;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("class LivePublish {\n");
        sb.append("    region: ").append(region).append("\n");
        sb.append("    pullUrl: ").append(pullUrl).append("\n");
        sb.append("    pushUrl: ").append(pushUrl).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}