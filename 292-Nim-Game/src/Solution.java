public abstract class Solution {
    public abstract boolean canWinNim(int n);

    public static void main(String[] args) {
        testCases(new Solution1());
    }

    private static void testCases(Solution solution) {
        System.out.println(solution.getClass().getName());
        for (int n = 1; n < 10; n++)
            System.out.println(solution.canWinNim(n));
    }
}
