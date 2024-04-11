package com.study.controller;

import com.study.domain.MyBean141;
import com.study.domain.MyBean142;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("main14")
public class Controller14 {

    @RequestMapping("sub1")
    public void sub1(Model model) {
        MyBean141 o1 = new MyBean141("신촌", "한국", 33, "흥민");
        MyBean142 o2 = new MyBean142();
        o2.setName("강인");
        o2.setId("19");
        o2.setAge(22);

        model.addAttribute("player1", o1);
        model.addAttribute("player2", o2);
    }

}
