import javax.swing.JOptionPane;

public class Clasificados {
	
	
	public static void main(String[] args) 
	{
		
		String clasificados[][]= 
			{
				{"Moto marca: Auteco","Modelo: 2016 - Cilindraje - 125 cc - Color: Negro","Valor: $ 2.520.000, contacto: Lina Marulanda Celular: 3201253652"},
				{"Camioneta marca: Luv Dmax", "Modelo: 2012 - Cilindraje - 3000 cc - Color: Blanco","Valor: $ 45.520.000 contacto: Lina Marulanda Celular: 3201253652"},
				{"Apartamento Amoblado en Arriendo","Apartamento de 6 habitaciones, 4 baños, sala social, salacomedor, cocina integral","Valor: $ 2.500.000 mensuales contacto: Lina Marulanda Celular: 3201253652"},
				{"","",""},
				{"","",""},
				{"","",""},
				{"","",""},
				{"","",""}
			};

		String menu1=" Bienvenido, a sus clasificados \n elija una opcion \n1.Consultar clasificado \n2.C"
				+ "rear un clasificado";
		String clas="";
		int cod=0;
		int j=3;
		int salir;
		do 
		{
			int opcion = Integer.parseInt(JOptionPane.showInputDialog(menu1));
			if(opcion == 2)
			{
				if(j<=6) 
				{	
					JOptionPane.showMessageDialog(null,"Bienvenido, siga los pasos para agregar un clasificado");
					for(int i=0;i<3;i++) 
					{
						
						cod=i;
						switch (cod) {
								
							case 0:
								clasificados[j][i] = JOptionPane.showInputDialog("Ingrese el asunto");
								break;
								
							case 1:
								clasificados[j][i] = JOptionPane.showInputDialog("Ingrese una Descripcion");
								break;
								
							case 2:
								clasificados[j][i] = JOptionPane.showInputDialog("Ingrese el valor y el contacto");
								break;
						}
						
					}
					j+=1;
					opcion = Integer.parseInt(JOptionPane.showInputDialog(menu1));
				}
				else 
				{
						JOptionPane.showMessageDialog(null, "Lo sentimos, ya no puedes agregar mas clasificados");
						opcion = Integer.parseInt(JOptionPane.showInputDialog(menu1));
				}
			}
			
			
			int tam = clasificados.length;
			int tam2 = clasificados[0].length;
			if(opcion == 1)
			{
					for(int i = 0, g = 1;i<tam;i++)
					{
						int l = 0;
						if(clasificados[i][l]!="") 
						{
							JOptionPane.showMessageDialog(null, "Clasificado #"+ g);
							for(l = 0;l<tam2;l++)
							{
								clas += clasificados[i][l] + "\n";
							}
							
							JOptionPane.showMessageDialog(null, clas);
							clas = "";
							g++;
						}
					}
			}
			
			if(opcion == 3)
			{
				JOptionPane.showMessageDialog(null, "La opcion no existe");
			}
			
			int eliminar = JOptionPane.showConfirmDialog(null, "¿Desea eliminar algun clasificado?","Menu",JOptionPane.YES_NO_OPTION);
			
			if(eliminar == 0)
			{
				for(int i = 0, g = 1;i<tam;i++)
				{
					int l = 0;
					if(clasificados[i][l]!="") 
					{
						JOptionPane.showMessageDialog(null, "Clasificado #"+ g);
						for(l = 0;l<tam2;l++)
						{
							clas += clasificados[i][l] + "\n";
						}
						
						JOptionPane.showMessageDialog(null, clas);
						clas = "";
						g++;
						
						int fin = JOptionPane.showConfirmDialog(null, "¿Deseas eliminar este clasificado?","ELIMINAR",JOptionPane.YES_NO_OPTION);
				
						if(fin==0) 
						{
							for(l=0;l<tam2;l++)
							{
								clasificados[i][l]="";
							}
							JOptionPane.showMessageDialog(null, "Clasificado eliminado exitosamente");
						}
					}
				}
			}
			
			salir = JOptionPane.showConfirmDialog(null, "¿Deseas salir?","Menu",JOptionPane.YES_NO_OPTION);
			
		}while(salir != 0 );
		
}
}