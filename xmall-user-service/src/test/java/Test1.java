import org.junit.Test;

/**
 * @author xiaqi
 * @date 2019/7/23
 */
public class Test1 {

    @Test
    public void test() {
        validUtf8(new int[]{197, 130, 1});
    }

    public boolean validUtf8(int[] data) {
        // validate
        if (null == data || 0 == data.length) {
            return true;
        }
        String[] binaryStr = convertBinary(data);
        int n = binaryStr.length;
        for (int i = 0;i<n;) {
            String temp = binaryStr[i];
            // one byte
            if (temp.charAt(0) == '0') {
                i++;
                continue;
            }
            // two bytes
            if (temp.startsWith("110")) {
                // is end
                if (i == n-1) {
                    return false;
                }
                if (binaryStr[i+1].startsWith("10")) {
                    i += 2;
                    continue;
                }
                return false;
            }
            // three bytes
            if (temp.startsWith("1110")) {
                if (i >= n-2) {
                    return false;
                }
                if (binaryStr[i+1].startsWith("10") && binaryStr[i+2].startsWith("10")) {
                    i += 3;
                    continue;
                }
                return false;
            }
            // four bytes
            if (temp.startsWith("11110")) {
                if (i >= n-3) {
                    return false;
                }
                if (binaryStr[i+1].startsWith("10") && binaryStr[i+2].startsWith("10")
                        && binaryStr[i+3].startsWith("10")) {
                    i += 4;
                    continue;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    private String[] convertBinary(int[] data) {
        String[] res = new String[data.length];
        for (int i = 0;i<data.length;i++) {
            StringBuilder builder = new StringBuilder(Integer.toBinaryString(data[i]));
            // add padding
            int tmp = 8 - builder.length();
            while (tmp-- > 0) {
                builder.insert(0,'0');
            }
            res[i] = builder.toString();
        }
        return res;
    }
}
