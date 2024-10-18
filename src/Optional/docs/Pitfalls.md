## Some common Pitfalls in Optionals
Here are some common pitfalls and misuses associated with using Optional in Java:

### Using `Optional` for Fields in Classes
`Optional` is designed primarily for return types to indicate the absence of a value. It is not meant to be used as a field in classes.

```java
public class Car {
    private Optional<Engine> engine;  // Bad practice
}
```
It adds unnecessary complexity to your class model. It breaks the clear separation between the class structure and the API return types.

#### Better Approach
Use Optional for the return type of getter methods:
```java
public Optional<Engine> getEngine() {
    return Optional.ofNullable(engine);
}
```

### Using `Optional` with Collections
Wrapping collections inside `Optional` is redundant since collections themselves can already represent absence (an empty collection). Using `Optional` with collections only adds unnecessary complexity.

```java
Optional<List<Customer>> customers = Optional.ofNullable(findAllCustomers());
```
#### Better Approach
Return an empty collection instead of using Optional to represent the absence of elements.
```java
List<Customer> customers = findAllCustomers();
```


