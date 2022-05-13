import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        int rs = 1;
        for (int i = 0; i < numRows; i++) {
            pascal.add(i, new ArrayList<Integer>());
            for (int j = 0; j < rs; j++) {

                if (j == 0 || j == rs - 1) {
                    pascal.get(i).add(j, 1);
                } else {
                    int val = pascal.get(i - 1).get(j - 1) + pascal.get(i - 1).get(j);
                    pascal.get(i).add(j, val);
                }

            }
            rs++;

        }
        return pascal;

    }
}