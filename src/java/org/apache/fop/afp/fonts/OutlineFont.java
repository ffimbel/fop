/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
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

/* $Id$ */

package org.apache.fop.afp.fonts;

import org.apache.fop.afp.AFPEventProducer;

/**
 * Default implementation of AbstractOutlineFont.
 */
public class OutlineFont extends AbstractOutlineFont {

    /**
     * Construct outline font with specified name and character set.
     * @param name font's name
     * @param embeddable whether or not this font is embeddable
     * @param charSet font's character set
     * @param eventProducer Handles any AFP related events
     */
    public OutlineFont(String name, boolean embeddable, CharacterSet charSet,
            AFPEventProducer eventProducer) {
        super(name, embeddable, charSet, eventProducer);
    }

}
