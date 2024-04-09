package com.study.controller;

import com.study.domain.MyBean101;
import com.study.domain.MyBean102;
import com.study.domain.MyBean103;
import com.study.domain.MyBean104;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("main10")
public class Controller10 {

    @RequestMapping("sub1")
    public void method1(Model model) {
        // 요청 분석
        // 비즈니스 로직 실행
        // 결과를 모델에 담고
        var data = new HashMap<String, List>();
        data.put("key1", List.of("java", "css"));
        data.put("key2", List.of("react", "vue"));
        data.put("key 삼", List.of("spring", "node"));
        model.addAttribute("myList", data);
        // view로 포워딩 (/WEB-INF/view/main10/sub1.jsp)

    }

    @RequestMapping("sub2")
    public void method2(Model model) {
        var data = new ArrayList<Map>();
        data.add(Map.of("son", 7,
                "lee", 19,
                "kim", 30));
        data.add(Map.of("korea", "seoul",
                "japan", "tokyo",
                "미국", "워싱턴"));

        model.addAttribute("myAttr", data);
    }

    @RequestMapping("sub3")
    public void method3(Model model) {
        var data = new HashMap<String, String>();
        data.put("흥민", "런던");
        data.put("민재", "뮌헨");
        data.put("강인", "파리");
        data.put("jh", "샌프란시스코");

        model.addAttribute("myAttr1", data);
        model.addAttribute("myAttr2", "흥민");
        model.addAttribute("myAttr3", "민재");
        model.addAttribute("jh", "강인");
    }

    @RequestMapping("sub4")
    public void method4(Model model) {
        var data = new ArrayList<Map>();
        data.add(Map.of("son", "london", "lee", "paris"));
        data.add(Map.of("korea", "seoul", "uk", "london"));
        data.add(Map.of("부산", "해운대"));
        data.add(Map.of("서울", "강남"));

        model.addAttribute("list1", data);
        model.addAttribute("number1", 1);
        model.addAttribute("two", 2);
        model.addAttribute("three", "3");
        model.addAttribute("3", 30);
        model.addAttribute("삼", 33);
        model.addAttribute("data1", "son");
        model.addAttribute("data2", "lee");
    }

    @RequestMapping("sub5")
    public void method5(Model model) {
        model.addAttribute("data", "값 1");
        model.addAttribute("데이타", "값 2");
        model.addAttribute("3", "삼");
    }

    @RequestMapping("sub6")
    public void method6(Model model) {
        var data = new ArrayList<MyBean101>();
        MyBean101 e1 = new MyBean101();
        MyBean101 e2 = new MyBean101();
        MyBean101 e3 = new MyBean101();

        e1.setName("흥민");
        e1.setAge(18);
        e1.setAddress("런던");

        e2.setName("강인");
        e2.setAge(30);
        e2.setAddress("파리");

        e3.setName("정후");
        e3.setAge(40);
        e3.setAddress("샌프란시스코");

        data.add(e1);
        data.add(e2);
        data.add(e3);

        model.addAttribute("myList", data);
    }

    @RequestMapping("sub7")
    public void method7(Model model) {
        var list = new ArrayList<MyBean102>();
        // todo: 코드작성 및 MyBean102 클래스 만들기
        MyBean102 e1 = new MyBean102();
        MyBean102 e2 = new MyBean102();
        MyBean102 e3 = new MyBean102();

        e1.setColor("white");
        e1.setModelName("tesla");
        e1.setPrice(30.50);
        e2.setColor("black");
        e2.setModelName("kia");
        e2.setPrice(60.12);
        e3.setColor("red");
        e3.setModelName("volvo");
        e3.setPrice(70.13);

        list.add(e1);
        list.add(e2);
        list.add(e3);

        model.addAttribute("cars", list);
    }

    @RequestMapping("sub8")
    public void method8(Model model) {
        var list = new ArrayList<MyBean103>();

        MyBean103 e1 = new MyBean103();
        MyBean103 e2 = new MyBean103();

        // ${myList[0].name}
        e1.setName("한국");
        // ${myList[0].cities[0]}
        // ${myList[0].cities[1]}
        // ${myList[0].cities[2]}
        e1.setCities(List.of("서울", "인천", "부산"));

        // ${myList[1].name}
        e2.setName("미국");
        // ${myList[1].cities[0]}
        // ${myList[1].cities[1]}
        e2.setCities(List.of("뉴욕", "LA"));

        list.add(e1);
        list.add(e2);

        model.addAttribute("myList", list);
    }

    @RequestMapping("sub9")
    public void method9(Model model) {
        MyBean104 e1 = new MyBean104();
        MyBean104 e2 = new MyBean104();

        e1.setCity("부산");
        e1.setFoods(List.of("국밥", "햄버거", "회"));

        e2.setCity("파리");
        e2.setFoods(List.of("커피", "바게뜨", "케이크"));

        var obj = List.of(e1, e2);
        model.addAttribute("data", obj);
    }
}









