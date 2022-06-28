package ru.gb.dao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DaoApplication {
    // Домашнее задание:
    // 1. Заменить безопасность по ролям на безопасность по правам доступа
    // 2. * Сделать как роли, так и права доступа, у каждой роли свой набор прав
    public static void main(String[] args) {
        SpringApplication.run(DaoApplication.class, args);
    }

}
