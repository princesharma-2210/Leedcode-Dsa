import java.util.*;
public class makeObject{
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name,int rank){
            this.name=name;
            this.rank= rank;
        }
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }
    }
    public static void main(String[] args){
        PriorityQueue<Student> pq= new PriorityQueue<>();
        pq.add(new Student("Prashant", 2));
        pq.add(new Student("Anup", 3));
        pq.add(new Student("Prince", 1));
        while(!pq.isEmpty()){
        System.out.println(pq.peek().name+" "+pq.peek().rank);
        pq.remove();
        }
    }
}