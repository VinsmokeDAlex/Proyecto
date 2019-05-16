import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conect {
private Connection conexion;
	
	public Connection conectarBaseDatos () {
		try {
			Class.forName("org.postgresql.Driver");
			final String url = "jdbc:postgresql://ec2-50-19-127-115.compute-1.amazonaws.com";
			this.conexion = DriverManager.getConnection(url, "rmoksuyuzefzvp","fe59804f36b943d7aaecb75f3d75bdd6d8279efb8ffbd6945591da291029a704");
			
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
