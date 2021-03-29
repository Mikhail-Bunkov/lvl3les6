import homework.Main;
import org.junit.Assert;
import org.junit.Test;

public class TestMethods {
    @Test
    public void testArray1(){
        int[] in = new int[]{6,5,3,7,1,6,2,1,4,0,3};
        int[] out = new int[]{0,3};
        Assert.assertArrayEquals(out, Main.array1(in));
    }


    @Test(expected = RuntimeException.class)
    public void test2Array1(){
        int[] in = new int[]{5,6,23,7,7,2,3,0};
        Main.array1(in);
    }


    @Test
    public void test1Array2(){
        int[] in = new int[]{6,1,4,6,8,5,0};
        Assert.assertFalse(Main.array2(in));
    }


    @Test
    public void test2Array2(){
        int[] in = new int[]{1,4,1,4,4,4,1};
        Assert.assertTrue(Main.array2(in));
    }
}
