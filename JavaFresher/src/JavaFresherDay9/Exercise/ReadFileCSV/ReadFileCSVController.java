package JavaFresherDay9.Exercise.ReadFileCSV;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ReadFileCSVController {
    public void readFileText(String filePath){
        ReadFileCSVView view = new ReadFileCSVView();
        ArrayList<String> country = new ArrayList<>();
        try {
            File file = new File(filePath);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null){
                String[] city = line.split(",");
                view.showMessage(line);
                country.add(city[2]);
            }
            br.close();
            ArrayList<String> countryListNoDupli = new ArrayList<>();
            for(String i : country) {
                if(!countryListNoDupli.contains(i)){
                    countryListNoDupli.add(i);
                }
            }
            view.showMessage(countryListNoDupli.toString());
        } catch (Exception e){
            view.showMessage("File not exist hoac noi dung co loi");
        }
    }
}
