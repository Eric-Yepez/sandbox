package org.example.inheritance.composition;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Composition {
    List<String> names;
    Set<String> values;
    Queue<String> items;
    String name;

    public Composition(List<String> names, Set<String> values) {
        this.names = names;
        this.values = values;
        this.items = new LinkedList<>();
        this.name = "Eric";

    }
}
