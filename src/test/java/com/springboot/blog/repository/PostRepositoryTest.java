package com.springboot.blog.repository;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.springboot.blog.entity.Post;


@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class PostRepositoryTest {
	
	@Autowired
	private PostRepository postRepository;
	
	//every test cases is divided in to 3 parts Arrange,Act,Assert
	@Test
	void save() {
		//Arrange
		Post postObj =new Post();
		
		postObj.setDescription("blogapplication description");
		postObj.setContent("blogapplication content");
		postObj.setTitle("blogapplication title");
		//postObj.setComments("blogapplication comment");
	
		//Act
		Post newPost =postRepository.save(postObj);
		
		//Assert
		assertNotNull(newPost);
		assertThat(newPost.getId()==postObj.getId());
		
	}
	@Test
	void getAllPosts() {
		Post postObj =new Post();
		
		postObj.setDescription("blogapplication description");
		postObj.setContent("blogapplication content");
		postObj.setTitle("blogapplication title");
		//postObj.setComments("blogapplication comment");
	
		//Act
		postRepository.save(postObj);
		
		Post postObj1 =new Post();
		postObj1.setDescription("blogapplication description2");
		postObj1.setContent("blogapplication content2");
		postObj1.setTitle("blogapplication title2");
		//postObj.setComments("blogapplication comment");
		postRepository.save(postObj1);
		//Act
	List<Post> list =postRepository.findAll();

	assertNotNull(list);
	assertThat(list).isNotNull();
	assertEquals(31, list.size());//27 records are there in database
	}
	
	@Test
	void getPostById() {
		Post postObj =new Post();
		postObj.setId(1L);
		postObj.setDescription("blogapplication description");
		postObj.setContent("blogapplication content");
		postObj.setTitle("blogapplication title");
		//postObj.setComments("blogapplication comment");
	
		//Act
		Optional<Post> existingPost =postRepository.findById(postObj.getId());
		assertNotNull(existingPost);
		assertThat(postObj.getTitle()==existingPost.get().getTitle());
		
	}
	@Test
	void updatePost() {
Post postObj =new Post();
		
		postObj.setDescription("blogapplication description");
		postObj.setContent("blogapplication content");
		postObj.setTitle("blogapplication title");
		//postObj.setComments("blogapplication comment");
	
		//Act
		postRepository.save(postObj);
		Post existingPost = postRepository.findById(postObj.getId()).get();
		existingPost.setContent("updated blogapplication content");
		existingPost.setTitle("updated blogapplication title");
		
		Post newPost=postRepository.save(existingPost);
		
		assertEquals("updated blogapplication content",newPost.getContent());
		assertEquals("updated blogapplication title",newPost.getTitle());
		
		assertEquals("blogapplication description", newPost.getDescription());
		
	}
	@Test
	void deletePost() {
Post postObj =new Post();
		
		postObj.setDescription("blogapplication description");
		postObj.setContent("blogapplication content");
		postObj.setTitle("blogapplication title");
		//postObj.setComments("blogapplication comment");
	
		//Act
		postRepository.save(postObj);
		
		Long id =postObj.getId();
		
		Post postObj1 =new Post();
		postObj1.setDescription("blogapplication description2");
		postObj1.setContent("blogapplication content2");
		postObj1.setTitle("blogapplication title2");
		//postObj.setComments("blogapplication comment");
		postRepository.save(postObj1);
		
		postRepository.delete(postObj);
		
		Optional<Post> existingPost = postRepository.findById(id);
		List<Post> list =postRepository.findAll();
		
		assertEquals(30, list.size());
		assertThat(existingPost.isEmpty());
	}
}
