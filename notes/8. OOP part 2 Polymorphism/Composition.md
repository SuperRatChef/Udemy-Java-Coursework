#### 1. **Definition**

- **Composition** is a design principle in object-oriented programming where a class is composed of one or more objects of other classes.
- It represents a **"has-a"** relationship, meaning an object is made up of or composed of other objects.
- It is a form of **aggregation** but with a stronger relationship where the composed objects (components) usually cannot exist independently of the parent object.

#### 2. **Difference Between Inheritance and Composition**

- **Inheritance** creates an "is-a" relationship, meaning a class inherits attributes and behaviors from a parent class.
- **Composition** creates a "has-a" relationship, where a class contains instances of other classes.
- **Composition** is often preferred over inheritance because it provides better flexibility and maintains a loose coupling between classes.
#### 4. **Characteristics of Composition**

- **Strong relationship**: The lifetime of composed objects is generally tied to the lifetime of the parent object.
- **Encapsulation**: Composition promotes better encapsulation as internal objects are hidden from external classes.
- **Reusability**: Classes can be composed of various objects, making code more modular and reusable.
- **Flexibility**: A class can change its components without affecting the external code, leading to better maintenance.

#### 5. **UML Representation**

- In **UML diagrams**, composition is represented by a filled diamond at the parent (owning) class and a line connecting it to the component class.
- **Aggregation** is a weaker form of composition and is represented with an empty diamond.

#### 6. **Advantages of Composition**

- **Loose Coupling**: Components of the class can be changed without altering the external interface.
- **Better Code Organization**: Encapsulation of responsibilities into smaller objects makes the codebase more organized.
- **Ease of Maintenance**: Since components are replaceable and the relationship between the classes is not too tight, it is easier to maintain the code.
- **Favors Reusability**: Objects can be composed and recomposed with different components, leading to reusable and adaptable code.

#### 7. **When to Use Composition**

- When you want to build complex objects from simpler ones.
- When you want to share behavior but don’t need to inherit from a parent class.
- When you need more flexibility than inheritance allows.

#### 8. **Composition vs. Aggregation**

- **Composition** implies ownership and a strong lifecycle dependency between the container (parent) and the contained objects.
- **Aggregation** is a weaker relationship where the contained objects can exist independently of the parent.