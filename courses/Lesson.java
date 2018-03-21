
public class Lesson {
    public String lessonTitle;
    public int durationMinutes;
    public boolean requiresLab;
    
	public Lesson(String lessonTitle, int durationMinutes, boolean requireLab) {
		this.lessonTitle = lessonTitle;
		this.durationMinutes = durationMinutes;
		this.requiresLab = requireLab;
	}
	
	public void outputLessonDetails() {
		System.out.println("\nTitle:"+lessonTitle+"\nMin: "+durationMinutes+"\nRequiresLab: "+requiresLab);
	}
}
