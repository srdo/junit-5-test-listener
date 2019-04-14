
package org.apache.surefire.stdout.corrupt;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DemoTest {
    
    private static final Logger LOG = LoggerFactory.getLogger(DemoTest.class);
    
    public DemoTest() {
    }

    @ParameterizedTest(name = "a parameterized test (bar(int))")
    @DisplayName(value = "bar({0})")
    @ValueSource(ints = {15, 54})
    public void bar(int param) {
        LOG.info("Some test text " + param);
    }
}
