import java.security.InvalidParameterException;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        

		try {
            
            System.out.println("Digite o primeiro parâmetro");
		    int parametroUm = scanner.nextInt();

		    System.out.println("Digite o segundo parâmetro");
		    int parametroDois = scanner.nextInt();

			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);

           
		//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}catch (InvalidParameterException e) {
            System.out.println("O SEGUNDO PARAMETRO DEVE SER MAIOR QUE O PRIMEIRO");
			
		}
		
	} 
	static void contar(int parametroUm, int parametroDois ) throws InvalidParameterException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if(parametroUm > parametroDois){
            throw new InvalidParameterException();

        } 

		int contagem = parametroDois - parametroUm;

        //realizar o for para imprimir os números com base na variável contagem
        for( int x = 0; x <= contagem ; x++){
            System.out.println("IMPRIMINDO O NUMERO " + x);
        }
		
	}
}