## Check if optional is present
Before fetching the object from the optional, let's make it a habit of checking
whether the value is present or not to avoid another fancy exception called `NoSuchElementException`.

### isPresent()
isPresent() returns a boolean. If the value is there it returns true, else if the optional is empty it returns false.

```java
public boolean isPresent() {
        return value != null;
    }
```
### isEmpty()
Returns: true if a value is not present, otherwise false

```java
public boolean isEmpty() {
        return value == null;
    }
```