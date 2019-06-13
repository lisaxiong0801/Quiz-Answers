import java.util.Scanner;
import java.io.*;

class Answers{
    File f = new File("quiz responses.csv");
    public void File(){
        try {
            Scanner input = new Scanner(f);
            String haha = input.nextLine();
            String ref = input.nextLine();
            String[] key = ref.split(",");
            while (input.hasNext()){
                String str = input.nextLine();
                int total = 0;
                String[] ans = str.split(",");
                System.out.print(ans[0] + " ");
                for (int i = 1; i < ans.length; i++){
                    if (ans[i].equals(key[i])){
                        total++;
                    }
                }
                System.out.println(total + "/" + (ans.length-1));
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
