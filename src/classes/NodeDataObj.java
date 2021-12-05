package classes;

import api.EdgeData;
import api.GeoLocation;
import api.NodeData;

import java.util.HashMap;
import java.util.Map;

public class NodeDataObj implements NodeData {

    private int key;
    private GeoLocation g;
    private String info;
    private int tag;

    private Map<Integer, EdgeData> edges;

    public Map<Integer, EdgeData> getEdges() {
        return this.edges;
    }
    public NodeDataObj ( NodeDataObj NewNode) {

        this.key = NewNode.getKey();
        this.g = NewNode.getLocation();
        this.info = NewNode.getInfo();
        this.tag = NewNode.getTag();
    }
    public NodeDataObj(int key, GeoLocation g) {    //change +info +tag

        this.key = key;
        this.g = g;

        edges = new HashMap<>();

    }


    /**
     * Returns the key (id) associated with this node.
     *
     * @return
     */
    @Override
    public int getKey() {
        return this.key;
    }

    /**
     * Returns the location of this node, if none return null.
     *
     * @return
     */
    @Override
    public GeoLocation getLocation() {
        return this.g;
    }

    /**
     * Allows changing this node's location.
     *
     * @param p - new new location  (position) of this node.
     */
    @Override
    public void setLocation(GeoLocation p) {                        /// change
        this.g = new GeoLocationObj(p.x(), p.y(), p.z());
    }

    /**
     * Returns the weight associated with this node.
     *
     * @return
     */
    @Override
    public double getWeight() {
        return 0;
    }

    /**
     * Allows changing this node's weight.
     *
     * @param w - the new weight
     */
    @Override
    public void setWeight(double w) {
        return;
    }

    /**
     * Returns the remark (meta data) associated with this node.
     *
     * @return
     */
    @Override
    public String getInfo() {
        return this.info;
    }

    /**
     * Allows changing the remark (meta data) associated with this node.
     *
     * @param s
     */
    @Override
    public void setInfo(String s) {
        this.info = s;
    }

    /**
     * Temporal data (aka color: e,g, white, gray, black)
     * @return
     * which can be used be algorithms
     *
     */
    @Override
    public int getTag() {
        return this.tag;
    }

    /**
     * Allows setting the "tag" value for temporal marking an node - common
     * practice for marking by algorithms.
     *
     * @param t - the new value of the tag
     */
    @Override
    public void setTag(int t) {
        this.tag = t;
    }

    @Override
    public String toString() {
        return "NodeDataObj{" +
                "key=" + key +
                ", g=" + g +
                ", weight=" + 0 +
                ", info='" + info + '\'' +
                ", tag=" + tag +
                '}';
    }
}
