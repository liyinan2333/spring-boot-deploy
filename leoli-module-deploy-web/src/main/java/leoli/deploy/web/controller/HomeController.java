package leoli.deploy.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * 首页Controller
 *
 * @author leoli
 * @date 2020/12/10
 */
@Controller
public class HomeController {

    @RequestMapping("hello")
    public String index(String name, Model model) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        model.addAttribute("name", name);
        model.addAttribute("strList", list);
        model.addAttribute("show", false);
        return "hello";
    }

}
