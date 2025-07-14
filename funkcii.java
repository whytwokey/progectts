public class funkcii {
    public static void main(String[] args) {
        // info("Hello");
        // String java = "Java";
        // info(java);
        // info("");

    //     short num = 7;
    //     int result1 = summa((short) 3, num);

    //     short num2 = 2;
    //     int result2 = summa((short) 1, num2);
    //     info(String.valueOf(result2));
    // }

    // public static int summa(short a, short b) {
    //     int res = a + b;
    //     String result = "Результат: " + res;
    //     info(result);
    //     return res;
    // }

    // public static void info(String word) {
    //     System.out.print(word);
    //     System.out.println("!");

        byte[] nums1 = new byte[] {5, 6, 8};
        int sum1 = summaArray(nums1);
        System.out.println("Сумма 1: " + sum1);
            
        byte[] nums2 = new byte[] {1, 2, 3, 4, 5};
        int sum2 = summaArray(nums2);
         System.out.println("Сумма 2: " + sum2);
    }

    public static int summaArray(byte[] arr){
        int summa = 0;
        for(byte x = 0; x < arr.length; x++)
            summa += arr[x];

        return summa;
    }
}