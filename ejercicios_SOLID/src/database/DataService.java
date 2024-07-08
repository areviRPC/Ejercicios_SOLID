package database;

public class DataService {
    private DataStorage database;

    public void DataService(DataStorage database){
        this.database = database;
    }

    public void saveData(String data) {
        database.save(data);
    }
}
