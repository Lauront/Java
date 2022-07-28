
public class DBMysql implements InterfaceDB {

	@Override
	public void conectar() {
		System.out.println("Conectar no MySql");
		
	}

	@Override
	public void desconectar() {
		System.out.println("Desconectar do SQL");
		
	}

	@Override
	public void executar(String comando) {
		System.out.println("mysql> " + comando);
		
	}
	

}
