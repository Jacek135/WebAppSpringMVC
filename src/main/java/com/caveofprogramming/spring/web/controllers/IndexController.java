package com.caveofprogramming.spring.web.controllers;

import com.caveofprogramming.spring.web.dao.Offer;
import com.caveofprogramming.spring.web.service.OffersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

@Controller
public class IndexController {

    /*public String showHome(HttpSession session){
        session.setAttribute("name", "Boris");
        return "home";
    }*/
    /*public ModelAndView index() {
        ModelAndView mv = new ModelAndView("home");

        Map<String, Object> model = mv.getModel();
        model.put("name", "River");

        return mv;
    }*/

    private OffersService offersService;

    @Autowired
    public void setOffersService(OffersService offersService) {
        this.offersService = offersService;
    }

    @RequestMapping(value = "/offers")
    public String showOffers(Model model) {

        List<Offer> offers = offersService.getCurrent();
        model.addAttribute("offers", offers);

        return "offers";
    }

    @RequestMapping(value = "/createoffer")
    public String createOffer(Model model) {

        return "createoffer";
    }
}
