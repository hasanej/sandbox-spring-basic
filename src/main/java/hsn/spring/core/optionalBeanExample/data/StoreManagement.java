package hsn.spring.core.optionalBeanExample.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StoreManagement {
    private Store store;

    private StoreManager storeManager;
}
