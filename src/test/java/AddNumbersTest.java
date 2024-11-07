import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddNumbersTest {

    private final AddNumbers addNumbers = new AddNumbers();
    @Test
    void additionTest(){
        assertEquals(10, addNumbers.addition(8,2));
    }

}