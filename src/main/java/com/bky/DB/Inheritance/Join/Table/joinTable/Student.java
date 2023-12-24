package com.bky.DB.Inheritance.Join.Table.joinTable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Student extends EcomUser{
    private double psp;
    private double instructor_rating;
}
