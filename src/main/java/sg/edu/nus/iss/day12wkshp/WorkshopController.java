package sg.edu.nus.iss.day12wkshp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;
import java.util.*;
import java.lang.Integer;

@Controller
public class WorkshopController {
    
    @RequestMapping(path= { "/workshop"})
    public String test() {
        return "workshop"; 
    }

    @RequestMapping(path= { "/processNumber"})
    public String testResults(
        @RequestParam(name="inputNumber", defaultValue = "1") Integer unit,
        Model model) {

            List<Integer> ListInt = new ArrayList<>();
            int loopValue = Integer.parseInt(unit.toString());

            int loop = 1;
            while (loop <= loopValue) {

                int result = (int) (Math.random() * (loopValue) + 1);

                // to check if the number not in the list, then add it to the loop and increase it
                if (!ListInt.contains(Integer.valueOf(result))) {
                    ListInt.add(Integer.valueOf(result));
                    loop++;
                }
            }

            for (int i = 0; i <ListInt.size(); i++) {
                System.out.println("==> " + ListInt.get(i));
                System.out.println();
            }
            model.addAttribute("numbers", ListInt);
            
            return "workshopresult";

        }
}
