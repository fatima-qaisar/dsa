public class Patient {
    private int id;
    private String name;
    private int severity;

    public Patient(int id, String name, int severity){
        this.id=id;
        this.name=name;
        this.severity=severity;
    }

    @Override
    public String toString(){
        return String.format("Patient [ID: %d, Name: %s, Severity: %d]",this.getId(), this.getName(), this.getSeverity());
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeverity() {
        return severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }
}
