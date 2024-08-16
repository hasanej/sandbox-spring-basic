package hsn.spring.core;

import hsn.spring.core.data.Example;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class BeanConfiguration {
    @Bean
    public Example example() {
        Example example = new Example();
        log.info("Example class created!");
        return example;
    }
}
