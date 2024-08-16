package hsn.spring.core.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class SwordShield {
    private Sword sword;

    private Shield shield;
}
