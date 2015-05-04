package programmingProjects;

import java.lang.reflect.Array;
import java.util.Scanner;

public class PP7_1 
{
	static PP7_1 master = new PP7_1();
	public boolean arrayChecker(int[] firstArray, int givenNum)
	{
		boolean stopped=false;
		int indexOfFirst=0;
		int lengthOfFirst=firstArray.length;
		while(indexOfFirst<lengthOfFirst && stopped==false)
		{
			if(Array.getInt(firstArray, indexOfFirst)==givenNum)
			{
				stopped=true;
			}
			indexOfFirst++;
		}
		if(stopped==false)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void dataOut(int[] userArray, int lengthOfUserArray)
	{
		System.out.println("Number|Number of occurances");
		System.out.println("------|--------------------");
		int[] testArray= new int[lengthOfUserArray];
		int indexOfTestArray=0;
		int givenNum;
		int howManyOfThatNum=0;
		for(int indexOfUser=0;indexOfUser<lengthOfUserArray;indexOfUser++ )
		{
			givenNum=Array.getInt(userArray, indexOfUser);
			if(master.arrayChecker(testArray, givenNum))
			{
				testArray[indexOfTestArray]=givenNum;
				indexOfTestArray++;
				for(int secondIndex=indexOfUser; secondIndex<lengthOfUserArray;secondIndex++)
				{
					if(givenNum==Array.getInt(userArray, secondIndex))
					{
						howManyOfThatNum++;
					}
				}
				if(givenNum<9)
				{
					System.out.println(givenNum+"     |  "+howManyOfThatNum);	
				}
				else
				{
					System.out.println(givenNum+"    |  "+howManyOfThatNum);
				}
			}
			howManyOfThatNum=0;
		}
	}
	public static void main(String[] args)
	{
		System.out.println("How many values are you going to enter?");
		Scanner scan = new Scanner(System.in);
		int numOfInputs=scan.nextInt();
		int[] userInputArray=new int[numOfInputs];
		for(int x=0; x<=numOfInputs-1; x++)
		{
			System.out.println("Enter an integer between 0 and 50.");
			int testScan=scan.nextInt();
			if(testScan<0 || testScan>50)
			{
				System.out.println("The number you entered was invalid.");
				x--;
			}
			else
			{
				userInputArray[x]=testScan;
			}
		}
		master.dataOut(userInputArray, numOfInputs);

	}

}
