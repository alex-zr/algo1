package session5;

public class ArrayUtilTest1 {
    public static void main(String[] args) {
        final ArrayUtilTest1 driver = new ArrayUtilTest1();
        driver.testSumSuccess();
        driver.testSumSingle();
        driver.testSumEmpty();
        driver.testSumVectorNull();
        driver.testSumContainsNull();
    }

    public void testSumSuccess() {
        ArrayUtil module = new ArrayUtil();
        long actual = module.sum(new Integer[]{1,2,3});
        long expected = 6;
        if (actual == expected) {
            System.out.println("Test Ok");
        } else {
            System.err.println("Test Fail");
        }
    }

    public void testSumSingle() {
        ArrayUtil module = new ArrayUtil();
        long actual = module.sum(new Integer[]{1});
        long expected = 1;
        if (actual == expected) {
            System.out.println("Test Ok");
        } else {
            System.err.println("Test Fail");
        }
    }

    public void testSumEmpty() {
        ArrayUtil module = new ArrayUtil();
        long actual = module.sum(new Integer[]{});
        long expected = 0;
        if (actual == expected) {
            System.out.println("Test Ok");
        } else {
            System.err.println("Test Fail");
        }
    }

    public void testSumContainsNull() {
        ArrayUtil module = new ArrayUtil();
        long actual = module.sum(new Integer[]{null, 5});
        long expected = 5;
        if (actual == expected) {
            System.out.println("Test Ok");
        } else {
            System.err.println("Test Fail");
        }
    }

    public void testSumVectorNull() {
        ArrayUtil module = new ArrayUtil();
        long actual = module.sum(null);
        long expected = 0;
        if (actual == expected) {
            System.out.println("Test Ok");
        } else {
            System.err.println("Test Fail");
        }
    }
}
