public class DiceRoll {

    int freq1 = 0;
    int freq2 = 0;
    int freq3 = 0;
    int freq4 = 0;
    int freq5 = 0;
    int freq6 = 0;

    public void roll(){
        for (int i  = 0; i < 1000; i++) {
        	 // Math.random() generates random number from 0.0 to 0.999
            double rand  = Math.random();

            if (rand >= 0 && rand < (1.0/6.0)){
                freq1+= 1;
            }
            else if (rand >= (1.0/6.0) && rand < (2.0/6.0)){
                freq2+= 1;
            }
            else if(rand >= (2.0/6.0) && rand < (3.0/6.0)){
                freq3+= 1;
            }else if(rand >= (3.0/6.0) && rand < (4.0/6.0)){
                freq4+= 1;
            }else if(rand >= (4.0/6.0) && rand < (5.0/6.0)){
               freq5+= 1;
            }else if (rand >= (5.0/6.0) && rand < (6.0/6.0)){
                freq6+= 1;
            }
        }
        display();
    }

    public void display(){
        double rounds = 1000;
        double percent = 100;
        double face1percentage =(freq1 / rounds) * percent;
        double face2percentage = (freq2 / rounds) * percent;
        double face3percentage =(freq3 / rounds) * percent;
        double face4percentage =(freq4 / rounds) * percent;
        double face5percentage =(freq5 / rounds) * percent;
        double face6percentage =(freq6 / rounds) * percent;

        int total_frequency = freq1 + freq2 + freq3 + freq4 + freq5 + freq6;
        double total_percentage = face1percentage + face2percentage + face3percentage + face4percentage + face5percentage + face6percentage;

        System.out.println("\nFACE\tFREQUENCY\tPERCENTAGE");
        System.out.printf(" 1\t%d\t\t%.1f \n 2\t%d\t\t%.1f \n 3\t%d\t\t%.1f "
                        + "\n 4\t%d\t\t%.1f \n 5\t%d\t\t%.1f \n 6\t%d\t\t%.1f " ,
                        freq1 , face1percentage,
                        freq2 , face2percentage,
                        freq3 , face3percentage,
                        freq4 , face4percentage,
                        freq5 , face5percentage,
                        freq6 , face6percentage);
        System.out.printf("\n\nTotal\t%d \t\t%.1f", total_frequency, total_percentage);
    } 

    public static void main(String[] args) {
    DiceRoll my_dice = new DiceRoll();
        my_dice.roll();
    }

}
