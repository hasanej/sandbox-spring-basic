package hsn.spring.core;

import hsn.spring.core.data.Example;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class NamedBeanTest {
    private ApplicationContext context;

    @BeforeEach
    void setUp() {
        context = new AnnotationConfigApplicationContext(NamedBeanConfiguration.class);
    }

    @Test
    void testGetNamedBean() {
        Example example = context.getBean(Example.class);
        Example example_1 = context.getBean("firstBean", Example.class);
        Example example_2 = context.getBean("secondBean", Example.class);

        Assertions.assertSame(example, example_1);
        Assertions.assertNotSame(example, example_2);
    }

    @Test
    void testGetByMethodName() {
        Assertions.assertThrows(NoSuchBeanDefinitionException.class, () -> {
            context.getBean("example_1", Example.class);
        });

        Assertions.assertThrows(NoSuchBeanDefinitionException.class, () -> {
            context.getBean("example_2", Example.class);
        });
    }
}
