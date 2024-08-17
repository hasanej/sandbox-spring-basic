package hsn.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CircularDependenciesTest {
    /*
     * Will throw an error:
     * "Requested bean is currently in creation: Is there an unresolvable circular reference?"
     * at the end of the error message.
     */
    @Test
    void setContext() {
        Assertions.assertThrows(Throwable.class, () -> {
            ApplicationContext context = new AnnotationConfigApplicationContext(CircularDependenciesConfiguration.class);
        });
    }
}
