import org.testng.Assert;
import org.testng.annotations.*;


public class ComplejoTest {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("|-@BeforeSuite (1,TestNg) ComplejoTest");
    }
    @BeforeClass
    public void setUp() {
        // code that will be invoked when this test is instantiated
        System.out.println("|---@BeforeClass (3,TestNg)/ComplejoTest");
    }
    @Test
    public void testSum() {
        int a = 5;
        int b = 3;
        int result = a + b;
        Assert.assertEquals(result, 8, "La suma debería ser 8");
        System.out.println("|----@Test (4,TestNg)testSum/ComplejoTest");
    }
    @Test
    public void testSubtraction() {
        int a = 10;
        int b = 5;
        int result = a - b;
        System.out.println("|----@Test (4,TestNg)testSubtraction/ComplejoTest");
        Assert.assertEquals(result, 5, "La resta debería ser 5");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("|----@AfterTest (4,TestNg)afterTest/ComplejoTest");
    }
    @AfterClass
    public void afterClassTest() {
        System.out.println("|--@AfterClassTest (2,TestNg)afterClassTest/ComplejoTest");
    }
    @AfterSuite
    public void afterSuite() {
        System.out.println("|-@AfterSuite (1,TestNg)afterSuite/ComplejoTest");
    }
}
