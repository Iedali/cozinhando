
package cozinhando;

import java.util.concurrent.Semaphore;

public class Cozinhando {
	private String name;
	private Semaphore pratos;
	private Semaphore fila_entrega;


        public Cozinhando(String name) {
		name = name;
		pratos = new Semaphore(5);
		fila_entrega = new Semaphore(1);
	}

	public void novoPrato() {
		new Prato(name, pratos, fila_entrega).start();
	}
}