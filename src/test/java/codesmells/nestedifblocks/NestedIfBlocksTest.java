package codesmells.nestedifblocks;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class NestedIfBlocksTest {

    @Test
    void testBeforeAndAfterScenariosMatch() {
        LocalDate thisDay = LocalDate.of(2022,1,9);
        Assertions.assertEquals(new NestedIfBlocks(thisDay).before("this is a test", false), new NestedIfBlocks(thisDay).after("this is a test", false));
        Assertions.assertEquals(new NestedIfBlocks(thisDay).before("this is a test", true), new NestedIfBlocks(thisDay).after("this is a test", true));
        Assertions.assertEquals(new NestedIfBlocks(thisDay).before(null, false), new NestedIfBlocks(thisDay).after(null, false));
        Assertions.assertEquals(new NestedIfBlocks(thisDay).before(null, true), new NestedIfBlocks(thisDay).after(null, true));
        Assertions.assertEquals(new NestedIfBlocks(thisDay).before("", false), new NestedIfBlocks(thisDay).after("", false));
        Assertions.assertEquals(new NestedIfBlocks(thisDay).before("", true),new NestedIfBlocks(thisDay).after("", true));

        LocalDate someDay = LocalDate.of(2022, 1, 10);
        Assertions.assertEquals(new NestedIfBlocks(someDay).before("this is a test", false), new NestedIfBlocks(someDay).after("this is a test", false));
        Assertions.assertEquals(new NestedIfBlocks(someDay).before("this is a test", true), new NestedIfBlocks(someDay).after("this is a test", true));
        Assertions.assertEquals(new NestedIfBlocks(someDay).before(null, false), new NestedIfBlocks(someDay).after(null, false));
        Assertions.assertEquals(new NestedIfBlocks(someDay).before(null, true), new NestedIfBlocks(someDay).after(null, true));
        Assertions.assertEquals(new NestedIfBlocks(someDay).before("", false), new NestedIfBlocks(someDay).after("", false));
        Assertions.assertEquals(new NestedIfBlocks(someDay).before("", true),new NestedIfBlocks(someDay).after("", true));
    }
}
