package com.ernieboy.website.controllers;

import com.ernieboy.website.model.Article;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class ArticlesController {


    @RequestMapping(value = "articles", method = RequestMethod.GET)
    public List<Article> List() {

        return new ArrayList<Article>();

    }
}
