package AbstractExercise;

public class SearchTree implements NodeList {
    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            // The tree is empty, so the new item becomes the root
            this.root = newItem;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(newItem);
            if (comparison < 0) {
                // newItem is greater, move right
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(newItem);
                    return true;
                }
            } else if (comparison > 0) {
                // newItem is less, move left
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    currentItem.setPrevious(newItem);
                    return true;
                }
            } else {
                // Item already exists
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }

        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;

        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison < 0) {
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else if (comparison > 0) {
                parentItem = currentItem;
                currentItem = currentItem.previous();
            } else {
                // We found the item to remove
                performRemoval(currentItem, parentItem);
                return true;
            }
        }
        return false;
    }

    private void performRemoval(ListItem item, ListItem parent) {
        if (item.next() == null && item.previous() == null) {
            // Leaf node
            if (parent.next() == item) {
                parent.setNext(null);
            } else {
                parent.setPrevious(null);
            }
        } else if (item.next() != null && item.previous() == null) {
            // Node has only a right child
            if (parent.next() == item) {
                parent.setNext(item.next());
            } else {
                parent.setPrevious(item.next());
            }
        } else if (item.previous() != null && item.next() == null) {
            // Node has only a left child
            if (parent.next() == item) {
                parent.setNext(item.previous());
            } else {
                parent.setPrevious(item.previous());
            }
        } else {
            // Node has two children
            ListItem successor = item.next();
            ListItem successorParent = item;
            while (successor.previous() != null) {
                successorParent = successor;
                successor = successor.previous();
            }
            item.setValue(successor.getValue());
            performRemoval(successor, successorParent);
        }
    }

    @Override
    public void traverse(ListItem root) {
        if (root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
