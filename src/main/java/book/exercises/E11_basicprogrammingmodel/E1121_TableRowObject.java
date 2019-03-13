package book.exercises.E11_basicprogrammingmodel;

public class E1121_TableRowObject {

    String name;
    int a;
    int b;

    public E1121_TableRowObject(String name, int a, int b){
        this.name = name;
        this.a = a;
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public String getName() {
        return name;
    }
}
