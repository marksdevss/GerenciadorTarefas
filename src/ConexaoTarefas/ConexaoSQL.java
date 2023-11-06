package ConexaoTarefas;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexaoSQL {

        private static final String DATABASEURL = "jdbc:mysql://localhost:3306/gerenciadorTarefas";
        private static final String USER = "root";
        private static final String PASSWORD = "";

        public static Connection ConexaoBD() throws Exception {

            Connection connection = DriverManager.getConnection(DATABASEURL, USER, PASSWORD);

            return connection;

        }

        public static void main(String[] args) throws Exception {

            Connection connection = ConexaoBD();

            if (connection != null) {

                JOptionPane.showMessageDialog(null, "Conectado com sucesso");

                connection.close();

            }

        }

    }

