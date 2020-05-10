
/*Una empresa ens demana desenvolupar un software per gestionar el sous del seus empleats.
El sistema de pagament dependrà de l’empleat. Hi ha quatre tipus:
- Manager: cobren un 10% més del seu salari mensual.
- Boss: cobren un 50% més del seu salari mensual.
- Employee: cobren el sou mensual aplicant una reducció del 15%
- Volunteer: no cobren
S’ha de partir del projecte parcialment desenvolupat i acabar les funcionalitats pendents 
de programar per tal que el software funcioni correctament.*/

package com.jobs.view;

import com.jobs.application.JobsController;

public class Main {

	private static JobsController controller=new JobsController(); 
	
	public static void main(String[] args) throws Exception {

		controller.createBossEmployee("Pepe Boss", "Direccion molona", "666666666", 100.0);
		controller.createEmployee("Pedro Employee", "Direccion molona 2", "665266666", 40.0);
		controller.createEmployee("Laura Employee", "Direccion molona 3", "625266666", 45.0);
		controller.createVolunteer("Juan Volunteer", "Direccion molona 4", "614266666", "No Salary.");
		controller.createManagerEmployee("Pedro Employee", "Direccion molona 2", "665226666", 80.0);

		controller.payAllEmployeers();
		
		System.out.println("EMPLOYEES: \n" + controller.getAllEmployees());
	}
}
