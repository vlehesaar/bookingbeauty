package com.example.bookingbeauty.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookingController {

    @GetMapping(path = "/booking")
    public String getTestPage() {
        return "/booking";
    }
}