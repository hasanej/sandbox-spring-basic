package hsn.spring.core;

import hsn.spring.core.multiConfiguration.ConfigurationA;
import hsn.spring.core.multiConfiguration.ConfigurationB;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScanConfigurationTest {
    private ConfigurableApplicationContext context;

    @BeforeEach
    void setContext() {
        context = new AnnotationConfigApplicationContext(ScanConfiguration.class);
    }

    @Test
    void testImport() {
        ConfigurationA configurationA = context.getBean(ConfigurationA.class);
        ConfigurationB configurationB = context.getBean(ConfigurationB.class);

        Assertions.assertNotNull(configurationA);
        Assertions.assertNotNull(configurationB);
    }
}
