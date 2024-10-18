## Returning Values if Optional is Absent
Previously we saw the `.isPresent()` or `isEmpty()` method. For sure they are better than get 
but hardly any better than checking for null. Also, this creates a bad habit in programmers to test with isPresent() before get(). We need to find alternatives to `isPresent()` and `get()` such that we need to force check the presence of an object.

### orElse() Method
It gets (`get()`) the wrapped value inside Optional if it is present (`isPresent()`) and its argument otherwise. 

```java
public T orElse(T other) {
        return value != null ? value : other;
    }
```
Notice, it would return other of generic type T is the value is not present. T should be same as `Optional<T>`. You cannot have an optional of type String and returns a default value of type Integer from `orElse()`. Also, notice one more thing, if you pass null as other, `orElse()` wil return null.

### orElseGet() Method
If a value is present, returns the value, otherwise returns the result produced by the supplying function.

```java
public T orElseGet(Supplier<? extends T> supplier) {
        return value != null ? value : supplier.get();
    }
```

> Notice that `orElse()` already has a default value to provide if the Optional is not present but `orElseGet()` would have to call the supplier so creation of default value is lazy in case of `orElseGet()` when the optional is absent.
