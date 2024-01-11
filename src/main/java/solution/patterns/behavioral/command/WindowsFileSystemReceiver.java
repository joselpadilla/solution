package solution.patterns.behavioral.command;

public class WindowsFileSystemReceiver implements FileSystemReceiver {

    @Override
    public void openFile() {
        System.out.println("opening File in Windows");
    }

    @Override
    public void writeFile() {
        System.out.println("writing File in Windows");
    }

    @Override
    public void closeFile() {
        System.out.println("closing File in Windows");
    }
}
