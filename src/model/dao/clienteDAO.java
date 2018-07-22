/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Cliente;


/**
 *
 * @author 31813256
 */
public class clienteDAO {
       public void create(Cliente c) {
         Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        
        try {
            stmt = con.prepareStatement("INSERT INTO cliente(nome,data,telefone,email,cpf,sexo )VALUES(?,?,?,?,?,?)");
            
         
      
            stmt.setString(1, c.getNome());
            
            stmt.setString(2,c.getData());
            stmt.setInt(3,c.getTelefone());
            //stmt.setInt(4,c.getCelular());
            stmt.setString(4,c.getEmail());
            stmt.setString(5,c.getCpf());
            stmt.setString(6,c.getSexo());
           
            
            stmt.execute();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }

    public List<Cliente> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cliente> cadas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM cliente");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Cliente c = new Cliente();
                
                
                c.setCodigo_funcionario(rs.getInt("codigo_funcionario"));
               
                c.setNome(rs.getString("nome"));
                c.setData(rs.getString("data"));
                c.setTelefone(rs.getInt("telefone"));
               // c.setCelular(rs.getInt("celular"));
                c.setEmail(rs.getString("email"));
                c.setCpf(rs.getString("cpf"));
                c.setSexo(rs.getString("sexo"));
                 
                cadas.add(c);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return cadas;

    }
    public List<Cliente> readForDesc(String nome) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cliente> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM cliente WHERE nome LIKE ?");
            stmt.setString(1, "%"+nome+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Cliente c = new Cliente();
                c.setCodigo_funcionario(rs.getInt("codigo_funcionario"));
                c.setNome(rs.getString("nome"));
                c.setEmail(rs.getString("email"));
                c.setTelefone(rs.getInt("telefone"));
                c.setCelular(rs.getInt("celular"));
                c.setData(rs.getString("data"));
                c.setSexo(rs.getString("sexo"));
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return produtos;

    }

    public void update(Cliente c) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE cliente SET nome = ?,data = ?,telefone = ?,celular=?,data=?,cpf=?,sexo=? WHERE codigo_funcionario = ?");
            stmt.setString(1, c.getNome());
            
            stmt.setString(2,c.getData());
            stmt.setInt(3,c.getTelefone());
            stmt.setInt(4,c.getCelular());
            stmt.setString(5,c.getEmail());
            stmt.setString(6,c.getCpf());
            stmt.setString(7,c.getSexo());
            
           stmt.setInt(8, c.getCodigo_funcionario());
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    public void delete(Cliente c) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM cliente WHERE codigo_funcionario = ?");
            stmt.setInt(1, c.getCodigo_funcionario());

            stmt.execute();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
}
