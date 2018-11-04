package pl.sebastiankisiel.tau.labtwo.sebablog.Domain.User;

import pl.sebastiankisiel.tau.labtwo.sebablog.Domain.User.Command.UserCommand;
import pl.sebastiankisiel.tau.labtwo.sebablog.Domain.User.DTO.UserDTO;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class UserRepository implements UserRepositoryInterface {

    private List<UserDTO> users = new ArrayList<UserDTO>();

    public UserRepository() {
        users.add(new UserDTO(1, "janusz", "brak", LocalDateTime.now(), LocalDateTime.now(), LocalDateTime.now()));
        users.add(new UserDTO(2, "ktos", "brak", LocalDateTime.now(), LocalDateTime.now(), LocalDateTime.now()));
        users.add(new UserDTO(3, "cos", "brak", LocalDateTime.now(), LocalDateTime.now(), LocalDateTime.now()));
        users.add(new UserDTO(4, "wie", "brak", LocalDateTime.now(), LocalDateTime.now(), LocalDateTime.now()));
    }

    public boolean create(UserCommand userCommand) {
        return users.add(new UserDTO(userCommand.getId(), userCommand.getLogin(), userCommand.getPassword(), LocalDateTime.now(), LocalDateTime.now(), LocalDateTime.now()));
    }

    public List<UserDTO> readAll() {
        return users;
    }

    public UserDTO read(int id) {
        return users.get(id);
    }

    public UserDTO update(UserCommand userCommand) throws Exception {
        UserDTO user = users.get(userCommand.getId());
        users.remove(user);
        users.add(new UserDTO(userCommand.getId(), userCommand.getLogin(), userCommand.getPassword(), LocalDateTime.now(), LocalDateTime.now(), LocalDateTime.now()));
        return user;
    }

    public UserDTO delete(UserCommand userCommand) {
        UserDTO user = users.get(userCommand.getId());
        users.remove(user);
        return user;
    }
}
