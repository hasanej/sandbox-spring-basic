package hsn.spring.core.optionalBean;

import hsn.spring.core.optionalBean.data.Store;
import hsn.spring.core.optionalBean.data.StoreManagement;
import hsn.spring.core.optionalBean.data.StoreManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Optional;

@Configuration
@Slf4j
public class OptionalBeanConfiguration {
    @Bean
    public Store store() {
        log.info("Store class created.");
        return new Store();
    }

    @Bean
    public StoreManagement storeManagement(Store store, Optional<StoreManager> storeManager) {
        return new StoreManagement(store, storeManager.orElse(null));
    }
}
