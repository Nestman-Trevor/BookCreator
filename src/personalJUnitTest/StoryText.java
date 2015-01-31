package personalJUnitTest;

public class StoryText {
	private String storyTextList = "";
	
	public String addToText(String text)
	{
		storyTextList = storyTextList.concat(text);
		return storyTextList;
	}
	
	public boolean isStoryTextListEmpty()
	{
		if(storyTextList.isEmpty())
			return true;
		else
			return false;
	}
	public String readStoryText()
	{
		return storyTextList;
	}
}
