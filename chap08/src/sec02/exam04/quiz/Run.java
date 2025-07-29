package sec02.exam04.quiz;

public class Run {

public static void main(String[] args) {
		Animal[] animalArr = new Animal[3];
		
		animalArr[0] = new Dog("강아지", 4);
		animalArr[1] = new Lion("사자", 4);
		animalArr[2] = new Eagle("독수리", 2);
	
		for (Animal animal : animalArr) {
			System.out.println(animal.getKind() + ", " + "다리수: " + animal.getLeg() + "개");
			animal.sound();
			animal.eat();
			if(animal instanceof Eagle e) {
				e.fly();
			}
			
		}
		
		
		
		
		
	}

}
