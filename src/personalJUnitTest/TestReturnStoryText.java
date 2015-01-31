package personalJUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestReturnStoryText {

	@Test
	public void testReturnStory() {
		StoryText story = new StoryText();
		String currentText = story.readStoryText();
		assertEquals("Hello", currentText);
	}

}
