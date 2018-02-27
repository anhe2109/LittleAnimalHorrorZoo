

public class Animal{

   private String name;
   private String sound;
   private int xAnimal;
   private int yAnimal;


// Constructor - vi konstruerer objektet
   public Animal (String name, String sound, int xAnimal, int yAnimal){
      this.name = name;
      this.sound = sound;
      this.xAnimal = xAnimal;
      this.yAnimal = yAnimal;
   
   }

   public void tell(){
      System.out.println("I am the " + name + " and I am standing at the square " + xAnimal + ", " + yAnimal);
   }

   public void setX(int xAnimal){
      this.xAnimal = xAnimal;
   }
  
   public void setY(int yAnimal){
      this.yAnimal = yAnimal;
   }
   
   public int getX(){
    return xAnimal;
   }    
    
   public int getY(){
      return yAnimal;
   }   
       
       
   public void setSound(String sound){
      this.sound = sound;
   }
   public String getSound(){
      
      return sound;
   }
   public String getName(){
      return name;
   
      
   }
   
   public void setName(String animalName){
      name = animalName;
   }

      

}
