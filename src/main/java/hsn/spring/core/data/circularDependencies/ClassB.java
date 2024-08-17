package hsn.spring.core.data.circularDependencies;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClassB {
    private ClassC classC;
}
