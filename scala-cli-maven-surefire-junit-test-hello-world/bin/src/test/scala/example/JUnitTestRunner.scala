package example

import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(classOf[Suite])
@Suite.SuiteClasses(Array(classOf[JUnitTestRunner]))
class JUnitTestRunner
