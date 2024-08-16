package hsn.spring.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DatabaseTest {
    @Test
    void testSingleton() {
        var firstDatabase = Database.getInstance();
        var secondDatabase = Database.getInstance();

        Assertions.assertSame(firstDatabase, secondDatabase);
    }
}
