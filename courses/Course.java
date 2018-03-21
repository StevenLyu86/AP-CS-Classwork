import java.util.ArrayList;

public class Course {
	  public String courseTitle;
	  public int maxStudent,lessons;
	  public ArrayList<Lesson> courseLesson;
	  public Assessment courseAssessment;
	  
	public Course(String courseTitle, int maxStudent, int lessons) {
		this.courseTitle = courseTitle;
		this.maxStudent = maxStudent;
		this.lessons = lessons;
	}
	
	public void addLesson(String lessonTitle, int durationMinutes, boolean requiresLab) {
      if(courseLesson.size()<=50)
    	  	courseLesson.add(new Lesson(lessonTitle, durationMinutes, requiresLab));
  	}
  
	public void addAssessment(String assessmentTitle,int maxMarks) {
		courseAssessment=new Assessment(assessmentTitle,maxMarks);
	}
	
	public void outputCourseDetails() {
		System.out.println("\nCourse: "+courseTitle+"\nMax Students: "+maxStudent);
		System.out.println("Lessons: ");
		for(int i=0;i<courseLesson.size();i++) {
			Lesson l=courseLesson.get(i);
	            l.outputLessonDetails();
	    		}
		System.out.println("Assessment: ");
		this.courseAssessment.outputAssessmentDetails();
	}
	
	public static void main(String[] args) {
		Course cs=new Course("Computer Science",40,10);
	    	cs.addAssessment("Project1", 100);	
	    	cs.addAssessment("Project2", 80);
	    	cs.addLesson("Interface", 40, false);
	    	cs.addLesson("Override", 40, false);
	    	cs.outputCourseDetails();
	}
}
