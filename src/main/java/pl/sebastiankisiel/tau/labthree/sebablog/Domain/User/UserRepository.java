package pl.sebastiankisiel.tau.labthree.sebablog.Domain.User;

import pl.sebastiankisiel.tau.labthree.sebablog.Domain.User.Command.UserCommand;
import pl.sebastiankisiel.tau.labthree.sebablog.Domain.User.DTO.UserDTO;
import pl.sebastiankisiel.tau.labthree.sebablog.Domain.User.UserRepositoryInterface;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

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

    public UserDTO getUserByNameLike(String text) {
        List<UserDTO> userList = this.readAll();
        for (UserDTO user : userList) {
            Pattern regex = Pattern.compile(text);
            if (regex.matcher(user.getLogin()).find()) {
                return user;
            }
        }
        return null;
    }

    public List<UserDTO> deleteByList(List<Integer> ids) {
        List<UserDTO> userDTOList = new ArrayList<UserDTO>();
        for(Integer id: ids) {
            UserDTO user = users.get(id);
            users.remove(user);
            userDTOList.add(user);
        }
        return userDTOList;
    }
}
