/*
 * Copyright 2018 Gustavo Pacheco.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.ryctabo.jersey;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

/**
 * The <strong>MyApplication</strong> is responsible to configure
 * the {@link org.glassfish.jersey.servlet.ServletContainer} and register all
 * classes that will handle HTTP requests.
 *
 * @author Gustavo Pacheco (ryctabo at gmail.com)
 * @version 1.0
 */
@ApplicationPath("api")
public class MyApplication extends ResourceConfig {

    /**
     * Create a new instance of {@link MyApplication}.
     * In this constructor the resource classes are loaded.
     */
    public MyApplication() {
        packages("com.github.ryctabo.jersey");
    }

}
