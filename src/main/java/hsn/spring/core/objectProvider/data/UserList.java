package hsn.spring.core.objectProvider.data;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@Slf4j
public class UserList {
    @Getter
    private List<User> users;

    public UserList(ObjectProvider<User> objectProvider) {
        users = objectProvider.stream().collect(Collectors.toList());
        log.info("userList", users);
    }
}
