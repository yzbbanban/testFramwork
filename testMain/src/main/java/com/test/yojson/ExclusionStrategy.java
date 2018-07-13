/*
 * Copyright (C) 2008 Google Inc.
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
 */

package com.test.yojson;

/**
 * A strategy (or policy) definition that is used to decide whether or not a field or top-level
 * class should be serialized or deserialized as part of the JSON output/input. For serialization,
 * if the {@link #shouldSkipClass(Class)} method returns true then that class or field type
 * will not be part of the JSON output.  For deserialization, if {@link #shouldSkipClass(Class)}
 * returns true, then it will not be set as part of the Java object structure.
 *
 * @since 1.4
 */
public interface ExclusionStrategy {

  /**
   * @param f the field object that is under test
   * @return true if the field should be ignored; otherwise false
   */
  public boolean shouldSkipField(FieldAttributes f);

  /**
   * @param clazz the class object that is under test
   * @return true if the class should be ignored; otherwise false
   */
  public boolean shouldSkipClass(Class<?> clazz);
}
