package oopTest;

public class Main {

	public static void main(String[] args) {
		
		Homework homework1 = new Homework(1,"1.G�n","�dev1","Java veri tipleri","Bitir ve Devam et" );
		
		Homework homework2 = new Homework(2,"1.G�n","�dev2","Alt�n.in sitesine gidiniz ve �art bloklar�n� bulunuz","Bitir ve Devam et");
		
		Homework homework3 = new Homework(3,"1.G�n","�dev3","5-23 aras� videolar� izleyiniz","Bitir ve Devam et");
		
		Homework[] homeworks = {homework1,homework2,homework3};
		
		for(Homework homework : homeworks) {
			
			System.out.println(homework.homeworkName);
		}
		System.out.println(homeworks.length);
		
		
		HomeworkManager homeworkManager = new HomeworkManager();
		
		homeworkManager.homeworkCompleted(homework1);
		homeworkManager.homeworkCompleted(homework2);
		homeworkManager.homeworkCompleted(homework3);
		
		HomeworkManager homeworkManager2 = new HomeworkManager();
		
		homeworkManager2.anotherHomework(homework1);
		homeworkManager2.anotherHomework(homework2);
		homeworkManager2.anotherHomework(homework3);

		

	}
	

	

}
