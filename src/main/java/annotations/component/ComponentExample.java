package annotations.component;

import jakarta.annotation.PostConstruct;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@ToString
@Getter
public class ComponentExample {
    private String greeting;
    @PostConstruct
    public void init() {
        greeting = "Hello from Spring Component.";
    }
}
