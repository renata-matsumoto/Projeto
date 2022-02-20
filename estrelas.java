import java.util.*;

class Estrela {

    public static void main (String[] args) throws java.lang.Exception
   {
       System.out.print("Digite o número de estrelas: ");
         try (Scanner in = new Scanner(System.in)) {
            List<String> degraus = new ArrayList<String>();
                int n = in.nextInt();
                for (int i = 0; i < n; i++) {
                    degraus.add(" ".repeat(n - i) + "*".repeat(i + 1));
                }
      for (String degrau : degraus) {
               System.out.println(degrau);
      }
        }
   }
}



