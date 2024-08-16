package hsn.spring.core;

import hsn.spring.core.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DuplicateBeanConfiguration {
    @Bean
    public Foo foo_1() {
        return new Foo();
    }

    @Bean
    public Foo foo_2() {
        return new Foo();
    }
}
