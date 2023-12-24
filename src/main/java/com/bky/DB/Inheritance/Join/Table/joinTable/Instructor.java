package com.bky.DB.Inheritance.Join.Table.joinTable;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Instructor extends EcomUser{
    private String batchName;

}
