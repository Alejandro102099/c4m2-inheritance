public class App {
    public static void main(String[] args) throws Exception {
        
        var eagle = new Eagle("Maria", 2, "hembra", "Arpia");
        var lion = new Lion("Andres", 5, "macho", "amarillo");
        var fish = new Fish("Nemo", 1, "macho", "naranja", true);
        var duck = new Duck("Manuel", 7,"macho", "negro");

        eagle.fly();
        eagle.hunt();
        eagle.happyBirthday();
        System.out.println("El "+ eagle.getName() + " tiene " + eagle.getAge() + " años");
        System.out.println("El "+ eagle.getName() + " " + (eagle.canPutEggs() ? " si" : " no") + " puede poner huevos");

        lion.run();
        lion.hunt();
        lion.happyBirthday();
        System.out.println("El "+ lion.getName() + " tiene "+lion.getAge()+" años");
        
        fish.swin();
        fish.hunt();
        fish.happyBirthday();
        System.out.println("El "+ fish.getName() + " tiene " + fish.getAge() + " años");
        System.out.println("El "+ fish.getName() + " " + (fish.canPutEggs() ? " si" : " no") + " puede poner huevos ");
        System.out.println("El "+ fish.getName() + " " + (fish.isFormSea() ? " es de mar " : " es de rio "));

        // condicion ? valor verdadero : valor falso

        duck.swin();
        duck.fly();
        duck.run();
        duck.hunt();
        duck.happyBirthday();
        System.out.println("El "+ duck.getName() + " tiene " + duck.getAge() + " años");
        System.out.println("El "+ duck.getName() + " " + (duck.canPutEggs() ? " si" : " no") + " puede poner huevos ");
        
    }
}
