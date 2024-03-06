import imovel.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Imovel> imoveis = new ArrayList<Imovel>();
        imoveis.add(new Casa('A', 100.0f, 5));
        imoveis.add(new Apartamento('B', 50.0f, 4));
        imoveis.add(new Terreno('B', 100.0f));

        for (Imovel imovel: imoveis) {
            System.out.println("valor do imóvel: " + imovel.calcularValor());
        }
     }
}