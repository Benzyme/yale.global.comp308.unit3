class Dog {
    public String name;
    public String says;
    public Dog(String n, String s) {
        this.name = n;
        this.says = s;
    }


    public static void main(String[] args) {
        Dog spot = new Dog("spot", "Ruff!");
        Dog scruff = new Dog("scruffy", "Wurf!");

        System.out.println(spot.name + " says: " + spot.says);
        System.out.println(scruff.name + " says: " + scruff.says);

        Dog jesus = spot;
        System.out.println("Does jesus = spot? " + jesus.equals(spot));
        System.out.println("Does jesus == spot? " + (jesus == spot));


        System.out.println("Does jesus == scruff? " + (jesus == scruff));
        System.out.println("Does jesus = scruff? " + jesus.equals(scruff));
    }
}
