package hsn.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "hsn.spring.core.multiConfiguration"
})
public class ScanConfiguration {
}
