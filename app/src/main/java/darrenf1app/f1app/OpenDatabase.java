package darrenf1app.f1app;

/**
 * Created by darre on 15/05/2018.
 */
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;


public class OpenDatabase extends SQLiteOpenHelper
{
    private static final String DATABASE_NAME = "f1Database.db";

    // TOGGLE THIS NUMBER FOR UPDATING TABLES AND DATABASE
    private static final int DATABASE_VERSION = 1;

    OpenDatabase(Context context)
    {
        super( context, DATABASE_NAME, null, DATABASE_VERSION );
    } // OpenDatabase(Context context)

    @Override
    public void onCreate(SQLiteDatabase db)
    {

    } // public void onCreate(SQLiteDatabase db)

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {

    } // public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)


    public String DisplayRecords(SQLiteDatabase sqdb) {

        String mystr = "";

        ArrayList < String > data = new ArrayList<String>();


            Cursor c = sqdb.rawQuery("SELECT * FROM Drivers", null);
            if (c != null) {
                if (c.moveToFirst()) {
                    do {
                        mystr = mystr + c.getString(1); //Add DriverName
                        mystr = mystr + c.getString(2); // Add Team
                        mystr = mystr + c.getString(3); // Add Country
                        mystr = mystr + c.getString(4); // Add Podiums
                        mystr = mystr + c.getString(5); // Add NumberofRaces
                        mystr = mystr + c.getString(6); // Add Wins
                        mystr = mystr + c.getString(7); // Add WC
                        mystr = mystr + c.getString(8); // Add DOB


                        //String DriverName = c.getString(1);
                        //String Team = c.getString(2);
                        //String Country = c.getString(3);
                        //String Podiums = c.getString(4);
                        //String NumberofRaces = c.getString(5);
                        //String Wins = c.getString(6);
                        //String WorldChampionships = c.getString(7);
                        //String DOB = c.getString(8);

                        //Log.w("F1_DB", "DriverName = " + DriverName + " Team = " +
                        //      Team);

                      //  data.add(mystr);
                        Log.w("F1_DB", mystr);
                      //  mystr = "";


                    } while (c.moveToNext());

                }
            }
                c.close();
                return mystr;

            }






    public ArrayList<String> DisplayRecordsV2(SQLiteDatabase sqdb) {

        String mystr = "";

        ArrayList <String> data = new ArrayList<String>();


        Cursor c = sqdb.rawQuery("SELECT * FROM Drivers", null);
        if (c != null) {
            if (c.moveToFirst()) {
                do {
                    mystr = mystr + "Driver Name = " + c.getString(1) + "\n";            //Add DriverName
                    mystr = mystr + "Team = " + c.getString(2)+ "\n";                    // Add Team
                    mystr = mystr + "Country = " + c.getString(3)+ "\n";                 // Add Country
                    mystr = mystr + "Podiums = " + c.getString(4)+ "\n";                // Add Podiums
                    mystr = mystr + "Number of Races = " + c.getString(5)+ "\n";        // Add NumberofRaces
                    mystr = mystr + "Number of Wins = " + c.getString(6)+ "\n";         // Add Wins
                    mystr = mystr + "World Championships = " + c.getString(7)+ "\n";     // Add WC
                    mystr = mystr + "DOB = " + c.getString(8)+ "\n";                      // Add DOB

                      data.add(mystr);
                    Log.w("F1_DB", mystr);
                     mystr = "";


                } while (c.moveToNext());

            }
        }
        c.close();
        return data;

    }




    }// public void DisplayRecords()











