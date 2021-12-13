import java.util.Random;

public class main {


    public static void main(String[] args) {

        //Initializing notebooks and other data like random generator and brand names
        Notebook [] allNotebook = new Notebook[10000];
        Random random = new Random();
        String [] brandNames = new String[] {"Lenuvo", "Asos", "MacNote", "Eser ", "Xamiou"};

        //Filling array of notebooks with random values
        for (int i = 0; i < allNotebook.length; i++) {
            Notebook notebook = new Notebook((random.nextInt(41 - 10) + 10) * 50, (random.nextInt(7 - 1) + 1) * 4, brandNames[random.nextInt(4)]);
            allNotebook[i] = notebook;
        }

        /**
         //Sorting Algorithm
         for (int i = 0; i < allNotebook.length; i ++) {
         for (int j = 1; j < allNotebook.length - 1; j++) {
         if(allNotebook[j-1].getCost() > allNotebook[j].getCost()) {
         temp = allNotebook[j-1];
         allNotebook[j-1] = allNotebook[j];
         allNotebook[j] = temp;
         } else if (allNotebook[j -1].getCost() == allNotebook[j].getCost()) {
         if(allNotebook[j-1].getOpMemory() > allNotebook[j].getOpMemory()) {
         temp = allNotebook[j-1];
         allNotebook[j-1] = allNotebook[j];
         allNotebook[j] = temp;
         } else if (allNotebook[j-1].getOpMemory() == allNotebook[j].getOpMemory()) {
         temp = allNotebook[j-1];
         if(temp.getBrandName().charAt(0) > allNotebook[j].getBrandName().charAt(0)) {
         allNotebook[j-1] = allNotebook[j];
         allNotebook[j] = temp;
         }
         }
         }
         }
         }
         */

        // Values to save selected data
        int pos = 0;
        Notebook max;

        //Rebuild Sorting Algorithm
        for (int i = allNotebook.length - 1; i >= 0; i--) {
            pos = i;
            //min = allNotebook[i];
            max = allNotebook[i];
            for (int j = i - 1; j >= 0; j--) {
                if (allNotebook[j].getCost() > max.getCost()) {
                    pos = j;
                    max = allNotebook[j];
                } else if (allNotebook[j].getCost() == max.getCost()) {
                    if (allNotebook[j].getOpMemory() > max.getOpMemory()) {
                        pos = j;
                        max = allNotebook[j];
                    } else if (allNotebook[j].getOpMemory() == max.getOpMemory()) {
                        if (allNotebook[j].getBrandName().charAt(0) > max.getBrandName().charAt(0)) {
                            pos = j;
                            max = allNotebook[j];
                        }
                    }
                }
            }
            allNotebook[pos] = allNotebook[i];
            allNotebook[i] = max;
        }

        for (int i = 0; i < allNotebook.length; i++) {
            System.out.println(allNotebook[i].getBrandName()  + ", " + allNotebook[i].getOpMemory() + ", " + allNotebook[i].getCost());
        }

    }
}
