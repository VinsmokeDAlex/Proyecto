import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
	private Connection conexion;
	
	public Connection conectarBaseDatos () {
		try {
			Class.forName("org.postgresql.Driver");
			final String url = "jdbc:postgresql://10.0.11.12:5432/rafex";
			this.conexion = DriverManager.getConnection(url, "externo","externo123");
			
			System.out.println("Conexion exitosa");
		} catch (final SQLException | ClassNotFoundException e){
		   	System.err.println("No se pudo conectar a la BD");
		   	System.err.println(e.getMessage());
	
		}
		return this.conexion;
	}		
	
	public void cerrarConexion() {
		try {
			if (this.conexion !=null) {
				this.conexion.close();
			}
		} catch (final SQLException ex) {
			System.err.println("Error al cerrar conexion");
			System.err.println(ex.getMessage());

		}
	}
}
