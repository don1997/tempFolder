package activity3;

public class Course {
	
	 private String courseNo;
	 private String title;
	 
	 /* Default Credit */
	 private int credit = 3;
	 
	/**
     * Class Constructor
     * @param courseNo, title
     */
    public Course(String courseNo, String title) {
		this.courseNo = courseNo;
		this.title = title;
	}

    /**
     * Class Constructor
     * @param coureNo, title, credit
     */
	public Course(String courseNo, String title, int credit) {
		this.courseNo = courseNo;
		this.title = title;
		this.credit = credit;
	}
	
	/*
     * Getter for courseNo
     * @return courseNo
     */
	public String getCourseNo() {
		 return courseNo;
	}
    
    /*
     * Getter for title
     * @return title
     */
	public String getTitle() {
		return title;
	}

    /*
     * Getter for credit 
     * @return credit
     */
	public int getCredit() {
		return credit;
	}
	

    /*
     * Setter for title instance
     */
	public void setTitle(String newTitle) {
		this.title = newTitle;
	}

    /* 
     * Setter for credit instance
     */
	public void setCredit(int newCredit) {
		this.credit = newCredit;
	}
	
	/*
     * Override toString 
     * 
     * @return String
     */
	public String toString() {
		return this.courseNo + " - " + this.title + "(" + this.credit + ")"; 
	}

    /*
     *Void Method
     *Prints out student info 
     */
	public void printInfo() {
		System.out.println(this.courseNo + " - " + this.title);
	}

}



