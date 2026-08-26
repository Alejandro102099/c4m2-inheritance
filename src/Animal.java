public abstract class Animal {

   private String name;
   private Integer age;
   private String genre;

   public Animal(String name, Integer age, String genre) {
    this.name = name;
    this.age = age;
    this.genre = genre;
   }
   
   //distintos getters para poder obtener la relación
   public String getName() {
    return name;
   }

   public Integer getAge() {
    return age;
   }

   public String getGenre() {
    return genre;
   }
   
   //metodo para cambiar el nombre y es protegido
   protected void setName(String name) {
       this.name = name;
   }
   
   public abstract void hunt();

   // Al decir que este metodo es abstracto, ya no necesito darle un bloque de codigo, porque yo como clase 
   // abtracta, yo no se como voy a hacer ruido. Yo puedo tener un sonido generico, pero entonces en este caso, 
   // lo mejor es dejar que cada uno de los hijos que defina su sonido
   // con esto obligo que todas las clases hijas tengan estos dos metodos hunt y makeNoice
   public abstract void makeNoice();

   // metodo para aumentar la edad al animal
   public void happyBirthday(){
        age++;
   }

}
