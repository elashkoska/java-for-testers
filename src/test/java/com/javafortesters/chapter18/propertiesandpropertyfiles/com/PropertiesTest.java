package com.javafortesters.chapter18.propertiesandpropertyfiles.com;

import org.junit.Test;

import java.util.Properties;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class PropertiesTest {
    @Test
    public void setProperties() {
        Properties properties = new Properties();
        assertThat(properties.size(), is(0));
        properties.setProperty("browser", "chrome");
        properties.setProperty("port", "80");
        assertThat(properties.getProperty("browser"), is("chrome"));
        assertThat(properties.getProperty("port"), is("80"));
        assertThat(properties.getProperty("missing"), is(nullValue()));
        assertThat(properties.getProperty("missing", "default"), is("default"));
        for (String key : properties.stringPropertyNames()) {
            System.out.println("Key:" + key + "" + "Value:" + properties.getProperty(key));
        }
        properties.list(System.out);
        assertThat(properties.containsKey("browser"), is(true));
    }
    @Test
    public void exerciseProperties() {
        Properties properties = new Properties();
        properties.setProperty("name", "bob");
        properties.setProperty("gender", "male");
        properties.setProperty("password", "paSSword");
        assertThat(properties.size(), is(3));
        for (String key : properties.stringPropertyNames()) {
            System.out.println("key:" + key + "" + "value:" + properties.getProperty(key));
        }
        properties.list(System.out);
        assertThat(properties.containsKey("gender"), is(true));
        assertEquals("bob", properties.get("name"));
        assertThat(properties.getProperty("permission", "Admin"), is("Admin"));
    }

    @Test
    public void testProperties() {
        Properties sys = System.getProperties();
        sys.list(System.out);
    }
}

