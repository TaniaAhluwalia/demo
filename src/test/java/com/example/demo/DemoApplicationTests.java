package com.example.demo;

import org.apache.tools.ant.taskdefs.Copy;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
 private CopyBookService copyService;
	private Copy copy;
	@Test
	void contextLoads() {
	}
	@Test
void fetchCopyByID_returnsBorgiaBrideForID83(){
		givenCopyDataAreAvailable();
		whenSearchCopyWithId83();
		thenReturnOneBorgiaBrideCopyForID83();
	}

	private void givenCopyDataAreAvailable() {
	}

	private void whenSearchCopyWithId83() {
		copy=copyService.fetchById(83);
	}

	private void thenReturnOneBorgiaBrideCopyForID83() {
		String description = copy.getDescription();
		assertEquals("The Borgia Bride", description);

	}
}
