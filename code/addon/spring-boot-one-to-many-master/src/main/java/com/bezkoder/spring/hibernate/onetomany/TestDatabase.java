package com.bezkoder.spring.hibernate.onetomany;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.bezkoder.spring.hibernate.onetomany.model.Comment;
import com.bezkoder.spring.hibernate.onetomany.model.Tutorial;
import com.bezkoder.spring.hibernate.onetomany.repository.CommentRepository;
import com.bezkoder.spring.hibernate.onetomany.repository.TutorialRepository;

@SpringBootApplication
public class TestDatabase implements CommandLineRunner {

	public static void main(String[] args) {
		
		SpringApplication.run(TestDatabase.class, args);
	}
	
	  @Autowired
	  private TutorialRepository tutorialRepository;

	  @Autowired
	  private CommentRepository commentRepository;
	
	
	
	  
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		
		//adding logic for comment
		Tutorial tutorial = tutorialRepository.findById(1L).get();
		/*
		 * 
		 * 
		 * Adding logic for tutorial
		Tutorial _tutorial = 
				tutorialRepository.save
				(new Tutorial(tutorial.getTitle(), tutorial.getDescription(), true));
		*/
		System.out.println("added successfully");
		
		
		/*
		Comment comment =new Comment();
		comment.setContent("decent enough book");
		comment.setTutorial(tutorial);
		commentRepository.save(comment);
		*/
		
		
		
		
		//getting all comments from the tutorial.
		// single select for comment.
		List<Comment> findAll = commentRepository.findAll();
		findAll.stream().forEach(e->System.out.println(e.getContent() +  "  " + e.getTutorial().getTitle()));		
		
		
		
		
		
	
		
		      
		     		


	}

}
