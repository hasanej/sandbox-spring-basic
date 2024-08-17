package hsn.spring.core;

import hsn.spring.core.data.circularDependencies.ClassA;
import hsn.spring.core.data.circularDependencies.ClassB;
import hsn.spring.core.data.circularDependencies.ClassC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CircularDependenciesConfiguration {
    @Bean
    public ClassA classA(ClassB classB) {
        return new ClassA(classB);
    }

    @Bean
    public ClassB classB(ClassC classC) {
        return new ClassB(classC);
    }

    @Bean
    public ClassC classC(ClassA classA) {
        return new ClassC(classA);
    }
}