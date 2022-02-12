package cnm.snax.petclinic.controllers;

import org.springframework.stereotype.Controller;
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

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOwner(){
        return "owners/index";
    }
}
