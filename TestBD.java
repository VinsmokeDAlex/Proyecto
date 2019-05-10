import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestBD {
	public static void main (final String [] args) {
		
		//Llamar clase	
		final Conexion conectBD = new Conexion ();

		final Connection connection = conectBD.conectarBaseDatos();
		// Consulta de SQL        Llamar la tabla
		final String nombreTabla = "Animales";                     //Indicar a SQL que pondra los datos en esos espacios
		final String insertaDato = "INSERT INTO public.\"" + nombreTabla + "\" (nombre, ubicacion, extincion ) Values (?, ?, ?);";
		final String querySQLSelect = "SELECT * FROM public.\"" + nombreTabla + "\";";
		try {
			PreparedStatement ps = connection.prepareStatement(insertaDato);
			ps.setString(1, "Phocoena sinus");
		 	ps.setString(2, "Ensenada");
		 	ps.setBoolean(3, false);
		 	
		 	ps.executeUpdate();
		 	
		 	ps = connection.prepareStatement(querySQLSelect);
		    ResultSet rs = ps.executeQuery();
		    
		 	while (rs.next()) {
				 System.out.print("||");
				 System.out.print(rs.getInt("id"));
				 System.out.print("||");
				 System.out.print(rs.getString("nombre"));
				 System.out.print("||");
				 System.out.print(rs.getString("ubicacion"));
				 System.out.print("||");
				 System.out.print(rs.getBoolean("extincion"));
				 System.out.print("||");
				 System.out.println(); 
			 }	 
		} catch (final SQLException e) {
			e.printStackTrace();
		
		}
	}
}
