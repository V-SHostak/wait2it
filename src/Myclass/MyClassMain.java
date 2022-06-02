package Myclass;

public class MyClassMain {

    public static void main(String[] args) {

        MyClassParent object1 = new MyClassParent();
        object1.parent();

        MyClassParent object2 = new MyClassChildFirst();
        object2.parent();

        MyClassParent object3 = new MyClassChildSecond();
        object3.parent();

        MyClassParent summa = new MyClassParent();
        System.out.println(summa.sumExercise(4, 2));
        System.out.println(summa.sumExercise(4, 2, 3));
        System.out.println(summa.sumExercise(4.2, 2.4));

        MyClassParent summa2 = new MyClassParent();
        System.out.println(summa2.sumExercise(3, 5, 4));

        MyClassParent summaDouble = new MyClassParent();
        System.out.println(summaDouble.sumExercise(2.3, 4.5));

    }
}
