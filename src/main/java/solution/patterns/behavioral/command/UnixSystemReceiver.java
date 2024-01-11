package solution.patterns.behavioral.command;

public class UnixSystemReceiver implements FileSystemReceiver {

    @Override
    public void openFile() {
        System.out.println("opening File in Linux");
    }

    @Override
    public void writeFile() {
        System.out.println("writing File in Linux");
    }

    @Override
    public void closeFile() {
        System.out.println("closing File in Linux");
    }
}
