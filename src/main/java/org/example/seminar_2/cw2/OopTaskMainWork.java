package org.example.seminar_2.cw2;

public class OopTaskMainWork {
    public static void main(String[] args) {
        Vector vector1 = new Vector(1, 1, 1);
        Vector vector2 = new Vector(1, 2, 1);

        System.out.println("length = " + vector1.length());
        System.out.println("scalar = " + vector1.scal(vector2));
        System.out.println("vector_proizv = " + vector1.vectorProizv(vector2));
        System.out.println("coinus = " + vector1.cosinus(vector2));
        System.out.println("summ = " + vector1.sumVector(vector2));
        System.out.println("diff = " + vector1.difVector(vector2));
    }
}
