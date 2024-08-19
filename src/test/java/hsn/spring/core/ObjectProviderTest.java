package hsn.spring.core;

import hsn.spring.core.objectProvider.ObjectProviderConfiguration;
import hsn.spring.core.objectProvider.data.UserList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ObjectProviderTest {
    private ApplicationContext context;

    @BeforeEach
    void setContext() {
        context = new AnnotationConfigApplicationContext(ObjectProviderConfiguration.class);
    }

    @Test
    void testObjectProvider() {
        UserList userList = context.getBean(UserList.class);

        Assertions.assertEquals(3, userList.getUsers().size());
    }
}
