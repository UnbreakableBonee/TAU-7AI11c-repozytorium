package pl.sebastiankisiel.tau.labthree.sebablog.Domain.User;

import pl.sebastiankisiel.tau.labthree.sebablog.Domain.User.Command.UserCommand;
import pl.sebastiankisiel.tau.labthree.sebablog.Domain.User.DTO.UserDTO;

import java.util.List;

public interface UserRepositoryInterface {

    public boolean create(UserCommand userCommand);

    public List<UserDTO> readAll();

    public UserDTO read(int id);

    public UserDTO update(UserCommand userCommand) throws Exception;

    public UserDTO delete(UserCommand userCommand);
}
