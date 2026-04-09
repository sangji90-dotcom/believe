package com.rental.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoardController {

    @GetMapping("/categories")
    public String categories(Model model) {
        List<String> categories = new ArrayList<>();
        categories.add("공구");
        categories.add("음악");
        categories.add("캠핑용품");
        categories.add("스포츠");
        categories.add("디지털");
        categories.add("패션");
        categories.add("유아용품");
        categories.add("빌려주세요/빌려드립니다");

        model.addAttribute("categories", categories);
        return "categories";
    }

    @GetMapping("/board")
    public String board(@RequestParam("category") String category, Model model) {
        model.addAttribute("category", category);

        List<String> posts = new ArrayList<>();

        if (category.equals("공구")) {
            posts.add("전동드릴 빌려드립니다");
            posts.add("망치 필요하신 분?");
        } else if (category.equals("음악")) {
            posts.add("기타 빌려드립니다");
            posts.add("피아노 연습실 같이 쓸래요?");
        } else if (category.equals("빌려주세요/빌려드립니다")) {
            posts.add("캠핑 의자 빌려주세요");
            posts.add("노트북 빌려드립니다");
        } else {
            posts.add(category + " 관련 첫 번째 글");
            posts.add(category + " 관련 두 번째 글");
        }

        model.addAttribute("posts", posts);
        return "board";
    }
}