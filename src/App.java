import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        getRow(3);
    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        List<Integer> row = new ArrayList<>();

        for (int i = 1; i <= rowIndex; i++) {
            row.add(0, 1);

            for (int j = 1; j < row.size() - 1; j++) {
                row.set(j, row.get(j) + row.get(j + 1));
            }
            if (i == rowIndex)
                res = new ArrayList<>(row);
            Arrays.fill(null, row);
        }
        return res;

        // This solution uses the same idea of the previous one
        /*
         * Integer[] ans = new Integer[rowIndex + 1];
         * Arrays.fill(ans, 1);
         * 
         * for (int i = 2; i < rowIndex + 1; ++i)
         * for (int j = 1; j < i; ++j)
         * ans[i - j] += ans[i - j - 1];
         * 
         * return Arrays.asList(ans);
         */
    }
}
