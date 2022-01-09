package collectionsqueue.vaccination;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Vaccination {
    public Queue<Integer> getVaccinationOrder(List<Person> personLIst) {
        PriorityQueue<Integer> result = new PriorityQueue<>();
        for (Person person : personLIst) {
            if (!(person.getAge() > 65) && !(person.getAge() < 18)) {
                result.add(person.getAge());
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Vaccination vaccination = new Vaccination();
        Queue<Integer> list = vaccination.getVaccinationOrder(List.of(new Person(6), new Person(26),
                new Person(36), new Person(66), new Person(55), new Person(30), new Person(40)));
        System.out.println(list);
        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list.poll());
        System.out.println(list.poll());
    }
}
