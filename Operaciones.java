
public enum Operaciones {

	MULTIPLICACION ("m"), ADICION ("a"), DIFERENCIA("d"), COCIENTE ("c"), RAIZ("r"), CUADRADO ("s");
	
    private final String inOperacion;

    Operaciones(final String inOperacion){
    	this.inOperacion = inOperacion;
    	
    }

    public String getInicialOperacion() {
        return this.inOperacion;
    }
    
}
