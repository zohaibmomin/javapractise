package in.com.challengeVarArgsCollections;

import in.com.CollectionInterfaces.CIUtility;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentPriorityQueue {
    private static class Student{
        private final String name;
        private final char grade;

        private Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return name + " " + grade;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> students = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGrade() - o2.getGrade();
            }
        });

        students.offer(new Student("Zohaib", 'B'));
        students.offer(new Student("Nazia", 'C'));
        students.offer(new Student("Nazia", 'A'));
        students.offer(new Student("jeha", 'D'));
        students.offer(new Student("Vikki", 'A'));

//        CIUtility.print(students);
//        System.out.printf("Queue is %s", students);

        //VERY important concept for priority Queue
        // Only when removing the Queue adjusts itself as per priority.
        // so it does not keep already sorted in priority order.

        System.out.printf("Got %s \n",students.poll());
        System.out.printf("Got %s \n",students.poll());
        System.out.printf("Got %s \n",students.poll());
        System.out.printf("Got %s \n",students.poll());
        System.out.printf("Got %s \n",students.poll());
    }

}
