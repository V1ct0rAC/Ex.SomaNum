import java.util.ArrayList;
import java.util.List;

public class ListaNum {
int somaTotal = 0;
    private List <Numeros> lista;

    public ListaNum() {
        this.lista = new ArrayList<>();

    }
    public void adcNum (int numero){
        lista.add(new Numeros( numero));

    }
    public int somaNum() {
        for (Numeros num : lista) {
            somaTotal+=num.getNumero();
            /* para eu realizar a soma de tudo colo no lopping for (nom da classe num : nom da lista
            somaTotal +=num.getNumero - esse get numero pega os valores do array da outra classe
             */
        }
        return somaTotal;
    }
    public int MaioValor(){
        if (lista.isEmpty()){
            System.out.println("Lista vazia");
            return 0;

        }
        int maionum = lista.get(0).getNumero();
        for (int i =1; i<lista.size(); i++){
            int numatual = lista.get(i).getNumero();
            if (numatual>maionum){
                maionum=numatual;
            }


        }
        return maionum;
    }
    public int MenorNum(){
        if(lista.isEmpty()){
            return  0;
        }
        int menornum = lista.get(0).getNumero();
        for(int i =1; i<lista.size();i++){
            int numatual =lista.get(i).getNumero();
            if(numatual<menornum){
                menornum=numatual;

            }



        }
        return menornum;
    }
    public void exibirval(){
    System.out.println(lista);
    }
    public static void main(String[] args) {
        ListaNum numeros = new ListaNum();
        numeros.adcNum(7);
        numeros.adcNum(8);
        numeros.adcNum(1);
        System.out.println("O maior numero é" + numeros.MaioValor());
        System.out.println("O menor numero é" + numeros.MenorNum());
        numeros.exibirval();
        System.out.println("A soma total é de:"+ numeros.somaNum());


    }
}




