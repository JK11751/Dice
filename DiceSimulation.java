package dicesimulation;

public class DiceSimulation {
  
    public static void main(String[] args) {
    	//variables declaration and initialization
    	int freq[] = new int [6];
	    int freqtotal=0;
		double pertotal=0;
		String face = "Face";
		String total="Total";
		String frequency = "Frequency";
		String percentagestr = "Percentage";
	    System.out.printf ("%-10s %-12s %s",face, frequency, percentagestr);
		 System.out.println ();
		 
		  //roll method
	        for (int i  = 0; i < 1000; i++) {
	        	 // Math.random() generates random number from 0.0 to 0.999
	            double rand  = Math.random();

	            if (rand >= 0 && rand < (1.0/6.0)){
	                freq[0]++;
	            }
	            else if (rand >= (1.0/6.0) && rand < (2.0/6.0)){
	                freq[1]++;
	            }
	            else if(rand >= (2.0/6.0) && rand < (3.0/6.0)){
	                freq[2]++;
	            }else if(rand >= (3.0/6.0) && rand < (4.0/6.0)){
	                freq[3]++;
	            }else if(rand >= (4.0/6.0) && rand < (5.0/6.0)){
	               freq[4]++;
	            }else if (rand >= (5.0/6.0) && rand < (6.0/6.0)){
	                freq[5]++;
	            }
	        }
	        
	        for(int i = 1; i <= 6; i++){
	        	//calculate frequency total
	            freqtotal+=freq[i - 1];
	           // calculate percentage of each frequency
		    	double percentage = ((double) freq[i-1] / 1000) * 100;
		    	//summation of faces percentage and should equal to 100%
		    	pertotal+=percentage;
		    	//display 
		        System.out.printf ("%3d %11d %12.1f%% \n",i, freq[i - 1], percentage);
		        }
			  System.out.printf ("%-10s %03d %12.1f%% \n",total, freqtotal, pertotal);
}
    }



    
    