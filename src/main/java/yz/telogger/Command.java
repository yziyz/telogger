package yz.telogger;

/**
 * 命令类
 *
 * @author 袁臻
 * 2017/12/05 18:04
 */
public final class Command {

    private String name;

    private String command;

    private String workingDirectory;

    private String help;

    Command(String line) {
        final String[] split = line.split(",");
        if (split.length == 4) {
            this.name = split[0];
            this.command = split[1];
            this.workingDirectory = split[2];
            this.help = split[3];
        }
    }

    String getName() {
        return name;
    }

    String getCommand() {
        return command;
    }

    String getWorkingDirectory() {
        return workingDirectory;
    }

    String getHelp() {
        return help;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", command='" + command + '\'' +
                ", workingDirectory='" + workingDirectory + '\'' +
                ", help='" + help + '\'' +
                '}';
    }
}
