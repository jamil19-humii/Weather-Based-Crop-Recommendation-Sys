package cropsystem;

import java.util.Scanner;

public class CropRecommendationSystem {

	public static void main(String[] args) {
	//Create Scanner object to read user input
		Scanner input=new Scanner(System.in);
		//declare variables
		double Totaltemp=0, totalrainfall=0, Totalhumidity=0;
		double avgtemp, avgrainfall,avghumidity;
		
		//declare arrays
		double[] temperature=new double[15];
		double[] humidity=new double[15];
		double[] rainfall=new double[15];
		
		System.out.println("Welcome to the Weather-Based Crop Recommendation System!");
		System.out.println("Enter Weather Data for 15 days:");
		
		//accept user data for the measurements 
		for(int i=0;i<15;i++) { 
			System.out.println("\nDay" + (i+1) + ":");
			
			System.out.println("Enter temperature:");
			temperature[i]=input.nextDouble();
			Totaltemp += temperature[i];
			
			System.out.println("Enter rainfall:");
			rainfall[i]=input.nextDouble();
			totalrainfall+=rainfall[i];
			
			System.out.println("Enter humidity:");
			humidity[i]=input.nextDouble();
			Totalhumidity+=humidity[i];
			
			}
		//calculate average
		avgtemp=Totaltemp/15;
		avgrainfall=totalrainfall/15;
		avghumidity=Totalhumidity/15;
		
		System.out.println("\nAnalyzing weather data..............");
		System.out.println("Average temperature:"+ avgtemp);
		System.out.println("Total rainfall:"+ avgrainfall);
		System.out.println("Average humidity:"+ avghumidity);
		
		//recommend crops based on weather condition
	String crop=input.nextLine();
	String details=input.nextLine();
	
	System.out.println("\nBased on the weather trends");
	
	//RICE
		if(avgtemp>=20 && avgtemp<=35 && avgrainfall>=100 &&avgrainfall<=300 && avghumidity>=60 && avghumidity<=90) {
			crop="Rice";
			details="Suitable for temperatures between 20-35,rainfall of 100-300mm and humidity of 60-90%";
		}
		//WHEAT
		else if(avgtemp>=10 && avgtemp<=25 && avgrainfall>=50 && avgrainfall<=100 && avghumidity>=40 && avghumidity<=60) {
			crop="Wheat";
			details="Suitable for temperatures between 10-25,rainfall of 50-100mm and humidity of 40-60%";
		}
		//MAIZE
	 else if (avgtemp>=18 && avgtemp<=27 && avgrainfall>=60 && avgrainfall<=150 && avghumidity>=50 && avghumidity<=70) {
		crop="Maize";
		details="Suitable for temperatures between 18-27,rainfall of 60-150mm and humidity of 50-70%";
	 }
		//SUGARCANE
		else if (avgtemp>=20 && avgtemp<=40 && avgrainfall>=100 && avgrainfall<=300 && avghumidity>=70 && avghumidity<=90) {
		crop="Sugarcane";
		details="Suitable for temperatures between 20-40,rainfall of 100-300mm and humidity of 70-90%";
		}
		
		else {
		System.out.println("No recommended crop for the given weather data  ");
		}
		
		//display input

		System.out.println("Recommended crops:"+ crop);
		System.out.println("." + details);
		
		input.close();
	}

	
}
