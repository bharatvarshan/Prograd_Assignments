package dailyCoding.day_13.test;

import dailyCoding.day_13.LengthHelper;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TestLength {

    @BeforeClass
    public static void beforeTest() {
        System.out.println("-------------------");
        System.out.println("Initiating Test");
        System.out.println("-------------------");
    }

//    [MethodUnderTest]_[Scenario]_[ExpectedResult]
    @Test
    public void testToCentimeterConvertor_inputLength_shouldReturnTrue(){
//        assertEquals(10.0, LengthHelper.toCentimeterConverter("1cm") );
          assertThat(1.0 , equalTo(LengthHelper.toCentimeterConverter("1cm")));
        assertThat(100.0 , equalTo(LengthHelper.toCentimeterConverter("1m")));
        assertThat(100000.0 , equalTo(LengthHelper.toCentimeterConverter("1km")));
        System.out.println("All Testing for Centimeter Conversion Passed");
    }

    @Test
    public void testToMeterConvertor_inputLength_shouldReturnTrue(){
        assertThat(1.0 , equalTo(LengthHelper.toMeterConverter("100cm")));
        assertThat(1.0 , equalTo(LengthHelper.toMeterConverter("1m")));
        assertThat(1000.0 , equalTo(LengthHelper.toMeterConverter("1km")));
        System.out.println("All Testing for Meter Conversion Passed");
    }

    @Test
    public void testToKilometerConvertor_inputLength_shouldReturnTrue(){
        assertThat(1.0 , equalTo(LengthHelper.toKilometerConverter("100000cm")));
        assertThat(1.0 , equalTo(LengthHelper.toKilometerConverter("1000m")));
        assertThat(1.0 , equalTo(LengthHelper.toKilometerConverter("1km")));
        System.out.println("All Testing for Kilometer Conversion Passed");
    }

    @Test
    public void testLengthCalculator_inputLengthsOperationsAndOutputType_shouldReturnTrue(){
        assertThat(2.0 , equalTo(LengthHelper.lengthCalculator("1m","100cm","+","m")));
        assertThat(100200.0 , equalTo(LengthHelper.lengthCalculator("200cm","1km","+","cm")));

        System.out.println("All Testing for length Calculator Passed");
    }


    @AfterClass
    public static void afterTest(){
        System.out.println("-------------------");

        System.out.println("Testing Ended");
        System.out.println("-------------------");

    }
}
