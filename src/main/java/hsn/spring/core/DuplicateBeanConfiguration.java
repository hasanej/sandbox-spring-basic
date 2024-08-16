package hsn.spring.core;

import hsn.spring.core.data.Example;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DuplicateBeanConfiguration {
    @Bean
    public Example example_1() {
        return new Example();
    }

    @Bean
    public Example example_2() {
        return new Example();
    }
}
