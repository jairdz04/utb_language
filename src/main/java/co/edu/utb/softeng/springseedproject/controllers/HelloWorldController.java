/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utb.softeng.springseedproject.controllers;

import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author jair
 */

@Controller
@RequestMapping("/test")
public class HelloWorldController {
    
    @RequestMapping(value={"/", ""}, method = RequestMethod.GET)
    public String test() {
        //Map<String, String> response = new HashMap<>();
        //response.put("message", "Hello World!");
        return "index";
    }
    
    @RequestMapping(value="/run", method = RequestMethod.POST)
    public @ResponseBody Map<String, String> run(@RequestBody Map body) throws RecognitionException {
        conexion con = new conexion();
        Map<String, String> response = new HashMap<>();
        response.put("message", con.conexion(body.get("text").toString()));
        return response;
    }
    
}
