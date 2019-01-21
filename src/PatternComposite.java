import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PatternComposite {
}
class File{
   private String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }
}

class Folder{
   private String nameFolder;
   private Date creationDate;
   List<Folder> folders = new ArrayList<>();
   List<File> files = new ArrayList<>();

    public List<Folder> getFolders() {
        return folders;
    }

    public List<File> getFiles() {
        return files;
    }

    void addFolder(Folder folder){
       folder.addFolder(folder);
   }
   void removeFolder(Folder folder){
       folders.remove(folder);
   }
   void addFile(File file){
        files.add(file);
   }
   void removeFile(File file){
        files.remove(file);
   }

}
