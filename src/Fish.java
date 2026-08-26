public class Fish extends Animal {
    private String color;
    private boolean formSea;
    public Fish(String name, Integer age, String genre, String color, boolean forSea) {
        super(name, age, genre);
        this.color = color;
        this.formSea = forSea;
    }

    public String getColor() {
        return color;
    }

    public boolean isFormSea() {
        return formSea;
    }
    
    public void swin(){
        System.out.printf("%s esta nadando%n", getName());
    }

    public boolean canPutEggs(){
        return getGenre().equalsIgnoreCase("hembra");
    }
    
    @Override
    public void hunt() {
        System.out.printf("%s esta nadando, se cruza con el objetivo, abre la boca y se lo come%n", getName());
    }
    
    @Override
    public void makeNoice() {
        System.out.printf("%s dice GLOB GLOB%n", getName());
    }

}
