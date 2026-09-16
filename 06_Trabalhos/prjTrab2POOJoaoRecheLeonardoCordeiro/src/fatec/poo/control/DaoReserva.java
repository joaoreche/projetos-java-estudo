package fatec.poo.control;

import fatec.poo.model.Reserva;
import fatec.poo.model.Data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @author Joao Reche e Leonardo Cordeiro
 */
public class DaoReserva {

    private Connection conn;

    public DaoReserva(Connection conn) {
        this.conn = conn;
    }

    public Reserva consultar(int codigo) {
        Reserva objReserva = null;

        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("SELECT * from tblReserva where Codigo_Res = ?");

            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                // Pega a data de entrada que esta salva como texto
                String dataEntradaString = rs.getString("DataEntrada_Res");

                // Quebra o texto onde tem a "/" gerando um vetor com 3 posicoes
                String[] partesData = dataEntradaString.split("/");

                // Converte os pedaços de texto para inteiros
                int dia = Integer.parseInt(partesData[0]);
                int mes = Integer.parseInt(partesData[1]);
                int ano = Integer.parseInt(partesData[2]);

                // Instancia Data
                Data dtEntrada = new Data(dia, mes, ano);

                // Instancia a Reserva
                objReserva = new Reserva(rs.getInt("Codigo_Res"),
                        rs.getString("NomeHosp_Res"),
                        dtEntrada);
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return (objReserva);
    }

    public void inserir(Reserva objReserva) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("INSERT into tblReserva (Codigo_res, NomeHosp_Res, DataEntrada_Res, Codigo_Hot) values(?,?,?,?)");
            ps.setInt(1, objReserva.getCodigo());
            ps.setString(2, objReserva.getNomeHosp());
            ps.setString(3, objReserva.getDataEntrada().obterData());
            ps.setInt(4, objReserva.getHotel().getCodigo());

            ps.execute(); // Envia a instrução SQL para o SGBD
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }

    public void alterar(Reserva objReserva) {
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("UPDATE tblReserva set DataSaida_Res = ?, "
                    + "ValorHosped_Res = ? "
                    + "where Codigo_Res = ?");

            ps.setString(1, objReserva.getDataSaida().obterData());
            ps.setDouble(2, objReserva.getValorHosped());
            ps.setInt(3, objReserva.getCodigo());

            ps.execute(); // Envia a instrução SQL para o SGBD
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
    }
}
