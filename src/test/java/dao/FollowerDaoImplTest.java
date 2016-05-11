package dao;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.ulearning.dao.impl.FollowerDaoImpl;
import com.ulearning.model.Follower;

@RunWith(Suite.class)
@SuiteClasses({FollowerDaoImpl.class, Follower.class})
public class FollowerDaoImplTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
