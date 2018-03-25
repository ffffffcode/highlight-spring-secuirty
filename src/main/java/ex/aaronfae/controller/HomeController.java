package ex.aaronfae.controller;

import ex.aaronfae.entity.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model) {
        Msg msg = new Msg("这是标题", "这是内容", "这是额外信息，只对管理员可见");
        model.addAttribute("msg", msg);
        return "home";
    }
}
