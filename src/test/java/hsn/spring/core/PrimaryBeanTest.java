package hsn.spring.core;

import hsn.spring.core.data.Example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PrimaryBeanTest {
    private ApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(PrimaryBeanConfiguration.class);
    }

    @Test
    void testGetPrimaryBean() {
        Example example = context.getBean(Example.class);
        Example example_1 = context.getBean("example_1", Example.class);
        Example example_2 = context.getBean("example_2", Example.class);

        Assertions.assertSame(example, example_2);
        Assertions.assertNotSame(example, example_1);
    }
}
