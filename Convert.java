/*
    Naval Sharma
    A00241484
    This program makes these conversions:

    Km to Miles
    CM to Inches
    kg to lbs
    grams to ounces
    cups to litres
    celsius to fahrenheit

    The program can make conversions in either direction,ie the user can enter
    km or mi. User is asked for the value and the unit of measure as inputs ..
*/


import java.util.*;
public class Convert
{
	public static void main(String[] args) {

		double inputVal = 0.0;
		String inputUnit = "";

    // get the input from the user
    Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value to Convert");

    try{
		inputVal = sc.nextDouble();
    sc.nextLine();
    }
    catch (InputMismatchException e) {
            System.out.println("Invalid Input. need a numeric value");
            return;
            // sc.next();
        }

    // get the unit to onvert from the user


		System.out.println("Enter current unit of measure");
		inputUnit = sc.nextLine();
    inputUnit = inputUnit.toUpperCase();

		double convertedVal = 0.0;


    /*

    This switch block will decide which conversion methods to be called and
    converted values will be returned from each method which are then printed
    to show the conversion. the input to every conversion method is the value
    and the unit from the user. the 'inputUnit' string is used in switch to
    determine the method call

    */
		switch(inputUnit) {

		case "KM":
        convertedVal = convertKmMi(inputVal,inputUnit);
        System.out.println(inputVal + " " +inputUnit + " is equal to " + convertedVal + "MI");
      	break;

		case "MI":
        convertedVal = convertKmMi(inputVal,inputUnit);
        System.out.println(inputVal + " " +inputUnit + " is equal to " + convertedVal + "Km");
    		break;

		case "CM":
        convertedVal = convertCmIn(inputVal,inputUnit);
        System.out.println(inputVal + " " +inputUnit + " is equal to " + convertedVal + "Inches");
  	    break;

		case "IN":
        convertedVal = convertCmIn(inputVal,inputUnit);
        System.out.println(inputVal + " " +inputUnit + " is equal to " + convertedVal + "Cm");
        break;

		case "KG":
  			convertedVal = convertKgLb(inputVal,inputUnit);
  			System.out.println(inputVal + " " +inputUnit + " is equal to " + convertedVal + "lb");
  			break;

		case "LB":
  		  convertedVal = convertKgLb(inputVal,inputUnit);
  			System.out.println(inputVal + " " +inputUnit + " is equal to " + convertedVal + "Kg");
  			break;

		case "G":
        convertedVal = convertGOz(inputVal,inputUnit);
        System.out.println(inputVal + " " +inputUnit + " is equal to " + convertedVal + "Ounces");
        break;

		case "OZ":
        convertedVal = convertGOz(inputVal,inputUnit);
        System.out.println(inputVal + " " +inputUnit + " is equal to " + convertedVal + "Grams");
        break;

		case "L":
        convertedVal = convertLCups(inputVal,inputUnit);
        System.out.println(inputVal + " " + inputUnit + " is equal to " + convertedVal + "Cups");
    		break;

		case "CUPS":
    case "CUP":
        convertedVal = convertLCups(inputVal,inputUnit);
        System.out.println(inputVal + " " + inputUnit + " is equal to " + convertedVal + "L");
    		break;

		case "C":
        convertedVal = convertTemp(inputVal,inputUnit);
        System.out.println(inputVal + " " +inputUnit + " is equal to " + convertedVal + "F");
        break;

		case "F":
        convertedVal = convertTemp(inputVal,inputUnit);
        System.out.println(inputVal + " " +inputUnit + " is equal to " + convertedVal + "C");
        break;

		default:
				System.out.println("Invalid input measure !!!! Cannot be converted");
		}
    sc.close();

	}
    /*
        THe methods below do conversion in both direction as their name suggest
         and return the converted value based on the input and inputUnit
         from the user
    */
	public static double convertKgLb(double input, String inputUnit){
          	  	double convertedVal = 0.0;
          			if(inputUnit.equals("KG")){
                  // converting Kgs to lbs ..
          				convertedVal = 2.2 * input;
          			}
          			else{
                  // converting lbs to Kg ..
          			  convertedVal = 0.45 * input;
          			   }
                return convertedVal;
          		    }

  public static double convertKmMi(double input, String inputUnit){
          	   	double convertedVal = 0.0;
          			if(inputUnit.equals("KM")){
                  // converting kms to miles ..
                	convertedVal = 0.62 * input;
          			}
          			else {
                  // converting miles to Kms
          			  convertedVal = 1.61 * input;
          			     }
                return convertedVal;
          		    }

  public static double convertCmIn(double input, String inputUnit){
          	   	double convertedVal = 0.0;
          			if(inputUnit.equals("CM")){
                  // converting cm to inches ..
          				convertedVal = 0.39 * input;
          			}
          			else{
                  // converting inches to cms ..
          			  convertedVal = 2.54 * input;
          			    }
                return convertedVal;
          		  }

  public static double convertGOz(double input, String inputUnit){
          	  	double convertedVal = 0.0;
          			if(inputUnit.equals("G")){
                  // converting grams to ounces ..
          				convertedVal = 0.04 * input;
          			}
          			else{
                  // converting ounces to grams ..
          			  convertedVal = 28.35 * input;
          			}
                return convertedVal;
          		  }

  public static double convertLCups(double input, String inputUnit){
              	double convertedVal = 0.0;
          			if(inputUnit.equals("L")){
                  // converting from litres to cups ..
          				convertedVal = (4.17 * input);
          			}
          			else{
                  // converting from cups to litres ..
          			  convertedVal = 0.24 * input;
          			}
                return convertedVal;
          		}
  public static double convertTemp(double input, String inputUnit){
          	  	double convertedVal = 0.0;
          			if(inputUnit.equals("F")){
                  // converting from farenheit to celsius ..
          				convertedVal = (( 5.0 * (input - 32.0)) / 9.0);
          			}
          			else{
                  // converting from celsius to farenheit ..
          		    convertedVal = ((9.0*input)/5.0 +32.0);
          			}
                return convertedVal;
          		}

}
