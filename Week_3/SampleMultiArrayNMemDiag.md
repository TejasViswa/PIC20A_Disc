# Sample Code with Arrays and its Memory Diagram

## Code
```java
public class MultiArrayTest {
    public static void main(String[] args) {

        int[][] square = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        // Stage - 1 

        for (int[] arr : square) {
            for (int val : arr) {
                System.out.print(val+" ");

                // Stage - 2
            }

            // Stage - 3
            System.out.println();
        }
        
        // Stage - 4

        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                System.out.print(square[i][j]+" ");

                // Stage - 5
            }

            // Stage - 6
            System.out.println();
        }

        // Stage - 7

    }
}

```
## Memory Diagram
### Note: I have omitted drawing the static pool because there are no static variables in this example. Also, note that the addresses I am assigning are at random, they need not follow the same pattern or numbers.
### Stage 1

<img width="946" alt="image" src="https://user-images.githubusercontent.com/45400093/233228239-13197118-5686-490b-abbe-6f674a03c262.png">

### Stage 2 (For the first iteration of both loops)

<img width="931" alt="image" src="https://user-images.githubusercontent.com/45400093/233228607-53aa68ca-c7a3-4ea5-9c94-9768a0662d86.png">

### Stage 3 (At the end of the first iteration of outer loop)

<img width="931" alt="image" src="https://user-images.githubusercontent.com/45400093/233228879-5e3e5b8c-dcc6-41a3-8264-4d412512b8de.png">

### Stage 4

<img width="931" alt="image" src="https://user-images.githubusercontent.com/45400093/233228921-4ea4b610-3a22-4661-bbdb-bc8e974b09cd.png">

### Stage 5 (For the first iteration of both loops)

<img width="931" alt="image" src="https://user-images.githubusercontent.com/45400093/233229081-a4a6ddc0-f35e-4080-a197-caeb816a4051.png">

### Stage 6 (At the end of the first iteration of outer loop)

<img width="931" alt="image" src="https://user-images.githubusercontent.com/45400093/233229131-71dada40-0de2-4593-8be6-3cc1866b0b4c.png">

### Stage 7

<img width="931" alt="image" src="https://user-images.githubusercontent.com/45400093/233229286-f3029674-6f2b-49c6-a28f-92fbdba89444.png">
