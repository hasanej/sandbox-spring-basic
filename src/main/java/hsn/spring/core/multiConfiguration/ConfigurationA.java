package hsn.spring.core.multiConfiguration;

import hsn.spring.core.data.Sword;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationA {
    @Bean
    public Sword sword() {
        return new Sword();
    }
}
