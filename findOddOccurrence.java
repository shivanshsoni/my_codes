public class findTheOddOccurence {

	public static void main(String[] args) {

		System.out.println("First round:\n-------------------");
		
		int[] array1 = { 1, 2, 1, 2, 2, 1, 3, 4, 4, 5, 6 };
		System.out.print("Original array: ");
		printArray(array1);
		findTheOddOccurenceMethod(array1);

		System.out.println("\n\nSecond round:\n-------------------");
		int[] array2 = {9,7,6,5,5,8,3,5,7,4,4,4,2,9,3,4,7,1,4};
		System.out.print("Original array: ");
		printArray(array2);
		findTheOddOccurenceMethod(array2);
	}

	static void findTheOddOccurenceMethod(int[] array) {
		array = sortArray(array);

		int[] newArray = new int[1];
		int[] auxArray = new int[newArray.length + 1];

		int k = 0;
		int m = 0;

		newArray[k] = array[0];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j]) {
					m++;
				}
			}
			if (i != 0 && m % 2 == 1) {

				if (array[i] != array[i - 1]) {
					k++;
					auxArray = new int[newArray.length + 1];
					for (int j = 0; j < newArray.length; j++) {
						auxArray[j] = newArray[j];
					}
					newArray = auxArray.clone();
					newArray[k] = array[i];
				}

			}
			m = 0;
		}
		System.out.println();
		System.out.print("Array of elements with odd occurences: ");
		printArray(newArray);
	}

	static int[] selectElements(int[] array) {

		return array;
	}

	static int[] sortArray(int[] array) {
		int aux = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}
		return array;
	}

	static void printArray(int[] array) {
		System.out.print("[");
		for (int i = 0; i < array.length - 1; i++) {
			System.out.print(array[i]);
			System.out.print(", ");
		}
		System.out.print(array[array.length - 1]);
		System.out.print("]");
	}
}
