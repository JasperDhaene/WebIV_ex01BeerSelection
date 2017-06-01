/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import domain.ColorBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author jasper
 */
@Controller
public class BeerController {

    @Autowired
    public ColorBean colorBean;
    
    
    @RequestMapping(value = {"/beer"}, method = RequestMethod.GET)
    public String showHomePage(Model model) {
        model.addAttribute("colours", colorBean.getColorsList());
        return "formView";
    }

}
