package JavaProgrames;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */

public class StationNames {

    public static void main(String[] args) {
        londonStation();




    }

    public static void londonStation(){
        Map<String, String[]> stationLines = new HashMap<>();


        stationLines.put("Baker Street", new String[]{"Bakerloo", "Circle", "Hammersmith & City", "Jubilee"});
        stationLines.put("Oxford Circus", new String[]{"Bakerloo", "Central", "Victoria"});
        stationLines.put("Victoria", new String[]{"Victoria", "Circle", "District"});
        stationLines.put("Liverpool Street", new String[]{"Central", "Circle", "Hammersmith & City", "Metropolitan"});
        stationLines.put("King's Cross", new String[]{"Northern", "Victoria", "Piccadilly", "Hammersmith & City"});
        stationLines.put("London Bridge", new String[]{"Jubilee", "Northern"});
        stationLines.put("Waterloo", new String[]{"Bakerloo", "Jubilee", "Northern"});
        stationLines.put("Paddington", new String[]{"Bakerloo", "Circle", "District", "Hammersmith & City"});
        stationLines.put("Piccadilly Circus", new String[]{"Bakerloo", "Piccadilly"});
        stationLines.put("Euston", new String[]{"Victoria", "Northern"});


        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter a zone 1 station name to find out which lines pass through it: ");

        String station = scanner.nextLine().trim();


        if(stationLines.containsKey(station)){
            String[] lines = stationLines.get(station);
            System.out.println("The following lines pass through " + station + ":");
            for (String line : lines){
                System.out.println(" - " + line);
            }
        }else {
            System.out.println("Station not found. Please make sure you entered A zone 1 station");
        }
        scanner.close();





    }
}
