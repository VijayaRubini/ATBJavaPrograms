package May2024.hw_11052024.MiniProject;

public class Course {

    String courseName; //Automation Testing with Java, ATB with Python, Manual Testing
    String courseDuration; //4 months or 6 months
    String courseMode= "Online"; //online/offline

    public Course(String courseName, String courseDuration, String courseMode) {
        this.courseName = courseName;
        this.courseDuration = courseDuration;
        courseMode = courseMode;
    }

    void printCourseDetails(){
        System.out.println("Course Name  : "+this.courseName);
        System.out.println("Course Duration  : "+this.courseDuration);
        System.out.println("Course Mode  : "+courseMode);
    }
}
