public class ExamManagementSystem {

    public static void main(String[] args) {

        Paper p1=new Paper("Object Orianted Programming","CS103","Sir Ali Zaib","2nd","BS CS","Annual"," dept IIT room no 8 ",123,160,7,4,2020,8,30,0,false);
        
        Paper p2=new Paper("Discrete Math","MT203","Miss Shemyla Batool","2nd","BS CS","Annual"," dept IIT room no 8",123,160,8,4,2020,8,30,0,false);
        
        Paper p3=new Paper("English","ENG151","Sir Nasar Khan","2nd","BS CS","Annual"," dept IIT room no 8",123,160,9,4,2020,8,30,0,false);
        
	System.out.println();
        System.out.println(p1.toString());

	System.out.println();
        System.out.println(p2.toString());

	System.out.println();
        System.out.println(p3.toString());
        
	System.out.println("\n");
        System.out.println(p1.toString()+new Course("java","CS101","MCS"));
	System.out.println();
        System.out.println(p2.toString()+new Course("Math","CS102","MSC"));
	System.out.println();
        System.out.println(p3.toString()+new Course("English","CS201","BS CS"));
    }
    
}
