package com.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/api/main45")
public class Controller45 {
    @PostMapping("sub1")
    @ResponseBody
    public String sub1(@RequestParam("name") String name,
                       @RequestParam("file") MultipartFile file) throws IOException {

        System.out.println("name = " + name);
        System.out.println("file.getOriginalFilename() = " + file.getOriginalFilename());
        System.out.println("file.getSize() = " + file.getSize());

        String path = "C:/Temp/" + file.getOriginalFilename();
        file.transferTo(new File(path));

        return null;
    }

    @PostMapping("sub2")
    @ResponseBody
    public String sub2(@RequestParam("name") String name,
                       @RequestParam("file[]") MultipartFile[] file) throws IOException {
        System.out.println("name = " + name);
        if (file != null && file.length > 0) {
            for (MultipartFile f : file) {
                if (f.getSize() > 0) {
                    String path = "C:/Temp/" + f.getOriginalFilename();
                    f.transferTo(new File(path));
                }
            }
        }

        return null;
    }
}
