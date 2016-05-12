/**
 * Copyright 2002-2016 xiaoyuepeng
 *
 * this is for @Provider Scan For Dubbo Export Services
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 * @author xiaoyuepeng <xyp260466@163.com>
 */
package com.xyp260466.dubbo.test.provider;

import com.xyp260466.dubbo.annotation.Provider;

/**
 * Created by xyp on 16-5-9.
 */
@Provider
public class SimpleProviderImpl implements SimpleProvider {

    public String providerMethod(String parameter) {
        return "SimpleProvider Result: "+parameter;
    }

}
