package com.neethu.DemoJPA.repository;

import com.neethu.DemoJPA.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
