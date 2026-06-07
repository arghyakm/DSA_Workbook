import java.util.ArrayList;
import java.util.List;

class pascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        if (numRows == 0) {
            return result;
        }
        
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        
        if (numRows == 1) return result;

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRows = result.get(i - 1);
            List<Integer> rows = new ArrayList<>();
            
            rows.add(1);

            for (int j = 0; j < i - 1; j++) {
                rows.add(prevRows.get(j) + prevRows.get(j + 1));
            }
            
            rows.add(1);
            result.add(rows);
        }

        return result;
    }

    public static void main(String[] args) {
        // Create an instance of the class
        pascalTriangle pt = new pascalTriangle();
        
        
        int numRows = 5;
        
        List<List<Integer>> result = pt.generate(numRows);
        
        
        System.out.println("Pascal's Triangle for " + numRows + " rows:");
        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}