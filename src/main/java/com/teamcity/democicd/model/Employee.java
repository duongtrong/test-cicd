package com.teamcity.democicd.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * demo-cicd
 *
 * @author duongtrong
 * @version 1.0.0
 * @createdAt 30/04/2021 - 21:12
 * @createdBy duongtrong
 * @since 30/04/2021
 **/
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
}
