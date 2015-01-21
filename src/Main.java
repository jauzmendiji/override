public class Main {
	public static void main (String [ ] Args) {

	        Entrenador entrenador = new Entrenador ();
	        entrenador.setNombret("Real Sociedad");
	        entrenador.setAños(1909);
	        entrenador.setLocalidad("Donostia");
	        entrenador.setDivision("Primera");
	        entrenador.setNombree("David Moyes");
	        entrenador.setEdade(51);
	        entrenador.setExpprimera(true);

	        
	        System.out.print("--- Entrenador: ");
	        System.out.print("\n\nNombre: " + entrenador.getNombree());
	        System.out.print("\nEdad: " + entrenador.getEdade());
	        System.out.print("\nExperiencia en primera: " + entrenador.getExpprimera());
	        System.out.print("\n	--- Equipo: ");	
	        System.out.print("\n    Nombre: " + entrenador.getNombret());
   	        System.out.print("\n    Año fundacion: " + entrenador.getAños());
   	        System.out.print("\n    Localidad: " + entrenador.getLocalidad());
   	        System.out.print("\n    Division actual: " + entrenador.getDivision());

	        Jugadores jugadores = new Jugadores();
	        jugadores.setNombret("Real Madrid");
	        jugadores.setAños(1902);
	        jugadores.setLocalidad("Madrid");
	        jugadores.setDivision("Primera");
	        jugadores.setNombrej("Cristiano Ronaldo");
	        jugadores.setEdadj(29);
	       	jugadores.setPuesto("Extremo izquierdo");
	        jugadores.setInternacional(true);
	        
	        System.out.print("\n\n--- Jugador: ");
	        System.out.print("\n\nNombre: " + jugadores.getNombrej());
	        System.out.print("\nEdad: " + jugadores.getEdadj());
	        System.out.print("\nDemarcacion: " + jugadores.getPuesto());
	       	System.out.print("\nInternacional: " + jugadores.getInternacional());
	        System.out.print("\n	--- Equipo: ");	
	        System.out.print("\n    Nombre: " + jugadores.getNombret());
   	        System.out.print("\n    Año fundacion: " + jugadores.getAños());
   	        System.out.print("\n    Localidad: " + jugadores.getLocalidad());
   	        System.out.print("\n    Division actual: " + jugadores.getDivision());
   	        
   	        entrenador.titulos();
   	        jugadores.titulos();

	        //Hashtable

	       /* Hashtable<String,String> otrosEspacios = new Hashtable<String,String>();

	        otrosEspacios.put("Playa", "Zurriola");
			otrosEspacios.put("Plaza", "Zumardi");
			otrosEspacios.put("Biblioteca", "Madalen");
			otrosEspacios.put("Hospital", "Edificio Gipuzkoa");


			System.out.print("\n\n--- Hashtable erabiltzen: \n");
			System.out.println(otrosEspacios.get("Playa"));
			System.out.println(otrosEspacios.get("Hospital"));*/
	        
	}
}

