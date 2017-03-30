package net.xuepo.algorithm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xuepo on 3/26/17.
 */
public class CourseSchedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        if(numCourses <= 0) return true;
        if(prerequisites == null || prerequisites.length <= 1) return true;

        Map<Integer, List<Integer>> graph = new HashMap<>();
        boolean[] visited = new boolean[numCourses];

        for(int[] edge : prerequisites) {
            if(graph.containsKey(edge[0])) {
                List<Integer> temp = graph.get(edge[0]);
                temp.add(edge[1]);
            } else {
                List<Integer> temp = new ArrayList<>();
                temp.add(edge[1]);
                graph.put(edge[0], temp);
            }
        }

        for(int i = 0; i < numCourses; i++) {
            if(hasCircle(visited, graph, i)) {
                return false;
            }
        }
        return true;
    }

    private boolean hasCircle(boolean[] visited, Map<Integer, List<Integer>> graph, int i) {
        if(visited[i]) {
            return true;
        } else {
            visited[i] = true;
        }
        List<Integer> neighbors = graph.get(i);
        if(neighbors != null) {
            for(Integer neighbor : neighbors) {

                if(hasCircle(visited, graph, neighbor)) {
                    return true;
                }
            }
        }
        visited[i] = false;
        return false;
    }
}
