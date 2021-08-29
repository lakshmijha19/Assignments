package com.lakshmi.spring6;

import com.lakshmi.springmvc6.model.Registration;

@Controller
public class RegistrationController {

   public String showForm(Model m)
   {
	   m.addAttribute("registration", new Registration());
	    return "register";
   }
   
   @RequestMapping(value = "/processForm", method = RequestMethod.POST)
   public String processForm(@Valid @ModelAttribute("registration") Registration register,
       BindingResult bindingResult) {
     if (bindingResult.hasErrors()) {
       return "register";
     } else {
       return "success";
     }
   }
   
}