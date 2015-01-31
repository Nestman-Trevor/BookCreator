package personalJUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestIsStoryTextEmpty {

	@Test
	public void storyTextEmptyTest() {
		StoryText storyWords = new StoryText();
		boolean isEmpty = storyWords.isStoryTextListEmpty();
		assertTrue(isEmpty);
	}

}
