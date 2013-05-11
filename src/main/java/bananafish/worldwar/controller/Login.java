package bananafish.worldwar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * User: twer
 * Date: 5/11/13
 * Time: 10:46 AM
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class Login {
    @RequestMapping("login.do")
    public String login(Model model){
        model.addAttribute("message", "Hello, visitor!");
        return "login";
    }
}
