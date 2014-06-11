package com.adaofeliz.web.controller;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.Callable;

/**
 * Created by adaopinto on 11/06/14.
 */
public class ServiceControllerTest {

    @Mock
    private HttpServletRequest httpServletRequest;

    @InjectMocks
    private ServiceController serviceControllerVictim;

    @BeforeMethod
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        // Do nothing
    }

    @Test
    public void testHelloWorld() throws Exception {
        Callable<String> victimReturn = serviceControllerVictim.helloWorld(httpServletRequest);
        Assert.assertNotNull(victimReturn);
    }
}
