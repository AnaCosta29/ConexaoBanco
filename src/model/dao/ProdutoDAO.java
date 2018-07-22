
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
import model.bean.Produto;

public class ProdutoDAO {

    public void create(Produto p) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO produtos (descricao_prod,preco_un_prod,qtd)VALUES(?,?,?)");
            
            stmt.setString(1,p.getDescricao_prod());
            stmt.setDouble(2, p.getPreco_un_prod());
            stmt.setInt(3, p.getQtd());

            stmt.execute();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public List<Produto> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM produtos");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Produto produto = new Produto();

                produto.setCodigo_prod(rs.getInt("codigo_prod"));
                produto.setDescricao_prod(rs.getString("descricao_prod"));
                produto.setPreco_un_prod(rs.getInt("preco_un_prod"));
                produto.setQtd(rs.getInt("qtd"));
                produtos.add(produto);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return produtos;

    }
    public List<Produto> readForDesc(String desc) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Produto> produtos = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM produtos WHERE descricao_prod LIKE ?");
            stmt.setString(1, "%"+desc+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Produto produto = new Produto();
               
                produto.setDescricao_prod(rs.getString("descricao_prod"));
                produto.setQtd(Integer.parseInt("qtd"));
                produto.setPreco_un_prod(rs.getDouble("preco_un_prod"));
                
                produtos.add(produto);
                
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return produtos;

    }

    public void update(Produto p) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE produtos SET descricao_prod = ? ,qtd = ?,preco_un_prod = ? WHERE codigo_prod = ?");
//            stmt.setInt(1, p.getCodigo_prod());
//            stmt.setString(2, p.getDescricao_prod());
//            stmt.setDouble(3, p.getPreco_un_prod());
//            stmt.setDouble(4, p.getQtd());

              stmt.setString(1, p.getDescricao_prod());
              stmt.setInt(2, p.getQtd());
              stmt.setDouble(3, p.getPreco_un_prod());
              stmt.setInt(4, p.getCodigo_prod());
              stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    public void delete(Produto p) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM produtos WHERE codigo_prod = ?");
            stmt.setInt(1, p.getCodigo_prod());

            stmt.execute();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

}
