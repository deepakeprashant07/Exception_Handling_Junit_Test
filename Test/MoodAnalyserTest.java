import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void testMoodAnalysisReturnSad () {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in Sad Mood");
        System.out.println(mood);
    }

    @Test
    public void testMoodAnalysisReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in Any Mood");
        System.out.println(mood);
    }
}
