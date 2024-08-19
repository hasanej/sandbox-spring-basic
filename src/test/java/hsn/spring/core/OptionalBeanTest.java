package hsn.spring.core;

import hsn.spring.core.optionalBean.OptionalBeanConfiguration;
import hsn.spring.core.optionalBean.data.Store;
import hsn.spring.core.optionalBean.data.StoreManagement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OptionalBeanTest {
    ConfigurableApplicationContext context;

    @BeforeEach
    void setContext() {
        context = new AnnotationConfigApplicationContext(OptionalBeanConfiguration.class);
        context.registerShutdownHook();
    }

    @Test
    void testOptionalBean() {
        Store store = context.getBean(Store.class);
        StoreManagement storeManagement = context.getBean(StoreManagement.class);

        Assertions.assertSame(store, storeManagement.getStore());
        Assertions.assertNull(storeManagement.getStoreManager());
    }
}
