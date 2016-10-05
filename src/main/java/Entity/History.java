package Entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "History")
public class History {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "idHistory")
    private int idHistory;
    @Column(name = "History")
    private double history;
    @Column(name = "Date")
    private String date;

    public History() {
    }
//    public History(double history, String date) {
//        history = history;
//        date = date;
//    }
    public int getIdHistory() {
        return idHistory;
    }

    public void setIdHistory(int idHistory) {
        this.idHistory = idHistory;
    }

    public double getHistory() {
        return history;
    }

    public void setHistory(double history) {
        history = history;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        date = date;
    }

}
