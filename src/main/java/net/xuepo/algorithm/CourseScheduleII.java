package net.xuepo.algorithm;

import java.util.*;

/**
 * Created by xuepo on 4/10/16.
 */
public class CourseScheduleII {

    public int[] findOrder(int numCourses, int[][] prerequisites) {

        List<Set<Integer>> adjList = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            adjList.add(new HashSet<Integer>());
        }

        for (int i = 0; i < prerequisites.length; i++) {
            adjList.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        int[] indegree = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            for (int x : adjList.get(i)) {
                indegree[x]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                q.offer(i);
            }
        }


        int[] res = new int[numCourses];
        int count = 0;

        while (!q.isEmpty()) {
            int curr = q.poll();
            for (int x : adjList.get(curr)) {
                indegree[x]--;
                if (indegree[x] == 0) {
                    q.offer(x);
                }
            }

            res[count++] = curr;

        }


        if (count == numCourses) return res;
        return new int[0];

    }
}
