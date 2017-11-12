package narzedzia;

/**
 * Węzeł do struktuj dynamicznych
 * @param <T> typ vartości wezła
 */
public class Node<T> {
    private T value;

    private Node left, right;

    public Node(T value) {
        this.value = value;
    }

    /**
     * Podłącza węzeł do początku danego
     * @param node dany węzeł
     */
    public void attachToFrontOf(Node node) {
        right = node;
        left = node.getLeft();

        if (left != null)
            left.setRight(this);
        node.setLeft(this);
    }

    /**
     * Podłacza węzeł do końca danego
     * @param node dany węzeł
     */
    public void attachToBackOf(Node node) {
        left = node;
        right = node.getRight();

        if (right != null)
            right.setLeft(this);
        node.setRight(this);
    }

    /**
     * Usuwa węzeł i łączy jego sąsiadów ze sobą
     */
    public void delete() {
        if (left != null)
            left.setRight(right);
        if (right != null)
            right.setLeft(left);
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public T getValue() {
        return value;
    }
}
