import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class App {

    private static int st;

    public static void main(String[] args) throws FileNotFoundException {

        for ( int i = 1; i < 10000; i++) {
            PM pm1 = new PM("Grisha "+i);
            for (int j = 1; j < 200000; j++) {
                Developer dev1 = new Developer("Misha "+j);
                dev1.addSkill("Skill_1 ffffffffffffffffffffffffffffffffffffffffffffffffffff "+j);
                dev1.addSkill("Skill_2 dsgggffffffffffffffffffawq2qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq"+j);
                dev1.addSkill("Skill_3 dkfglkdfjglkdjfglkdfjgldfkgjdflkgjdflkgjdlfkgjdfglkdfjglkdfjglkdjfgldkfjgldkfjgldfkgjlkfg"+j);
                dev1.addSkill("Skill_4sssssssssssssssssssssssssssssssssssssssssss sssssssssssssssssss ssssssssssssssssssssssss "+j);

                pm1.addWorker(dev1);
                pm1.addWorker(dev1);
            }
            System.out.println("Step" + i);
        }

    }


}





