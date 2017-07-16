package demo

import org.grails.orm.hibernate.HibernateDatastore
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class DemoApplication {

    @Autowired HibernateDatastore hibernateDatastore

    static void main(String[] args) {
        SpringApplication.run(DemoApplication, args)
    }

}