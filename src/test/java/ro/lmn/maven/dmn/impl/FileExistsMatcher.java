/*
 * Copyright 2013 Robert Munteanu
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
package ro.lmn.maven.dmn.impl;

import java.io.File;

import org.hamcrest.Description;
import org.hamcrest.Factory;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class FileExistsMatcher extends TypeSafeMatcher<File> {

    @Factory
    public static <T> Matcher<File> exists() {
        return new FileExistsMatcher();
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("does not exist");
    }

    @Override
    protected boolean matchesSafely(File item) {
        return item != null && item.exists();
    }
}