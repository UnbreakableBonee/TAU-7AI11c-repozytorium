package pl.sebablog.Domain.User;

import pl.sebablog.Domain.User.Command.UserCommand;
import pl.sebablog.Domain.User.DTO.UserDTO;

import java.util.List;

public class UserRepository implements UserRepositoryInterface {
    public boolean create(UserCommand userCommand) {
        return false;
    }

    public List<UserDTO> readAll() {
        return null;
    }

    public UserDTO read(int id) {
        return null;
    }

    public UserDTO update(UserCommand userCommand) {
        return null;
    }

    public UserDTO delete(UserCommand userCommand) {
        return null;
    }
}
