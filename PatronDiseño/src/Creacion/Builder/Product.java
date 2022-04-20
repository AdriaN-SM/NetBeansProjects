
package Creacion.Builder;


public class Product {

    public String name = "";
    public String type = "";
    public int id;

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setId(int id) {
        this.id = id;
    }    

    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", type=" + type + ", id=" + id + '}';
    }

    
}
