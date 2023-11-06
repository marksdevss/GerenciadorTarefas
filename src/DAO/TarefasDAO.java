package DAO;

import ConexaoTarefas.ConexaoSQL;
import Model.TarefasModel;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TarefasDAO {

    public void CreateTarefas(TarefasModel tarefasModel) {

        String sql = "INSERT INTO tarefas (nome,tipo_tarefa,data_tarefas) VALUES (?,?,?)";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {

            connection = ConexaoSQL.ConexaoBD();

            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, tarefasModel.getNome());
            preparedStatement.setString(2, tarefasModel.getTipo_tarefa());
            preparedStatement.setString(3, tarefasModel.getData_tarefas());

            preparedStatement.execute();

        } catch (Exception e) {

            System.out.println(e + "Erro cadastro tarefas!");

        }

    }

    public List<TarefasModel> ShowTarefas() {

        String sql = "SELECT * FROM tarefas";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        ArrayList<TarefasModel> tms = new ArrayList<>();
        //classe que vai recuperar os dados do banco.
        ResultSet resultSet = null;

        try {

            connection = ConexaoSQL.ConexaoBD();
            preparedStatement = connection.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {

                TarefasModel tm = new TarefasModel();

                tm.setId_tarefa(resultSet.getInt("id_tarefa"));
                tm.setNome(resultSet.getString("nome"));
                tm.setTipo_tarefa(resultSet.getString("tipo_tarefa"));
                tm.setData_tarefas(resultSet.getString("data_tarefas"));

                tms.add(tm);

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return tms;
    }

    public void DeleteTarefas(int id) {

        String sql = "DELETE FROM tarefas WHEN id_tarefas = ?";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConexaoSQL.ConexaoBD();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, id);

            preparedStatement.execute();

        } catch (Exception e) {
            System.out.println("Erro " + e);
        }

    }

}
