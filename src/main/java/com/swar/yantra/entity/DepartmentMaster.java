package com.swar.yantra.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name= "DepartmentMaster")
public class DepartmentMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="departmentId")
    private Integer departmentId;

    @Column(name="departmentName")
    private String departmentName;

    @Column(name="departmentHOD")
    private String departmentHOD;

    @Column(name="type")
    private String type;

    @Column(name="cat")
    private String cat;
}
