package hsn.spring.core;

import hsn.spring.core.data.dependsOn.Armor;
import hsn.spring.core.data.dependsOn.Armorer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Slf4j
@Configuration
public class DependsOnConfiguration {
    /*
    * This is to force the creation of Armorer class first,
    * even though the Armor class doesn't depend on the Armorer class.
    */

    @Bean
    @DependsOn(value = {"armorer"})
    public Armor armor() {
        log.info("Armor class created!");
        return new Armor();
    }

    @Bean
    public Armorer armorer() {
        log.info("Armorer class created!");
        return new Armorer();
    }
}
