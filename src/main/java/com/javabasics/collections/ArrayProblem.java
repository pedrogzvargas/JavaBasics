package com.javabasics.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class ArrayProblem {
    public static void main(String[] args) {
        var door = new Product("Wooden Door", 35);
        var floorPanel = new Product("Floor Panel", 25);
        var window = new Product("Glass window", 10);

       /* Product[] products = {door, floorPanel};

        System.out.println(Arrays.toString(products));

        products = add(window, products);

        System.out.println(Arrays.toString(products));*/

        Collection<Product> products = new ArrayList<>();
        products.add(door);
        products.add(floorPanel);
        products.add(window);
        // System.out.println(products);

        /*for (var product: products){
            var w = product.weight();
            if (product.weight() > 20){
                products.remove(product);
            }
        }*/

        // products.removeIf(product -> product.weight() > 20);

        Iterator<Product> it = products.iterator();
        while (it.hasNext()){
            var product = it.next();
            if (product.weight() > 20){
                it.remove();
            }
        }

        Collection<Product> toRemove = new ArrayList<>();
        toRemove.add(window);

        products.removeAll(toRemove);

        System.out.println("Productos: " + products);
    }

    private static Product[] add(Product product, Product[] array)
    {
        int length = array.length;
        var newArray = Arrays.copyOf(array, length + 1);
        newArray[length] = product;
        return newArray;
    }
}
