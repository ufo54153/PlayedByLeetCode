public class Solution1 extends Solution {
    /**
     * 用字符串实现精确的大数乘法。
     * 这里使用的算法就是整数的竖式乘法
     *
     * @param num1
     * @param num2
     * @return
     */
    @Override
    public String multiply(String num1, String num2) {
        if (num1.length() < num2.length()) return multiply(num2, num1);
        if (num2.equals("0")) return "0";
        String result = "";
        String postfix = "";
        for (int i = num2.length() - 1; i >= 0; i--) {
            String sub = multipyByDigit(num1, num2.charAt(i) - '0');
            result = add(sub + postfix, result);
            postfix += "0";
        }
        return result;
    }

    private String add(String num1, String num2) {
        if (num1.length() < num2.length()) return add(num2, num1);
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = num1.length() - 1, j = num2.length() - 1;
        while (j >= 0) {
            int digit = (num1.charAt(i) - '0') + (num2.charAt(j) - '0') + carry;
            carry = digit / 10;
            result.insert(0, digit % 10);
            i--;
            j--;
        }
        while (i >= 0) {
            int digit = (num1.charAt(i) - '0') + carry;
            carry = digit / 10;
            result.insert(0, digit % 10);
            i--;
        }
        if (carry != 0) result.insert(0, carry);
        return result.toString();
    }

    private String multipyByDigit(String num1, int multiplier) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        for (int i = num1.length() - 1; i >= 0; i--) {
            int digit = (num1.charAt(i) - '0') * multiplier + carry;
            carry = digit / 10;
            result.insert(0, digit % 10);
        }
        if (carry != 0) result.insert(0, carry);
        return result.toString();
    }
}
