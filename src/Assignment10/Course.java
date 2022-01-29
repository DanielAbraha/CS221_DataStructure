package Assignment10;

public class Course {

     private String cID;
     private String cName;
     private int creditHours;
     public Course(String cID, String cName, int creditHours) {
         this.cID = cID;
         this.cName = cName;
         this.creditHours = creditHours;
     }
     public String getCID() {
          return cID;
          }
           public String getCName() {
               return cName;
           }
           public int getCreditHours() {
          return creditHours;
           }

    @Override
    public String toString() {
        return "Course{" +
                "cID='" + cID + '\'' +
                ", cName='" + cName + '\'' +
                 +
                '}';
    }
}





