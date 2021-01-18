import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AreaPatratuluiTest {
    @Test
    public void areaPatratului(){
        AreaPatratului areaPatratului = new AreaPatratului();
        assertEquals(10.142399285975088, areaPatratului.areaPatratului(5));
    }


}