package hsn.spring.core.objectProvider;

import hsn.spring.core.objectProvider.data.User;
import hsn.spring.core.objectProvider.data.UserList;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

@Configuration
@Import(UserList.class)
public class ObjectProviderConfiguration {
    @Bean
    @Primary
    public User user_1() {
        return new User();
    }

    @Bean
    public User user_2() {
        return new User();
    }

    @Bean
    public User user_3() {
        return new User();
    }
}
