package uunifast;

import java.io.FileWriter;
import java.io.IOException;

public class Generateur {
    
    public static void main(String[] args) throws IOException {
        for(int i=0;i<11;i++)
        {
            System.out.println("\\draw ("+i+",0) -- ("+i+",-0.3) node[fill=white] {"+i/10.0+"};                                                                                                                                 ");
            System.out.println("\\draw (0,"+i*2+") -- (-0.5,"+i*2+") node[fill=white] {"+i/10.0+"};");
        }
    }
}
