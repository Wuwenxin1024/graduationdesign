package gzu.test;

import gzu.pojo.User;
import gzu.service.UserService;
import gzu.util.JunitClassRunner;







import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;

@RunWith(JunitClassRunner.class)
@ContextConfiguration(locations = "classpath:gzu/config/applicationContext.xml")
public class UserServiceTest {
	@Autowired
	@Qualifier("userService")
	private UserService userService;

	@Test
	public void addUser() {
		User user = new User();
		user.setUserName("test");
		user.setPassword("00000");
		userService.addUser(user);
	}
}
