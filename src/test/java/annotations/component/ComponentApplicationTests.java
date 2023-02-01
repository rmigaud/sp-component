package annotations.component;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ComponentApplicationTests {
    @Autowired
    final ApplicationContext applicationContext;

    ComponentApplicationTests(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Test
    void contextLoadsComponent_whenScanningApplicationContext_componentFound() {
        final ComponentExample component = applicationContext.getBean(ComponentExample.class);
        assertEquals("Hello from Spring Component.", component.getGreeting());
    }
}
