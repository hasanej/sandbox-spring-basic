package hsn.spring.core;

import hsn.spring.core.data.Foo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PrimaryBeanConfiguration {
    @Bean
    public Foo foo_1() {
        return new Foo();
    }

    @Primary
    @Bean
    public Foo foo_2() {
        return new Foo();
    }
}
