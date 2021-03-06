package CollectionsAssignment;

import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable<Person>{
     String name;
     int height;
     double weight;
public Person(String name, int height, double weight) {
    this.name = name;
    this.height = height;
    this.weight = weight;
}
public int compareTo(Person b) {
    if(weight>b.weight){
        return -1;
    }else if(weight<b.weight){
        return 1;
    }else{
    	return 0;
    }

}
}
public class Assignment3Q1 {
public static void main(String[] args) {
    Set<Person> set=new TreeSet<Person>();
    Person b1=new Person("Akash",8,59.5);
    Person b2=new Person("Puneet",6,57.4);
    Person b3=new Person("Jeet",7, 60.2);
    set.add(b1);
    set.add(b2);
    set.add(b3);

    for(Person b:set){
    System.out.println(b.name+" "+b.height+" "+b.weight);
    }
}
}
