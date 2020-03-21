package day42;

public class Pet {
    private String type;
    private String name;
    public Pet(){
        this.type= "unknown";
        this.name = "noname";

    }
    public Pet(String type, String name){
        this.type= type;
        this.name=name;
    }
    public void Speak(){
        if(this.type.equals("cat")){
            System.out.println("meow");
        }
        else if(this.type.equals("dog")){
            System.out.println("woof");
        }
        else if(this.type.equals("cow")){
            System.out.println("mooo");
        }
        else if(this.type.equals("horse")){
            System.out.println("neinei");
        }
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
