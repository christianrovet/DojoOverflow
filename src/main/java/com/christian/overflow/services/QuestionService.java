package com.christian.overflow.services;

import java.util.*;
import org.springframework.stereotype.Service;

import com.christian.overflow.models.*;
import com.christian.overflow.respositories.*;

@Service
public class QuestionService {
	private static QuestionRepository questionRepo;
	private static TagRepository tagRepo;

	public QuestionService(QuestionRepository questionRepo, TagRepository tagRepo) {
		this.questionRepo = questionRepo;
		this.tagRepo = tagRepo;
	}

	public Question create(Question newQuestion) {
		return questionRepo.save(newQuestion);
	}

	public List<Question> getQuestions() {
		return (List<Question>) questionRepo.findAll();
	}

	public Question getQuestion(Long id) {
		Optional<Question> question = questionRepo.findById(id);
		return question.isPresent() ? question.get() : null;
	}

	public Question saveQuestion(Question question) {
		return questionRepo.save(question);
	}

	public Tag createOrRetreive(String tagName) {
		Optional<Tag> mightExist = tagRepo.findTagByTag(tagName);
		if (mightExist.isPresent()) {
			return mightExist.get();
		} else {
			return tagRepo.save(new Tag());
		}
	}

	public Question CreateQuestionWithTags(Question newQuestionPlus) {
		List<Tag> tag = new ArrayList<Tag>();
		for (String tagName : newQuestionPlus.getTagInput().split(",")) {
			tag.add(createOrRetreive(tagName));
		}
		newQuestionPlus.setTags(tag);
		return questionRepo.save(newQuestionPlus);
	}
}
