package pl.sebablog.Domain.User;

import pl.sebablog.Domain.User.Command.UserCommand;
import pl.sebablog.Domain.User.DTO.UserDTO;

import java.util.List;

public interface UserRepositoryInterface {

    public boolean create(UserCommand userCommand);

    public List<UserDTO> readAll();

    public UserDTO read(int id);

    public UserDTO update (UserCommand userCommand);

    public UserDTO delete (UserCommand userCommand);
}
