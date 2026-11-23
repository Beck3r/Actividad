package clearminds.cuentas.test;
import clearminds.cuentas.Cuenta;

public class TestCuentas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Creación de instancias con diferentes constructores
		Cuenta cuenta1 = new Cuenta("03476");
		cuenta1.setSaldo(675);
		Cuenta cuenta2 = new Cuenta("03476", "C", 98);
		Cuenta cuenta3 = new Cuenta("03476");
		cuenta3.setTipo("C");
		// 2. Visualización inicial
		System.out.println("-------- Valores Iniciales ---------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		
		//retos adicionales
		
		cuenta1.setSaldo(950.98f);
		cuenta1.setTipo("C");
		
		
		cuenta2.setSaldo(530.99f);
		cuenta2.setTipo("A");
		
		
		cuenta3.setSaldo(260);
		cuenta3.setTipo("A");
		
		cuenta1.imprimirConMiEstilo();
		cuenta2.imprimirConMiEstilo();
		cuenta3.imprimirConMiEstilo();
		
		//parte2
		Cuenta cuenta4 = new Cuenta("0012586699");
		cuenta4.setSaldo(950.98f);
		cuenta4.setTipo("C");
		Cuenta cuenta5 = new Cuenta("0123456789","A",5986.22f);
		cuenta5.setTipo("C");
		Cuenta cuenta6 = new Cuenta("9876543210");
		cuenta6.setSaldo(820);
		
		
		cuenta4.imprimirConMiEstilo();
		cuenta5.imprimirConMiEstilo();
		cuenta6.imprimirConMiEstilo();
	}

}
