

public class second_lesson {

    public static void main(String[] args) {

        //for(float x = 100; x > 10; x /= 2) {
          //  System.out.println("Element: " + x);
        //}

        //int x = 1;

        //while(x <= 5) {

            //System.out.println("Element: " + x);
            //x++;
        //}

        //int x = 3;

        //do {
           // System.out.println("Element: " + x);
            //x++;
        //} while(x <= 5);

        for(int x = 5; x < 25; x += 2) {
            if(x % 3 ==0)
                continue;
            if(x >= 15)
                break;
            System.out.println("Element: " + x);
        }

    }
}