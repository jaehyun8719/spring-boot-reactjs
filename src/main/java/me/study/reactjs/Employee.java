package me.study.reactjs;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author : jaehyun
 * <p>
 * Date: 2019-09-03
 * Copyright(©) 2019 by jaehyun.
 */
@Entity
@Getter @Setter @ToString
@EqualsAndHashCode @NoArgsConstructor
public class Employee {

    private @Id @GeneratedValue Long id;
    private String firstName;
    private String lastName;
    private String description;

    public Employee(String firstName, String lastName, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
    }

}
