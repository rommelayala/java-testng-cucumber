Sirva este proyecto para dar un ejemplo del ciclo de vida de los test usando testNG / Cucumber
Para integrar el cucumber-testng es necesario :  
Añadir las dependencias del testng + cucumebr-testNg además de configurar el surefire

````xml
<dependencies>
 <!-- https://mvnrepository.com/artifact/org.testng/testng -->
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.10.1</version>
            <scope>test</scope>
        </dependency>
        <!-- https://mvnrepository.com/artifact/io.cucumber/cucumber-testng -->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-testng</artifactId>
            <version>7.18.0</version>
        </dependency>
        <!-- Cucumber Java support -->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>7.18.0</version>
        </dependency>

        <!-- Cucumber core -->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-core</artifactId>
            <version>7.18.0</version>
        </dependency>
</dependencies>
<!---Ademas del surefire  -->
<build>
    <plugins>
    <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-surefire-plugin</artifactId>
        <version>3.0.0-M7</version>
        <configuration>
            <includes>
                <include>**/*Test.java</include>
            </includes>
            <parallel>classes</parallel>
            <threadCount>4</threadCount>
        </configuration>
    </plugin>
</plugins>
</build>

````
EL test.xml
````xml 
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd" >
<suite name="CucumberTestSuite">
    <test name="Cucumber Tests">
        <classes>
            <class name="runners.RunCucumberTest"/> <!-- Reemplaza con el paquete y nombre correctos -->
        </classes>
    </test>
</suite>

````
Jerarquía en el árbol
````shell
Primero se ejecutan los TestNg
|-@BeforeSuite (1,TestNg)
|--@BeforeTest (2,TestNg)
|---@BeforeClass (3,TestNg)
|----@Test (4,TestNg)
|----@Test (4,TestNg)

|-----@BeforeAll (5,Cucumber)
|------@Before (6,Cucumber)
|-------@BeforeStep (7,Cucumber)
|--------@StepCucumber (8,Given - Cucumber)
|--------@StepCucumber (8,When - Cucumber)
|-------@BAfterStep (7,Cucumber)
|------@After (6,Cucumber)
|-----@AfterAll (5,Cucumber)

|----@AfterTest (4,TestNg)
|--@AfterClassTest (2,TestNg)
|-@AfterSuite (1,TestNg)
````
