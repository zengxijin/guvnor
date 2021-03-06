/*
 * Copyright 2017 Red Hat, Inc. and/or its affiliates.
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
 *
 */

package org.guvnor.m2repo.preferences;

import org.uberfire.preferences.shared.annotations.Property;
import org.uberfire.preferences.shared.annotations.WorkbenchPreference;
import org.uberfire.preferences.shared.bean.BasePreference;

@WorkbenchPreference(identifier = "ArtifactRepositoryPreference", bundleKey = "ArtifactRepositoryPreference.Label")
public class ArtifactRepositoryPreference implements BasePreference<ArtifactRepositoryPreference> {

    @Property(bundleKey = "ArtifactRepositoryPreference.DefaultM2RepoDir")
    private String defaultM2RepoDir;

    @Override
    public ArtifactRepositoryPreference defaultValue(final ArtifactRepositoryPreference defaultValue) {
        defaultValue.defaultM2RepoDir = "repositories/kie";
        return defaultValue;
    }

    public String getDefaultM2RepoDir() {
        return defaultM2RepoDir;
    }

    public void setDefaultM2RepoDir(final String defaultM2RepoDir) {
        this.defaultM2RepoDir = defaultM2RepoDir.trim();
    }
}
