package edu.curso.aula2;

public class UsaJobs {

	public static void main(String[] args) {
		JobA jA = new JobA();
		JobB jB = new JobB();
		Thread tA = new Thread(jA);
		Thread tB = new Thread(jB);
		tA.start();
		tB.start();
	}
}
