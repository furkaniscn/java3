package oopTest;

public class Main {

	public static void main(String[] args) {
		
		Homework homework1 = new Homework();
		homework1.homeworkName = "Ödev1";
		homework1.day = "1.Gün";
		homework1.detail = "Java başlangıç terimleri ve giriş";
		homework1.anotherHomework = "Bitir ve devam et";
		
		Homework homework2 = new Homework();
		homework2.homeworkName = "Ödev2";
		homework2.day = "1.Gün";
		homework2.detail = "Java classlar ";
		homework2.anotherHomework = "Bitir ve devam et";
		
		Homework homework3 = new Homework();
		homework3.homeworkName = "Ödev3";
		homework3.day = "1.Gün";
		homework3.detail = "Java metotlar ";
		homework3.anotherHomework = "Bitir ve devam et";
		
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
		
		homeworkManager2.completedLessons(homework1);
		homeworkManager2.completedLessons(homework2);
		homeworkManager2.completedLessons(homework3);

		
		HomeworkManager homeworkManager3 = new HomeworkManager();
		
		homeworkManager3.anotherHomework(homework1);
		homeworkManager3.anotherHomework(homework2);
		homeworkManager3.anotherHomework(homework3);

		

	}
	

	

}
