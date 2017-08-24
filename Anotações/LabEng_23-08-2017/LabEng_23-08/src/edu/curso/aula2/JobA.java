package edu.curso.aula2;

public class JobA implements Runnable {

	@Override
	public void run() {
		while(true) {
			System.out.println("Execução do Job A!");
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
