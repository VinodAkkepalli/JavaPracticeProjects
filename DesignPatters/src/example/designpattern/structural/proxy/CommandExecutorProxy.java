package example.designpattern.structural.proxy;

/**
 * <b>Description</b> : Proxy class defined to act wrap
 * user access functionality around runCommand
 *
 * @author Vinod Akkepalli
 */
public class CommandExecutorProxy implements CommandExecutor {

    private boolean isAdmin;
    private CommandExecutor executor;

    public CommandExecutorProxy(String user, String pwd){
        if("admin_user".equals(user) && "admin".equals(pwd)) {
            isAdmin=true;
        }
        executor = new CommandExecutorImpl();
    }

    @Override
    public void runCommand(String cmd) throws Exception {
        if (!isAdmin && cmd.trim().startsWith("rm")) {
            throw new Exception("rm command is not allowed for non-admin users.");
        }
        executor.runCommand(cmd);
    }
}
