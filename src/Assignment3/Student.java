package Assignment3;

public class Student {
    private int id;
    private String name;
    private int mark;

    public Student(int id, String name, int mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }

    public void displayStudent() {
        System.out.println("Id: " + id + " Name: " + name + " Mark: " + mark);

    }

    public int getId() {
        return id;
    }

    public int getMark() {
        return mark;
    }
}
    class StudentArray {
        private Student[] a; // reference to array
        private int nElems; // number of data items

        // constructor max is a capacity/length
        public StudentArray(int max) {
            a = new Student[max];         // create the array no items yet
            nElems = 0;
        }

        // get element at specified index
        public Student get(int index) {
            if (index < 0 || index > nElems) {
                return null;
            }
            return a[index];
        }

        public Student find(int id) {
            // find specified value
            int j;
            for (j = 0; j < nElems; j++)
                if (a[j].getId() == id)
                    break;                       // exit loop before end
            if (j == nElems)
                return null;
            else
                return a[j];
        }  // end find()

        //-------------------------------------------------------------- // put student into array at last
        // Duplicates of id not allowed. Make a check before inserting values
        public void insert(int id, String name, int mark) {
            boolean duplicateId = false;

            for (int i = 0; i < nElems; i++) {
                if (a[i].getId() == id)
                    duplicateId = true;
            }

            if (!duplicateId) {
                a[nElems] = new Student(id, name, mark);
                nElems++; // values
            }
        }

        //--------------------------------------------------------------
        // delete student from array
        public boolean delete(int id) {
            int j;
            for (j = 0; j < nElems; j++)
                if (a[j].getId() == id)
                    break;
            if (j == nElems)
                return false;
            else {
                for (int k = j; k < nElems; k++)
                    a[k] = a[k + 1];
                nElems--;                       // decrement size
                return true;
            }
        }  // end delete()

        //--------------------------------------------------------------
        // displays array contents
        public void displayAll() {
            for (int j = 0; j < nElems; j++)       // for each element,
                a[j].displayStudent();          // display it
        }
//--------------------------------------------------------------

        // end class StudentArray
        ////////////////////////////////////////////////////////////////
        public static void main(String[] args) {

            // Create an object for StudentArray and invoke all the methods
            StudentArray stda = new StudentArray(15);
            stda.insert(111, "Patty", 76);
            stda.insert(112, "Lorraine", 65);
            stda.insert(113, "Tom", 87);
            stda.insert(114, "Henry", 96);
            stda.insert(115, "Sato", 70);
            stda.insert(116, "Jose", 69);
            stda.insert(117, "Minh", 89);
            stda.insert(118, "Lucinda", 48);
            System.out.println("------- Student lists with ID, name and mark ---------");
            stda.displayAll();
            System.out.println("----------------------- ***** ------------------------");
            int searchKey = 114;  // search for item
            Student found;
            found = stda.find(searchKey);
            if(found != null){

                System.out.print("Student Found ");
                found.displayStudent();
            }
            else {
                System.out.println("Can't find a student with id of " + searchKey);
            }
            System.out.println("----------------------- ***** ------------------------");
            // Inserting students with their id and without duplicates
            System.out.println("List after inserting new student: ");
            stda.insert(121, "Harry", 66);
            stda.displayAll();
            System.out.println("----------------------- ***** ------------------------");
            // // delete students by their id
            System.out.println("Deleting Tom, Sato, and Smith: ");
            stda.delete(113);
            stda.delete(115);
            stda.delete(120);
            System.out.println("List after deletion of three students: ");
            stda.displayAll();
            System.out.println("----------------------- ***** ------------------------");

            // Find the student who got Maximum and Minimum Mark
            // Find Maximum Mark
            int max = stda.get(0).getMark();
            for (int i = 1; i < stda.nElems; i++) {
                if (stda.get(i).getMark() > max)
                    max = stda.get(i).getMark();
            }
            //System.out.println("Student who got minimum mark is:max"); //prints max mark

            // Find the Minimum Mark
            int min = stda.get(0).getMark();
            for (int i = 1; i < stda.nElems; i++) {
                if (stda.get(i).getMark() < min)
                    min = stda.get(i).getMark();
            }
            //System.out.println("Student who got minimum mark is:min"); this prints only min mark

            // Displaying the student who got minimum and maximum mark
            for (int j = 0; j < stda.nElems; j++) {
                if (stda.get(j).getMark() == min) {
                    System.out.println("Student who got minimum mark is:");
                    stda.get(j).displayStudent();
                } else if (stda.get(j).getMark() == max) {
                    System.out.println("Student who got maximum mark is:");
                    stda.get(j).displayStudent();
                }
            }

        } // end main()


    } // end class Student array


