package demo.domain

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import grails.gorm.annotation.Entity
import org.grails.datastore.gorm.GormEntity

@Entity
@JsonIgnoreProperties(['dirtyPropertyNames', 'errors', 'dirty', 'attached', 'version'])
class Hit implements GormEntity<Hit>{
    Date dtStamp = new Date()
    String referer

    static mapping = {
        version false
    }

    static constraints = {
        dtStamp nullable: false
        referer nullable: true
    }
}
