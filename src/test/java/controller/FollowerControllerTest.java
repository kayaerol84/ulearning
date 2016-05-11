package controller;

import static org.junit.Assert.fail;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.mockito.runners.MockitoJUnitRunner;

import com.ulearning.controller.FollowerController;
import com.ulearning.model.Follower;
import com.ulearning.model.User;

@RunWith(MockitoJUnitRunner.class)
//@RunWith(Suite.class)
@SuiteClasses({FollowerController.class, Follower.class, User.class})
public class FollowerControllerTest {

	@Rule
	public TemporaryFolder temp = new TemporaryFolder();
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testFollowUser(){
		
	}
	
	@Test
	public void testGetFollower(){
		
	}
	
	@Test
	public void testGetFollowers(){
		
	}
	
	@Test 
	public void testCancelFollowing() {
		
	}
	
/*	@After
	public void wipeTable(){
		
	}
	*/
}
