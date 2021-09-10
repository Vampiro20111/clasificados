import javax.swing.Icon;
import javax.swing.JOptionPane;

public class Clasificados2 {
	
	
	public static void main(String[] args) {
		
		String clasificados="";

		String menu="Bienvenido(a)\n\n";
		menu+="1. Ingrese su nombre\n";
		menu+="2. Clasificados Vehiculos - Motos\n";
		menu+="3. Clasificados Vehiculos - Carros \n";
		menu+="4. Clasificados Arrendamiento - Inmobiliario \n";
		menu+="5. Clasificados Ventas - Inmobiliario\n";
		menu+="6. Clasificados empleos\n";
		menu+="7. Salir\n\n";
		menu+="Ingrese una opcion\n";
		
		boolean validaIngreso=false;
		int cod=0;
		String nombre="";

		do {
			
			int muestraOperacion=1;
			cod=Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (cod) {
			case 1: 
				nombre=JOptionPane.showInputDialog("Ingrese su nombre");
				JOptionPane.showMessageDialog(null, "Hello " + nombre);
				break;
			case 2:
				JOptionPane.showMessageDialog(null, nombre+ " Los clasificados de vehiclulos - motos que tenemos para ti son: ", "Clasificados", muestraOperacion);
				JOptionPane.showMessageDialog(null,"------Moto---- Marca: Auteco - Modelo: 2016 - Cilindraje - 125 cc - Color: Negro\n", "Clasificado 1", muestraOperacion);
				JOptionPane.showMessageDialog(null,"Moto automática fly 125 con 59160 km año 2016, batería nueva,\n"
						+ "llantas en buen estado, tecnomecanica acaba de sacar se vence hasta agosto del 2022,\n"
						+ "soat se vence en 23 de agosto del 2021, única dueña.Valor: $ 2.520.000 - Contacto Liliana Dominguez - \n Celular: 312856421", "Clasificado 1", muestraOperacion);
				
										
				break;
			case 3: 
				JOptionPane.showMessageDialog(null, nombre+ " Los clasificados de vehiculos - carros que tenemos para ti son: ", "Clasificados", muestraOperacion);
				JOptionPane.showMessageDialog(null,"------Camioneta---- Marca: Luv Dmax - Modelo: 2012 - Cilindraje - 3000 cc - Color: Blanco\n", "Clasificado 1", muestraOperacion);
				JOptionPane.showMessageDialog(null," Camioneta automática Dmax 3000 con 590160 km año 2012, batería nueva,\n"
						+ "llantas en buen estado, tecnomecanica acaba de sacar se vence hasta agosto del 2022,\n"
						+ "soat se vence en 23 de agosto del 2021, único dueño.Valor: $ 45.520.000 - Contacto Juan Dominguez - \n Celular: 312856421", "Clasificado 1", muestraOperacion);
				
				break;
			case 4: 
				JOptionPane.showMessageDialog(null, nombre+ " Los clasificados de arriendo inmobiliario que tenemos para ti son: ", "Clasificados", muestraOperacion);
				JOptionPane.showMessageDialog(null,"------Apartamento Amoblado en Arriendo---- ","Clasificado 1", muestraOperacion);
				JOptionPane.showMessageDialog(null," Apartamento de 6 habitaciones, 4 baños, sala social, salacomedor, cocina integral\n"
						+ "parqueadero bajo techo, patio de ropas, es un octavo punto con balcón, servicio de vigilancia\n"
						+ "con servicio de piscina y gimnasio comunal, conjunto cerrado .Valor: $ 2.500.000 mensuales - Contacto Maria Dominguez - \n Celular: 312856421", "Clasificado 1", muestraOperacion);
				
				break;
			case 5: 
				JOptionPane.showMessageDialog(null, nombre+ " Los clasificados de venta inmobiliaria que tenemos para ti son: ", "Clasificados", muestraOperacion);
				JOptionPane.showMessageDialog(null,"------Apartamento Amoblado en Venta---- ","Clasificado 1", muestraOperacion);
				JOptionPane.showMessageDialog(null," Apartamento de 6 habitaciones, 4 baños, sala social, salacomedor, cocina integral\n"
						+ "parqueadero bajo techo, patio de ropas, es un octavo punto con balcón, servicio de vigilancia\n"
						+ "con servicio de piscina y gimnasio comunal, conjunto cerrado .Valor: $ 500 millones / Negociables - Contacto Hector Dominguez - \n Celular: 312856421", "Clasificado 1", muestraOperacion);
				
				
					
				break;
			case 6: 
				JOptionPane.showMessageDialog(null, nombre+ " Los clasificados de empleo que tenemos para ti son: ", "Clasificados", muestraOperacion);
				JOptionPane.showMessageDialog(null,"------Se solicita programador Web---- ","Clasificado 1", muestraOperacion);
				JOptionPane.showMessageDialog(null," Importante empresa del sector de las telecomunicaciones busca para su equipo de trabajo programador web\n"
						+ "quien es el encargado implementar y soportar las aplicaciones y plataformas tecnológicas asociadas a la estrategia de\n"
						+ "aprendizaje,bajo las metodologías y políticas del proceso de TI .Salario: $ 4.500.000 - Contacto Arle Dominguez - \n Celular: 312856421", "Clasificado 1", muestraOperacion);
				
				
				
				
				break;
			case 7: 
				JOptionPane.showMessageDialog(null, nombre+ " GRACIAS POR VISITARNOS ", "Salir", muestraOperacion);
				
				break;		
			default: 
				JOptionPane.showMessageDialog(null, nombre+ " Opción Invalida ", "Pruebe nuevamente", muestraOperacion);
				
				break;
			}
		
			
			
		} while (cod!=7);
			
		
		
	}

	

}