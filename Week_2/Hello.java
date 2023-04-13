public class Hello {

    public int inst = 5; // instance variable, it need not be initialized
    public static int stat = 5; // static variable, it need not be initialized
    public static void main (String[] args) {

        int local = 5; //local variable because it is within a method, it has be initialized

        System.out.println(local);



        Hello h1 = new Hello(); //creating a object valled h1 of class Hello
        h1.inst++;
        Hello.stat++;
        System.out.println(h1.inst); // use object name to access instance variable
        System.out.println(Hello.stat); //use class name to access static variable

        Hello h2 = new Hello(); //creating a object valled h2 of class Hello
        System.out.println(h2.inst); // use object name to access instance variable
        System.out.println(Hello.stat); //use class name to access static variable

        callMe();


        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        int[] arr = new int[] {1,2,3,4};

        // modifying with the for-loop
        for(int i=0; i< arr.length; i++) {
            arr[i] += 4;
        }

        // printing
        for(int i=0; i< arr.length; i++) {
            System.out.println(arr[i]);
        }

        // modifying with the enhanced for-loop
        for (int val : arr ) {
            val+=2;
        }

        // printing
        for(int i=0; i< arr.length; i++) {
            System.out.println(arr[i]);
        }



        double d = 5.0f;
        //System.out.println(arr[1]);


    }

    public static void callMe() {
        int local2 = 5; //local variable because it is within a method

        Hello h2 = new Hello();
        
    }

}
