package day6;

import java.util.Arrays;

public class SortingElementsArray {

	public static void main(String[] args) 
			{
				int i [] = {40, 50, 130, 85, 20, 90, 110, 400, 305};
				
				 //Before sorting numbers
				System.out.println(Arrays.toString(i));
				
				Arrays.sort(i);
				//After sorting
				System.out.println(Arrays.toString(i)); 

			}

	}
