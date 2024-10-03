An **Iterator** in Java is an object used to traverse or iterate through elements of a collection (like `ArrayList`, `LinkedList`, etc.) one by one. It provides a standard way to access and remove elements during the iteration without exposing the underlying collection's implementation details.

#### Key Characteristics:

- **Generic Traversal:** Iterators allow you to go through elements of a collection sequentially, regardless of the specific type of the collection.
- **Supports Removal:** You can remove elements during iteration safely, without encountering `ConcurrentModificationException`.

#### Interfaces:

- **`Iterator<E>`**: The most basic form of an iterator, part of the **Java Collections Framework**, defined in the `java.util` package.
- **`ListIterator<E>`**: An extension of the `Iterator` for lists, allowing bidirectional traversal (forward and backward) and supports more complex operations like setting or adding elements.

#### Key Methods of `Iterator<E>`:

- **`boolean hasNext()`**: Returns `true` if there are more elements to iterate over.
- **`E next()`**: Returns the next element in the iteration and advances the iterator.
- **`void remove()`**: Removes the last element returned by the iterator from the underlying collection (optional operation).

#### Key Methods of `ListIterator<E>` (in addition to `Iterator`):

- **`boolean hasPrevious()`**: Returns `true` if there are elements when traversing backwards.
- **`E previous()`**: Returns the previous element in the list.
- **`void set(E e)`**: Replaces the last element returned by `next()` or `previous()` with the specified element.
- **`void add(E e)`**: Inserts the specified element into the list.