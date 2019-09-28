package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by MaoChenDong on 2019/9/28.
 */
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(){

        return "index";
    }
}
