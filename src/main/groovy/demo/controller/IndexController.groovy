package demo.controller

import demo.service.HitService
import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@CompileStatic
class IndexController {

    HitService hitService

    @Autowired
    PostController(HitService hitService) {
        this.hitService = hitService
    }

    @RequestMapping("/")
    String home(Model model, @RequestHeader(value = "referer", required = false) referer) {
        hitService.addHit(referer as String)

        "home"
    }
}
