/*
 * Copyright (c) 2017-present Samelody.com
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
package com.samelody.stathod.util;

import android.support.annotation.StringRes;

import static android.widget.Toast.LENGTH_LONG;
import static android.widget.Toast.LENGTH_SHORT;
import static android.widget.Toast.makeText;
import static com.samelody.stathod.Stathod.getAppContext;

/**
 * Utilities for toasts.
 *
 * @author Belin Wu
 */
public final class Toasts {

    /**
     * Private constructor.
     */
    private Toasts() {}

    /**
     * Shows a short toast whit given text.
     *
     * @param text The resource id of text to show.
     */
    public static void showShort(@StringRes int text) {
        makeText(getAppContext(), text, LENGTH_SHORT).show();
    }

    /**
     * Shows a short toast whit given text.
     *
     * @param text The text to show.
     */
    public static void showShort(CharSequence text) {
        makeText(getAppContext(), text, LENGTH_SHORT).show();
    }

    /**
     * Shows a long toast whit given text.
     *
     * @param text The resource id of text to show.
     */
    public static void showLong(@StringRes int text) {
        makeText(getAppContext(), text, LENGTH_LONG).show();
    }

    /**
     * Shows a long toast whit given text.
     *
     * @param text The text to show.
     */
    public static void showLong(CharSequence text) {
        makeText(getAppContext(), text, LENGTH_LONG).show();
    }
}
