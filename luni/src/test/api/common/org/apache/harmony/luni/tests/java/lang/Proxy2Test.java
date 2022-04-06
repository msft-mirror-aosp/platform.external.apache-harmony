/*
 * Copyright (C) 2022 The Android Open Source Project
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
 */

package org.apache.harmony.luni.tests.java.lang;

import java.lang.reflect.Proxy;

import junit.framework.TestCase;


/*
 * This test is required to be run with "DefaultPkgIntf" defined in the default package
 * Do not move.  See HARMONY-6000
 */
public class Proxy2Test extends TestCase {
    public void test_getProxyClass_DefaultPackage() {
        Class pc = Proxy.getProxyClass(DefaultPkgIntf.class.getClassLoader(),
                new Class[] { DefaultPkgIntf.class });
        assertTrue(pc.getName().startsWith("$Proxy"));
    }
}

interface DefaultPkgIntf {

}
