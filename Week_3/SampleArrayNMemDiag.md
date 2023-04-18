# Sample Code with Arrays and its Memory Diagram

## Code
```java
public class ArrayTest {
    public static void main(String[] args) {

        int x = 5;
        int y = x;

        // Stage 1

        // There is no difference between the two lines below in terms of the memory diagram respresentation
        int[] arr1 = {1,2,3,4};
        int[] arr2 = new int[]{1,2,3,4};

        int[] arr3 = arr1;

        // Stage 2

        System.out.println();
        System.out.println("arr1 is: "+arr1);
        System.out.println("arr2 is: "+arr2);
        System.out.println("arr3 is: "+arr3);
        System.out.println();

        System.out.println("We now attempt to modify the values of arr1 using a regular for-loop ");
        for(int i = 0; i < arr1.length; i++) {
            int val = arr1[i];
            val+=1;
            arr1[i]+=1;

            // Stage 3
        }

        System.out.print("The values in arr1 are ");
        for(int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.println("Using the `[]`(array index operator), we can directly modify the values in the array object");
        System.out.println();

        System.out.println("You may also note that the values in arr3 are modified");
        System.out.print("The values in arr3 are ");
        for(int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i]+" ");
        }
        System.out.println();
        System.out.println("This is because both the array references point to the same array objects in the heap. In other words, they store the same address");
        System.out.println();

        // Stage 4

        System.out.println("We now attempt to modify the values of arr2 using an enhanced for-loop ");
        for(int val : arr2) {
            val+=1;
            // Stage 5
        }

        System.out.print("The values in arr2 are ");
        for(int val : arr2) {
            System.out.print(val+" ");
        }
        System.out.println();
        System.out.println("When we draw the memory diagram, we realize that `val` in the enhanced for-loop is a local variable in that enhanced for-loop frame and it is also a copy of the elements in the array object and does not refer to the original array object");
        System.out.println();

        System.out.println("We now attempt to modify the values of arr2 by passing it to a method modArray ");
        modArray(arr2);
        System.out.print("The values in arr2 are ");
        for(int val : arr2) {
            System.out.print(val+" ");
        }
        System.out.println();
        System.out.println("In the method `modArray`, we make the parameter/local variable `arr` reference, a copy of the `arr2` array reference, essentially, they both have the same address or they point to the same array object. So, when we modify one of them, the other is  modified as well. Even though, it is a local variable that disappears at the end of the method call, it can still modify the values in `arr2`.");
        System.out.println();

        // Stage 7

        System.out.println("We now attempt to modify the values of arr2 by passing it to a method modArray2");
        modArray2(arr2);
        System.out.print("The values in arr2 are ");
        for(int val : arr2) {
            System.out.print(val+" ");
        }
        System.out.println();
        System.out.println("In the method `modArray2`, initially, the parameter/local variable `arr` is a copy of the `arr2` array reference but within the method, it is later reassigned to a new array object on the heap and all the modifications it performs is reflected on this new object and not on the original object that `arr2` is referencing. Thus, when it disappears at the end of the method call, it feels it did nothing");
        System.out.println();

        // Stage 9
    }

    public static void modArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i]+=1;
            // Stage 6
        }
    }

    public static void modArray2(int[] arr) {
        arr = new int[]{1,2,3,4}; // Cannot use `arr = {1,2,3,4}` - that can only be used when it is being initialized for the first time
        for(int i = 0; i < arr.length; i++) {
            arr[i]+=1;
            // Stage 8
        }
    }

}

```
## Memory Diagram
### Note: I have omitted drawing the static pool because there are no static variables in this example. Also, note that the addresses I am assigning are at random, they need not follow the same pattern or numbers.
### Stage 1
![image](https://user-images.githubusercontent.com/45400093/232637609-7ea48f44-6eee-47ab-8978-f1421f415d92.png)
### Stage 2
![image](https://user-images.githubusercontent.com/45400093/232640654-4859b5e3-4570-4d5c-ba01-c3b17ab0289d.png)
## Stage 3 (At the end of the first iteration when i=0)
### Error: arr1 should be {2,2,3,4} instead of {2,3,4,5} at the end of first iteration when i=0
![image](https://user-images.githubusercontent.com/45400093/232640545-8cda4902-08c6-435d-8754-65f5a2e8a4d8.png)
## Stage 4
![image](https://user-images.githubusercontent.com/45400093/232640614-b75262be-eee7-4848-a5f4-c2b5179436ca.png)
## Stage 5 (At the end of the first iteration)
![image](https://user-images.githubusercontent.com/45400093/232640334-448f2497-9704-4c2a-8cff-ec30bdac4c45.png)
## Stage 6 (At the end of the first iteration when i=0)
![image](https://user-images.githubusercontent.com/45400093/232639501-4e99335a-14a7-4e0a-8d33-e1586e5faaad.png)
## Stage 7
![image](https://user-images.githubusercontent.com/45400093/232639663-f4a20cfe-a95f-4ea5-b14b-f81124e3fdab.png)
## Stage 8 (At the end of the first iteration when i=0)
![image](https://user-images.githubusercontent.com/45400093/232640925-cc696754-784a-4fd8-98da-31e9e4ca6888.png)
## Stage 9
![image](https://user-images.githubusercontent.com/45400093/232640023-3b5e8116-6e1e-4e38-9392-94f4278adc10.png)
