/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.webappspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller

public class runPage {
   // @Autowired
    //PeopleManagementService categoryService;

     @RequestMapping("new")
    public String index(ModelMap mm) {
      //  mm.put("listCategory", categoryService.getPersonsInfoByID(3));
        return "index";
    } 
}
