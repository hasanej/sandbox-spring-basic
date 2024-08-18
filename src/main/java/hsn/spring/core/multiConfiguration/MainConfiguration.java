package hsn.spring.core.multiConfiguration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({
        ConfigurationA.class,
        ConfigurationB.class
})
public class MainConfiguration {
}
