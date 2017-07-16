package demo.service

import demo.domain.Hit
import groovy.transform.CompileStatic
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service('hitService')
@Transactional
@CompileStatic
class HitServiceImpl implements HitService {

    @Override
    void addHit(String referer) {
        new Hit(referer: referer).save(failOnError: true)
    }

}
