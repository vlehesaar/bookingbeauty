package com.example.bookingbeauty.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SubprofileController {
    @GetMapping(path = "/subprofile")
    public String getTestPage() {
        return "subprofile";
    }
}
