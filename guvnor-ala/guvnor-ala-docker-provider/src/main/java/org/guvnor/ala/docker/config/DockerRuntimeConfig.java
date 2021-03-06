/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.guvnor.ala.docker.config;

import org.guvnor.ala.config.ProvisioningConfig;
import org.guvnor.ala.config.RuntimeConfig;

/*
 * Represents the Docker Runtime Configuration specific settings to run to Docker Images
 * @see ProvisioningConfig
 * @see RuntimeConfig
 */
public interface DockerRuntimeConfig extends ProvisioningConfig,
        RuntimeConfig {

    /*
     * Get the Docker Image Name to be executed
     * @return String with the Docker Image name. 
     */
    String getImage();

    /*
     * Get the Docker Image Exposed port number
     * @return String with the Docker Image exposed port number. 
     */
    String getPort();

    /*
     * Get the Docker Pull value, to decide if the Image needs to be pulled from a public 
     *  registry or not. 
     * @return String with the Docker Pull value.
     */
    boolean isPull();

}
