import org.junit.Test;
import java.util.Arrays;

public class testSelectionSort {

    SelectionSort sort = new SelectionSort();

    @Test
    public void testMixed(){
        int[] arr = new int[]{-8,-9,7,-10,2,0};
        int[] res = new int[]{-10,-9,-8,0,2,7};
        sort.basicSelectionSort(arr);
        assert(Arrays.equals(arr,res));
    }

    @Test
    public void testDuplicates(){
        int[] arr = new int[]{-8,-9,7,2,-8,2,-10,2,0};
        int[] res = new int[]{-10,-9,-8,-8,0,2,2,2,7};
        sort.basicSelectionSort(arr);
        assert(Arrays.equals(arr,res));
    }
}
