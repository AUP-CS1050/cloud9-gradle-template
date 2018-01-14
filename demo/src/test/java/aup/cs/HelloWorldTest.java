package aup.cs;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * A file testing the functionality of HelloWorl.
 */
public class HelloWorldTest {

    /**
     * A dummy test.
     */
    @Test
    public void  testSomething() {
        assertThat(1 == 1, is(true));
    }
}
