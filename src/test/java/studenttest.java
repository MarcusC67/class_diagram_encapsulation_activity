import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class studenttest {

    public studenttest ex001;

    @Test
    public void checkGetName() {
        // Arrange - setting up the objects needed for tests
        student ex001 = new student("Marcus", "A", 1, "fred");
        // Act - action you take, ie: run the code you want to test
        // Assert - what you are testing for - actual vs. expected result
        Assertions.assertEquals("Marcus", ex001.getName());
    }

    @Test
    public void checkGetGrade() {
        student ex001 = new student("Marcus", "A", 1, "fred");
        Assertions.assertEquals("A", ex001.getGrade());
    }

    @Test
    public void checkGetGroup() {
        student ex001 = new student("Marcus", "A", 1, "fred");
        Assertions.assertEquals("1", ex001.getGroup());
    }

    @Test
    public void checkUpGrade(){
        student ex001 = new student("Marcus", "B", 1, "fred");
        Assertions.assertEquals('A', ex001.getUpGrade());
    }

    @Test
    public void checkDownGrade(){
        student ex001 = new student("Marcus", "A", 1, "fred");
        Assertions.assertEquals("B", ex001.getDownGrade());
    }

}