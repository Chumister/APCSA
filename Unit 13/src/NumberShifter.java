//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	private static Random random = new Random();
	public static int getRandomInteger(int min, int max) {
		return (random.nextInt(((max - min) + 1)) + min);
	}
	public static short getRandomShort(short min, short max) {
		return ((short) getRandomShort(min, max));
	}
	public static int[] makeLucky7Array(int size)
	{
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = getRandomInteger(0, 10);
		}
		return array;
	}
	public static void shiftEm(int[] array)
	{
		for (int i = 0; i < array.length; i++) {
			int j = i;
			while (j < array.length && array[j] != 7) j++;
			if (j != i && j < array.length) {
				int t = array[j];
				array[j] = array[i];
				array[i] = t;
			}
		}
	}
}