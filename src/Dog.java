public class Dog {
    String name,breed,color;
    int age;
    public Dog(String name,String breed,String color,int age)
    {
        this.name=name;
        this.breed=breed;
        this.color=color;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args)
    {
        Dog tuffy=new Dog("tuffy","papillon","white",5);
        System.out.println(tuffy.toString());
    }
}
