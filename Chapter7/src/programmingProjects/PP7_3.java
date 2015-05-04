package programmingProjects;

import java.lang.reflect.Array;
import java.util.Random;

public class PP7_3 
{
	static PP7_3 master = new PP7_3();
	public void asteriskPrintOut(int asteriskNum)
	{
		for(int current=0; current<asteriskNum; current++)
		{
			System.out.print("*");
		}
		System.out.println("");
	}
	public int rangeReturner(int[] frequencyArray, int index)
	{
		if(frequencyArray[index]<10)
		{
			return 0;
		}
		else if(frequencyArray[index]<20)
		{
			return 1;
		}
		else if(frequencyArray[index]<30)
		{
			return 2;
		}
		else if(frequencyArray[index]<40)
		{
			return 3;
		}
		else if(frequencyArray[index]<50)
		{
			return 4;
		}
		else if(frequencyArray[index]<60)
		{
			return 5;
		}
		else if(frequencyArray[index]<70)
		{
			return 6;
		}
		else if(frequencyArray[index]<80)
		{
			return 7;
		}
		else if(frequencyArray[index]<90)
		{
			return 8;
		}
		else
		{
			return 9;
		}
	}
	public void frequencyPrintOut(int[] frequencyArray)
	{
		int[] distribution ={0,0,0,0,0,0,0,0,0,0};
		for(int index=0; index<=frequencyArray.length-1;index++)
		{
			switch(master.rangeReturner(frequencyArray, index))
			{
			case 0:
				distribution[0]++;
				break;
			case 1:
				distribution[1]++;
				break;
			case 2:
				distribution[2]++;
				break;
			case 3:
				distribution[3]++;
				break;
			case 4:
				distribution[4]++;
				break;
			case 5:
				distribution[5]++;
				break;
			case 6:
				distribution[6]++;
				break;
			case 7:
				distribution[7]++;
				break;
			case 8:
				distribution[8]++;
				break;
			case 9:
				distribution[9]++;
				break;
			}
		}
		System.out.print(" 1 - 10  | ");
		master.asteriskPrintOut(Array.getInt(distribution, 0));
		System.out.print("11 - 20  | ");
		master.asteriskPrintOut(Array.getInt(distribution, 1));
		System.out.print("21 - 30  | ");
		master.asteriskPrintOut(Array.getInt(distribution, 2));
		System.out.print("31 - 40  | ");
		master.asteriskPrintOut(Array.getInt(distribution, 3));
		System.out.print("41 - 50  | ");
		master.asteriskPrintOut(Array.getInt(distribution, 4));
		System.out.print("51 - 60  | ");
		master.asteriskPrintOut(Array.getInt(distribution, 5));
		System.out.print("61 - 70  | ");
		master.asteriskPrintOut(Array.getInt(distribution, 6));
		System.out.print("71 - 80  | ");
		master.asteriskPrintOut(Array.getInt(distribution, 7));
		System.out.print("81 - 90  | ");
		master.asteriskPrintOut(Array.getInt(distribution, 8));
		System.out.print("91 - 100 | ");
		master.asteriskPrintOut(Array.getInt(distribution, 9));
		
		
	}
	public static void main(String[] args) 
	{
		int[] frequencyArray = new int[200];
		Random rand = new Random();
		for(int index=0; index<=frequencyArray.length-1; index++)
		{
			frequencyArray[index]=rand.nextInt(99)+1;
		}
		master.frequencyPrintOut(frequencyArray);
		
	}

}
