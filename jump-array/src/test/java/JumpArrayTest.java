import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JumpArrayTest {
    private JumpArray j;
    private int[] array1 = {2, 3, 1, 1, 4};
    private int[] array2 = {3, 2, 1, 2, 4};
    @BeforeEach
    void setUp(){ j = new JumpArray(); }

    @Test
    public void shouldReturnTrue(){
        Assertions.assertTrue(j.isJumpable(this.array1));
    }

    @Test
    public void shouldReturnFalse(){
        Assertions.assertFalse(j.isJumpable(this.array2));
    }
}
