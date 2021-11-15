package lesson7.homework;

import java.util.LinkedList;
import java.util.Scanner;
// Реализовать программу, в которой задается граф из 10 вершин.
// Задать ребра и найти кратчайший путь с помощью поиска в ширину.

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);

        Scanner scanner = new Scanner(System.in);

        graph.addEdge(0, 1);
        graph.addEdge(0, 7);
        graph.addEdge(1, 4);
        graph.addEdge(1, 5);
        graph.addEdge(2, 3);
        graph.addEdge(4, 5);
        graph.addEdge(4, 6);
        graph.addEdge(5, 9);
        graph.addEdge(6, 8);
        graph.addEdge(6, 7);
        graph.addEdge(8, 9);

        System.out.println(graph.getEdgeCount());
        System.out.println(graph.getAdjList(9));

        BreadthFirstPaths bfp = new BreadthFirstPaths(graph, 0);
        bfp.showAdjacencyList(graph);

        LinkedList<Integer> path; // путь
        int from = scanner.nextInt(); //4;
        int to = scanner.nextInt(); //7;
        path = bfp.findShortestPathFromTo(graph, from, to);  //  from - от to до
        System.out.println("The shortest way from " + from + " to " + to + ": " + path);  // кратчайший путь от до путь(path)

        //1 1
        // Кратчайший путь от  1 до 1: []
        //4 7
        // Кратчайший путь от 4 до 7: [6, 7]
        // 0 9
        // Кратчайший путь от 0 до 9: [1, 5, 9]
        // 0 8
        // Кратчайший путь от 0 до 8: [7, 6, 8]
        // 3 2
        // Кратчайший путь от 3 до 2: [2]
        // 9 3
        // Кратчайший путь от 9 до 3: []

    }
}
