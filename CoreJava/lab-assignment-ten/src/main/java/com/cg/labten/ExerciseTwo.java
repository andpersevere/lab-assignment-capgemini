package com.cg.labten;

import java.time.LocalTime;

public class ExerciseTwo {

	public void run() {
		while (true) {
			System.out.println(LocalTime.now());
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}

		}
	}

}
