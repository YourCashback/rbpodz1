package ru.mtuci.demo.controller;

import org.springframework.web.bind.annotation.*;
import ru.mtuci.demo.model.Demo;

@RestController
@RequestMapping("/")
class DemoController {

    @GetMapping("/hello")
    public String getHello(@RequestParam String str, int numc) {
        try {
            int num = numc + 1;
            String incrementedNumber = str ;
            return "hello " + incrementedNumber + "\n" + num; // Возвращаем "hello" и увеличенное число
        } catch (NumberFormatException e) {
            return "Invalid input: " + str; // Если строка не является числом
        }
    }
}
