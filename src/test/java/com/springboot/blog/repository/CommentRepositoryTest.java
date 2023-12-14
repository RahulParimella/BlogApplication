//package com.springboot.blog.repository;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertNotNull;
//
//import java.util.List;
//import java.util.Optional;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//
//import com.springboot.blog.entity.Comment;
//
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//public class CommentRepositoryTest {
//	@Autowired
//	private CommentRepository commentRepository;
//	
//	//every test cases is divided in to 3 parts Arrange,Act,Assert
////	@Test
////	void save() {
////		//Arrange
////		Comment commenttObj =new Comment();
////		commenttObj.setId(1L);
////		commenttObj.setBody("commentBody1");
////		commenttObj.setEmail("comment1@gmail.com");
////		commenttObj.setName("commentName");
////		//commenttObj.setPost("Post1");
////	
////		//Act
////		Comment newComment =commentRepository.save(commenttObj);
////		
////		//Assert
////		assertNotNull(newComment);
////		assertThat( newComment.getId()==commenttObj.getId());
////		
////	}
//	@Test
//	void getAllComments() {
//		Comment commenttObj =new Comment();
//		commenttObj.setId(1L);
//		commenttObj.setBody("commentBody1");
//		commenttObj.setEmail("comment1@gmail.com");
//		commenttObj.setName("commentName");
//	
//	
//		//Act
//		commentRepository.save(commenttObj);
//		
//		Comment commenttObj1 =new Comment();
//		commenttObj1.setId(1L);
//		commenttObj1.setBody("commentBody1");
//		commenttObj1.setEmail("comment1@gmail.com");
//		commenttObj1.setName("commentName");
//		//postObj.setComments("blogapplication comment");
//	
//		//Act
//		commentRepository.save(commenttObj1);
//		
//		//Act
//	List<Comment> list =commentRepository.findAll();
//
//	assertNotNull(list);
//	assertThat(list).isNotNull();
//	assertEquals(31, list.size());//27 records are there in database
//	}
//	
////	@Test
////	void getCommentById() {
////		Comment commenttObj =new Comment();
////		commenttObj.setId(1L);
////		commenttObj.setBody("commentBody1");
////		commenttObj.setEmail("comment1@gmail.com");
////		commenttObj.setName("commentName");
////		
////	
////		//Act
////		Optional<Comment> existingPost =commentRepository.findById(commenttObj.getId());
////		assertNotNull(existingPost);
////		assertThat(commenttObj.getName()==existingPost.get().getName());
////		
////	}
////	@Test
////	void updateComment() {
////		Comment commenttObj =new Comment();
////		commenttObj.setId(1L);
////		commenttObj.setBody("commentBody1");
////		commenttObj.setEmail("comment1@gmail.com");
////		commenttObj.setName("commentName");
////	
////		//Act
////		commentRepository.save(commenttObj);
////		Comment existingComment = commentRepository.findById(commenttObj.getId()).get();
////		existingComment.setName("updated comment name");
////		existingComment.setBody("updated comment body");
////		
////		Comment newComment=commentRepository.save(existingComment);
////		
////		assertEquals("updated comment body",newComment.getBody());
////		assertEquals("updated comment email",newComment.getEmail());
////		
////		assertEquals("comment name", newComment.getName());
////		
////	}
////	@Test
////	void deleteComment() {
////		Comment commenttObj =new Comment();
////		commenttObj.setId(1L);
////		commenttObj.setBody("commentBody1");
////		commenttObj.setEmail("comment1@gmail.com");
////		commenttObj.setName("commentName");
////	
////		//Act
////		commentRepository.save(commenttObj);
////		
////		Long id =commenttObj.getId();
////		
////		Comment commenttObj1 =new Comment();
////		commenttObj1.setId(1L);
////		commenttObj1.setBody("commentBody1");
////		commenttObj1.setEmail("comment1@gmail.com");
////		commenttObj1.setName("commentName");
////		
////		commentRepository.save(commenttObj1);
////		
////		commentRepository.delete(commenttObj1);
////		
////		Optional<Comment> existingPost = commentRepository.findById(id);
////		List<Comment> list =commentRepository.findAll();
////		
////		assertEquals(30, list.size());
////		assertThat(existingPost.isEmpty());
////	}
//}
