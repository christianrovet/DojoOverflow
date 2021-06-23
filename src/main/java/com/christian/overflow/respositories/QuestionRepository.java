package com.christian.overflow.respositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.christian.overflow.models.Question;

@Repository
public interface QuestionRepository extends CrudRepository<Question, Long> {

}