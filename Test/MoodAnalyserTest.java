import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void testMoodAnalysisReturnSad () {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String mood = moodAnalyser.analyseMood();
        System.out.println(mood);
    }

    @Test
    public void testMoodAnalysisReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String mood = moodAnalyser.analyseMood();
        System.out.println(mood);
    }
}
