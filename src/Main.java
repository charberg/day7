import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        ArrayList<Prog> allProgs = new ArrayList<Prog>();
        HashMap<String, Prog> nameCount = new HashMap<String, Prog>();

        try {
            FileInputStream fstream = new FileInputStream("resources\\in.txt");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            while ((strLine = br.readLine()) != null) {

                Prog p = new Prog();

                String[] tokens = strLine.split(" ");

                p.setName(tokens[0]);
                p.setWeight(Integer.valueOf(tokens[1].replace("(","").replace(")","")));

                int i = 3;

                while(i < tokens.length) {
                    String n = tokens[i].replace(",","");
                    p.addNames(n);
                    i++;
                }

                if(nameCount.get(p.getName()) == null) {
                    nameCount.put(p.getName(), p);
                }

                allProgs.add(p);

            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        //Recurse for sum of disks, find wrong weight



    }
}
