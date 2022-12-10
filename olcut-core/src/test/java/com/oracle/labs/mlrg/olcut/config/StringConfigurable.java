/*
 * Copyright (c) 2004-2020, Oracle and/or its affiliates.
 *
 * Licensed under the 2-clause BSD license.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package com.oracle.labs.mlrg.olcut.config;

import com.oracle.labs.mlrg.olcut.provenance.ConfiguredObjectProvenance;
import com.oracle.labs.mlrg.olcut.provenance.Provenancable;
import com.oracle.labs.mlrg.olcut.provenance.impl.ConfiguredObjectProvenanceImpl;

import java.io.Serializable;
import java.util.logging.Logger;

/**
 * A configurable with a few strings. Uses the @Config annotation to directly
 * annotate configurable members.
 */
public class StringConfigurable implements Configurable, Provenancable<ConfiguredObjectProvenance>, Serializable {

    protected Logger logger;

    @Config
    public String one = "";

    @Config
    public String two = "";

    @Config
    public String three = "";

    public StringConfigurable() {}

    public StringConfigurable(String one, String two, String three) {
        this.one = one;
        this.two = two;
        this.three = three;
    }

    @Override
    public String toString() {
        return "StringConfigurable{" + "one=" + one + ", two=" + two + ", three=" + three + '}';
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof StringConfigurable) {
            StringConfigurable sc = (StringConfigurable) other;
            return one.equals(sc.one) && two.equals(sc.two) && three.equals(sc.three);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        int result = one.hashCode();
        result = 31 * result + two.hashCode();
        result = 31 * result + three.hashCode();
        return result;
    }

    @Override
    public ConfiguredObjectProvenance getProvenance() {
        return new ConfiguredObjectProvenanceImpl(this,"StringConfigurable");
    }
}
