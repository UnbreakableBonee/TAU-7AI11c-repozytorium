package pl.sebastiankisiel.tau.labthree.sebablog.Domain.User;

import cucumber.api.java.pl.Ale;
import cucumber.api.java.pl.I;
import cucumber.api.java.pl.Wtedy;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Assert;
import cucumber.api.java.Before;
import cucumber.api.java.pl.Kiedy;
import pl.sebastiankisiel.tau.labthree.sebablog.Domain.User.DTO.UserDTO;

import java.util.ArrayList;
import java.util.List;

public class UserServiceTest {

    private UserRepository repo;

    @Before
    public void setRepo() {
        this.repo = new UserRepository();
    }

    @Kiedy("^użytkownik jest na naszej stronie$")
    public void userStatus() {
        Assert.assertTrue(true);
    }

    @Wtedy("^lubi dużo napsocić \"([^\"]*)\" innemu człowiekowi$")
    public void usesBadDo(String exceptedUserName) {
        Assert.assertThat(this.repo.getUserByNameLike(exceptedUserName), new IsInstanceOf(UserDTO.class));
    }

    @Ale("^iż będzie usunięty on raz z użytkownikiem (\\d+) i (\\d+)$")
    public void usersToDelete(int number1, int number2) {
        List<Integer> ids = new ArrayList<>();
        ids.add(number1);
        ids.add(number2);
        List<UserDTO> userDTOList = this.repo.deleteByList(ids);
        Assert.assertFalse(userDTOList.isEmpty());
    }

    @I("^użytkownikiem (\\d+)$")
    public void onlyOneUserToDelete(int number3) {
        List<Integer> ids = new ArrayList<>();
        ids.add(number3);
        List<UserDTO> userDTOList = this.repo.deleteByList(ids);
        Assert.assertFalse(userDTOList.isEmpty());
    }

    @Wtedy("^i tak sporo przeszkud napsoci MI!$")
    public void endOfHistory() {
        Assert.assertTrue(true);
    }
}
