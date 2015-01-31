package personalJUnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddToStory {

	@Test
	public void testAddToStory() {
		StoryText storyText = new StoryText();
		
		storyText.addToText("This is new.");
		String theText = storyText.readStoryText();
		assertEquals("This is new.", theText);
		
		storyText.addToText(" Oh hot dog.");
		assertEquals("This is new. Oh hot dog.",
				storyText.readStoryText());
	}

}
