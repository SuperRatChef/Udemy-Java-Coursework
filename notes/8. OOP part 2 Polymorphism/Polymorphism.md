### Polymorphism in Java

Polymorphism is one of the four fundamental principles of Object-Oriented Programming (OOP), along with encapsulation, inheritance, and abstraction. It allows objects of different classes to be treated as objects of a common superclass. Polymorphism enables flexibility and the ability to extend code easily.

There are two main types of polymorphism in Java: **compile-time polymorphism** (also known as static polymorphism) and **runtime polymorphism** (also known as dynamic polymorphism).

---

### 1. **Compile-time Polymorphism (Method Overloading)**

Compile-time polymorphism is achieved through **method overloading**. This is when multiple methods share the same name but differ in:

- Number of parameters
- Type of parameters
- Sequence of parameters

Java determines which method to invoke at compile time based on the method signature.

#### Key Points:

- The method's return type can be different but is not enough for overloading by itself.
- Compile-time polymorphism improves code readability and reuse.

### 2. **Runtime Polymorphism (Method Overriding)**

Runtime polymorphism is achieved through **method overriding**. It occurs when a subclass provides a specific implementation for a method that is already defined in its superclass. The method that is called is determined at runtime, hence the name.

#### Key Points:

- Requires inheritance.
- A subclass overrides a method with the same name, return type, and parameters.
- The decision of which method to execute (the overridden or the overriding) is made at runtime.
- Achieved using dynamic method dispatch.
### 3. **Dynamic Method Dispatch**

- Dynamic method dispatch is the mechanism through which Java implements runtime polymorphism.
- It occurs when a call to an overridden method is resolved at runtime rather than compile time.
- Java uses dynamic method dispatch to determine which version of the method (overridden or the original) should be executed based on the actual object type, not the reference type.

### 4. **Key Benefits of Polymorphism**

- **Code Reusability**: Write generic code that works for different object types. For instance, the same method can process different subclasses, allowing for extensibility and modular code.
    
- **Maintenance**: Polymorphism allows for easy maintenance and future expansion. New types can be added with minimal changes to existing code.
    
- **Extensibility**: Subclasses can override methods to implement specific behavior without modifying the superclass or other parts of the code.
    
- **Flexibility**: Allows methods to perform differently based on the object type, enhancing flexibility in system design.