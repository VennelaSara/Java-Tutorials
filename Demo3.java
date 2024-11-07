
public class Demo3 {
    public static void main(String args[]) {
        int nums[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                nums[i][j] = (int) (Math.random() * 10);
            }
        }
    }
}
// Every Method a Stack in JVM.
// In MultiDimensional Array - we will give
// rows and Can or Cannot give Columns size
// When Columns Size is not given that means they
// are different so called Jagged Array

// Enhanced For loop
// for(int n[]:nums){
// for(int m:n){
// System.out.println(m + " ");
// }
// System.out.println();
// }
// int nums[][] = new int[3][];
// int nums[0] = new int[2];
// int nums[1] = new int[4];
// int nums[3] = new int[3];
// for(int i=0;i<nums.length;i++){
// for(int j=0;j<nums[i].length;j++){
// nums[i][j] = (int)(Math.Random()*10);
// System.out.println(nums[i][j]);
// } Can also use Enhanced Array so that
// Dont need to Specify size as it Automatically Detect.
// }
// int nums[][][] = new int[2][4][5];
// Default - Zeros
// Disadvantages of Array :-
// ->Size is Fixed so Solution Create another array and then Copy elements into
// it.
// ->Arary created Object in Heap - Continuously Occupied Consume time,Space in
// Heap and Computation
