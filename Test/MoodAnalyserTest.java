import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void testMoodAnalysis () {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in Sad Mood");
        System.out.println(mood);
    }
}
