import java.util.*;
public class Ejercicio12{
	public static void main(String[] args){
		double h;
		double h_Hombres=0;
		double h_Mujeres=0;
		int hombres=0;
		int mujeres=0;
		int totalParticipantes=0;
		int edad;
		int edadTot=0;
		double promed_h_Mujeres;
		double promed_h_Hombres;
		double promedioEdadParticipantes;
		String sexo;
		Scanner scanner=new Scanner(System.in);

		System.out.print("Ingrese la edad: ");
		edad=scanner.nextInt();
		System.out.print("Ingrese la altura en Metros: ");
		h=scanner.nextDouble();
		System.out.print("Ingrese el sexo, Femenino=F, Masculino=M.  ");
		sexo=scanner.next();
		while(h>=0){
			totalParticipantes++;
			edadTot += edad;
			if (sexo.equals("F") | sexo.equals("f")) {
				h_Mujeres += h;
				mujeres++;
				System.out.println("Persona Femenina registrada");
			} else if(sexo.equals("M") | sexo.equals("m")){
				h_Hombres += h;
				hombres++;
				System.out.println("Persona Masculina registrada");
			}else {
				System.out.println("Ingrese el sexo correctamente");
			}
			System.out.print("Ingrese la edad: ");
			edad=scanner.nextInt();
			System.out.print("Ingrese la altura en metros: ");
			h=scanner.nextDouble();
			System.out.print("Ingrese el sexo, (Femenino=F, Masculino=M): ");
			sexo=scanner.next();
		}
		promed_h_Hombres=h_Hombres/hombres;
		promed_h_Mujeres=h_Mujeres/mujeres;
		promedioEdadParticipantes=edadTot/totalParticipantes;
		System.out.println("El promedio de altura de mujeres es: "+promed_h_Mujeres+" mts.");
		System.out.println("El promedio de altura de hombres es: "+promed_h_Hombres+" mts.");
		System.out.println("El promedio de edad de los participantes es: "+promedioEdadParticipantes+" años");
	}
}