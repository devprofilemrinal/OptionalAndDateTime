## Why Optionals?

To understand `Optionals`, think about dealing with data in the real world. Imagine you're looking inside a box. Sometimes, the box has an item in it, like a phone or a book. Other times, it might be empty. If you pick up a box thinking there’s something inside and it’s actually empty, you could drop it out of surprise!

In Java, a method might return `null` when it doesn’t have a meaningful value to return, like a method that finds a student in a database by ID. If the student with that ID doesn’t exist, the method might return `null`, and if your code doesn’t expect this, it could crash with a `NullPointerException`.

## What are Optionals
Introduced in Java 8, it is intended to provide a limited mechanism for library method return types where there is a clear need to represnt “no result”, and where using null for that is overwhelmingly likely to cause errors.


### States of Optionals
It can be in two states:

- contains a non-null reference to a T (generic type); also called “present”
- is empty: also called “absent” (also, let’s stop saying null when we talk about optional)

> **⚠️ Optional itself is a reference type and can be null. But, do not ever, ever, use `null` for an `Optional` variable or return value. (Let’s say this is a mandatory thing)**
