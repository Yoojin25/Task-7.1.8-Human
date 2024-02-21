package org.example;

import lombok.*;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("John", "Smith");
        System.out.println(human);
    }
}
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
class Human {
    String firstName;
    String lastName;
}