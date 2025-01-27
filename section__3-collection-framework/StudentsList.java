/*
 * Manageable operations involing student names
 * Supported operations
 * 1. Insertion
 * 2. searching
 * 3. display
 * 4. deletion
 */

import java.util.ArrayList;

public class StudentsList{

    public ArrayList<String> create(){

        ArrayList<String> list = new ArrayList<>();

        return list;
    }
    public void insert(ArrayList<String> list, int index, String element){

        // get the list and add element at specified index
        list.add(index, element);
        
    }

    public void addAtEnd(ArrayList<String> list, String element){

        // get the list and add element at the end
        list.add(element);
    }

    /*
     * @param index: the index of the element to be removed
     * 
     * @returns element that is removed.
     * 
     * @throws IndexOutOfBoundsException
     */
    public void remove(ArrayList<String> list, int index){

        // remove the element from the end
        list.remove(index);
    }

    public void display(ArrayList<String> list){

        System.out.println("List of Students: ");
        for(String name: list){
            System.out.print(name + ", ");
        }
        System.out.println();
    }

    // Entrypoint of code execution, input parameters, method invoking
    public static void main(String[] args) {
        
        // create the class instance
        StudentsList sl = new StudentsList();

        // create a new a list 
        ArrayList<String> list = sl.create();

        // adding element to the list
        list.add("Ankit Asati");
        list.add("Rajbhaan Singh");
        list.add("Prashant Chaturvedi");

        // showing the list of students
        sl.display(list);
        

    }

}