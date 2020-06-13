public class BackendDeveloper extends Employee implements Programmer_member {
    public static int deadline;
    public static int Bonus;
    public static int Penalty;
    //these are static fields, setBonus(), setPenalty(), setDoingDuration() functions are manipulate with them
    private int doTime;
    private int Salary;
    public BackendDeveloper(int EmpId, String Name, String address, String status, String level, String Department){
        super();
     super.setEmpId(EmpId);
     super.setName(Name);
     super.setAddress(address);
     super. setStatus(status);
     super. setLevel(level);
     super.setDepartment(Department);
    }
    public void setSalary(int money){
    this.Salary=money;}

    public int gettingSalary(){
    return Salary;
}
    public void setDoTime(int day) {
        this.doTime = day;
    }

    public int getDoTime() {
        return doTime;
    }

    public String programs() {
        return super.getName() + " programs in "+ super.getDepartment()+" department";
    }

    public String work() {
        return super.getName() + " works in IT company as Backend developer.";
    }

    public String getSalary() {
     return "He get salary "+gettingSalary()+"$ per month.";
    }

    public int get_doing_duration() {
        return deadline;
    }

    public int getBonus() {
       return Bonus;
    }

    public int getPenalty() {
      return Penalty;
}
public String write(){
        return "He writes Java";
}
//this function check and return if the stuff finish work on time and if he get for this penalty or bonus
public String checking() {
    if (deadline < doTime)
        return "He got bonus in "+getBonus()+"$ for early done.";

    else
        return "He got penalty in "+getPenalty()+"$ tg for late";

 }
public void BackendInfo(){
        System.out.println(work());
        System.out.println(programs());
        System.out.println(getSalary());
        System.out.println(write());
        System.out.println(checking());
}
}
