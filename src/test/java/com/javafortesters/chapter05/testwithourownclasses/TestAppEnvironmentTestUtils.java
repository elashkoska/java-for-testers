package com.javafortesters.chapter05.testwithourownclasses;

import com.javafortesters.helpers.TestAppEnvUtils;
import org.junit.Assert;
import org.junit.Test;

public class TestAppEnvironmentTestUtils {
    @Test
    public void canGetUrlStatically() {
        Assert.assertEquals("Returns Hard Coded URL", "http://192.123.0.3:67", TestAppEnvUtils.getUrl());
        Assert.assertEquals("Just the domain", "192.123.0.3", TestAppEnvUtils.DOMAIN);
        Assert.assertEquals("Just the port", "67", TestAppEnvUtils.PORT);
    }
}

