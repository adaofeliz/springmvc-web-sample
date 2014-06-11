package com.adaofeliz.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.concurrent.Callable;

@Controller
@RequestMapping("/*")
public class ServiceController {

    @ResponseBody
    @RequestMapping(
            value = "/",
            method = RequestMethod.GET)
    public Callable<String> helloWorld(final HttpServletRequest request) {
        return new Callable<String>() {
            public String call() throws Exception {
                return "Hello World! " + System.currentTimeMillis();
            }
        };
    }
}
