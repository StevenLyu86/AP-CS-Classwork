
public class Assessment {
    public String assessmentTitle;
    public int maxMark;
    
	public Assessment(String assessmentTitle, int maxMark) {
		this.assessmentTitle = assessmentTitle;
		this.maxMark = maxMark;
	}
    
	public void outputAssessmentDetails() {
		System.out.println("\nAssessment: "+assessmentTitle+"\nMax Marks: "+maxMark);
	}
}
