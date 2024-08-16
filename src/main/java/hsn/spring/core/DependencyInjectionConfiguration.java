package hsn.spring.core;

import hsn.spring.core.data.Shield;
import hsn.spring.core.data.Sword;
import hsn.spring.core.data.SwordShield;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DependencyInjectionConfiguration {
    @Bean
    public Sword sword() {
        return new Sword();
    }

    @Bean
    public Shield shield() {
        return new Shield();
    }

    @Bean
    public SwordShield swordShield(Sword sword, Shield shield) {
        return new SwordShield(sword, shield);
    }
}
