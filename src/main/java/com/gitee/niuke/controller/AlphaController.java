package com.gitee.niuke.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * @author oliver
 * @date 2020/1/9 10:05
 */
@Controller
public class AlphaController {

    @RequestMapping("/http")
    public void http(HttpServletRequest request, HttpServletResponse response) {
        System.out.println(request.getMethod());
        System.out.println(request.getServletPath());
        Enumeration<String> names = request.getHeaderNames();
        while (names.hasMoreElements()) {
            String key = names.nextElement();
            String valve = request.getHeader(key);
            System.out.println(key + ":" + valve);
        }

        response.setContentType("text/html;charset=utf-8");
        try {
            PrintWriter writer = response.getWriter();
            writer.write("<h1>牛客</h1>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @PostMapping(value = "/student")
    @ResponseBody
    public String save(String name, Integer age) {
        System.out.println(name);
        System.out.println(age);
        return "success";
    }

    @GetMapping(value = "/teacher")
    public ModelAndView getTeacher() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "八戒");
        modelAndView.addObject("age", 19);
        modelAndView.setViewName("teacher");
        return modelAndView;
    }

    @GetMapping("/school")
    public String getSchool(Model model) {
        model.addAttribute("name","大学生");
        model.addAttribute("age",18);
        return "/teacher";
    }

}
