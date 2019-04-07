package com.mycompany.webappspring;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@ComponentScan
@Controller
@SpringBootApplication

public class run extends SpringBootServletInitializer {

   
    public static void main(String[] args) {
        SpringApplication.run(run.class, args);
    }
  
    @RequestMapping("/index")
    public String index(ModelMap mm) {
      //  mm.put("listCategory", categoryService.getPersonsInfoByID(3));
        return "index";
    } 
//public String come(){
//return "hi";
//}
}
