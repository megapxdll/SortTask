import java.util.Random;

public class main {


    public static void main(String[] args) {

        //Initializing notebooks and other data like random generator and brand names
        Notebook [] allNotebook = new Notebook[10000];
        Random random = new Random();
        String [] brandNames = new String[] {"Lenuvo ", "Asos ", "MacNote ", "Eser ", "Xamiou"};

        //Filling array of notebooks with random values
        for (int i = 0; i < allNotebook.length; i++) {
            Notebook notebook = new Notebook(random.nextInt(2000 - 50) + 50, random.nextInt(24 - 4) + 4, brandNames[random.nextInt(4)]);
            allNotebook[i] = notebook;
        }

        //Sorting by BubbleSort Algorithm
        Notebook temp;
        String tempBrandName = "";
        for (int i = 0; i < allNotebook.length; i++) {
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

        for (int i = 0; i < allNotebook.length; i++) {
            System.out.println(allNotebook[i].getBrandName()  + ", " + allNotebook[i].getOpMemory() + ", " + allNotebook[i].getCost());
        }

    }
}
