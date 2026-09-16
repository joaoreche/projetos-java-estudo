package fatec.poo.control;

import fatec.poo.model.Hotel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Joao Reche e Leonardo Cordeiro
 */
public class DaoHotel {

    private Connection conn;

    public DaoHotel(Connection conn) {
        this.conn = conn;
    }

    public Hotel consultar(int codigo) {
        Hotel objHotel = null;

        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("SELECT * from tblHotel where Codigo_Hot = ?");

            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                objHotel = new Hotel(rs.getInt("Codigo_Hot"),
                        rs.getString("Nome_Hot"));
                objHotel.setEndereco(rs.getString("Endereco_Hot"));
                objHotel.setTelefone(rs.getString("Telefone_Hot"));
                objHotel.setValorDiaria(rs.getDouble("ValorDiaria_Hot"));
                objHotel.setTotalFaturamento(rs.getDouble("TotalFaturamento_Hot"));
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (objHotel);
    }

    public void inserir(Hotel objHotel) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("INSERT into tblHotel values(?,?,?,?,?,?)");
            ps.setInt(1, objHotel.getCodigo());
            ps.setString(2, objHotel.getNome());
            ps.setString(3, objHotel.getEndereco());
            ps.setString(4, objHotel.getTelefone());
            ps.setDouble(5, objHotel.getValorDiaria());
            ps.setDouble(6, objHotel.getTotalFaturamento());

            ps.execute(); //envia a instrução SQL para o SGBD
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void alterar(Hotel objHotel) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("UPDATE tblHotel set Nome_Hot = ?, "
                    + "Endereco_Hot = ?, "
                    + "Telefone_Hot = ?, "
                    + "ValorDiaria_Hot = ?, "
                    + "TotalFaturamento_Hot = ? "
                    + "where Codigo_Hot = ?");

            ps.setString(1, objHotel.getNome());
            ps.setString(2, objHotel.getEndereco());
            ps.setString(3, objHotel.getTelefone());
            ps.setDouble(4, objHotel.getValorDiaria());
            ps.setDouble(5, objHotel.getTotalFaturamento());
            ps.setInt(6, objHotel.getCodigo());

            ps.execute(); //Envia a instrução SQL para o SGBD
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void excluir(Hotel objHotel) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("DELETE from tblHotel where Codigo_Hot = ?");

            ps.setInt(1, objHotel.getCodigo());

            ps.execute(); //Envia a instrução SQL para o SGBD
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
