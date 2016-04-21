package service;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import junit.framework.TestCase;

import com.ulearning.model.Learner;
import com.ulearning.model.User;
import com.ulearning.service.impl.LearnerServiceImpl;
import com.ulearning.service.impl.UserServiceImpl;

public class LearnerServiceTest {

	@Before
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
	public void addLearnerServiceTest() {
		LearnerServiceImpl impl = new LearnerServiceImpl();
		Learner learner = new Learner();
		//assertEquals( userid ,impl.getUser(userid).getId());
		//assertEquals(false,impl.addLearner(learner));
	}
	
	@Test
	@Ignore
	public void getLearnerServiceTest() {
		LearnerServiceImpl impl = new LearnerServiceImpl();
		Long learnerid = 1L;
		//assertEquals( userid ,impl.getUser(userid).getId());
		TestCase.assertEquals(learnerid ,impl.getLearner(learnerid).getId());
	}
	
	@Test
	@Ignore
	public void getLearnersServiceTest() {
		LearnerServiceImpl impl = new LearnerServiceImpl();
		Long userid = 1L;
		//assertEquals( userid ,impl.getUser(userid).getId());
		TestCase.assertNotNull(impl.getLearners());
	}
	
	
}
