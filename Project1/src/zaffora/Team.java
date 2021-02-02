package zaffora;

public class Team {
    private String name;
    private int[][] score = new int[10][4];
    private int[] gameTotal = new int[10];
    private float q1=0,q2=0,q3=0,q4=0;

    void setName(String name){
    this.name = name;
    }

    float getQ1(){avgSumQs(); return q1;}
    float getQ2(){avgSumQs(); return q2;}
    float getQ3(){avgSumQs(); return q3;}
    float getQ4(){avgSumQs(); return q4;}
    float getH1(){
        float h1 = q1+q2;
        return h1;
    }
    float getH2(){
        float h2 = q3 + q4;
        return h2;
    }
    float getGame(){
        float g = q1+q2+q3+q4;
        return g;
    }


   void random(){
       // Setting the random scores for the 4 teams
       for (int game = 0; game < 10; game++) {
           for (int qtr = 0; qtr < 4; qtr++) {
               score[game][qtr] = (int) (Math.random() * 25) + 5;
           }
       }
       }

   void printQrt(int game) {
               for (int qtr = 0; qtr < 4; qtr++) {
                   System.out.print(name + ": \n" + score[game][qtr] + "\t");
               }

       }
    // Total for each game
    void gTotal(){
        for(int game=0; game<10; game++){
            for(int qtr=0; qtr<4; qtr++){
                gameTotal[game] += score[game][qtr];
            }
        }
    }

   // Averages each quarter for use in other methods
   private void avgSumQs(){
       for (int game=0; game < 10; game++){
           q1 += score[game][0] / 10;
           q2 += score[game][1] / 10;
           q3 += score[game][2] / 10;
           q4 += score[game][3] / 10;
       }
   }

    // 1: View average points scored by quarter
    void averageQtr(){
        avgSumQs();
        System.out.println("Q1: " + q1 + "\n" +
                "Q2: " + q2 + "\n" +
                "Q3: " + q3 + "\n" +
                "Q4: " + q4 + "\n");
    }


    // 2: View average points scored by half.
    void averageHalf(){
        avgSumQs();
        System.out.print("H1: " + (q1+q2) + "\n" +
                "H2: " + (q3+q4) + "\n");
    }

    // 3: View average points scored by game.
    void averageGame (){
        avgSumQs();
        System.out.println("Average points per game: " + (q1+q2+q3+q4) + "\n");
    }

    // 4: View average point difference by quarter.
    // See case 4 in Main.java

    // 5: View average point difference by half.
    // See case 5 in Main.java

    // 6: View average point difference by game.
    // See case 6 in Main.java

    // 7: View highest points scored.
    // This gives the highest game score.
    int highGame(){
        int max=0;
        gTotal();
        for (int game=0; game<10; game++){
            if (max <= gameTotal[game])
                max = gameTotal[game];
        }
        return max;
    }

    // 8: View lowest points scored.
    // This shows the lowest game score.
    int lowGame(){
        int low=0;
        gTotal();
        for (int game=0; game<10; game++){
            if (low >= gameTotal[game])
                low = gameTotal[game];
        }
        return low;
    }



}
