package ru.gb.dao.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.gb.dao.entities.Privilege;

@Repository
public interface PrivilegeRepository extends CrudRepository<Privilege, Long> {
}

