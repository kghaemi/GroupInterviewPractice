import java.util.ArrayList;
import java.util.List;

public class Node {
    Task val;
    List<Node> children;

    public Node() {
        children = new ArrayList<>();
    }
}
