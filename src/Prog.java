import java.util.ArrayList;

/**
 * Created by Charberg on 12/7/2017.
 */
public class Prog {

    private String name;
    private int weight;
    private ArrayList<Prog> supports;
    private ArrayList<String> suppNames;

    public Prog() {
        supports = new ArrayList<Prog>();
        suppNames = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public ArrayList<Prog> getSupports() {
        return supports;
    }

    public void setSupports(ArrayList<Prog> supports) {
        this.supports = supports;
    }

    public void addSupport(Prog p) {
        this.supports.add(p);
    }

    public boolean contains(Prog p) {
        return supports.contains(p);
    }

    public ArrayList<String> getSuppNames() {
        return suppNames;
    }

    public void setSuppNames(ArrayList<String> suppNames) {
        this.suppNames = suppNames;
    }

    public void addNames(String s) {
        this.suppNames.add(s);
    }

    public boolean containsName(String s) {
        return suppNames.contains(s);
    }
}
