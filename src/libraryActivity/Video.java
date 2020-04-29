package libraryActivity;

public class Video implements Media{

    private String title;
    private String director;
    private int totalAvailable;
    private int isAvailable;

    public Video(String title, String director, int totalAvailable) {
        this.totalAvailable = totalAvailable;
        this.isAvailable = totalAvailable;
        this.title = title;
        this.director = director;

    }

    public String getDirector() {
        return this.director;
    }

    public String getTitle() {
        return this.title;
    }

    public String toString() {
        return this.title + " by " + this.director + "\nAvailable: " + isAvailable;
    }


    public boolean checkOut() {
        if(this.isAvailable>0 && this.isAvailable<=this.totalAvailable) {
            this.isAvailable--;
            return true;

        }
        else {
            return false;
        }
    }


    public boolean checkIn() {
        if(this.isAvailable>=0&&this.isAvailable!=this.totalAvailable) {
            isAvailable++;
            return true;
        }
        else {
            return false;
        }
    }
}

