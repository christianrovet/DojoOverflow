package com.christian.overflow.services;

import java.util.*;
import org.springframework.stereotype.Service;

import com.christian.overflow.models.*;
import com.christian.overflow.respositories.*;

@Service
public class TagService {
	private static TagRepository tagRepo;

	public TagService(TagRepository tagRepo) {
		this.tagRepo = tagRepo;
	}

	public Tag create(Tag newTag) {
		return tagRepo.save(newTag);
	}

	public List<Tag> getTags() {
		return (List<Tag>) tagRepo.findAll();
	}

	public Tag getTag(Long id) {
		Optional<Tag> tag = tagRepo.findById(id);
		return tag.isPresent() ? tag.get() : null;
	}

	public Tag saveTag(Tag tag) {
		return tagRepo.save(tag);
	}
}
