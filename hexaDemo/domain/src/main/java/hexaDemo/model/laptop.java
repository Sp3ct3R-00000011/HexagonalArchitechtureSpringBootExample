package hexaDemo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "laptop")
public class laptop {
    @Id
    @Column(name ="laptopID")
    public String laptopID;
    @Column(name ="brand_name")

    public String brand_name;

    @Column(name ="model")
    public String model;
    @Column(name ="ram")
    public int ram;
    @Column(name ="processor")
    public String processor;
        public String getLaptopID() {
        return laptopID;
    }

    public void setLaptopID(String laptopID) {
        this.laptopID = laptopID;
    }

    public String getBrand_name() {
        return brand_name;
    }

    public void setBrand_name(String brand_name) {
        this.brand_name = brand_name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }



    public laptop(String laptopID, String brand_name, String model, int ram, String processor) {
        this.laptopID = laptopID;
        this.brand_name = brand_name;
        this.model = model;
        this.ram = ram;
        this.processor = processor;
    }

    public laptop() {

    }
    @Override
    public String toString() {
        return "Laptop [laptopID=" + laptopID + ", brand_name=" + brand_name + ", model=" + model + ", ]";
    }

}
