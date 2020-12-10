import Controller.RosterController;
import Model.CourseClass;
import Model.StudentClass;
import View.RosterClass;

public class MVCDemo {
	 public static void main(String[] args) {
		//fetch student record based on his roll no from the database
         CourseClass model  = retriveCourseFromDatabase();
         StudentClass model1 =  retriveStudentFromDatabase();

         //Create a view : to write Student details on console
         RosterClass view = new RosterClass();

         RosterController controller = new RosterController(model, model1, view);

         controller.updateView();

         //update model data
         controller.setCourseTitle("Python");
         System.out.println("After updating, Course Details are as follows");

         controller.updateView();
      }

      private static CourseClass retriveCourseFromDatabase(){
         CourseClass course = new CourseClass();
         course.setCourseTitle("Java");
         course.setCourseId("101");
         return course;
      }
      private static StudentClass retriveStudentFromDatabase(){
          StudentClass student = new StudentClass();
          student.setStudentName("Mike");
          student.setStudentId("1");
          return student;
       }
}
