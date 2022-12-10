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

import javax.management.MXBean;

/**
 * An interface that configurable objects can implement that will cause the
 * object to be registered with the JMX server for the VM when they are
 * instantiated.  The methods in this interface can be used to get and set the
 * values of configurable properties for a component.  It is not expected that
 * a component that implements this interface can handle all property changes: a
 * component can only handle the setting of those properties that are settable
 * during runtime.
 */
@MXBean
public interface ConfigurableMXBean {

    /**
     * Gets the properties that can be configured for this component.  An implementing
     * class should only provide the names of the properties that <code>getValue</code>
     * and <code>setValue</code> can handle, but users of this method cannot expect
     * that to be the case.
     * 
     * @return the names of the properties.
     * @see PropertySheet#getPropertyNames
     */
    public String[] getProperties();

    /**
     * Gets the value of a particular property as a string.
     * @param property the property whose value we should get
     * @return the value of the property, as a string, or <code>null</code> if
     * no such property exists (or if the property should not be exposed.)
     */
    public String getValue(String property);

    public String[] getValues(String property);

    /**
     * Sets the value of a property
     * @param property the property whose value we want to set
     * @param value the value that the property should be set to.
     * @return <code>true</code> if the component has taken the changed value
     * into account, <code>false</code> otherwise.
     */
    public boolean setValue(String property, String value);

    /**
     * Sets the values in a property list.
     * @param property the property whose value we want to set
     * @param values the value that the property should be set to.
     * @return True if the values were set correctly.
     */
    public boolean setValues(String property, String[] values);

}
