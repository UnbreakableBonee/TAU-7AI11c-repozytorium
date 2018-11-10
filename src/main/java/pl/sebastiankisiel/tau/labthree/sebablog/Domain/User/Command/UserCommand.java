package pl.sebastiankisiel.tau.labthree.sebablog.Domain.User.Command;

import java.time.LocalDateTime;

public class UserCommand {

    private int id;

    private String login;

    private String password;

    private LocalDateTime addedDateTime;

    private LocalDateTime modifyDateTime;

    private LocalDateTime lastReadDateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getAddedDateTime() {
        return addedDateTime;
    }

    public void setAddedDateTime(LocalDateTime addedDateTime) {
        this.addedDateTime = addedDateTime;
    }

    public LocalDateTime getModifyDateTime() {
        return modifyDateTime;
    }

    public void setModifyDateTime(LocalDateTime modifyDateTime) {
        this.modifyDateTime = modifyDateTime;
    }

    public LocalDateTime getLastReadDateTime() {
        return lastReadDateTime;
    }

    public void setLastReadDateTime(LocalDateTime lastReadDateTime) {
        this.lastReadDateTime = lastReadDateTime;
    }
}
