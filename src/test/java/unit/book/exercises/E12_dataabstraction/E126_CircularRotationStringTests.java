package unit.book.exercises.E12_dataabstraction;

import book.exercises.E12_dataabstraction.E126_CircularRotationString;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

public class E126_CircularRotationStringTests {

    E126_CircularRotationString crs;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        crs = new E126_CircularRotationString();
    }

    @Test
    public void test_checkStrings() {
        boolean result =crs.check("erazderap", "perazdera" );
        Assert.assertTrue(result);
    }

    @Test
    public void test_checkStrngsByTheBookHint() {
        boolean result =crs.checkByTheBookHint("erazderap", "perazdera" );
        Assert.assertTrue(result);
    }
}

