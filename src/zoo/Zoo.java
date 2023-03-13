package zoo;

import animal.Animal;
import cage.AnimalCage;
import cage.LionCage;
import cage.SnakeCage;
import cage.WolfCage;

public class Zoo {

   private AnimalCage<? extends Animal> uniCage1 = new LionCage();
   private AnimalCage<? extends Animal> uniCage2 = new WolfCage();
   private AnimalCage<? extends Animal> uniCage3 = new SnakeCage();

}
