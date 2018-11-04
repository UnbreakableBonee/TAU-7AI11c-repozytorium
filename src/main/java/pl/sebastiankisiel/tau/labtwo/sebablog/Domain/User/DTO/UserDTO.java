package pl.sebastiankisiel.tau.labtwo.sebablog.Domain.User.DTO;

import java.time.LocalDateTime;

public class UserDTO {

    private int id;

    private String login;

    private String password;

    private LocalDateTime addedDateTime;

    private LocalDateTime modifyDateTime;

    private LocalDateTime lastReadDateTime;

    public UserDTO(int id, String login, String password, LocalDateTime addedDateTime, LocalDateTime modyfiDateTime, LocalDateTime lastReadDateTime) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.addedDateTime = addedDateTime;
        this.modifyDateTime = modyfiDateTime;
        this.lastReadDateTime = lastReadDateTime;
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

    public LocalDateTime getAddedDateTime() {
        return addedDateTime;
    }

    public LocalDateTime getModifyDateTime() {
        return modifyDateTime;
    }

    public LocalDateTime getLastReadDateTime() {
        return lastReadDateTime;
    }
}
