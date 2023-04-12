
 package laboratorioDeEstudo;

 import java.util.ArrayList;
 
 public class laboratorioDeEstudo {
 
     public static void main(String[] args) {
 
         ArrayList<String> list = new ArrayList<>();
         list.add("Maça");
         list.add("Laranja");
         list.add("Carambola");
         list.add("Jabuticaba");
         list.add("Abacaxi");
         list.add("Melancia");
 
         quickSort(list, 0, list.size() - 1);
 
         for (String s : list) {
             System.out.print(s + " ");
         }
     }
 
     private static void quickSort(ArrayList<String> list, int inicio, int fim) {
         if (fim <= inicio) return;
 
         int ultimo = parteLista(list, inicio, fim);
         quickSort(list, inicio, ultimo - 1);
         quickSort(list, ultimo + 1, fim);
     }
 
     private static int parteLista(ArrayList<String> list, int inicio, int fim) {
         String ultimo = list.get(fim);
         int i = inicio - 1;
 
         for (int j = inicio; j <= fim; j++) {
             if (list.get(j).compareTo(ultimo) < 0) {
                 i++;
                 String aux = list.get(i);
                 list.set(i, list.get(j));
                 list.set(j, aux);
             }
         }
         i++;
         String aux = list.get(i);
         list.set(i, list.get(fim));
         list.set(fim, aux);
 
         return i;
     }
 }
 
