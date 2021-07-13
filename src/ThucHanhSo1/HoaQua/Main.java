package ThucHanhSo1.HoaQua;

import ThucHanhSo1.Dongvat.Animal;
import ThucHanhSo1.Dongvat.Chicken;
import ThucHanhSo1.Dongvat.Edible;
import ThucHanhSo1.Dongvat.Tiger;

public class Main {
        public static void main(String[] args) {
            Animal[] animals = new Animal[2];
            animals[0] = new Tiger();
            animals[1] = new Chicken();
            for (Animal animal : animals) {
                System.out.println(animal.makeSound());
                if (animal instanceof Chicken) {
                    Edible edibler = (Chicken) animal;
                    System.out.println(edibler.howToEat());
                }
            }
            Fruit[] fruits = new Fruit[2];
            fruits[0] = new Apple();
            fruits[1] = new Orange();
            for (Fruit fruit: fruits) {
                System.out.println(fruit.howToEat());
            }
        }
    }
