package pl.sebastiankisiel.tau.labtwo.sebablog.Domain.User;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pl.sebastiankisiel.tau.labtwo.sebablog.Domain.User.Command.UserCommand;
import pl.sebastiankisiel.tau.labtwo.sebablog.Domain.User.DTO.UserDTO;

import java.time.LocalDateTime;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UserServiceTest {

    private UserRepository repo;

    @Before
    public void setRepo() {
        this.repo =  mock(UserRepository.class);
    }

    @Test
    public void testAddingUser() {
        UserService service = new UserService(this.repo);
        UserCommand user = new UserCommand();
        user.setId(5);
        user.setLogin("test");
        user.setPassword("pass");
        when(this.repo.create(user)).thenReturn(false);
        Assert.assertFalse(service.createUser(user));
    }

    @Test
    public void testGetOneUser() {
        UserService service = new UserService(this.repo);
        UserDTO user = new UserDTO(1, "janusz", "brak", LocalDateTime.now(), LocalDateTime.now(), LocalDateTime.now());
        when(service.fetchOneUser(0)).thenReturn(new UserDTO(1, "janusz", "brak", LocalDateTime.now(), LocalDateTime.now(), LocalDateTime.now()));
        Assert.assertEquals(user.getId(),service.fetchOneUser(0).getId());
        Assert.assertEquals(user.getLogin(),service.fetchOneUser(0).getLogin());
        Assert.assertEquals(user.getPassword(),service.fetchOneUser(0).getPassword());
    }

    @Test
    public void testGetAllUsers() {
        UserService service = new UserService(this.repo);
        when(service.fetchAllUser()).thenReturn(null);
        Assert.assertNull(service.fetchAllUser());
    }

    @Test
    public void testUpdateUser() throws Exception {
        UserService service = new UserService(this.repo);
        UserCommand user = new UserCommand();
        user.setId(3);
        user.setLogin("des");
        user.setPassword("test");
        user.setAddedDateTime(LocalDateTime.now());
        user.setLastReadDateTime(LocalDateTime.now());
        user.setModifyDateTime(LocalDateTime.now());
        when(service.updateUser(user)).thenReturn(new UserDTO(3, "des", "test", LocalDateTime.now(), LocalDateTime.now(), LocalDateTime.now()));
        Assert.assertTrue(service.updateUser(user) instanceof UserDTO);
    }

    @Test(expected = Exception.class)
    public void testExceptionAtUpdateUser() throws Exception {
        UserService service = new UserService(this.repo);
        UserCommand user = new UserCommand();
        user.setId(4);
        user.setLogin("des");
        user.setPassword("test");
        user.setAddedDateTime(LocalDateTime.now());
        user.setLastReadDateTime(LocalDateTime.now());
        user.setModifyDateTime(LocalDateTime.now());
        when(service.updateUser(user)).thenThrow(new Exception());
        Assert.assertTrue(service.updateUser(user) instanceof UserDTO);
    }

    @Test
    public void testDeleteUser() {
        UserService service = new UserService(this.repo);
        UserCommand user = new UserCommand();
        user.setId(1);
        user.setLogin("des");
        user.setPassword("test");
        user.setAddedDateTime(LocalDateTime.now());
        user.setLastReadDateTime(LocalDateTime.now());
        user.setModifyDateTime(LocalDateTime.now());
        when(service.deleteUser(user)).thenReturn(new UserDTO(1, "des", "piesełWow", LocalDateTime.now(), LocalDateTime.now(), LocalDateTime.now()));
        Assert.assertEquals("piesełWow", service.deleteUser(user).getPassword());
    }

}
