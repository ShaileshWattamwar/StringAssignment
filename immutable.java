package TDIT_String;
import java.util.LinkedList;
import java.util.List;

final class Immutable {
    private final int uid;
    private final List < Object > list;
    private String fname;
    public Immutable(int uid, List < Object > list, String fname) {
        super();
        this.uid = uid;
        this.list = list;
        this.fname = fname;
    }
    public int getUId() {
        return uid;
    }
    public String getName() {
        return fname;
    }
    public List < Object > getList() {

        return new LinkedList < > (list); // defensive
    }
}




