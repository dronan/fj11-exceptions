public class TesteErro {
	public static void main(String[] args) {
		System.out.println("inicio do main");
		try {
			metodo1();
		} catch (Exception e) {
			System.out.println("erro" + e);
		}
		
		
		System.out.println("fim do main");
	}

	private static void metodo1() {
		// TODO Auto-generated method stub
		System.out.println("inicio do metodo1");
		metodo2();
		System.out.println("fim do metodo1");
	}

	private static void metodo2() {
		// TODO Auto-generated method stub
		System.out.println("inicio do metodo 2");
		int[] array = new int[10];

		for (int i = 0; i <= 15; i++) {
			//try {
				array[i] = i;
				System.out.println(i);
			//} catch (Exception e) {

			//	System.out.println("Erro:" + e);
			//}
		}
		System.out.println("fim do metodo 2");
	}
}
