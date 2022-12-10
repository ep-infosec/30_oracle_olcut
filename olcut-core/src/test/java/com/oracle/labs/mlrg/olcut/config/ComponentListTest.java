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


import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * A set of tests for component lists.
 */
public class ComponentListTest {

    public ComponentListTest() {
    }


    @Test
    public void componentListTest() throws IOException {
        ConfigurationManager cm = new ConfigurationManager("componentListConfig.xml");
        ListConfigurable lc = (ListConfigurable) cm.lookup("simple");
        List<Configurable> l = lc.getList();
        assertTrue(l.size() == 2);
        for (Configurable c : l) {
            assertNotNull(c);
        }
    }

    @Test
    public void badComponentListTest() throws IOException {
        assertThrows(PropertyException.class, () -> {
            ConfigurationManager cm = new ConfigurationManager("componentListConfig.xml");
            ListConfigurable lc = (ListConfigurable) cm.lookup("bad");
            for (Configurable c : lc.getList()) {
                assertNotNull(c);
            }
        });
    }

    @Test
    public void simpleTypedTest() throws IOException {
        ConfigurationManager cm = new ConfigurationManager("componentListConfig.xml");
        ListConfigurable lc = (ListConfigurable) cm.lookup("typed");
        List<Configurable> l = lc.getList();
        assertTrue(l.size() == 3);
        for (Configurable c : l) {
            assertNotNull(c);
            assertEquals(c.getClass(), StringConfigurable.class);
        }
    }

    @Test
    public void dualTypedTest() throws IOException {
        ConfigurationManager cm = new ConfigurationManager("componentListConfig.xml");
        ListConfigurable lc = (ListConfigurable) cm.lookup("dualtyped");
        List<Configurable> l = lc.getList();
        assertTrue(l.size() == 5);
        int simp = 0;
        int string = 0;
        for (Configurable c : l) {
            assertNotNull(c);
            if (c.getClass().equals(SimpleConfigurable.class)) {
                simp++;
            } else if (c.getClass().equals(StringConfigurable.class)) {
                string++;
            } else {
                fail("Unknown class: " + c.getClass());
            }
        }

        assertTrue(simp == 2);
        assertTrue(string == 3);
    }

    @Test
    public void comboTypedTest() throws IOException {
        ConfigurationManager cm = new ConfigurationManager("componentListConfig.xml");
        ListConfigurable lc = (ListConfigurable) cm.lookup("combotyped");
        List<Configurable> l = lc.getList();
        assertTrue(l.size() == 4);
        int simp = 0;
        int string = 0;
        for (Configurable c : l) {
            assertNotNull(c);
            if (c.getClass().equals(SimpleConfigurable.class)) {
                simp++;
            } else if (c.getClass().equals(StringConfigurable.class)) {
                string++;
            } else {
                fail("Unknown class: " + c.getClass());
            }
        }
        assertTrue(simp == 1);
        assertTrue(string == 3);
    }

    @Test
    public void stringConfigurableArrayTest() throws IOException {
        ConfigurationManager cm = new ConfigurationManager("componentListConfig.xml");
        ArrayStringConfigurable lc = (ArrayStringConfigurable) cm.lookup("stringconfigurablearray");
        StringConfigurable[] l = lc.getArray();
        assertTrue(l.length == 3);
        String firstOne = l[0].one;
        assertEquals("alpha",firstOne);
        String secondOne = l[1].one;
        assertEquals("one",secondOne);
        String thirdOne = l[2].one;
        assertEquals("un",thirdOne);
    }

    @Test
    public void stringConfigurableBrokenArrayTest() throws IOException {
        assertThrows(PropertyException.class, () -> {
            ConfigurationManager cm = new ConfigurationManager("componentListConfig.xml");
            ArrayStringConfigurable lc = (ArrayStringConfigurable) cm.lookup("stringconfigurablearraybroken");
        }, "Did not throw PropertyException when asking for unknown element in configurable array.");
    }
}