package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class userDetailsController {

    @GetMapping("/userData")
    public ModelAndView UserDetails(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Inputuser");
        return modelAndView;
    }
    @PostMapping("/Usersubmit")
    public ModelAndView SubmitUser(@ModelAttribute userDetails User){
         ModelAndView mv=new ModelAndView();
         mv.addObject("userData", User);
         mv.setViewName("details");
         return mv;
    }
}
