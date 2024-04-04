import org.example.AgeChecker;
import org.junit.jupiter.api.Test;

public class TestingAge {

    @Test
    public void testIsAgeValidWhen20() {
        AgeChecker AgeChecker = new AgeChecker();
        boolean result = AgeChecker.isAgeValid(20);
        org.junit.jupiter.api.Assertions.assertEquals(true, result);
    }
    @Test
    public void testIsAgeValidWhen100() {
        AgeChecker AgeChecker = new AgeChecker();
        boolean result = AgeChecker.isAgeValid(100);
        org.junit.jupiter.api.Assertions.assertEquals(true, result);
    }
}