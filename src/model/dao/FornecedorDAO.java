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
import model.bean.Fornecedor;

/**
 *
 * @author Usuario
 */
public class FornecedorDAO {
    public void salvar(Fornecedor f){
          
         Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO fornecedor(nome,endereco,cidade,cnpj_fornecedor,telefone )VALUES(?,?,?,?,?)");
            
         
      
            stmt.setString(1, f.getNome());
            
            stmt.setString(2,f.getEndereco());
            stmt.setString(3,f.getCidade());
            stmt.setString(4,f.getCnpj_fornecedor());
            stmt.setString(5,f.getTelefone());
           
            
            stmt.execute();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
  public void update(Fornecedor f) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE fornecedor SET nome = ? ,endereco = ?,cidade= ? ,telefone=?,cnpj_fornecedor=?WHERE id_fornecedor = ?");
           

           stmt.setString(1, f.getNome());
            
            stmt.setString(2,f.getEndereco());
            stmt.setString(3,f.getCidade());
            stmt.setString(4,f.getCnpj_fornecedor());
            stmt.setString(5,f.getTelefone());
            stmt.setInt(6,f.getId_fornecedor());
            
              stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
  public void delete(Fornecedor f) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM fornecedor WHERE id_fornecedor = ?");
            stmt.setInt(1, f.getId_fornecedor());

            stmt.execute();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
  
  
    public List<Fornecedor> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Fornecedor> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM fornecedor");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Fornecedor f = new Fornecedor();

                f.setId_fornecedor(rs.getInt("id_fornecedor"));
                f.setNome(rs.getString("nome"));
                f.setCnpj_fornecedor(rs.getString("cnpj_fornecedor"));
                f.setEndereco(rs.getString("endereco"));
                f.setTelefone(rs.getString("telefone"));
                produtos.add(f);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return produtos;

    }
    public List<Fornecedor> readForDesc(String cid) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Fornecedor> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM fornecedor WHERE id_fornecedor LIKE ?");
            stmt.setString(1, "%"+cid+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Fornecedor f = new Fornecedor();

                 f.setId_fornecedor(rs.getInt("id_fornecedor"));
                f.setNome(rs.getString("nome"));
                f.setCnpj_fornecedor(rs.getString("cnpj_fornecedor"));
                f.setEndereco(rs.getString("endereco"));
                f.setTelefone(rs.getString("telefone"));
                
                
                produtos.add(f);
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return produtos;

    }
    }
        
        
      
 

 