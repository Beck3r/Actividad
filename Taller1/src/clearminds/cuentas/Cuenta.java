package clearminds.cuentas;

public class Cuenta {
	private String id;
	private String tipo;
	private float saldo;
	public Cuenta(String id) {
		this.tipo = "A";
	}
	public Cuenta(String id, String tipo, float saldo) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.saldo = saldo;
	}
	public String getId() {
		return id;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	
	public void imprimir() {
		System.out.println("************************");
		System.out.println("         CUENTA");
		System.out.println("************************");
		System.out.println("Número de Cuenta: "+id);
		System.out.println("Tipo: "+tipo);
		System.out.println("Saldo: USD "+saldo);
		System.out.println("************************");
	}
	
	public void imprimirConMiEstilo() {
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		System.out.println("|-|-|-|-|-|-|-|-CUENTA BANCARIA-|-|-|-|-|-|-|-|-");
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		System.out.println(".-NUMERO DE CUENTA: "+id);
		System.out.println(".-Tipo: "+tipo);
		System.out.println(".-Saldo: USD "+saldo);
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
	}
	
}
