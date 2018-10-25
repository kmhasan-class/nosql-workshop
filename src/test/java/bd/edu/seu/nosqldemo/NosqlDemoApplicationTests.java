package bd.edu.seu.nosqldemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class NosqlDemoApplicationTests {
    @Autowired
    private AppUserRepository appUserRepository;

    @Test
    public void contextLoads() {
    }

    @Test
    public void insertAppUser() {
        AppUser appUser = new AppUser(234, "HT", "hasantareque@gmail.com", "557");
        AppUser savedUser = appUserRepository.save(appUser);
        assertEquals(appUser, savedUser);
    }
}
