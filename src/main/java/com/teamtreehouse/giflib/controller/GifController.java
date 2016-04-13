package com.teamtreehouse.giflib.controller;

import com.teamtreehouse.giflib.model.Gif;
import java.time.LocalDate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


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
    public String gifDetails(ModelMap modelMap) {
        Gif gif = new Gif("android-explosion", LocalDate.of(2015, 2, 13), "Dave Sudia", true);
        modelMap.put("gif", gif);
        return "gif-details";
    }
}
