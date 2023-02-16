/**
 * 
 */

/**
 * @author Juan Simón
 *
 */
public class Calculadora {

    /**
     * Esta clase contiene los métodos que usaremos para la Calculadora
     */

    /**
     * Es un método constructor.¡
     */
	
	public Calculadora(){
        
    }

    /**
     * Es un método el cual sumas dos números
     * @param num1 el primer número para sumar
     * @param num2 el segundo número para sumar
     * @return devuelve la suma de los dos números
     */

    public int suma(int num1,int num2){
        return num1+num2;
    }

    /**
     *Este es un método para restar dos números
     * @param num1 el primer número para restar
     * @param num2 el segundo número para restar
     * @return devuelve la resta de los dos números
     */
    
    public int resta(int num1,int num2){
        return num1-num2;
    }

    /**
     *Este es un método para multiplicar dos números
     * @param num1 el primer número para multiplicar
     * @param num2 el segundo número para multiplicar
     * @return devuelve la multiplicación de los dos números
     */
    
    public int multiplica(int num1,int num2){
        return num1*num2;
    }

    /**
     *Este es un método para dividir dos números
     * @param num1 el primer número para divivir
     * @param num2 el segundo número para dividir
     * @return devuelve la división de los dos números
     */
    
    public int divide(int num1,int num2){
        if (num2==0) throw new ArithmeticException("NO PUEDES DIVIDIR POR CERO, MELON");
        return num1/num2;
    }

	private int valor1;
	private int valor2;
}

