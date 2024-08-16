package hsn.spring.core;

import hsn.spring.core.data.Example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanTest {
    @Test
    void testCreateBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        Assertions.assertNotNull(context);
    }

    @Test
    void testGetBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        Example example_1 = context.getBean(Example.class);
        Example example_2 = context.getBean(Example.class);

        Assertions.assertSame(example_1, example_2);
    }
}
