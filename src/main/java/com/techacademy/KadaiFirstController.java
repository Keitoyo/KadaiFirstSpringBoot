package com.techacademy;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable; // 追加
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("/dayofweek/{val1}")
    public String dispDayOfWeek(@PathVariable String val1) {

        int yy, mm, dd;

        yy = Integer.parseInt(val1.substring(0,4));
        mm = Integer.parseInt(val1.substring(4,6));
        dd = Integer.parseInt(val1.substring(6));

        LocalDate date = LocalDate.of(yy, mm, dd);

        String dayofweek = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);

        return val1 + "の曜日は" + dayofweek;
    }

    @GetMapping("/plus/{val1}/{val2}")
    public int calcPlus(@PathVariable int val1, @PathVariable int val2)
    {
        return val1 + val2;
    }

    @GetMapping("/minus/{val1}/{val2}")
    public int calcMinus(@PathVariable int val1, @PathVariable int val2)
    {
        return val1 - val2;
    }

    @GetMapping("/times/{val1}/{val2}")
    public int calcTimes(@PathVariable int val1, @PathVariable int val2)
    {
        return val1 * val2;
    }

    @GetMapping("/divide/{val1}/{val2}")
    public int calcDivide(@PathVariable int val1, @PathVariable int val2)
    {
        return val1 / val2;
    }
}
