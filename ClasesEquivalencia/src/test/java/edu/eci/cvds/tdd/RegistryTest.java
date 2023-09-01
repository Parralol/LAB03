package edu.eci.cvds.tdd;
import edu.eci.cvds.tdd.registry.*;
import org.junit.Assert;
import org.junit.Test;
public class RegistryTest {
    private Registry registry = new Registry();
    @Test
    public void validateRegistryResult() {
        Person person = new Person();
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }
    // TODO Complete with more test cases

    @Test
    public void ShouldBeValid(){
        Person person = new Person("godofredo", 1651461, 18, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);
    }

    @Test
    public void ShouldBeDeadth(){
        Person person = new Person("godofredo", 1651461, 18, Gender.MALE, false);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DEAD, result);
    }

    @Test
    // Dado
    // Cuando
    // Entonces
    public void ShouldBeUnderage(){
        // Arrange
        Person person = new Person("godofredo", 1651461, 17, Gender.MALE, true);
        // Act
        RegisterResult result = registry.registerVoter(person);
        // Assert
        Assert.assertEquals(RegisterResult.UNDERAGE, result);
    }

    @Test 
    public void ShouldINVALID_AGE(){
        Person person = new Person("godofredo", 1651461, 18, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.VALID, result);

    }
    @Test 
    public void ShouldBeDuplicated(){
        Person person = new Person("godofredo", 1651461, 18, Gender.MALE, true);
        registry.registerVoter(person);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.DUPLICATED, result);

    }
    @Test
    public void shouldBenullPersonName(){
        Person person = new Person(null, 1651461, 18, Gender.MALE, true);
        RegisterResult result = registry.registerVoter(person);
        Assert.assertEquals(RegisterResult.NULL_PERSON, result);
    }
    
}
