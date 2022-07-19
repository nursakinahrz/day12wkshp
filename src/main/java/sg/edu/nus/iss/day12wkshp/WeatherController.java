package sg.edu.nus.iss.day12wkshp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
    

    @Controller
    @RequestMapping(path={"/weather"})
    public class WeatherController {

        @GetMapping
        public String weather(
            @RequestParam(required = true) String city,
            @RequestParam(name = "units", defaultValue="kilometers") String units,
            Model model) {

                model.addAttribute("city", city);
                model.addAttribute("units", units);

                return "weather";

            }
        
    }

