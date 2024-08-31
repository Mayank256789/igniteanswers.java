@FunctionalInterface
 interface Animal {
    void bark();
}

class Dog implements Animal {
    public void bark() {
        System.out.println("Dog");
    }
}
