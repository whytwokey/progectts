import java.util.Scanner;

public class massive {
    public static void main(String[] args) {

        //int[] nums = new int[5];
        //nums[0] = 45;
        //nums[1] = 50;
        //nums[2] = 55;
        //nums[3] = 60;
        //nums[4] = 65;
        //int res = nums[2] + nums[3];
        //System.out.println(res);

        //float[] nums2 = new float[] {2.5f, 45.32f, 3.14f, 5.56f};
        //System.out.println(nums2[1]);

        //for(int x = 0; x < nums2.length; x++) {
            //System.out.println("Element: " + nums2[x]);
        //}

        //int[] arr = new int[4];
        //Scanner scan = new Scanner(System.in);

       //for(int x = 0; x < arr.length; x++) {
            //System.out.println("Введите значение: ");
            //int value = scan.nextInt();
            //arr[x] = value;
        //}

        //int min = arr[0];
        //for(int x = 0; x < arr.length; x++) {
            //if(arr[x] < min)
            //min = arr[x];
        //}
        //System.out.println("Minimal: " + min);

        char[][] syms = new char[2][2];
        syms[0][0] = 'g';
        System.out.println(syms[0][0]);

        byte[][] nums = new byte[][] {
            {4, 3},
            {2, 5},
            {6, 2}
        };

        nums[1][0] = 45;
        System.out.println(nums[1][0]);
    }
}
