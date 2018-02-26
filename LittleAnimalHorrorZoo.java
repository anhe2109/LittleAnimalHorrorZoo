
public class LittleAnimalHorrorZoo{


   public static void main (String[] args){
   
   

      Animal snake = new Animal("Snake", "Tssss", 9, 9);
      Animal rabbit = new Animal("Rabbit", "Miv", 0, 0);
      
   
   
    snake.setName("Snake");
    snake.setX(9);
    snake.setY(9);
    snake.tell();
     
    rabbit.setName("Rabbit");
    rabbit.setX(0);
    rabbit.setY(0);
    rabbit.tell();

    snake.setX(8);
    snake.setY(8);
    snake.tell();
    
    rabbit.setX(1);
    rabbit.setY(1);
    rabbit.tell();

    snake.setX(7);
    snake.setY(7);
    snake.tell();
    
    rabbit.setX(2);
    rabbit.setY(2);
    rabbit.tell();
    
    snake.setX(6);
    snake.setY(6);
    snake.tell();
    
    rabbit.setX(3);
    rabbit.setY(3);
    rabbit.tell();
    
    snake.setX(5);
    snake.setY(5);
    snake.tell();
     
    rabbit.setX(4);
    rabbit.setY(4);
    rabbit.tell();
    
    snake.setX(4);
    snake.setY(4);
    snake.tell();


     
     
     if (snake.getX() == rabbit.getX() && snake.getY() == rabbit.getY()){
      System.out.println("Rabbit: Nej - du må ikke spise mig");
      System.out.println("Snake: HA HA - jeg er sulten, og jeg spiser dig alligevel");
      
     }else {
      System.out.println("Rabbit: Jeg var for hurtig"); 
     }
     
           
      
    

}
}
