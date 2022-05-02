import static org.junit.Assert.*;
import org.junit.*;

public class ShowSkillTest {
    @Test
    public void multi() {
        assertEquals(6, ShowSkill.multi(2, 3));
    }

}
