package ru.gb.dao.entities;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "privileges")
public class Privilege {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

}