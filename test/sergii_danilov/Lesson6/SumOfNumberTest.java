package sergii_danilov.Lesson6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumOfNumberTest {

        private SumOfNumber unit;
        @Before
        public void setUp() throws Exception {
            unit = new SumOfNumber();
        }

        @Test
        public void testSumOfNumberSuccess() {
            assertEquals(25, unit.sum(1234564,0));
        }


}
