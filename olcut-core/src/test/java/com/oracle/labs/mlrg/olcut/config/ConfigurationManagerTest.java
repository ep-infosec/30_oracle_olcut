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

import com.oracle.labs.mlrg.olcut.config.test.Ape;
import com.oracle.labs.mlrg.olcut.config.test.Barbary;
import com.oracle.labs.mlrg.olcut.config.test.Chimp;
import com.oracle.labs.mlrg.olcut.config.test.Gorilla;
import com.oracle.labs.mlrg.olcut.config.test.Monkey;
import com.oracle.labs.mlrg.olcut.config.test.Orangutan;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 */
public class ConfigurationManagerTest {
    private static ConfigurationManager singletonCM;

    @BeforeAll
    public static void setup() {
        singletonCM = new ConfigurationManager("/com/oracle/labs/mlrg/olcut/config/singletonConfig.xml");
    }

    @Test
    public void testSingletonTrue() {
        Chimp c = singletonCM.lookupSingleton(Chimp.class, false);
        assertNotNull(c, "Failed to find actual singleton");
        c = singletonCM.lookupSingleton(Chimp.class, true);
        assertNotNull(c, "Failed to find actual singleton");
    }

    @Test
    public void testSingletonTrueSubclass() {
        Orangutan o = singletonCM.lookupSingleton(Orangutan.class, true);
        assertNotNull(o, "Failed to find Bornean as subclass");
        o = singletonCM.lookupSingleton(Orangutan.class, false);
        assertNull(o, "Should not have found an Orangutan ");
    }


    @Test
    public void testSingletonMultipleClasses() {
        assertThrows(PropertyException.class, () -> {singletonCM.lookupSingleton(Gorilla.class, false);},
                "Config has multiple Gorillas but no exception was thrown");
        assertThrows(PropertyException.class, () -> {singletonCM.lookupSingleton(Gorilla.class, true);},
                "Config has multiple Gorillas but no exception was thrown");
    }

    @Test
    public void testSingletonMultipleInterfaces() {
        assertThrows(PropertyException.class, () -> {singletonCM.lookupSingleton(Monkey.class, true);},
                "Config has multiple Gorillas but no exception was thrown");
        Monkey m = singletonCM.lookupSingleton(Monkey.class, false);
        assertNull(m, "Looked up interface without allowAssignable but didn't get null");
    }

    @Test
    public void testSingletonNoImport() {
        assertNull(singletonCM.lookupSingleton(Barbary.class, false), "Should ignore imports");
        assertNull(singletonCM.lookupSingleton(Barbary.class, true), "Should ignore imports");
    }

    @Test
    public void testMultipleLoading() {
        List<String> files = new ArrayList<>();

        files.add("/com/oracle/labs/mlrg/olcut/config/timeConfig.xml");
        files.add("/com/oracle/labs/mlrg/olcut/config/stringConfig.xml");
        files.add("/com/oracle/labs/mlrg/olcut/config/typeConfig.xml");

        ConfigurationManager cm = new ConfigurationManager(files);

        Configurable a = cm.lookup("valid-time");
        assertNotNull(a);

        Configurable b = cm.lookup("ac");
        assertNotNull(b);

        Configurable c = cm.lookup("default");
        assertNotNull(c);

        assertEquals(12,cm.getComponentNames().size());
    }
}
