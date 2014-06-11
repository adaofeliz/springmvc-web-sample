package com.adaofeliz.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by adaopinto on 12/03/14.
 */

@ContextConfiguration(locations = {"classpath:web-application-context.xml"})
public class ApplicationContextLoadTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private ApplicationContext context;

    @Test(description = "This test will test if the IoC framework is loading without errors.")
    public void testSpringApplicationContextLoad() throws Exception {
        Assert.assertNotNull(context);
    }
}
