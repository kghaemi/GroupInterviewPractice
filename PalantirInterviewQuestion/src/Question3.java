//package PalantirInterview;
//
//import java.io.*;
//import java.math.*;
//import java.security.*;
//import java.text.*;
//import java.util.*;
//import java.util.concurrent.*;
//import java.util.function.*;
//import java.util.regex.*;
//import java.util.stream.*;
//import static java.util.stream.Collectors.joining;
//import static java.util.stream.Collectors.toList;
//
//
//
//class Result {
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
//    public static List<String> tasksToRun(List<String> taskDefinitionsInput, List<String> changedFiles) {
//        // Write your code here
//
//    }
//
//}
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        int taskDefinitionsInputCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<String> taskDefinitionsInput = IntStream.range(0, taskDefinitionsInputCount).mapToObj(i -> {
//            try {
//                return bufferedReader.readLine();
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        })
//                .collect(toList());
//
//        int changedFilesCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<String> changedFiles = IntStream.range(0, changedFilesCount).mapToObj(i -> {
//            try {
//                return bufferedReader.readLine();
//            } catch (IOException ex) {
//                throw new RuntimeException(ex);
//            }
//        })
//                .collect(toList());
//
//        List<String> result = Result.tasksToRun(taskDefinitionsInput, changedFiles);
//
//        bufferedWriter.write(
//                result.stream()
//                        .collect(joining("\n"))
//                        + "\n"
//        );
//
//        bufferedReader.close();
//        bufferedWriter.close();
//    }
//}
