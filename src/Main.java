//import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {


  public static void main(String[] args){
     // vetores

//      int [] colcaointeiros = {1, 2, 3, 4, 5};
//      int [] minhacolecao = new int[8];
//
//
//      System.out.println(colcaointeiros[0]);
//      System.out.println(colcaointeiros.length);


      // estrutura de condição:
//      int x = 4;
//
//      if (x == 10) {
//          System.out.println("é 10!!");
//
//      }
//      else {
//          System.out.print("não é 10 e sim ");
//          System.out.print(x);
//
//      }

      // arrylist



      ArrayList<String> nomes = new ArrayList<>();
      nomes.add("Carlos");
      nomes.add("Maria");
      nomes.add("Livia");

      //ver os itens
//      System.out.println(nomes.get(0));

      // remover itens
//      nomes.remove(1);
      // ver os items
//      System.out.println(nomes.get(1));

      // loops
      //For -> utilizado para que execute o que acabe a lista ou atributo
//      for(int i = 0; i < nomes.size(); i++){
//        System.out.println(nomes.get(i));
//    }


      // whilw -> faz uma coisa até que a condição termine
//    int contador = 0;
//
//    while (contador <10){
//        System.out.println("PLUS");
//        contador++;
//    }

    // casting -> transformar um tipo de valor para outra

      double resultado = 0.3;

      int resultadoint = (int) resultado;

      // integer
      String meustring = "10";
      int meuint2 = Integer.parseInt(meustring);
      System.out.println(meuint2);








  }






}

