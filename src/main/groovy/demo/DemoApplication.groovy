package demo

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan

@SpringBootApplication
@ComponentScan
class DemoApplication {
    static void main(String[] args) {
        SpringApplication.run(DemoApplication, args)
    }
}