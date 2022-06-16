import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void testMoodAnalysisReturnNullException () throws Exception{
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood();
        System.out.println(mood);
    }

    @Test
    public void testMoodAnalysisReturnHappy() throws Exception{
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood();
        System.out.println(mood);
    }
}
