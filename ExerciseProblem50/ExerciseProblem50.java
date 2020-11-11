package ExerciseProblem50;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author : 62701
 * @Title :
 * @Description :
 * @date : 2020-10-18 20:50
 * @since : 1.0.0
 **/

public class ExerciseProblem50 {
    public static class Person implements Comparable<Person> {
        int id;
        int age;
        int sex;

        public Person() {
        }


        public Person(int id, int age, int sex) {
            this.id = id;
            this.age = age;
            this.sex = sex;
        }

        public int getId() {
            return id;
        }

        public int getAge() {
            return age;
        }

        public int getSex() {
            return sex;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        @Override
        public int compareTo(Person person) {
            //从大到小的顺序
            if (sex < person.sex) {
                return 1;
            } else if (sex > person.sex) {
                return -1;
            } else if (this.sex == person.sex) {
                if (age < person.age) {
                    return 1;
                } else {
                    return -1;
                }
            }
            return 0;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    '}';
        }
    }

    public static void main(String[] args) {
        ArrayList<Person> mans = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        // 输入编号
        String id = sc.nextLine();
        String[] ids = id.split(" ");
        int length = ids.length;
        // 输入性别
        String sex = sc.nextLine();
        String[] sexes = sex.split(" ");
        // 输入年龄
        String age = sc.nextLine();
        String[] ages = age.split(" ");
        for (int i = 0; i < length; i++) {
            Person person = new Person();
            if ("1".equals(sexes[i])) {
                person.sex = 1;
            } else {
                person.sex = 0;
            }
            person.id = i + 1;
            person.age = Integer.parseInt(ages[i]);
            mans.add(person);
        }
        Collections.sort(mans);
        System.out.println(mans);
    }
}
