package com.example.capstone3.Repository;

import com.example.capstone3.Model.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorRepository extends JpaRepository<Instructor, Integer> {

    Instructor findInstructorById(Integer id);

}
