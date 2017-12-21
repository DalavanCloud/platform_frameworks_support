/*
 * Copyright (C) 2017 The Android Open Source Project
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

package androidx.time

import org.junit.Assert.assertEquals
import org.junit.Test
import java.time.LocalTime

class LocalTimeTest {
    @Test fun destructuring() {
        val (hour, minute, second, nanos) = LocalTime.of(5, 12, 42, 55678)
        assertEquals(5, hour)
        assertEquals(12, minute)
        assertEquals(42, second)
        assertEquals(55678, nanos)
    }
}
