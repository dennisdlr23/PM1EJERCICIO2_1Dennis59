package com.example.pm1ejercicio2_1dennis59.Procesos;

public class Operaciones {

    public static final String NameDatabase = "PM1E2_1";

    public static String tblVideos = "videos";

    public static final String id = "id";
    public static final String videoPath = "videoPath";

    public static final String CreateTableVideo = "CREATE TABLE IF NOT EXISTS " + tblVideos+
            "(id INTEGER PRIMARY KEY AUTOINCREMENT,"+"videoPath TEXT UNIQUE)";

    public static final String DropTableVideo = "DROP TABLE " + tblVideos;

}