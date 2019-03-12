import java.util.ArrayList;
import java.util.List;

public class PM extends Engineer implements Manager {

    private List<Worker> teams = new ArrayList<Worker>();

    public PM(String name) {
        super.setName(name);

    }

    public boolean addWorker(Worker worker) {
        if ( teams.indexOf(worker) > -1 ) {
            return false;
        }
        teams.add(worker);
        return true;
    }


    public boolean deleteWorker(Worker worker) {
        if ( teams.indexOf(worker) == -1 ) {
            return false;
        }
        teams.remove(worker);
        return true;
    }
}
