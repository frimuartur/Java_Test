public class evenNumbers {
    public static int oddCount (int n) {
        int even = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 != 0) {
                even++;
            } else {
                continue;
            }
        }
        return even;
    }
}
