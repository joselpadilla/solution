package solution.patterns.behavioral.command;

public interface FileSystemReceiver {

    void openFile();
    void writeFile();
    void closeFile();
}
