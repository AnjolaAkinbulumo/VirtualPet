public class VirtualPet {
    private String name;
    private int age;
    private PetNeeds petNeeds;

    public VirtualPet(String name, int age){
        this.name =name;
        this.age = age;
        this.petNeeds = new PetNeeds();
    }
    public void feed(){
        int decreaseAmount = getRandomNumber(10,20);
        petNeeds.decreaseHunger(decreaseAmount);
    }
    public void drink(){
        int decreaseAmount = getRandomNumber(10,20);
        petNeeds.decreaseThirst(decreaseAmount);
    }
    public void play(){
        int increaseAmount = getRandomNumber(10,20);
        petNeeds.increaseHappiness(increaseAmount);
    }
    public boolean isSick() {
         if (petNeeds.getHunger() >= 100 || petNeeds.getThirst() >= 100) {

         }
        return true;
    }
        public boolean isSad() {
            if (petNeeds.getHappiness() <= 0) {

            }
            return true;
        }
            public void printStatus(){
                System.out.println(name);
                System.out.println(age);
                System.out.println(petNeeds.getHunger() + "/100");
                System.out.println(petNeeds.getThirst() + "/100");
                System.out.println(petNeeds.getHappiness() + "/100");
        }

    private int getRandomNumber(int min, int max){
        return (int) (Math.random() * (max - min +1) + min);
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public PetNeeds getPetNeeds() {
        return petNeeds;
    }


    }



