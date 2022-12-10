/*
 * Copyright (c) 2004-2021, Oracle and/or its affiliates.
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

import com.oracle.labs.mlrg.olcut.config.property.ListProperty;
import com.oracle.labs.mlrg.olcut.config.property.MapProperty;
import com.oracle.labs.mlrg.olcut.config.property.SimpleProperty;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.oracle.labs.mlrg.olcut.util.IOUtil.replaceBackSlashes;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * Tests reading and writing all valid fields from a config file.
 */
public class AllFieldsConfiguredTest {

    private File f;

    @BeforeAll
    public static void setup() {
        Logger logger = Logger.getLogger(PropertySheet.class.getName());
        logger.setLevel(Level.SEVERE);
    }

    @BeforeEach
    public void setUp() throws IOException {
        f = File.createTempFile("all-config", ".xml");
        f.deleteOnExit();
    }

    @Test
    public void loadConfig() throws IOException {
        ConfigurationManager cm = new ConfigurationManager("allConfig.xml");
        AllFieldsConfigurable ac = (AllFieldsConfigurable) cm.lookup("all-config");
        assertNotNull(ac, "Failed to load all-config");
    }

    @Test
    public void saveConfig() throws IOException {
        ConfigurationManager cm1 = new ConfigurationManager("allConfig.xml");
        AllFieldsConfigurable ac1 = (AllFieldsConfigurable) cm1.lookup("all-config");
        cm1.save(f, true);
        ConfigurationManager cm2 = new ConfigurationManager(replaceBackSlashes(f.toString()));
        AllFieldsConfigurable ac2 = (AllFieldsConfigurable) cm2.lookup("all-config");
        assertEquals(ac1,ac2,"Two all configs aren't equal");
    }

    @Test
    public void generateConfig() throws IOException {
        AllFieldsConfigurable ac = generateConfigurable();
        ConfigurationManager cm1 = new ConfigurationManager();
        cm1.importConfigurable(ac,"all-config");
        cm1.save(f);
        ConfigurationManager cm2 = new ConfigurationManager(replaceBackSlashes(f.toString()));
        AllFieldsConfigurable ac2 = (AllFieldsConfigurable) cm2.lookup("all-config");
        assertEquals(ac,ac2,"Imported config not equal to generated object");
    }

    @Test
    public void overrideTest() throws IOException {
        ConfigurationManager cm = new ConfigurationManager("allConfig.xml");

        // Override various properties.
        cm.overrideConfigurableProperty("all-config","boolField",new SimpleProperty("false"));
        cm.overrideConfigurableProperty("all-config","doubleArrayField", ListProperty.createFromStringList(Arrays.asList("3.14","2.77","1.0")));
        // This rearranges the elements of listConfigurableSubclassField
        cm.overrideConfigurableProperty("all-config","listConfigurableSubclassField", ListProperty.createFromStringList(Arrays.asList("second-configurable","first-configurable")));
        Map<String,String> newMap = new HashMap<>();
        newMap.put("one","1.0");
        newMap.put("two","2.0");
        cm.overrideConfigurableProperty("all-config","mapDoubleField", MapProperty.createFromStringMap(newMap));

        AllFieldsConfigurable ac = (AllFieldsConfigurable) cm.lookup("all-config");

        assertEquals(false,ac.boolField);
        assertArrayEquals(new double[]{3.14,2.77,1.0},ac.doubleArrayField,1e-10);
        assertEquals(new StringConfigurable("alpha","beta","gamma"),ac.listConfigurableSubclassField.get(0));
        assertEquals(new StringConfigurable("A","B","C"),ac.listConfigurableSubclassField.get(1));
        assertEquals(1.0,ac.mapDoubleField.get("one"),1e-10);
        assertEquals(2.0,ac.mapDoubleField.get("two"),1e-10);
    }

    public static AllFieldsConfigurable generateConfigurable() {
        AllFieldsConfigurable ac = new AllFieldsConfigurable();

        ac.name = "all-config";

        //Primitives
        ac.boolField = true;
        ac.BoolField = true;

        ac.byteField = 123;
        ac.ByteField = 123;

        ac.charField = 'a';
        ac.characterField = 'a';

        ac.shortField = 1234;
        ac.ShortField = 1234;

        ac.intField = 12345;
        ac.integerField = 12345;

        ac.longField = 123456789L;
        ac.LongField = 123456789L;

        ac.floatField = 3.14159f;
        ac.FloatField = 3.14159f;

        ac.doubleField = 3.141592653589793;
        ac.DoubleField = 3.141592653589793;

        ac.stringField = "monkeys";

        //Primitive array types
        ac.byteArrayField = new byte[]{123, 23 ,3};
        ac.charArrayField = new char[]{'1', '2', '3'};
        ac.shortArrayField = new short[]{12345,2345,345};
        ac.intArrayField = new int[]{123456,23456,3456};
        ac.longArrayField = new long[]{9223372036854775807L,9223372036854775806L,5L};
        ac.floatArrayField = new float[]{1.1f,2.3f,3.5f};
        ac.doubleArrayField = new double[]{1e-16,2e-16,3.16};
        ac.booleanArrayField = new boolean[]{true,false,true};

        //Configurable classes
        ac.configurableField = new StringConfigurable("A","B","C");
        ac.configurableSubclassField = new StringConfigurable("alpha","beta","gamma");

        //Object array types
        ac.stringArrayField = new String[]{"gibbons","baboons","gorillas"};

        ac.configurableArrayField = new Configurable[]{ac.configurableField,ac.configurableSubclassField};
        ac.configurableSubclassArrayField = new StringConfigurable[]{(StringConfigurable)ac.configurableField,ac.configurableSubclassField};

        //Generic types - requires genericType argument to be set
        ac.listDoubleField = new ArrayList<>();
        ac.listDoubleField.add(2.71828);
        ac.listDoubleField.add(3.14159);
        ac.listStringField = new ArrayList<>();
        ac.listStringField.add("e");
        ac.listStringField.add("pi");
        ac.listConfigurableSubclassField = new ArrayList<>();
        ac.listConfigurableSubclassField.add(ac.configurableSubclassArrayField[0]);
        ac.listConfigurableSubclassField.add(ac.configurableSubclassArrayField[1]);

        ac.setDoubleField = new HashSet<>();
        ac.setDoubleField.add(2.71828);
        ac.setDoubleField.add(3.14159);
        ac.setStringField = new HashSet<>();
        ac.setStringField.add("e");
        ac.setStringField.add("pi");
        ac.setPathField = new HashSet<>();
        ac.setPathField.add(Paths.get("/tmp/first-path.txt"));
        ac.setPathField.add(Paths.get("/tmp/second-path.txt"));
        ac.setConfigurableSubclassField = new HashSet<>();
        ac.setConfigurableSubclassField.add(ac.configurableSubclassArrayField[0]);
        ac.setConfigurableSubclassField.add(ac.configurableSubclassArrayField[1]);

        ac.mapDoubleField = new HashMap<>();
        ac.mapDoubleField.put("e",2.71828);
        ac.mapDoubleField.put("pi",3.14159);
        ac.mapStringField = new HashMap<>();
        ac.mapStringField.put("first","A");
        ac.mapStringField.put("second","B");
        ac.mapFileField = new HashMap<>();
        ac.mapFileField.put("first",new File("/tmp/first-file.txt"));
        ac.mapFileField.put("second",new File("/tmp/second-file.txt"));
        ac.mapFileField.put("third",new File("/tmp/third-file.txt"));
        ac.mapConfigurableSubclassField = new HashMap<>();
        ac.mapConfigurableSubclassField.put("first", ac.configurableSubclassArrayField[0]);
        ac.mapConfigurableSubclassField.put("second", ac.configurableSubclassArrayField[1]);
        ac.mapConfigurableSubclassField.put("third", new StringConfigurable("uno","dos","tres"));

        ac.enumSetField = EnumSet.of(AllFieldsConfigurable.Type.A, AllFieldsConfigurable.Type.C, AllFieldsConfigurable.Type.E);

        //Misc types
        ac.atomicIntegerField = new AtomicInteger(1);
        ac.atomicLongField = new AtomicLong(123456789);
        ac.fileField = new File("/tmp/a-file.txt");
        ac.pathField = Paths.get("/tmp/a-path.txt");
        try {
            ac.urlField = new URL("file:///tmp/a-file-url.txt");
        } catch (MalformedURLException e) {
            fail("Malformed URL");
        }
        ac.dateField = LocalDate.parse("1948-06-21");
        ac.dateTimeField = OffsetDateTime.parse("1949-06-16T20:30:00+01:00");
        ac.timeField = OffsetTime.parse("12:34:00+00:00");
        ac.enumField = AllFieldsConfigurable.Type.F;

        ac.postConfig();

        return ac;
    }
}
