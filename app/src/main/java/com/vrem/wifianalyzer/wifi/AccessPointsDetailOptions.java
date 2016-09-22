/*
 * Copyright (C) 2015 - 2016 VREM Software Development <VREMSoftwareDevelopment@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.vrem.wifianalyzer.wifi;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

class AccessPointsDetailOptions {
    private final boolean child;
    private final boolean frequencyRange;

    AccessPointsDetailOptions(boolean child, boolean frequencyRange) {
        this.child = child;
        this.frequencyRange = frequencyRange;
    }

    boolean isChild() {
        return child;
    }

    boolean isFrequencyRange() {
        return frequencyRange;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;

        if (other == null || getClass() != other.getClass()) return false;

        AccessPointsDetailOptions otherOptions = (AccessPointsDetailOptions) other;
        return new EqualsBuilder()
            .append(isChild(), otherOptions.isChild())
            .append(isFrequencyRange(), otherOptions.isFrequencyRange())
            .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(isChild())
            .append(isFrequencyRange())
            .toHashCode();
    }


}
