package faj.poo.usina.dao;

import faj.poo.usina.model.Usinas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UsinasDao {
	@Autowired

	private JdbcTemplate jdbcTemplate;

	public Usinas incluir(Usinas u) throws Exception {
		validar(u, true);
		String sqlInsert = "INSERT INTO USINAS (id, nome, capacidadeEnergetica, tipo, status) VALUES(?, ?, ?, ?, ?)";

		try (Connection con = jdbcTemplate.getDataSource().getConnection();
			 PreparedStatement ps = con.prepareStatement(sqlInsert)) {
			ps.setInt(1, u.getId());
			ps.setString(2, u.getNome());
			ps.setInt(3, u.getCapacidadeEnergetica());
			ps.setString(4, u.getTipo());
			ps.setBoolean(5, u.getStatus());

			int result = ps.executeUpdate();
			if (result == 1) {
				System.out.println("Usina inserida com sucesso:" + u.getNome());
				return u;
			}
			throw new Exception("Erro ao inserir no banco.");
		}
	}


	private void validar(Usinas u, boolean incluir) throws Exception {
		if (u.getNome() == null || u.getNome().trim().isEmpty()) {
			throw new Exception("Nome da usina vazio");
		}
		if (incluir) {
			String query = "select nome from usinas where nome = ?";
			try (Connection con = jdbcTemplate.getDataSource().getConnection();
				 PreparedStatement ps = con.prepareStatement(query);) {
				ps.setString(1, u.getNome());
				try (ResultSet rs = ps.executeQuery()) {
					if (rs.next()) {
						throw new Exception("Nome já cadastrado");
					}
				}
			}
		}
	}

	public List<Usinas> listar() {
		List<Usinas> lista = new ArrayList<>();
		try (Connection con = jdbcTemplate.getDataSource().getConnection();
			 Statement stmt = con.createStatement()) {
			String sql = "SELECT * FROM USINAS";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				int id = rs.getInt("ID");
				String nome = rs.getString("NOME");
				int capacidadeEnergetica = rs.getInt("CAPACIDADEENERGETICA");
				String tipo = rs.getString("TIPO");
				boolean status = rs.getBoolean("STATUS");

				Usinas u = new Usinas();
				u.setId(id);
				u.setNome(nome);
				u.setCapacidadeEnergetica(capacidadeEnergetica);
				u.setTipo(tipo);
				u.setStatus(status);
				lista.add(u);
			}
			rs.close();
		} catch (Exception ex) {
			System.out.println("Erro ao listar Usinas");
		}
		return lista;
	}

	public Usinas alterar(Usinas u) throws Exception {

		String sqlUpdate = "UPDATE FROM USINAS (id, nome, capacidadeEnergetica, tipo, status) WHERE ID=?";

		try (Connection con = jdbcTemplate.getDataSource().getConnection();
			 PreparedStatement ps = con.prepareStatement(sqlUpdate)) {
			ps.setInt(1, u.getId());

			int result = ps.executeUpdate();
			if (result == 1) {
				System.out.println("Usina alterada com sucesso:" + u.getNome());
				return u;
			}
			throw new Exception("Erro ao alterar no banco.");
		}


	}
	public boolean excluir(Usinas u) throws Exception{
		String sql = "DELETE FROM USINAS WHERE ID=?";

		try(Connection con = jdbcTemplate.getDataSource().getConnection();
			PreparedStatement ps = con.prepareStatement(sql)){
			ps.setInt(1, u.getId());
			return ps.executeUpdate()>0;
		}

	}

}
