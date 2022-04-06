import java.util.Arrays;
import java.util.List;

public class Task {
    private String task; //the name of the task
    private List<String> files; //what files a task tracks
    private List<String> deps; //list of other tasks which this task depends on

    public Task(String task, String files, String deps) {
        this.task = task;
        this.files = Arrays.asList(files.split(" ")); //split the files by space and store in an arraylist
        this.deps = Arrays.asList(deps.split(" ")); //split the files by space
    }

    public List<String> getDeps() {
        return deps;
    }

    public List<String> getFiles() {
        return files;
    }

    public String getTask() {
        return task;
    }

//    public Task[] getDependencies() {
//        return dependencies;
//    }
}
