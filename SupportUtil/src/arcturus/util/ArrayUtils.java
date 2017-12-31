package arcturus.util;

/**
 * 一个关于数组的工具类
 */
public class ArrayUtils {
    /**
     * 本工具类不能被实例化
     */
    private ArrayUtils() {

    }

    /**
     * 将一个{@code Integer[]}数组拆箱为{@code int[]}
     * @param array 包装类数组
     * @return 基本类型数组
     */
    public static int[] toPrimitive(Integer[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    /**
     * 将一个{@code Character[]}数组拆箱为{@code char[]}
     * @param array 包装类数组
     * @return 基本类型数组
     */
    public static char[] toPrimitive(Character[] array) {
        char[] result = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    /**
     * 将一个{@code Double[]}数组拆箱为{@code double[]}
     * @param array 包装类数组
     * @return 基本类型数组
     */
    public static double[] toPrimitive(Double[] array) {
        double[] result = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    /**
     * 将一个{@code Byte[]}数组拆箱为{@code byte[]}
     * @param array 包装类数组
     * @return 基本类型数组
     */
    public static byte[] toPrimitive(Byte[] array) {
        byte[] result = new byte[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    /**
     * 将一个{@code Long[]}数组拆箱为{@code long[]}
     * @param array 包装类数组
     * @return 基本类型数组
     */
    public static long[] toPrimitive(Long[] array) {
        long[] result = new long[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    /**
     * 将一个{@code Boolean[]}数组拆箱为{@code boolean[]}
     * @param array 包装类数组
     * @return 基本类型数组
     */
    public static boolean[] toPrimitive(Boolean[] array) {
        boolean[] result = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }

    public static <T> String toString(T[] array, int start, int end) throws ArrayIndexOutOfBoundsException {
        if (start < 0 || end >= array.length) throw new ArrayIndexOutOfBoundsException();
        if (array == null) return "null";
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = start; i < end; i++) {
            sb.append(array[i].toString());
            if (i + 1 < end - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public static String toString(char[] array, int start, int end) throws ArrayIndexOutOfBoundsException {
        if (start < 0 || end >= array.length) throw new ArrayIndexOutOfBoundsException();
        if (array == null) return "null";
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = start; i < end; i++) {
            sb.append(array[i]);
            if (i < end - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public static String toString(int[] array, int start, int end) throws ArrayIndexOutOfBoundsException {
        if (start < 0 || end >= array.length) throw new ArrayIndexOutOfBoundsException();
        if (array == null) return "null";
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = start; i < end; i++) {
            sb.append(array[i]);
            if (i < end - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public static String toString(short[] array, int start, int end) throws ArrayIndexOutOfBoundsException {
        if (start < 0 || end >= array.length) throw new ArrayIndexOutOfBoundsException();
        if (array == null) return "null";
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = start; i < end; i++) {
            sb.append(array[i]);
            if (i < end - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public static String toString(long[] array, int start, int end) throws ArrayIndexOutOfBoundsException {
        if (start < 0 || end >= array.length) throw new ArrayIndexOutOfBoundsException();
        if (array == null) return "null";
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = start; i < end; i++) {
            sb.append(array[i]);
            if (i < end - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public static String toString(float[] array, int start, int end) throws ArrayIndexOutOfBoundsException {
        if (start < 0 || end >= array.length) throw new ArrayIndexOutOfBoundsException();
        if (array == null) return "null";
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = start; i < end; i++) {
            sb.append(array[i]);
            if (i < end - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public static String toString(double[] array, int start, int end) throws ArrayIndexOutOfBoundsException {
        if (start < 0 || end >= array.length) throw new ArrayIndexOutOfBoundsException();
        if (array == null) return "null";
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = start; i < end; i++) {
            sb.append(array[i]);
            if (i < end - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public static String toString(boolean[] array, int start, int end) throws ArrayIndexOutOfBoundsException {
        if (start < 0 || end >= array.length) throw new ArrayIndexOutOfBoundsException();
        if (array == null) return "null";
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = start; i < end; i++) {
            sb.append(array[i]);
            if (i < end - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
