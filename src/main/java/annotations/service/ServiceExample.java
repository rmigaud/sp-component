package annotations.service;

import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
@ToString
@Getter
public class ServiceExample {
    private String greeting;

    @PostConstruct
    private void init() {
        greeting = "Hello from the Service.";
    }

    // Business Logic
    public Object sumOf(Object o1, Object o2) {
        if (o1 instanceof Integer && o2 instanceof Integer) {
            return (Integer) o1 + (Integer) o2;
        }
        if (o1 instanceof Double && o2 instanceof Double) {
            return (Double) o1 + (Double) o2;
        }
        if (o1 instanceof String && o2 instanceof String) {
            return o1 + (String) o2;
        }
        return o1;
    }
}
