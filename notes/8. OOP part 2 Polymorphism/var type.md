The `var` keyword, introduced in **Java 10** (as part of **JEP 286**), enables **local variable type inference**, meaning that the type of the variable is automatically inferred from the context. While `var` provides syntactic sugar and can make code cleaner and easier to read, it must be used with care to avoid confusion.

---
### 1. **Type Inference with `var`**

When you declare a variable using `var`, Java automatically infers its type based on the value that the variable is initialized with. The inferred type is determined at **compile time**, not runtime.

### 2. **Usage of `var`**

- **Local Variables**: `var` can only be used for **local variables** inside methods, constructors, or initialization blocks.
- **For Loop**: It can also be used in `for` loops.
- **Try-with-Resources**: `var` works in try-with-resources for resource declarations.