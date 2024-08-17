package hsn.spring.core;

import hsn.spring.core.data.dependsOn.Crafting;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependsOnTest {
    private ApplicationContext context;

    @BeforeEach
    void setContext() {
        context = new AnnotationConfigApplicationContext(DependsOnConfiguration.class);
    }

    @Test
    void testDependsOn() {
        /*
        * The log will show that the Armorer class created first
        * before Armor class.
        */

        // Uncomment to see the Crafting class is load when needed
        // context.getBean("crafting", Crafting.class);
    }
}
