import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class TextAnalyzerTest
{
    @Test
    public void getWordsTest()
    {
        TextAnalyzer textAnalyzer = new TextAnalyzer("a b a");
        ArrayList<String> words = textAnalyzer.getWords();
        String[] actualWords = new String[words.size()];
        words.toArray(actualWords);
        String[] expectedWords = {"a", "b", "a"};
        Assert.assertArrayEquals(expectedWords, actualWords);
    }

    @Test
    public void getMostFrequentWordTest()
    {
        TextAnalyzer textAnalyzer = new TextAnalyzer("a b a");
        String actualWord = textAnalyzer.getMostFrequentWord();
        String expectedWord = "a";
        Assert.assertEquals(expectedWord, actualWord);
    }

    @Test(expected = NullPointerException.class)
    public void getWordsTestException()
    {
        TextAnalyzer textAnalyzer = new TextAnalyzer(null);
        textAnalyzer.getWords();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getMostFrequentWordTestException1()
    {
        TextAnalyzer textAnalyzer = new TextAnalyzer("");
        textAnalyzer.getMostFrequentWord();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void getMostFrequentWordTestException2()
    {
        TextAnalyzer textAnalyzer = new TextAnalyzer("2000 - 2018");
        textAnalyzer.getMostFrequentWord();
    }
}
