package hsn.spring.core;

import hsn.spring.core.data.Shield;
import hsn.spring.core.data.Sword;
import hsn.spring.core.data.SwordShield;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjectionTest {
    private ApplicationContext context;

    @BeforeEach
    void setContext() {
        context = new AnnotationConfigApplicationContext(DependencyInjectionConfiguration.class);
    }

    @Test
    void testDI() {
         Sword sword = context.getBean("sword", Sword.class);
         Shield shield = context.getBean("shield", Shield.class);
         SwordShield swordShield = context.getBean("swordShield", SwordShield.class);

         Assertions.assertSame(sword, swordShield.getSword());
         Assertions.assertSame(shield, swordShield.getShield());
    }

    @Test
    void testWithoutDI() {
        Sword sword = new Sword();
        Shield shield = new Shield();

        SwordShield swordShield = new SwordShield(sword, shield);

        Assertions.assertSame(swordShield.getSword(), sword);
        Assertions.assertSame(swordShield.getShield(), shield);
    }
}
