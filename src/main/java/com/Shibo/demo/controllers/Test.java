/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Shibo.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author s.ibrahim
 */
@RestController("hello")
public class Test {

    @RequestMapping("/greeting")
    public String getName() {
        return "hello world ";
    }

}
