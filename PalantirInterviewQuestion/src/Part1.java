import java.util.*;

class Part1 {

    public static List<String> tasksToRun(List<String> taskDefinitionsInput, List<String> changedFiles) {
        List<String> taskNamesThatNeedToBeReRun = new ArrayList<>();
        //add Tasks to a list
        List<Task> listOfTasks = createListOfTasks(taskDefinitionsInput);

        //implement a tasksToRun function to figure out the tasks that need to run in response to files that have been changed
        taskNamesThatNeedToBeReRun = addTaskNamesToListToBeReRun(changedFiles, listOfTasks);

        return taskNamesThatNeedToBeReRun;
    }

    //TODO add a method which contains a list of all the dependencies + task name for the tasks to that need to be rerun

    public static List<Task> returnListOfTasksToBeRerun(List<String> taskDefinitionsInput, List<String> changedFiles) { //need this for part two
        List<Task> listOfTasks = createListOfTasks(taskDefinitionsInput); //create the list of all tasks
        List<Task> tasksThatNeedToBeReRun = new ArrayList<>(); //create a list of all tasks that need to be rerun
        for (String fileThatHasBeenChanged : changedFiles) {
            for (Task task : listOfTasks) {
                if (task.getFiles().contains(fileThatHasBeenChanged)) {
                    tasksThatNeedToBeReRun.add(task);
                }
            }
        }
        return tasksThatNeedToBeReRun;
    }

    private static List<String> addTaskNamesToListToBeReRun(List<String> changedFiles, List<Task> listOfTasks) {
        List<String> taskNamesThatNeedToBeReRun = new ArrayList<>();
        for (String fileThatHasBeenChanged : changedFiles) {
            for (Task task : listOfTasks) {
                if (task.getFiles().contains(fileThatHasBeenChanged)) {
                    taskNamesThatNeedToBeReRun.add(task.getTask());
                }
            }
        }
        return taskNamesThatNeedToBeReRun;
    }


    private static List<Task> createListOfTasks(List<String> taskDefinitionsInput) {
        List<Task> listOfTasks = new ArrayList<Task>(); //these will store all of the tasks
        for (int i = 0; i < taskDefinitionsInput.size(); i = i + 4) {
            Task task = parseTask(taskDefinitionsInput, i);
            listOfTasks.add(task);
        }
        return listOfTasks;
    }

    private static Task parseTask(List<String> taskDefinitionsInput, int i) {
        String task = taskDefinitionsInput.get(i);
        String files = taskDefinitionsInput.get(i + 1);
        String deps = taskDefinitionsInput.get(i + 2);
        Task addToTaskList = new Task(task, files, deps); //create a new task
        return addToTaskList;
    }
}


