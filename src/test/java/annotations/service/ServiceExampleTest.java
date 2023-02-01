package annotations.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = {ServiceExample.class})
class ServiceExampleTest {
    @Autowired
    private final ApplicationContext applicationContext;

    ServiceExampleTest(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Test
    public void contextLoadsService_whenScanningApplicationContext_serviceGreeting() {
        assertThat(applicationContext.getBean(ServiceExample.class).getGreeting())
                .contains("Hello from the Service.");
    }

    @Test
    public void ServiceCallsFunction_whenServiceIsCalled_serviceFunctionality() {
        assertThat(applicationContext.getBean(ServiceExample.class).sumOf(1, 2)).isEqualTo(3);
        assertThat(applicationContext.getBean(ServiceExample.class).sumOf(1.0, 2.0)).isEqualTo(3.0);
        assertThat(applicationContext.getBean(ServiceExample.class).sumOf("a", "b")).isEqualTo("ab");
    }
}