package data_structures.build_order47;

import data_structures.trees_graphs.Node;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class McDowell47BuildOrder {

    public List<Node> findBuildOrder(List<Node> projects, List<Pair> dependencies) {

        createProjectGraph(projects, dependencies);

        List<Node> nextProjects = new ArrayList<>();

        for(Node project : projects) {

            List<Node> children = project.getChildren();

            if (children.isEmpty()) {
               nextProjects.add(project);
            }
        }

        if (nextProjects.isEmpty()) {
            throw new RuntimeException("no build order found, there are no projects without dependencies");
        }

        while(true) {

           List<Node> newProjects = new ArrayList<>();

            for (Node node : projects) {
                List<Node> children = node.getChildren();

                if (!nextProjects.contains(node) && new HashSet<>(nextProjects).containsAll(children)) {
                    newProjects.add(node);
                }
            }

            if (newProjects.isEmpty()) {
                break;
            }

            nextProjects.addAll(newProjects);
        }

        if (!new HashSet<>(nextProjects).containsAll(projects)){
            throw new RuntimeException("no build order found, projects: " + projects +
                    ", found order only for those projects: " + nextProjects);
        }

        return nextProjects;

    }

    private void createProjectGraph(List<Node> projects, List<Pair> dependencies) {

        for (Pair pair : dependencies) {

            Node dependant = pair.getDependant();
            Node dependency = pair.getDependency();

            List<Node> projectList = projects.stream().filter(e -> e.getId().equals(dependant.getId()))
                    .toList();

            if (!projectList.isEmpty()) {
                Node project = projectList.get(0);
                project.addChild(dependency);
            }

        }

    }
}
