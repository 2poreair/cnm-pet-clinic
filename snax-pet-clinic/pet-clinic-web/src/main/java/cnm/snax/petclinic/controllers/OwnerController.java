package cnm.snax.petclinic.controllers;

import cnm.snax.petclinic.services.OwnerService;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/*
* You can add the template folder pointing your controller to look in that folder for it.
* without @RequestMapping("/owners") you have to use line below above the construct
* @RequestMapping({"/owners","/owners/index","/owners/index.html"})
*
* when you use @RequestMapping("/owners") with the class you can just use
* @RequestMapping({"/","/index", "/index.html"})
* above the construct
* */

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwner(Model model){

        model.addAttribute("owners", ownerService.findAll());

        return "owners/index";
    }
}
