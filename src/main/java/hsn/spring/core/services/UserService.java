package hsn.spring.core.services;

import hsn.spring.core.repository.UserRepository;
import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    @Getter
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}