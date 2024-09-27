package steps;

import io.cucumber.java.*;
import io.cucumber.java.en.Given;
import org.testng.annotations.AfterClass;

public class MyStepdefs {

    @BeforeAll
    public static void beforeallCucumber(){
        System.out.println("|-----@BeforeAll (5,Cucumber)beforeallCucumber/MyStepdefs");
    }
    @Before
    public void before() {
        System.out.println("|------@Before (6,Cucumber)before/MyStepdefs");
    }
    @BeforeStep
    public void beforeStep() {
        // Código que se ejecuta antes de cada paso
        System.out.println("|-------@BeforeStep (7,Cucumber)beforeStep/MyStepdefs");
    }
    @Given("^Hola que$")
    public void iAmOnTheLoginPage() {

        System.out.println("|--------@StepCucumber (8,Given - Cucumber)iAmOnTheLoginPage/MyStepdefs");
    }
    @Given("Hola que tal")
    public void hola_que_tal() {
        // Write code here that turns the phrase above into concrete actions
        //throw new io.cucumber.java.PendingException();
        System.out.println("|--------@StepCucumber (8,Given - Cucumber)hola_que_tal/MyStepdefs");
    }

    @AfterStep
    public void afterStep() {
        // Código que se ejecuta después de cada paso
        System.out.println("|-------@AfterStep (7,Cucumber)afterStep/MyStepdefs");
    }
    @After
    public void after() {
        // Código de limpieza que se ejecuta después de cada escenario ideal para hacer (tearDown)
        System.out.println("|------@After (6,Cucumber)after/MyStepdefs");
    }
    @AfterAll
    public static void afterAllCucumber(){
        System.out.println("|-----@AfterAll (5,Cucumber)afterAllCucumber/MyStepdefs");
    }


}
