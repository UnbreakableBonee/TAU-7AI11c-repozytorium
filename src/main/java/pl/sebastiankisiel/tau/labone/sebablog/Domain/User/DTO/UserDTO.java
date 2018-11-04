package pl.sebastiankisiel.tau.labone.sebablog.Domain.User.DTO;

import java.time.LocalDateTime;

public class UserDTO {

    private int id;

    private String login;

    private String password;

    public UserDTO(int id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }


    public String getPassword() {
        return password;
    }

}
