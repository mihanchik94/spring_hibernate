package hiber.model;


import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    private String model;
    private int series;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public Car() {
    }

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", id=" + id +
                '}';
    }
}
