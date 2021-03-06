package pl.sebastiankisiel.tau.labtwo.sebablog.Domain.User;

import pl.sebastiankisiel.tau.labtwo.sebablog.Domain.User.Command.UserCommand;
import pl.sebastiankisiel.tau.labtwo.sebablog.Domain.User.DTO.UserDTO;
import pl.sebastiankisiel.tau.labtwo.sebablog.Domain.User.UserRepository;
import pl.sebastiankisiel.tau.labtwo.sebablog.Domain.User.UserRepositoryInterface;

import java.util.List;

public class UserService {

    private UserRepositoryInterface repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public boolean createUser(UserCommand user) {
        return this.repository.create(user);
    }

    public List<UserDTO> fetchAllUser() {
        return this.repository.readAll();
    }

    public UserDTO fetchOneUser(int id) {
        return this.repository.read(id);
    }

    public UserDTO updateUser(UserCommand user) throws Exception {
        return this.repository.update(user);
    }

    public UserDTO deleteUser(UserCommand user) {
        return this.repository.delete(user);
    }
}
