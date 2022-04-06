import java.util.ArrayList;
import java.util.List;

public class Solution1 {

    public static void main(String[] args) {
        //adding the tasks
        List<String> taskDefinitionsInput = new ArrayList<>();
        taskDefinitionsInput.add("task: taskA" + ",");
        taskDefinitionsInput.add("files: lib/foo.txt lib/bar.txt");
        taskDefinitionsInput.add("deps:"+ ",");
        taskDefinitionsInput.add("" + ",");
        taskDefinitionsInput.add("task: taskB" + ",");
        taskDefinitionsInput.add("files: src/baz.txt" + ",");
        taskDefinitionsInput.add("deps:");
        taskDefinitionsInput.add("" + ",");
        taskDefinitionsInput.add("task: taskC" + ",");
        taskDefinitionsInput.add("files: README.md");
        taskDefinitionsInput.add("deps:");
        taskDefinitionsInput.add("" + ",");

        //add to the recently changed files
        List<String> recentlyChanged = new ArrayList<>();
        recentlyChanged.add("lib/foo.txt");
        recentlyChanged.add("README.md");

        //running the function
        Part1.tasksToRun(taskDefinitionsInput,recentlyChanged);
    }
}
