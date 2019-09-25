package me.study.reactjs;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : jaehyun
 * <p>
 * Date: 2019-09-03
 * Copyright(©) 2019 by jaehyun.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

}
