package example.designpattern.structural.proxy;

/**
 * <b>Description</b> :
 *
 * @author Vinod Akkepalli
 */
public class CommandExecutorImpl implements ICommandExecutor {

    @Override
    public void runCommand(String cmd) throws Exception {

        cmd = "notepad.exe";
        Runtime.getRuntime().exec(cmd);
        System.out.println("'" + cmd + "' command executed.");
    }
}
