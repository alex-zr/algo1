package sergii_danilov.Lesson10;

import session10.User;

import java.util.AbstractMap;

public class getDelete {

}

public void get(Integer key) {
   User user = new User("uuu","ggg");
   AbstractMap.SimpleEntry<Integer, User> integerUserSimpleEntry = new AbstractMap.SimpleEntry<>(key, null);

   for (int i = 0; i <= size; i++) {
      if (buckets[i] != null){
         System.out.println("bucket["+i+"]="+buckets[i]);
      }

   }
}
