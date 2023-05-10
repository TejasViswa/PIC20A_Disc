# Midterm Problem 2

## Question
The following code (saved in a file called `Question2.java`) compiles and executes successfully.
```java
public class Question2 {
    public static void main(String[] args) {
        int[] arr1, arr2, arr3, arr4;

        arr1 = new int[] {1, 1, 1, 1, 1};
        arr2 = new int[] {5, 5, 5, 5, 5};
        arr3 = arr2;

        arr3[3] = 1;

        arr2 = new int[] {8, 8, 8, 8, 8};

        f1(arr1);
        f2(arr2);

        System.out.println(java.util.Arrays.toString(arr1));
        System.out.println(java.util.Arrays.toString(arr2));
        System.out.println(java.util.Arrays.toString(arr3));
    }

    public static void f1(int[] arr) {
        arr[0] = 2;
        arr = new int[] {0, 0, 0, 0};
    }

    public static void f2(int[] arr) {
        arr = new int[] {0, 0, 0, 0};
        arr[0] = 2;
    }
}
```
Write down the output from executing the code in the following box.

### Answer
- `arr1 = new int[] {1, 1, 1, 1, 1};`
- <img width="818" alt="image" src="https://github.com/TejasViswa/PIC20A_Disc/assets/45400093/3198ec79-153a-46ed-9de0-6d7b7d000c1f">
- `arr2 = new int[] {5, 5, 5, 5, 5};`
- <img width="818" alt="image" src="https://github.com/TejasViswa/PIC20A_Disc/assets/45400093/59fb54d6-4bc7-4391-b60f-edb43caa14f9">
- `arr3 = arr2;`
- <img width="818" alt="image" src="https://github.com/TejasViswa/PIC20A_Disc/assets/45400093/776c486d-b9f5-4603-80cc-ac78593157bd">
- `arr3[3] = 1;`
- <img width="818" alt="image" src="https://github.com/TejasViswa/PIC20A_Disc/assets/45400093/67e4d0cf-de2d-41f8-967e-7328a984d8e8">
- `arr2 = new int[] {8, 8, 8, 8, 8};`
- <img width="813" alt="image" src="https://github.com/TejasViswa/PIC20A_Disc/assets/45400093/1e7d081a-33d1-4aaf-bdfe-981de9e5d196">
- `f1(arr1);`
  - <img width="818" alt="image" src="https://github.com/TejasViswa/PIC20A_Disc/assets/45400093/f988e205-5e2c-45fd-b8de-0a935d671ce7">
  - `arr[0] = 2;`
  - <img width="818" alt="image" src="https://github.com/TejasViswa/PIC20A_Disc/assets/45400093/552cb448-02e0-4dcd-bda0-69c2de1da911">
  - `arr = new int[] {0, 0, 0, 0};`
  - <img width="763" alt="image" src="https://github.com/TejasViswa/PIC20A_Disc/assets/45400093/6461a3b9-7787-43d2-ac79-4e1ad685c624">
  - After method call
  - <img width="763" alt="image" src="https://github.com/TejasViswa/PIC20A_Disc/assets/45400093/8436d587-7626-4595-9fe5-73e81a7e96ec">
- `f2(arr2);`
  - <img width="763" alt="image" src="https://github.com/TejasViswa/PIC20A_Disc/assets/45400093/6f655c79-55e4-45df-87c5-4c0a8cc2c173">
  - `arr = new int[] {0, 0, 0, 0};`
  - <img width="650" alt="image" src="https://github.com/TejasViswa/PIC20A_Disc/assets/45400093/83aae25a-5d41-4f36-b5fc-cf4df039f514">
  - `arr[0] = 2;`
  - <img width="650" alt="image" src="https://github.com/TejasViswa/PIC20A_Disc/assets/45400093/0fec643d-7105-441f-8037-11455555900e">
  - After method call
  - <img width="650" alt="image" src="https://github.com/TejasViswa/PIC20A_Disc/assets/45400093/4ecce28a-6677-4129-9a57-b8fc7940d322">
```java
System.out.println(java.util.Arrays.toString(arr1));
System.out.println(java.util.Arrays.toString(arr2));
System.out.println(java.util.Arrays.toString(arr3));
```
Output:
```
[2, 1, 1, 1, 1]
[8, 8, 8, 8, 8]
[5, 5, 5, 1, 5]
```
        
