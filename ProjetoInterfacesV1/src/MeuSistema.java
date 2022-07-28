
public class MeuSistema {
	public static void main(String[] args) {
		InterfaceDB idb,idb2;
		
		idb = new DBAccess();
		// vou conectar no banco de dados
		idb.conectar();
		//vou recuperar dados
		idb.executar("SELECT * FROM tb_clientes");
		//vou desconectar do banco de dados
		idb.desconectar();
		
		idb2 = new DBMysql();
		idb2.conectar();
		idb2.executar("SELECT * FROM tb_clientes");
		idb2.desconectar();
	}
	
}
