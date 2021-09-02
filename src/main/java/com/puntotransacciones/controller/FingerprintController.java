/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.puntotransacciones.controller;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.WebRequest;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import java.net.URL;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Optional;
import javax.script.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Edwin
 */
@Controller
public class FingerprintController {
    

    @RequestMapping(value = "/fingerprint", produces="text/plain")
    @ResponseBody
    public String fingerprint(HttpServletResponse response, HttpServletRequest request) throws IOException, ScriptException, NoSuchMethodException{
        /*RestTemplate rest = new RestTemplate();
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        engine.eval(Files.newBufferedReader(Paths.get("C:\\Users\\Edwin\\Documents\\NetBeansProjects\\puntotrans-pagadito\\src\\main\\webapp\\WEB-INF\\resources\\cybs_devicefingerprint.js"), StandardCharsets.UTF_8));
        //ResponseEntity<String> responseEntity = rest.exchange(request.getScheme()+ "://" + request.getServerName()+ ":" + request.getServerPort() + request.getContextPath() + "/home", HttpMethod.GET, null, String.class);
        
        Invocable inv = (Invocable) engine;
        Object object = inv.invokeFunction("cybs_dfprofiler", "pagadito", "SANDBOX");*/
        //URI uri = URI.parseURI("https://fingerprint-punto.herokuapp.com/home").get();
        //URL url = new URL("http://localhost:8080/puntotrans-pagadito/home");
        WebRequest webRequest = new WebRequest(new URL("http://localhost:8080/puntotrans-pagadito/home"));
        WebClient client = new WebClient();
        HtmlPage page = client.getPage("http://localhost:8080/puntotrans-pagadito/home");
        System.out.println("Page has being requested.");
        String bodyContent = page.getBody().asText();
        System.out.println(bodyContent);
        return bodyContent;
    }
}
