## Empty Optional

    /**
     * Returns an empty {@code Optional} instance.  No value is present for this
     * {@code Optional}.
     *
     * @apiNote
     * Though it may be tempting to do so, avoid testing if an object is empty
     * by comparing with {@code ==} or {@code !=} against instances returned by
     * {@code Optional.empty()}.  There is no guarantee that it is a singleton.
     * Instead, use {@link #isEmpty()} or {@link #isPresent()}.
     *
     * @param <T> The type of the non-existent value
     * @return an empty {@code Optional}
     */
```java
    public static<T> Optional<T> empty() {
        @SuppressWarnings("unchecked")
        Optional<T> t = (Optional<T>) EMPTY;
        return t;
    }
```

## Optional from a Value
```java
Optional<String> nonNullOptional = Optional.of("Hello");
```
This creates an `Optional` that contains a non-null value. If you pass a null value, it will throw a `NullPointerException`.

```java
public static <T> Optional<T> of(T value) {
        return new Optional<>(Objects.requireNonNull(value));
    }
```

## Optional from a Value
```java
Optional<String> nullableOptional = Optional.ofNullable(null);
```
This creates an `Optional `that may or may not contain a value. If the value is null, it returns `Optional.empty()`.

```java
public static <T> Optional<T> ofNullable(T value) {
        return value == null ? (Optional<T>) EMPTY
                             : new Optional<>(value);
    }
```