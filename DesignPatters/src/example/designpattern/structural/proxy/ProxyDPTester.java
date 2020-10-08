package example.designpattern.structural.proxy;

/**
 * <b>Description</b> : Proxy design pattern implementation
 *  https://www.journaldev.com/1572/proxy-design-pattern#proxy-design-pattern
 *  https://www.youtube.com/watch?v=cHg5bWW4nUI
 *
 * @author Vinod Akkepalli
 */
public class ProxyDPTester {

    public static void main(String[] args) {
        ICommandExecutor executor = new CommandExecutorProxy("admin_user", "admin1");
        try {
            executor.runCommand("ls -ltr");
            executor.runCommand("rm -rf abc.pdf");
            executor.runCommand("notepad.exe");
        } catch (Exception e) {
            System.out.println("Exception Message::" + e.getMessage());
        }
    }
}
