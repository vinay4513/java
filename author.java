package bookatuthar;

public class author{
    private int id;
    private String name;
    private String city;

public author (int id, String name, String city){
    this.id = id;
    this.name = name;
    this.city = city;
} 
public author(){
    id=0;
    name=null;
    city=null;

}
public int getId(){
    return id;
}

public String getName(){
    return name;
}
public String getCity(){
    return city;
}

public String toString(){
    return "Author = id:" + id + ",  Name: " + name + ", City: " + city;
}



}


