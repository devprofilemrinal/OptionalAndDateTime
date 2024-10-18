## Fetching values from Optional
`.get()` method is used to fetch value from an optional wrapper. Below is the source code for the same.

```java
public T get() {
        if (value == null) {
            throw new NoSuchElementException("No value present");
        }
        return value;
    }
```
If you have noticed, if the value is present, value will be returned but if the value is absent `NoSuchElementException` will be thrown. We got away from `NullPointerException` but got another one which is a bad practice so as practice

> **⚠️ If you are unsure whether the value is present in an optional do not use `.get() method**
