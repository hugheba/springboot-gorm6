package demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
@SpringBootApplication
class DemoApplication {
    @RequestMapping("/")
    String home(Model model) {
        "home"
    }

    static void main(String[] args) {
        SpringApplication.run(DemoApplication, args)
    }
}