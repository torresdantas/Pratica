
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class ParesStreamAPI {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
//        List<Integer> paresNumeros = numeros.stream()
//                .filter(n -> n % 2 == 0)
//                .toList();
//        System.out.println(paresNumeros);

//        Consumer<Integer> pares = n -> {
//            if(n % 2 == 0){
//                System.out.println(n);
//            }
//        };
//        numeros.forEach(pares);

        numeros.forEach(n -> {
            if(n % 2 == 0){
                System.out.println(n);
            }
        });
    }
}