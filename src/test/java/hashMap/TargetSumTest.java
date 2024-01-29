package hashMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TargetSumTest {
    @Test
    public void testFindTwoSumIndices() {
        int[] nums = {10, 20, 30, 40, 50, 60};
        int target = 100;
        int[] expected = {3, 5};
        int[] result = TargetSum.findTwoSumIndices(nums, target);
        Assertions.assertArrayEquals(expected, result);
    }
    @Test
    public void testFindTwoSumIndicesNoSolution() {
        int[] nums = {10, 20, 30, 40, 50, 60};
        int target = 200;
        int[] result = TargetSum.findTwoSumIndices(nums, target);
        Assertions.assertArrayEquals(new int[0], result);
    }
    @Test
    public void testFindTwoSumIndicesEmptyArray() {
        int[] nums = {};
        int target = 100;
        int[] result = TargetSum.findTwoSumIndices(nums, target);
        Assertions.assertArrayEquals(new int[0], result);
    }
}
