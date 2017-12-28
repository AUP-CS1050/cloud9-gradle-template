package cs1050;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class H elloWorldTest {

    @Test
    public void  testSomething() {
        assertThat(1 == 1, is(true));
    }
}
