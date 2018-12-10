
public class Performance {

    private String groupName;
    private int members;
    private int duration;

    public Performance() {
        super();
    }

    public Performance(String groupName, int members, int duration) {
        super();
        this.groupName = groupName;
        this.members = members;
        this.duration = duration;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public int getMembers() {
        return members;
    }

    public void setMembers(int members) {
        this.members = members;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void printPerformanceData() {

        System.out.println("\t\t\t" + this.getGroupName()
                + " " + "\t" + this.getMembers() + "\t" + this.getDuration());
    }

    public void mostrarDatos() {
        System.out.println("\t\t" + this.groupName + "\t" + this.members + "\t" + this.duration);
//        System.out.println(this.getGroupName() + "\t" + this.getMembers() + "\t" + this.getDuration());

    }

//    public void mostrarMax() {
//        System.out.println("Máximo: " + performances.stream().mapToDouble(i -> i).max().getAsDouble());
//        System.out.println("Máximo: " + performances.stream().mapToDouble(i -> i).min().getAsDouble());
//    }

}
