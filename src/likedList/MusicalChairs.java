package likedList;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

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
    public void rotate(int distance) {
    	Collections.rotate(this.names, distance);
    }
    public void rotateAndRemoveLast(int distance) {
    	if(!this.names.isEmpty());
    	rotate(distance);
    	((LinkedList<String>) this.names).removeLast();
    }
     public String play() {
    	 if(!this.names.isEmpty()) {
    		 while(this.names.size()>1){
    			 int randomDistance = ThreadLocalRandom.current().nextInt();
    			 rotateAndRemoveLast(randomDistance);
    			 System.out.println(this.names);
    		 }
    	 }
    	 return this.names.toString();
     }
}
