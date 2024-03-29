package com.worametrics.webappwithspring.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private Logger logger = LoggerFactory.getLogger(getClass());
    @RequestMapping("login")
    public String sayHelloJsp(@RequestParam String name, ModelMap modelMap) {
        modelMap.put("name", name);
        logger.info("Info level printed ");
        return "login";
    }
}
