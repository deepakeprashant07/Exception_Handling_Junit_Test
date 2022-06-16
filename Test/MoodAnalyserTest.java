import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void testMoodAnalysis () {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("Happy or Sad");
        System.out.println(mood);
    }
}
