/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.ballerinalang.stdlib.url;

import io.ballerina.runtime.api.creators.ErrorCreator;
import io.ballerina.runtime.api.utils.StringUtils;
import io.ballerina.runtime.api.values.BError;
import org.ballerinalang.stdlib.url.nativeimpl.ModuleUtils;

import static org.ballerinalang.stdlib.url.Constants.URL_ERROR;

/**
 * Utility functions relevant to URL operations.
 *
 * @since 0.990.3
 */
public class UrlUtils {

    public static BError createError(String errMsg) {
        return ErrorCreator.createDistinctError(URL_ERROR, ModuleUtils.getModule(), StringUtils.fromString(errMsg));
    }
}
