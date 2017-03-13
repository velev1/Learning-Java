/*
You are manager on a vehicle park. Your job is to sell cars and give reports to the accounting. 
You will be given all vehicles that are available for selling in format like the example below:
c2 c4 v10 v20 b50
Each car is described by vehicle type (single character ‘b’, ‘c’ or ‘v’) and number of seats in the vehicle (natural number). 
For example, “c4” means car with 4 seats, “b50” means bus with 50 seats and “v10” means van with 10 seats.
You need to process a sequence of incoming requests. Each request holds type of vehicle and number of seats in the following format:
Car with 4 seats
Bus with 20 seats
…
If you have vehicle that matches the description of the desired vehicle, you should sell it, otherwise print “No”.
The price is calculated as а product of the character ASCII code and the number of seats.
For example, the price for “c4” (car with 4 seats), will be calculated as 99(‘c’) * 4 = 396.
If there are 2 or more matching vehicles you should sell the leftmost one.
After you run out of customers, you need to print the vehicles that you didn’t sell and the count of sold vehicles.

Input
The input data should be read from the console.
•	On the first input line, you will receive all vehicles in the park, separated with single whitespace.
•	On the next lines, you will receive requests for vehicles in the following format:
“{Vehicle Type} with {Number of seats} seats”
until you receive “End of customers!”
The input data will always be valid and in the format described. There is no need to check it explicitly.

Output
The output should consist of:
•	For each vehicle request you either need to print:
    o	“Yes, sold for {price}$” – if the wanted vehicle is available in the park.
    o	“No” – if there is no such vehicle in the vehicle park.
•	After you stop receiving request, you need to print two lines:
    o	On the first line, you need to print the remaining vehicles in the format: 
        “Vehicles left: x1, x2, x3…”
    o	On the second line, you need to print the total number of vehicles sold in the following format: “Vehicles sold: x1, x2, x3…”

Constraints
•	The number of vehicles will be in range [0 – 10,000].
•	The amount of request for vehicles will be in range [0 – 10,000].
•	The number of seats for each vehicle will be in range [1 – 10,000].
•	The vehicle type can only be one of the following Car – c; Bus – b; Van – v;
•	Allowed working time for your program: 0.1 seconds. Allowed memory: 16 MB.

 */
package JavaSyntax;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Iliya Velev <velev_bg@mail.bg>
 */
public class VehiclePark {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> vehicle = new ArrayList<String>();

        String[] input = sc.nextLine().split(" ");

        for (int i = 0; i < input.length; i++) {

            vehicle.add(input[i]);
        }
        int vehiclesInitialCount = vehicle.size();
        StringBuilder output = new StringBuilder();
        String crrVehiclecontainer = "";
        String extractedVehicleType = "";

        while (true) {

            crrVehiclecontainer = sc.nextLine();
            if (crrVehiclecontainer.equals("End of customers!")) {

                //print some stuff
                System.out.printf("%s",output.toString());
                System.out.printf("Vehicles left: %s\n", String.join(", ", vehicle));
                System.out.printf("Vehicles sold: %s\n", vehiclesInitialCount - vehicle.size());
                break;
            }

            extractedVehicleType = vehicleTypeExtractor(crrVehiclecontainer);

            output.append(priceOutput(vehicle, extractedVehicleType));
            
            vehicle.remove(extractedVehicleType);
        }
    }

    public static String priceOutput(List<String> vehicles, String vehicle) {

        String result = "";
        int index = vehicles.indexOf(vehicle);

        if (index < 0) {
            result = "No\n";
        } else {
            int numberOfSeats = Integer.parseInt(vehicle.substring(1));
            int price = vehicle.charAt(0) * numberOfSeats;

            result = "Yes, sold for " + price + "$\n";
        }

        return result;
    }

    public static String vehicleTypeExtractor(String text) {

        String result = "";
        text = text.toLowerCase();
        String[] wordsInText = text.split(" ");

        result += wordsInText[0].charAt(0);
        result += wordsInText[2];

        return result;
    }
}
