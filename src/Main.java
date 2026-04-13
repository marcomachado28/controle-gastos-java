import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
ArrayList<Double> gastos = new ArrayList<>();

System.out.println("Digite um gasto:");
double valor = sc.nextDouble();
gastos.add(valor);

double total = 0;
for (double g : gastos) {
total += g;
}

System.out.println("Total gasto: " + total);
}
}
