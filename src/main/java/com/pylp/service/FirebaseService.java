package com.pylp.service;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import org.springframework.stereotype.Service;

@Service
public class FirebaseService {

    private final DatabaseReference database;

    public FirebaseService() {
        this.database = FirebaseDatabase.getInstance().getReference();
    }

    public void saveData(String path, Object data) {
        database.child(path).setValueAsync(data);
    }

    public DatabaseReference getData(String path) {
        return database.child(path);
    }

    public void deleteData(String path) {
        database.child(path).removeValueAsync();
    }
}
