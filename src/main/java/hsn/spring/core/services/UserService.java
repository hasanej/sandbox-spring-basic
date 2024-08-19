package hsn.spring.core.services;

import hsn.spring.core.repository.UserRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {
    @Getter
    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserService(UserRepository userRepository, String param) {
        this.userRepository = userRepository;
        String name = param;
    }
}