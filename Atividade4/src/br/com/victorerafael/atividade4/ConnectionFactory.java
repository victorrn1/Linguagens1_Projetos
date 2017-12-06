//Victor Rampanha Nicolaus RA: 14.01617-6
//Rafael Negrão Chaves Caielli RA: 15.04095-0
package br.com.victorerafael.atividade4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Aluno 16
 */
public class ConnectionFactory {
    
    public static Connection getConnection(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost/bus_travel", "root", "");
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
