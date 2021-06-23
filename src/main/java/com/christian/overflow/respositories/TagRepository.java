package com.christian.overflow.respositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.christian.overflow.models.Tag;

@Repository
public interface TagRepository extends CrudRepository<Tag, Long> {
	Optional<Tag> findTagByTag(String tag);
}