import javax.swing.*;

public class Acceso_Aplicacion {

	public static void main(String[] args) {
		
		String usuario = "Gustavo";
		
		String clave = "Gus";
		
		String general = "False";
		
		while (usuario.equals(general)==false) {
			
			general = JOptionPane.showInputDialog("Ingrese el usuario, por favor");
			
			if (usuario.equals(general)==false) {
				
				System.out.println("Usuario incorrecto!");
			}
			
		}
		while (clave.equals(general)==false) {
			
			general = JOptionPane.showInputDialog("Ingrese la contrase�a, por favor");
			
			if (clave.equals(general)==false) {
				
				System.out.println("contrase�a incorrecta!");
			}
			
		}
		
		System.out.println("Plasssshhh!");
	}

}
