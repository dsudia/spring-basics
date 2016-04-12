package com.teamtreehouse.giflib.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by davidsudia on 4/12/16.
 */
@Controller
public class GifController {

    @RequestMapping("/")
    public String listGifs() {
        return "home";
    }

    @RequestMapping("/gif")
    @ResponseBody
    public String singleGif() {
        return "This would be a GIF if I knew what I was doing.";
    }
}
