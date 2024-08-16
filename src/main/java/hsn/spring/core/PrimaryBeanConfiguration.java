package hsn.spring.core;

import hsn.spring.core.data.Example;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PrimaryBeanConfiguration {
    @Bean
    public Example example_1() {
        return new Example();
    }

    @Primary
    @Bean
    public Example example_2() {
        return new Example();
    }
}
