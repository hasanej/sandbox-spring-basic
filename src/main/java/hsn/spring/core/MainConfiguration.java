package hsn.spring.core;

import hsn.spring.core.multiConfiguration.ConfigurationA;
import hsn.spring.core.multiConfiguration.ConfigurationB;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        ConfigurationA.class,
        ConfigurationB.class
})
public class MainConfiguration {
}
