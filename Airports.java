import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Airports {
    //read the airline file and store it in a list.
    // return the list, say if its in values, and you type values[0], the first airline record should show
    public static ArrayList<String> readingAirport() {
        String path = "/Users/ab/Desktop/routes.csv"; // reading the file path

        String line; // variable that stores the data being read

        ArrayList<String>airportList = new ArrayList<>(); // storing arrays in a list

        try {
            BufferedReader br; // declaring
            br = new BufferedReader(new FileReader(path)); // assigning
            // to store array to form multidimensional array
            while ((line = br.readLine()) != null) {
                String[] values = line.split(","); // to store data read as an array
                airportList.add(Arrays.toString(values));
            }

        } catch (IOException ioException) { // Handling errors
            ioException.printStackTrace();
        }
        return airportList;
    }

    public static void gettingValues(){
        ArrayList<String> airport = readingAirport(); // calling readingAirlines to the variable airline
        String[] airportArray = new String[airport.size()]; // converting ArrayList to Array
        airport.toArray(airportArray);
        System.out.println(Arrays.toString(airportArray));
    }



    public static void main(String[] args) {
        gettingValues();
    }
}
