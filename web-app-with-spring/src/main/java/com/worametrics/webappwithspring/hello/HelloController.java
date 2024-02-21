package com.worametrics.webappwithspring.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello(){
        return "Hello what's up.!";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml(){
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>");
        sb.append("My First web app");
        sb.append("</title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("my first web app");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    }

    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp(){
        return "sayHello";
    }
}
