package laboratorioDeEstudo;

public class laboratorioDeEstudo {

    public static void main(String[] args) {

        String[] array = {"Maça", "Laranja", "Carambola", "Jabuticaba", "Abacaxi", "Melancia"};

        quickSort(array, 0, array.length - 1);

        for (String s : array) {
            System.out.print(s + " ");
        }
    }

    private static void quickSort(String[] array, int inicio, int fim) {
        if (fim <= inicio) return;

        int pivot = parteArray(array, inicio, fim);
        quickSort(array, inicio, pivot - 1);
        quickSort(array, pivot + 1, fim);
    }

    private static int parteArray(String[] array, int inicio, int fim) {
        String pivot = array[fim];
        int i = inicio - 1;

        for (int j = inicio; j <= fim; j++) {
            if (array[j].compareTo(pivot) < 0) {
                i++;
                String aux = array[i];
                array[i] = array[j];
                array[j] = aux;
            }
        }
        i++;
        String aux = array[i];
        array[i] = array[fim];
        array[fim] = aux;

        return i;
    } 
 }

