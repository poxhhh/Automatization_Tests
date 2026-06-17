package ua.pr5;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeTags("no_parameter")
@SelectClasses(TextProcessorTest.class)
public class NoParameterTest {
}
