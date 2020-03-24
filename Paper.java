public class Paper {
    private String  PapersTitle,CourseCode,CourseIncharge,Semester,PrgaramName,TypeOfExam,Location;
    private int PaperIdNumber,NumberOfStudentInExam,day, month, year,hour,min,sec;
    private boolean PaperCollected;

    public Paper(String PapersTitle, String CourseCode, String CourseIncharge, String Semester, String PrgaramName, String TypeOfExam, String Location, int PaperIdNumber, int NumberOfStudentInExam, int day, int month, int year,int hour,int min,int sec, boolean PaperCollected) {
        this.PapersTitle = PapersTitle;
        this.CourseCode = CourseCode;
        this.CourseIncharge = CourseIncharge;
        this.Semester = Semester;
        this.PrgaramName = PrgaramName;
        this.TypeOfExam = TypeOfExam;
        this.Location = Location;
        this.PaperIdNumber = PaperIdNumber;
        this.NumberOfStudentInExam = NumberOfStudentInExam;
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour=hour;
        this.min=min;
        this.sec=sec;
        this.PaperCollected = PaperCollected;
    }

    public String getPapersTitle() {
        return PapersTitle;
    }

    public void setPapersTitle(String PapersTitle) {
        this.PapersTitle = PapersTitle;
    }

    public String getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(String CourseCode) {
        this.CourseCode = CourseCode;
    }

    public String getCourseIncharge() {
        return CourseIncharge;
    }

    public void setCourseIncharge(String CourseIncharge) {
        this.CourseIncharge = CourseIncharge;
    }

    public String getSemester() {
        return Semester;
    }

    public void setSemester(String Semester) {
        this.Semester = Semester;
    }

    public String getPrgaramName() {
        return PrgaramName;
    }

    public void setPrgaramName(String PrgaramName) {
        this.PrgaramName = PrgaramName;
    }

    public String getTypeOfExam() {
        return TypeOfExam;
    }

    public void setTypeOfExam(String TypeOfExam) {
        this.TypeOfExam = TypeOfExam;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public int getPaperIdNumber() {
        return PaperIdNumber;
    }

    public void setPaperIdNumber(int PaperIdNumber) {
        this.PaperIdNumber = PaperIdNumber;
    }

    public int getNumberOfStudentInExam() {
        return NumberOfStudentInExam;
    }

    public void setNumberOfStudentInExam(int NumberOfStudentInExam) {
        this.NumberOfStudentInExam = NumberOfStudentInExam;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int day,int month,int year) {
        this.day=day;
        this.month=month;
        this.year = year;
    }   
    public void setTime(int hour,int min,int sec) {
        this.hour=hour;
        this.min=min;
        this.sec = sec;
    }
    public int getHour() {
        return hour;
    }

    public int getMin() {
        return min;
    }

    public int getSec() {
        return sec;
    }
    public boolean isPaperCollected() {
        return PaperCollected;
    }

    public void setPaperCollected(boolean PaperCollected) {
        this.PaperCollected = PaperCollected;
    }

    public String toString() {
        return "Paper:\t{" + "Paper's Title=" + PapersTitle + ", \tCourse Code=" + CourseCode + ", \tCourse Incharge=" + CourseIncharge + ", \tSemester=" + Semester + ", \tPrgaram Name=" + PrgaramName + ", \tType Of Exam=" + TypeOfExam + ", \tLocation=" + Location + ", \tPaper IdNumber=" + PaperIdNumber + ", \tNumber Of Student In Exam=" + NumberOfStudentInExam + ", \tdate=" + day + "/" + month + "/" + year + ",\ttime=" + hour + ":" + min + ":" + sec+", \tPaperCollected=" + PaperCollected + '}';
    }
    
    
}
