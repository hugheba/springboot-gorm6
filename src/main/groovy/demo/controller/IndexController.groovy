package demo.controller

import demo.domain.Hit
import demo.service.HitService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class IndexController {
    HitService hitService

    @Autowired
    PostController(HitService hitService) {
        setHitService(hitService)
    }

    @RequestMapping("/")
    String home(Model model, @RequestHeader(value = "referer", required = false) referer) {
        new Hit(referer: referer).save()

        "home"
    }
}
