package com.caveofprogramming.spring.web.controllers;

import com.caveofprogramming.spring.web.dao.Offer;
import com.caveofprogramming.spring.web.service.OffersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class IndexController {

   private OffersService offersService;

    @Autowired
    public void setOffersService(OffersService offersService) {
        this.offersService = offersService;
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String showTest(Model model, @RequestParam("id") String id){
        System.out.println("Id is: " + id);

        return "createoffer";
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

    @RequestMapping(value = "/docreate", method=RequestMethod.POST)
    public String doCreate(Model model, Offer offer) {

        System.out.println(offer);
        return "offercreated";
    }
}