package demo.service

import demo.domain.Hit
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service('hitService')
@Transactional
class HitServiceImpl implements HitService {
    @Override
    void addHit(String referrer) {
        new Hit(referer: referrer).save(failOnError: true)
    }
}
