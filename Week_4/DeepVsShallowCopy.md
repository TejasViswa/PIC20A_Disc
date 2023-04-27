# Deep Vs Shallow Copy

n Java, when you copy an object, there are two types of copy that can be made: a deep copy and a shallow copy.

A shallow copy creates a new object and copies all the fields of the original object to the new object. However, if any of the fields are reference types (i.e., they point to other objects in memory), then only the reference to the object is copied, not the object itself. This means that the new object and the original object share references to the same objects in memory.

```java
//code illustrating shallow copy
public class Ex {

	private int[] data;

	// makes a shallow copy of values
	public Ex(int[] values) {
		data = values;
	}

	public void showData() {
		System.out.println( Arrays.toString(data) );
	}
}
```
![image](https://user-images.githubusercontent.com/45400093/234994923-293ae624-6a46-416d-8d29-9c54ac9a4a61.png)

A deep copy, on the other hand, creates a new object and recursively copies all the fields of the original object to the new object. If any of the fields are reference types, a new object is created for that field and its fields are recursively copied.

```java
// Code explaining deep copy
public class Ex {
      
    private int[] data;
  
    // altered to make a deep copy of values
    public Ex(int[] values) {
        data = new int[values.length];
        for (int i = 0; i < data.length; i++) {
            data[i] = values[i];
        }
    }
  
    public void showData() {
        System.out.println(Arrays.toString(data));
    }
}
```
![image](https://user-images.githubusercontent.com/45400093/234995224-5b8318c0-63f2-433f-bea3-c591300b6d9a.png)

To create a shallow copy in Java, you can use the clone() method, but it only copies the object and its fields, not the objects to which the fields point. To create a deep copy, you will need to implement the copy logic yourself, which can be a more involved process. This is where the copy constructor comes into play. You need to define your copy constructor such that it performs a deep copy.

[Reference](https://www.geeksforgeeks.org/deep-shallow-lazy-copy-java-examples/)

## More on Copy

### Note: I have omitted the Random objects in the Pokemon objects. But, in your actual code, they also exist and they also need to be deep copied.

The constructor we created during today's discussion using the for-loop for the PokemonTeam class looks the following:
<img width="1307" alt="image" src="https://user-images.githubusercontent.com/45400093/234998471-e648dedf-10b1-4696-869a-2b775a1fa4fc.png">

This is still a shallow copy because team2 is still pointing to the pokemon objects from team1.

A true deep copy will look like the following:
<img width="1307" alt="image" src="https://user-images.githubusercontent.com/45400093/234998833-367e5fb4-f74e-435e-9ff1-35f2c3493c88.png">

