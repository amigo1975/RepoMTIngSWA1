import java.util.*;

public class SelectionSort implements SortingStrategy {

	@Override
	public void sort(int[] numbers) {
		System.out.println("Selection Sort!");

		//se declaran variable siniciales
		int i, j, first, temp;
		for (i = numbers.length - 1; i > 0; i--) {
			first = 0;
			for (j = 1; j <= i; j++) {
				if (numbers[j] > numbers[first])
					first = j;
			}
			temp = numbers[first];
			numbers[first] = numbers[i];
			numbers[i] = temp;
		}
		//Aqui se imprime en pantalla
		System.out.println(Arrays.toString(numbers));
	}
}