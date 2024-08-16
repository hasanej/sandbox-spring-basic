package hsn.spring.core;

import hsn.spring.core.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrimaryBeanTest {
    @Test
    void testGetBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(PrimaryBeanConfiguration.class);

        Foo fooPrimary = context.getBean(Foo.class);
        Foo foo_1 = context.getBean("foo_1", Foo.class);
        Foo foo_2 = context.getBean("foo_2", Foo.class);

        Assertions.assertSame(fooPrimary, foo_2);
        Assertions.assertNotSame(fooPrimary, foo_1);
    }
}
