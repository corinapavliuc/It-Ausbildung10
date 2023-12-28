package summer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SummerUtilTest {

    @Test
    void sholdWordCorrectlyWhenSunTwoNumber() {
        int first =19;
        int second =11;

        int result  =SummerUtil.sum(first,second);

        assertEquals(30,result);
    }
    @Test
    void sholdSumNegativeNumbers(){
        int first =-14;
        int second=-1;

        int result = SummerUtil.sum(first,second);
        assertEquals(-15,result);
    }
    @Test
    void shouldNotWorkwithDoubles(){
        double first = 0.2;
        double second = 1.2;

        int result =SummerUtil.sum(first,second);
        assertEquals();
    }
}