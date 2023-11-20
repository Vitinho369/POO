package persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import aplicacao.Socio;
import persistencia.Conexao;

public class SocioDAO {
	private Conexao c;
	private String atualizar = "UPDATE Socio SET nome = ?, data_adm = ? WHERE cpf = ?";
	private String inserir = "INSERT INTO Socio (cpf, nome, data_adm) VALUES(?,?,?)";
	private String relatorio = "SELECT * FROM Socio";
	private String deletar = "DELETE FROM Socio WHERE cpf = ?";
	private String buscar = "SELECT * FROM Socio WHERE cpf = ?";
	
	public SocioDAO() {
		c = new Conexao("jdbc:postgresql://localhost:5432/BDSocio","vitinho","vitinho");
	}
	
	public void deletar(int cpf) {
		try {
			c.conectar();
			PreparedStatement instrucao = c.getConexao().prepareStatement(deletar);
			instrucao.setInt(1, cpf);
			instrucao.execute();
			c.desconectar();
		}catch(Exception e) {
			System.out.println("Erro ao deletar socio");
		}
	}
	
	public void relatorio() {
		try {
			c.conectar();
			Statement instrucao = c.getConexao().createStatement();
			ResultSet rs = instrucao.executeQuery(relatorio);
			
		}catch(Exception e){
			
		}
	}
	
	public void inserir(Socio s) {
		try {
			c.conectar();
			PreparedStatement instrucao = c.getConexao().prepareStatement(inserir);
			instrucao.setInt(1, s.getCpf_s());
			instrucao.setString(2, s.getNome_s());
			instrucao.setString(3, s.getData_adm());
			instrucao.execute();
			c.desconectar();
		}catch(Exception e) {
			System.out.println("Erro ao inserir socio");
		}
	}
	
	public void alterar(){
		
	}
}
