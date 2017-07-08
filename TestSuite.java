package com.tanu;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

public class TestSuite {
	@RunWith(Suite.class)
	@Suite.SuiteClasses({ TestFeatureLogin.class, TestFeatureLogout.class, TestFeatureNavigate.class,
			TestFeatureUpdate.class })
	public class FeatureTestSuite {
	}

}
