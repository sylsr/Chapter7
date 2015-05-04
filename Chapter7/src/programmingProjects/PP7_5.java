package programmingProjects;

import java.util.Random;

public class PP7_5 
{
	static PP7_5 master = new PP7_5();
	public float mean(float[] generatedArray, int arrayLength)
	{
		float sumOfAll=0.0f;
		float mean;
		for(int index=0; index<generatedArray.length; index++)
		{
			sumOfAll+=generatedArray[index];
		}
		mean=sumOfAll/generatedArray.length;
		return mean;
	}
	public float standardDeviation(float[] generatedArray, float mean)
	{
		float partialSum =0.0f;
		float currentIndexSum=0.0f;
		float standardDeviation;
		for(int index=0; index<generatedArray.length; index++)
		{
			partialSum=(float) Math.pow((generatedArray[index]-mean),2);
			currentIndexSum+=partialSum;
		}
		standardDeviation=(float) Math.sqrt(currentIndexSum/(generatedArray.length-1));
		return standardDeviation;
	}
	public static void main(String[]args)
	{
		Random rand = new Random();
		float[] generatedArray = new float[50];
		for(int index=0; index<generatedArray.length; index++)
		{
			
			generatedArray[index]=rand.nextFloat();
		}
		System.out.println(master.mean(generatedArray, generatedArray.length));
		System.out.println(master.standardDeviation(generatedArray, master.mean(generatedArray, generatedArray.length)));
	}
}
