package sg.edu.rp.c346.improvedtodolist;

import android.text.BoringLayout;

import java.util.Calendar;

public class ToDoItem {
    private String title;
    private Calendar date;
    private boolean isImportant;

    public ToDoItem(String title, Calendar date, Boolean isImportant) {
        this.title = title;
        this.date = date;
        this.isImportant = isImportant;
    }

    public void setImportant(boolean important) {isImportant = important;}
    public boolean getImportant() {return isImportant;}

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }
    public Calendar getDate() {
        return date;
    }

    public String getDateString() {
        String str = date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH)+"/"+date.get(Calendar.YEAR);
        return str;
    }

    @Override
    public String toString() {
        return "ToDoItem{" +
                "title='" + title + '\'' +
                ", date=" + getDateString() +
                ", isImportant=" + getImportant() +
                '}';
    }
}
