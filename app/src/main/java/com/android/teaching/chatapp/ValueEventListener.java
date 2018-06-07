package com.android.teaching.chatapp;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;

public interface ValueEventListener {
    void onDataChange(DataSnapshot var1);

    void onCancelled(DatabaseError var1);
}
