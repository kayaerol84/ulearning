package service;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;
import junit.framework.TestCase;

import com.ulearning.model.User;
import com.ulearning.service.impl.UserServiceImpl;

public class UserServiceTest {

	private void setup() {
		// TODO Auto-generated method stub

	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void addUserServiceTest() {
		UserServiceImpl impl = new UserServiceImpl();
		Long userid = 1L;
		//assertEquals( userid ,impl.getUser(userid).getId());
		TestCase.assertEquals(userid ,impl.addUser(userid).getId());
	}
	
	@Test
	public void getUserServiceTest() {
		UserServiceImpl impl = new UserServiceImpl();
		Long userid = 1L;
		//assertEquals( userid ,impl.getUser(userid).getId());
		TestCase.assertEquals(userid ,impl.getUser(userid).getId());
	}
	
	@Test
	public void getUsersServiceTest() {
		UserServiceImpl impl = new UserServiceImpl();
		Long userid = 1L;
		//assertEquals( userid ,impl.getUser(userid).getId());
		TestCase.assertNotNull(impl.getUsers());
	}
	
	@Test
	public void validateUserServiceTest() {
		UserServiceImpl impl = new UserServiceImpl();
		User user = new User();
		//assertEquals( userid ,impl.getUser(userid).getId());
		TestCase.assertTrue(impl.validateUser(user));
	}
	

}
