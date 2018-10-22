package pl.sebastiankisiel.tau.labone.sebablog.Domain.User;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pl.sebastiankisiel.tau.labone.sebablog.Domain.User.Command.UserCommand;
import pl.sebastiankisiel.tau.labone.sebablog.Domain.User.DTO.UserDTO;

public class UserServiceTest {

    private UserRepository repo;

    @Before
    public void setRepo() {
        this.repo =  new UserRepository();
    }

    @Test
    public void testAddingUser() {
        UserService service = new UserService(this.repo);
        UserCommand user = new UserCommand();
        user.setId(5);
        user.setLogin("test");
        user.setPassword("pass");
        Assert.assertTrue(service.createUser(user));
    }

    @Test
    public void testGetOneUser() {
        UserService service = new UserService(this.repo);
        UserDTO user = new UserDTO(1, "janusz", "brak");
        Assert.assertEquals(user.getId(),service.fetchOneUser(0).getId());
        Assert.assertEquals(user.getLogin(),service.fetchOneUser(0).getLogin());
        Assert.assertEquals(user.getPassword(),service.fetchOneUser(0).getPassword());
    }

    @Test
    public void testGetAllUsers() {
        UserService service = new UserService(this.repo);
        Assert.assertTrue(!service.fetchAllUser().isEmpty());
    }

    @Test
    public void testUpdateUser() throws Exception {
        UserService service = new UserService(this.repo);
        UserCommand user = new UserCommand();
        user.setId(3);
        user.setLogin("des");
        user.setPassword("test");
        Assert.assertTrue(service.updateUser(user) instanceof UserDTO);
    }

    @Test(expected = Exception.class)
    public void testExceptionAtUpdateUser() throws Exception {
        UserService service = new UserService(this.repo);
        UserCommand user = new UserCommand();
        user.setId(4);
        user.setLogin("des");
        user.setPassword("test");
        Assert.assertTrue(service.updateUser(user) instanceof UserDTO);
    }

    @Test
    public void testDeleteUser() {
        UserService service = new UserService(this.repo);
        UserCommand user = new UserCommand();
        user.setId(1);
        user.setLogin("des");
        user.setPassword("test");
        Assert.assertTrue(service.deleteUser(user) instanceof UserDTO);
    }

}
