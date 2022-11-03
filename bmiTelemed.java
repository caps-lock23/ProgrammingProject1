package telemed;
import java.util.Scanner;

/* Make a program to determine an adult bmi and corresponding physical activities recommendation and/or diet to
 improve or retain a healthy weight */


/*Make another program to determine cholesterol levels and recommend health tips and medication 
to improve less desirable or undesirable conditions
*/

//prompt user to if what program to run bmiTelemed and/or cholesterolTelemed 

//BMI program
//prompt user if metric (kg, m) or imperial system (lb, in) for input
//prompt user to input for weight and height 

//bmi == weight / height * height

//if bmi < 18.5 print "You are underweight" followed by corresponding health recommendation and health risk
//else if bmi > 18.5 && bmi < 24.9 print "You have a healthy weight" followed by corresponding health recommendation and health risk
//else if bmi > 25.0 && bmi < 29.9 print "You are overweight" followed by corresponding health recommendation and health risk
//else if bmi > 30 print "You are obese" followed by corresponding health recommendation and health risk
//else print "invalid input" 


public class bmiTelemed {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println();
		System.out.println("    [___+_]");
		System.out.print("  \\" + "(  - v -)/ ");
		
		System.out.println("         Hello there! I am Dr. G'Telemed at your service");
		System.out.println("                 Welcome to my BMI and Cholesterol Telemed Health App (BCTHA) \n\n");
		
		System.out.print("Which program would you like to run first?\n\nInput 1 for BMI telemed or Input 2 for Cholesterol telemed: ");
		int programToRun = s.nextInt();
		if(programToRun == 1) {
		while(true) {
			System.out.print("\n\nWhat measurement system would you like to use?\n\nInput 1 for Metric System (kg, m) or Input 2 for Imperial System (lb, in) [input 0 to exit]: ");
			int measurementSystem = s.nextInt();
			String weightmsg = "";
			String heightmsg = "";
			
			if (measurementSystem == 0) {
				System.out.println("\nExiting program");
				System.out.println("\nHealth is wealth, goodbye!");
			} else if (measurementSystem == 1) {
				weightmsg = "\nInput your weight in kilograms (kg) [input 0 to exit]: ";
				heightmsg = "\nInput your height in meters (m) [input 0 to exit]: ";
			} else if (measurementSystem == 2) {
				weightmsg = "\nInput your weight in pounds (lb) [input 0 to exit]: ";
				heightmsg = "\nInput your height in inches (in) [input 0 to exit]: ";
			}

			System.out.print(weightmsg);
			double weight = s.nextDouble();
			
			if (weight < 0) {
				System.out.println("\nInvalid input, must be a positive integer!\n");
				continue;
			} else if (weight == 0) {
				System.out.println("\n                -- Exiting Program --");
				System.out.println("\n                -- Health is wealth, goodbye! --");
				return;
			}
						
			System.out.print(heightmsg);
			double height = s.nextDouble();
						
			if (height < 0) {
				System.out.println("\nInvalid input, must be a positive integer!\n");
				continue;
			} else if (height == 0) {
				System.out.println("\n                -- Exiting Program --");
				System.out.println("\n                -- Health is wealth, goodbye! --");
				return;
			}
			
			int bmiInstance = 0;
			double bmi = 0;
			double metric = (weight / (height*height));
			double imperial = (weight / (height*height)) * 703;
			
			if (measurementSystem == 1) {
				bmi = (metric);
			} else if (measurementSystem == 2) {
				bmi = (imperial);
			}
			
			
			if (bmi <= 18.5) {
				System.out.println("\n\n                         -- Your bmi is " + bmi + ", you are underweight --\n\n");
				bmiInstance = 1;
			} else if (bmi > 18.5 && bmi < 25) {
				System.out.println("\n\n                     -- Your bmi is " + bmi + ", you have a healthy weight --\n\n");
				bmiInstance = 2;
			} else if (bmi > 25 && bmi < 30) {
				System.out.println("\n\n                        -- Your bmi is " + bmi + ", you are overweight --\n\n");
				bmiInstance = 3;
			} else if (bmi >= 30) {
				System.out.println("\n\n                          -- Your bmi is " + bmi + ", you are obese --\n\n");
				bmiInstance = 4;
			} else System.out.println("Invalid input");
			
			System.out.println("    [___+_]");
			System.out.print("  \\" + "(  o w o)/ ");
			
			switch(bmiInstance) {
				case 1:
					System.out.println("                      -- To Gain Weight --\n\n");
					System.out.println("                    Focus on eating more nutrient-dense foods and living an overall healthy lifestyle.\n");
					
					System.out.println("      //" + "\\");
					System.out.println("     //" + " \\" + "\\");
					System.out.println("    // " + "!" + " \\" + "\\");
					System.out.print("   //" +  "_____\\" + "\\");
					
					System.out.println("                  -- Health Risks of Underweight--\n\n");
					System.out.println("                    ~ Increased risk of developing complication");
					System.out.println("                    ~ Fertility problems");
					System.out.println("                    ~ Malnutrition");
					System.out.println("                    ~ Osteoporosis");
					System.out.println("                    ~ Decreased muscle strength");
					System.out.println("                    ~ Lowered immunity");
					
					break;
				case 2:
					System.out.println("                -- To Maintain Your Weight --\n\n");
					System.out.println("                    Work your way up to 150 minutes of moderate-intensity aerobic activity, 75");
					System.out.println("                    minutes of vigorous-intensity aerobic activity, or an equivalent each week.\n");
					System.out.println("                    Do note that this might vary from person to person as this is only");
					System.out.println("                    an average amount of recommended physical activity.\n");
					
					break;
				case 3:
				case 4:
					System.out.println("                  -- To Lose Your Weight --\n\n");
					System.out.println("                You will need a high amount of physical activity, adjust your diet,");
					System.out.println("                and reduce the amount of calories you are eating and drinking.\n");
					
					System.out.println("      //" + "\\");
					System.out.println("     //" + " \\" + "\\");
					System.out.println("    // " + "!" + " \\" + "\\");
					System.out.print("   //" +  "_____\\" + "\\");
					
					System.out.println("             -- Health Risks of Overweight and Obese --\n\n");
					System.out.println("                    ~ Coronaray heart disease");
					System.out.println("                    ~ Stroke                 ");
					System.out.println("                    ~ Gallbladder disease    ");
					System.out.println("                    ~ Osteoarthritis    ");
					System.out.println("                    ~ High blood pressure");
					System.out.println("                    ~ High cholesterol");
					System.out.println("                    ~ Type 2 diabetes");
					System.out.println("                    ~ Asthma");
					System.out.println("                    ~ Sleep apnea");
				default:
			}
				System.out.println();
				System.out.println("    [___+_]");
				System.out.print("  \\" + "(  - ^ -)/ ");
				
				System.out.println("                     -- Always Remember --\n\n");
				System.out.println("                        Being healhty and staying healthy requires");
				System.out.println("                    regular physical activity and a healthy eating plan!");
				System.out.println("\n");
				
				System.out.println("                   ----------------------------------------------------------");
				System.out.println("                                    // End of Program //");
				System.out.println("                   ----------------------------------------------------------");
				return;
		}}
		
		//Cholesterol Program
		//print recommendation via switch cases
		//prompt user for ldl hdl and triglyceride
		//totalCholesterol = LDL + HDL + (triglyceride/5)

		//if totalCholesterol <= 200 print desirable
		//if totalCholesterol > 200 && totalCholesterol < 240 print less desirable
		//if totalCholesterol => 240 print undesirable

		//if LDL <= 130 print "Your bad cholesterol is at desirable level"
		//if LDL > 130 && < 160 print borderline "Your bad cholesterol is at less desirable level"
		//if LDL >= 160 print "Your bad cholesterol is at undesirable level"

		//if HDL >= 50 print "Your good cholesterol is at desirable level"
		//if HDL > 40 && HDL < 49 print "Your good cholesterol is at less desirable level"
		//if HDL <= 40 print high "Your good cholesterol is undesirable level"

		//if triglycerides <= 200 print "Your triglyceride is at desirable level"
		//if triglycerides > 200 && triglyceride < 400 print "Your triglyceride is at less desirable level"
		//if triglycerides >= 400 " print "Your triglyceride is at undesirable level"

		//print recommendation via switch cases		
		
		else if (programToRun == 2) {
		while(true) {
			System.out.print("\n\nEnter your LDL cholesterol (mg/dL) : ");
			int LDL = s.nextInt();
			System.out.print("\nEnter your HDL cholesterol (mg/dL) : ");
			int HDL = s.nextInt();
			System.out.print("\nEnter your triglyceride level (mg/dL) : ");
			int triglyceride = s.nextInt();
			
			int cholesterolInstance = 0;
			int LDLInstance = 0;
			int HDLInstance = 0;
			int triglycerideInstance = 0;
			
			double totalCholesterol = LDL + HDL + (triglyceride/5);
			
			System.out.println("\n");
			System.out.println("      //" + "\\");
			System.out.println("     //" + " \\" + "\\");
			System.out.println("    // " + "!" + " \\" + "\\");
			System.out.print("   //" +  "_____\\" + "\\");
			
			System.out.print("                 -- Cholesterol Status Report --\n\n");
			
			if (totalCholesterol <= 200) {
				System.out.println("\n                      Your total cholesterol is desirable");
				cholesterolInstance = 1;
			} else if (totalCholesterol > 200 && totalCholesterol < 240) {
				System.out.println("\n                      Your total cholesterol is barely high");
				cholesterolInstance = 2;
			} else if (totalCholesterol >= 240) {
				System.out.println("\n                      Your total cholesterol is high");
				cholesterolInstance = 2;
			} 
			
			if (LDL <= 130) {
				System.out.println("\n                      Your bad cholesterol is at desirable level");
				LDLInstance = 1;
			} else if (LDL > 130 && LDL < 160){
				System.out.println("\n                      Your bad cholesterol is at less desirable level");
				LDLInstance = 2;
			} else if (LDL >= 160) {
				System.out.println("\n                      Your bad cholesterol is at undesirable level");
				LDLInstance = 2;
			}
			

			if (HDL >= 50) {
				System.out.println("\n                      Your good cholesterol is at desirable level");
				HDLInstance = 1;
			} else if (HDL < 49 && HDL > 40) {
				System.out.println("\n                      Your good cholesterol is at less desirable level");
				HDLInstance = 2;
			} else if (HDL <= 40) {
				System.out.println("\n                      Your good cholesterol is undesirable level");
				HDLInstance = 2;
			}
			
			if (triglyceride <= 200) {
				System.out.println("\n                      Your triglyceride is at desirable level\n\n");
				triglycerideInstance = 1;
			} else if (triglyceride > 200 && triglyceride < 400) {
				System.out.println("\n                      Your triglyceride is at less desirable level\n\n");
				triglycerideInstance = 2;
			} else if (triglyceride >= 400) {
				System.out.println("\n                      Your triglyceride is at undesirable level\n\n");
				triglycerideInstance = 2;
			}
			
			System.out.println();
			System.out.println("    [___+_]");
			System.out.print("  \\" + "(  - o -)/ ");
			
			System.out.println("               -- Results and Recommendations --\n\n");
			
			switch(cholesterolInstance) {
				case 1: 
					System.out.println("\n                      Your total cholesterol level is acceptable, you are good to go");
					break;
				case 2:
					System.out.println("\n                      insert cholesterol tips and medical recommendations here");
					break;
				default:
					System.out.println("\n                      invalid cholesterolInstance");
			}
			switch(LDLInstance) {
				case 1:
					System.out.println("\n                      Your LDL level is acceptable, you are good to go");
					break;
				case 2:
					System.out.println("\n                      insert LDL tips and medical recommendations here");
					break;
				default:
					System.out.println("\n                      invalid LDLInstance");
			} 
			switch(HDLInstance) {
				case 1:
					System.out.println("\n                      Your HDL level is acceptable, you are good to go");
					break;
				case 2:
					System.out.println("\n                      insert HDL tips and medical recommendations here");
					break;
				default:
					System.out.println("\n                      invalid HDLInstance");
			}
			switch(triglycerideInstance) {
				case 1:
					System.out.println("\n                      Your triglyceride level is acceptable, you are good to go\n\n");
					break;
				case 2:
					System.out.println("\n                      insert triglyceride tips and medical recommendations\n\n");
					break;
				default:
					System.out.println("\n                      invalid triglycerideInstance\n\n");
			}
			
			System.out.println();
			System.out.println("    [___+_]");
			System.out.print("  \\" + "(  - ^ -)/ ");
			
			System.out.println("                     -- Always Remember --\n\n");
			System.out.println("                        Being healhty and staying healthy requires");
			System.out.println("                    regular physical activity and a healthy eating plan!");
			System.out.println("\n");
			
			System.out.println("                   ----------------------------------------------------------");
			System.out.println("                                    // End of Program //");
			System.out.println("                   ----------------------------------------------------------");
			return;
		}}
	}

}
