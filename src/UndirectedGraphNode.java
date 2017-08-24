import java.util.ArrayList;
import java.util.List;

/**
 * Created by cuibowu on 2017/8/24.
 */
public class UndirectedGraphNode {
    int label;
    List<UndirectedGraphNode> neighbors;

    UndirectedGraphNode(int x) {
        label = x;
        neighbors = new ArrayList<UndirectedGraphNode>();
    }
}
