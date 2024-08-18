package hsn.spring.core.multiConfiguration;

import hsn.spring.core.data.Shield;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationB {
    @Bean
    public Shield shield() {
        return new Shield();
    }
}
