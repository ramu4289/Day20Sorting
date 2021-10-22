import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BubbleSortWithArraylist {
    public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    
            int n = Integer.parseInt(bufferedReader.readLine().trim());
    
            String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
    
            List<Integer> a = new ArrayList<>();
    
            for (int i = 0; i < n; i++) {
                int aItem = Integer.parseInt(aTemp[i]);
                a.add(aItem);
            }
            int count = 0;
            for (int i = 0; i < n; ++i) {
                
                
                
                for (int j = 0; j < n - 1; ++j) {
                    
                    if (a.get(j) > a.get(j + 1)) {
                            //swap here
                        int temp = a.get(j);
                        a.set(j, a.get(j + 1));
                        a.set(j+1, temp);
                        count++;
                    }
                    
                    
                }
                
            }
            // // int min = 0;
            
            // // int count = 0;
            // // for (int i = 0; i < a.size(); ++i) {
                
            // //     min = i;
                
            // //     for (int j = i + 1; j < a.size(); ++j) {
            // //         if (a.get(j) < a.get(min)){
            // //             min = j;
            // //             int temp = a.get(i);
            // //             a.set(i, a.get(j));
            // //             a.set(j, temp);
                        
            // //             count++;
            // //         }
                    
                    
            // //     }
            // //     if (count == 0) {
            // //         break;
            // //     }
                
            // // }
            // // Write your code here
            System.out.println("Array is sorted in " + count + " swaps.");
            System.out.println("First Element: " + a.get(0));
            System.out.println("Last Element: " + a.get(a.size() - 1));
            bufferedReader.close();
        }
}