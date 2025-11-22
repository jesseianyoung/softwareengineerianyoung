package com.MonthsaryLetter.letterian.controller;

import org.springframework.core.io.ClassPathResource;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
public class MonthsaryLetterMonths {
    @GetMapping("/api/letters")
    public Map<String, String> getLetters() {
        Map<String, String> letters = new LinkedHashMap<>();
        letters.put("January", "Happy 1st Monthsary! Here's to many more beautiful moments together ❤️");
        letters.put("February", "Our love keeps growing every day. Happy 2nd Monthsary, my dear!");
        letters.put("March", "3 months with you feels like forever. Thank you for being my rock.");
        letters.put("April", "April showers bring May flowers — just like you bring happiness to my life!");
        letters.put("May", "Happy 5th Monthsary! Every month with you is a gift I treasure.");
        letters.put("June", "6 months of memories, laughter, and love. Here's to us!");
        letters.put("July", "Together for 7 months and I still fall for you every single day.");
        letters.put("August", "/letters/MonthsaryAugust2025/Passcode.html");
        letters.put("September", "/letters/MonthsarySeptember2025/Passcode.html");
        letters.put("October", "/letters/MonthsaryOctober2025/Passcode.html");
        letters.put("November", "/letters/MonthsaryNovember2025/Passcode.html");
        letters.put("December", "/letters/MonthsaryDecember2025/Passcode.html");
        return letters;
    }
}
