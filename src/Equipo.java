public class Equipo {
	protected String nombret;
	protected int años;
	protected String localidad;
	protected String division;
	
	//getter y setter
	public void setNombret (String izena){
		nombret = izena;
	}
	
	public String getNombret(){
		return nombret;
	}

	public void setAños (int urteak){
		años = urteak;
	}
	public int getAños(){
		return años;
	}

	public void setLocalidad (String prem){
		localidad = prem;
	}
	public String getLocalidad(){
		return localidad;
	}
	
	public void setDivision (String div){
		division = div;
	}
	public String getDivision(){
		return division;
	}

	public void titulos() {
		System.out.println("Este equipo ha ganado titulos");
	}
}
