/*
 * Copyright (c) 2012. JSpringBot. All Rights Reserved.
 *
 * See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The JSpringBot licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jspringbot.keyword.sikulix;

import org.jspringbot.KeywordInfo;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.springframework.stereotype.Component;

@Component
@KeywordInfo(
        name = "Sikuli Enter",
        description = "classpath:desc/SikuliEnter.txt"
)
public class SikuliEnter extends AbstractSikuliKeyword {

    @Override
    public Object execute(Object... params) throws FindFailed {
        helper.type(Key.ENTER);

        return null;
    }
}
