package service;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import org.hamcrest.MatcherAssert;
import org.hamcrest.Matcher;
import org.hamcrest.CoreMatchers;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.ulearning.model.Learner;
import com.ulearning.model.Teacher;
import com.ulearning.model.User;
import com.ulearning.service.impl.FollowerServiceImpl;

import junit.framework.TestCase;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class FollowerServiceTest {

	private void setup() {
		// TODO Auto-generated method stub

	}
	
	@Test
	@Ignore
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	@Ignore
	public void followLearnerServiceTest() {
		FollowerServiceImpl impl = new FollowerServiceImpl();
		User user = new User();
		Learner learner = new Learner();
		impl.followLearner(user, learner);
		assertNotNull(impl.getFollowers(learner.getId()));
	}
	@Test
	@Ignore
	public void followTeacherServiceTest() {
		FollowerServiceImpl impl = new FollowerServiceImpl();
		User user = new User();
		Teacher teacher = new Teacher();
		impl.followTeacher(user, teacher);
		assertNotNull(impl.getFollowers(teacher.getId()));
	}
	
		
	@Test
	@Ignore
	public void getFollowersServiceTest() {
		FollowerServiceImpl impl = new FollowerServiceImpl();
		
		
		User user = new User();
		Teacher teacher = new Teacher();
		impl.followTeacher(user, teacher);
		String check = "";
		TestCase.assertNotNull(impl.getFollowers(teacher.getId()));

		//assertThat("", impl.getFollowers(teacher.getId()), hasItem());
	}
	
	@Test
	@Ignore
	public void getFollowedUsersServiceTest() {
		FollowerServiceImpl impl = new FollowerServiceImpl();
		User user = new User();
		Teacher teacher = new Teacher();
		impl.followTeacher(user, teacher);
		String smthng = new String("test");
		/*
		 *  if the pool already contains a string equal to this String object as determined by the equals(Object) method, 
		 *  then the string from the pool is returned. 
		 *  Otherwise, this String object is added to the pool and a reference to this String object is returned. 
		 */
		smthng.intern(); 
		
		TestCase.assertNotNull(impl.getFollowedUsers(user.getId()));
		
		// assertThat("", impl.getFollowers(teacher.getId()), hasItem(user1));
	}
	

}
