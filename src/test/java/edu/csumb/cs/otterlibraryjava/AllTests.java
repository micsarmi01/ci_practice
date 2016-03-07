package edu.csumb.cs.otterlibraryjava;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ BookTests.class, DateTests.class, TransactionsTest.class, UserTests.class })
public class AllTests {

}
