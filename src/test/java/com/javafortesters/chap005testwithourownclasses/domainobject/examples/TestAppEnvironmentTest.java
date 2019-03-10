package com.javafortesters.chap005testwithourownclasses.domainobject.examples;

import com.javafortesters.domainobject.TestAppEnv;
import org.junit.Assert;
import org.junit.Test;

public class TestAppEnvironmentTest {
    @Test
    public void canGetUrlStatically() {
        Assert.assertEquals("Returns Hard Coded URL", "http://192.123.0.3:67", TestAppEnv.getUrl());
        Assert.assertEquals("Just the domain", "192.123.0.3", TestAppEnv.DOMAIN);
        Assert.assertEquals("Just the port", "67", TestAppEnv.PORT);
    }
}

