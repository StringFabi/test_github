package likedList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class MusicalChairs {
    private List<String> names;

    public MusicalChairs(String... name) {
        if (name.length != 0) {
            this.names = new LinkedList<String>(Arrays.asList(name));
        } else {
            this.names = new LinkedList<String>();
        }
    }

    public String toString() {
        Iterator<String> itr = this.names.iterator();
        StringBuilder tmp = new StringBuilder();
        while (itr.hasNext()) {
            tmp.append(itr.next()).append(" , ");
        }
        return tmp.toString();
    }
}
