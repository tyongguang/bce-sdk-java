/*
 * Copyright 2015 Baidu, Inc.
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

package com.baidubce.services.media.model;

import static com.baidubce.util.Validate.checkStringNotEmpty;

import com.baidubce.auth.BceCredentials;
import com.baidubce.model.AbstractBceRequest;

public class DeletePresetRequest extends AbstractBceRequest {
    private String presetName = null;

    public String getPresetName() {
        return presetName;
    }

    public void setPresetName(String presetName) {
        checkStringNotEmpty(presetName, "The parameter presetName should NOT be null or empty string.");
        this.presetName = presetName;
    }

    public DeletePresetRequest withPresetName(String presetName) {
        this.setPresetName(presetName);
        return this;
    }

    public DeletePresetRequest withRequestCredentials(BceCredentials credentials) {
        this.setRequestCredentials(credentials);
        return this;
    }
}
