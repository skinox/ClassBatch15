package day56;

public class Product extends Object{
    public String name;
    public int value;
    public Product(String name,int value){
        this.name = name;
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        Product other_p = (Product) obj;
        return (other_p.name.equalsIgnoreCase(this.name))&&(other_p.value==this.value);
    }
}
