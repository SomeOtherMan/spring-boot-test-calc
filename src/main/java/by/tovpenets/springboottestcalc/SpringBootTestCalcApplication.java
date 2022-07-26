package by.tovpenets.springboottestcalc;

import by.tovpenets.springboottestcalc.model.Expression;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

@SpringBootApplication
public class SpringBootTestCalcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTestCalcApplication.class, args);
    }

}
