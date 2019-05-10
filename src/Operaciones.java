
public enum Operaciones {

	Multiplicacion ("m"), Adicion("a"), Diferencia("d"), cociente ("c"), Raiz("r"), Cuadrado ("s");  ;
	
    private final String inOperacion;

    Operaciones(final String inOperacion){
    	this.inOperacion = inOperacion;
    	
    }

    public String getInicialOperacion() {
        return this.inOperacion;
    }
    
}
