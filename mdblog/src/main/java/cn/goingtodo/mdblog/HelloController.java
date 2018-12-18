package cn.goingtodo.mdblog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String Hello(Model m) {
        m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        return "hello";
    }
//    @Autowired
//    private StudentProperties studentProperties;
//
//    @Value("${content}")
//    private String content;
//
//    @RequestMapping("/hello")
//    public String Hello() {
//        return "Hello Spring Boot!"+name +age;
//    }
//    public String Hello() {
//        return content;
//    }
//    public String Hello() {
//        return studentProperties.getName()+studentProperties.getAge();
//    }


//    @Value("${name}")
//    private String name;
//    @Value("${age}")
//    private Integer age;
}
