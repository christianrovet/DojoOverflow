package com.christian.overflow.respositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.christian.overflow.models.Answer;

@Repository
public interface AnswerRepository extends CrudRepository<Answer, Long> {

}
