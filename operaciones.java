public class operaciones
{
	public static void main(String[] args)
	{
		int valor1=8, valor2=2;
		float suma, resta, multiplicacion, division, residuo;
		suma=valor1+valor2;
		System.out.println("La suma de "+valor1+" + "+valor2+" es: "+suma);
		resta=valor1-valor2;
		System.out.println("La resta de "+valor1+" - "+valor2+" es: "+resta);	
		multiplicacion=valor1*valor2;
		System.out.println("La multiplicacion de "+valor1+" * "+valor2+" es: "+multiplicacion);
		division=valor1/valor2;
		System.out.println("La division de "+valor1+" / "+valor2+" es: "+division);
		residuo=valor1%valor2;
		System.out.println("El residuo de "+valor1+" % "+valor2+" es: "+residuo);
	}
}