public class Entrenador extends Equipo {

	public Entrenador(){
		super();
	}

	//propiedades de la subclase
	public String nombree;
	public int edade;
	public boolean expprimera;
	
	//getter y setter
		public void setNombree(String izena){
			this.nombree=izena;
		}
		public String getNombree(){
			return nombree;
		}

		public void setEdade(int adina){
			this.edade=adina;
		}
		public int getEdade(){
			return edade;
		}

		public void setExpprimera(boolean expe){
			this.expprimera=expe;
		}
		public boolean getExpprimera(){
			return expprimera;
		}

		@Override
		public void titulos() {
		//super.titulos();
		System.out.println("Este entrenador ha ganado titulos");
	}
}
