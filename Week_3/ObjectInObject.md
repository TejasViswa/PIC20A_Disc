# Where are objects in objects stored?

If an object contains another reference, the reference itself is typically stored as a field of the object, which is located on the heap.

For example, consider a class in Java or C# that represents a person and contains a reference to an address object:

```java
public class Person {
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // getters and setters omitted for brevity
}

public class Address {
    private String street;
    private String city;
    private String state;
    private String zip;

    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    // getters and setters omitted for brevity
}
```
In this example, when a Person object is created, it contains a reference to an Address object, which is stored as a field of the Person object on the heap. The Address object itself is also allocated on the heap. When the Person object goes out of scope or is garbage collected, the memory used by both the Person and Address objects is released.

It's important to note that the reference to the Address object is stored on the heap as a field of the Person object, not on the stack. The variable that holds the reference to the Person object may be located on the stack, but the reference to the Address object is stored within the Person object itself on the heap.
