//package PalantirInterview;
//
//import java.util.*;
//
//
//
//class Part2 {
//
//    /*
//     * Complete the 'tasksToRun' function below.
//     *
//     * The function is expected to return a STRING_ARRAY.
//     * The function accepts following parameters:
//     *  1. STRING_ARRAY taskDefinitionsInput
//     *  2. STRING_ARRAY changedFiles
//     */
//
//    //either use a linked list or a list
//    //check if i should use a queue or a stack
//
//    public static List<String> tasksToRun(List<String> taskDefinitionsInput, List<String> changedFiles) {
//        List<Task> unOrderedListOfTasksToBeReRun = Part1.returnListOfTasksToBeRerun(taskDefinitionsInput, changedFiles);
//        List<Task> orderedListOfTasks = new LinkedList<>();
//        HashSet<Task> visitedTaskNode = new HashSet<>();
//
//        //find the name of the Task(s) which are in the unorderedListOfTasksToBeReRun and don't have any Tasks they are dependent on
//        //This will be the starting point
//        for(Task task: unOrderedListOfTasksToBeReRun) {
//            if (task.getDeps().equals(null)) { //no other Tasks are dependent on the Task
//                orderedListOfTasks.add(task); //add to the LinkedList (i.e. a Queue)
//                visitedTaskNode.add(task); //mark the Task as visited
//            }
//        }
//
//        //find the name of the Task which is in the unorderedListOfTasksToBeReRun and no Tasks rely on it
//
//    }
//
//
//
//    public static boolean bfs(Node start, Task end) {
//        HashSet<Node> visited = new HashSet<>();
//        Queue<Node> adjacent = new LinkedList<>();
//        adjacent.add(start);
//
//        while(!adjacent.isEmpty()) {
//            Node current = adjacent.remove(); //remove the first node from the queue
//            if(current.val == end) {
//                return true; //we have found a complete path from the starting node to the end
//            }
//            for(int i = 0; i < current.children.size(); i++) {
//                Node adjacentNode = current.children.get(i);
//                if (!visited.contains(adjacentNode)) { //if the adjacent node has not been visited
//                    adjacent.add(current.children.get(i));
//                }
//            }
//            visited.add(current); //if it hasn't been visited, then add it to the visited nodes
//        }
//        return false; //we were unable to find a path from the starting node to any node with the value n.
//    }
//}
//
