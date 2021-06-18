package com.shorelight.studentportal.repository;

import com.shorelight.studentportal.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
