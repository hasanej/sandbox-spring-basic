package hsn.spring.core.data.circularDependencies;

import lombok.AllArgsConstructor;
import lombok.Data;

// Auto generate Getter and Setter
@Data

// Auto generate constructor
@AllArgsConstructor
public class ClassA {
    private ClassB classB;
}
