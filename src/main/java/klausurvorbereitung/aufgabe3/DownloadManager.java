package klausurvorbereitung.aufgabe3;

import java.net.URL;
import java.util.UUID;

public class DownloadManager {
    private URL url;

    DownloadManager configure(int maxThreads, long timeout) {
        return this;
    }

    String startDownload() {
        DownloadJob dj = new DownloadJob(url);
        dj.start();
        return dj.getJobID();
    } // returns the JobId

    void cancelDownload(String jobId) {
        //
    }

    DownloadManager specifyDownloadLocation(URL url) {
        this.url = url;
        return this;
    }

    // nicht Teil des F l u i d I n t e rf a c e s
    public static byte[] downloadFromURL(URL url) {
        return null;
    }

    //class DownloadJob
    private static class DownloadJob extends Thread {
        String jobID;
        byte[] data;
        URL url;

        public DownloadJob(URL url) {
            this.url = url;
            jobID = UUID.randomUUID().toString();
        }

        @Override
        public void run() {
            data = downloadFromURL(url);
        }

        public byte[] getData() {
            return data;
        }

        public String getJobID() {
            return jobID;
        }
    } //class end

    public static void main(String[] args) throws Exception {
        DownloadManager manager = new DownloadManager();

        String jobId = manager
                .configure(4, 4000)
                .specifyDownloadLocation(new URL(" http :// example . com / resource "))
                .startDownload();
        System.out.println(jobId);
    }

    // 5.)
    /*
        Im DownloadHandler könnte eine Map ergänzt werden , die die DownloadTasks verwaltet.
        Sie könnten dann unter den UUIDs als Keys abgelegt werden.
        Die URLs müssten nicht einmal mehrfach gespeichert werden , weil dies in den DownloadTasks
        als Attribut enthalten ist.
        Es müsste vor dem Start jedes Downloads die neue URL gespeichert werden.
        Es dafür gesorgt werden , dass nicht mehr gleichzeitige Threads gestartet werden können
        als in der Konfiguration festgelegt wurde.
    */
}
